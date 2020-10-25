package org.itlake.service.api

import org.itlake.service.dto.TechnologyInDto
import org.itlake.service.dto.TechnologyOutDto
import org.itlake.service.model.Technology
import org.itlake.service.service.TechTypeService
import org.itlake.service.service.TechnologyService
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Component

@Component
class TechnologyApiImpl(
        override val mapper: ModelMapper,
        override val service: TechnologyService,
        private val typeService: TechTypeService,
        override val outDtoClass: Class<TechnologyOutDto> = TechnologyOutDto::class.java,
        override val entityClass: Class<Technology> = Technology::class.java,
) : TechnologyApi {

    override fun create(dto: TechnologyInDto): TechnologyOutDto {
        val entity = mapper.map(dto, entityClass)

        entity.parent = dto.parentId?.let(service::getById)
        entity.type = dto.typeId.let(typeService::getById)

        return mapper.map(
                service.create(entity),
                outDtoClass
        )
    }
}