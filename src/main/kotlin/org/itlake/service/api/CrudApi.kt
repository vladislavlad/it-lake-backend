package org.itlake.service.api

import org.itlake.service.model.Model
import org.itlake.service.service.CrudService
import org.modelmapper.ModelMapper
import org.springframework.core.ResolvableType
import org.springframework.core.ResolvableTypeProvider
import org.springframework.data.domain.Pageable

interface CrudApi<DTO_ID, IN, OUT, ID, E : Model<ID>> : ResolvableTypeProvider {
    val mapper: ModelMapper
    val service: CrudService<ID, E>
    val outDtoClass: Class<OUT>
    val entityClass: Class<E>

    fun getEntityByDtoId(dtoId: DTO_ID): E

    override fun getResolvableType(): ResolvableType {
        return ResolvableType.forClassWithGenerics(this.javaClass, ResolvableType.forClass(this.javaClass))
    }

    fun getById(id: DTO_ID): OUT {
        return mapper.map(
                getEntityByDtoId(id),
                outDtoClass
        )
    }

    fun getList(page: Pageable): List<OUT> {
        return service.getList(page)
            .map { mapper.map(it, outDtoClass) }
    }

    fun create(dto: IN): OUT {
        val toCreation = mapper.map(dto, entityClass)
        return mapper.map(
                service.create(toCreation),
                outDtoClass
        )
    }

    fun update(id: DTO_ID, dto: IN): OUT {
        val entity = getEntityByDtoId(id)
        mapper.map(dto, entity)

        return mapper.map(
                service.update(entity),
                outDtoClass
        )
    }

    fun delete(id: DTO_ID) = service.delete(getEntityByDtoId(id))
}