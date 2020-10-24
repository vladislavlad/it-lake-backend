package org.itlake.service.service

import org.itlake.service.model.Model
import org.modelmapper.ModelMapper
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository

abstract class AbstractCrudService<ID, E : Model<ID>, U, DTO>(
        private val repository: PagingAndSortingRepository<E, ID>,
        override val mapper: ModelMapper
) : CrudService<ID, E, U, DTO>, WithTransformation<E, U, DTO> {

    override fun getById(id: ID): E {
        return repository.findById(id)
            .orElseThrow()
    }

    override fun getList(page: Pageable): List<DTO> {
        return repository.findAll(page).content
            .map { toDto(it) }
    }

    override fun delete(id: ID) {
        //TODO
    }
}
