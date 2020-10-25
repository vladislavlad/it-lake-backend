package org.itlake.common.service

import org.itlake.service.model.Model
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository

abstract class ACrudService<ID, E : Model<ID>>(
        private val repository: PagingAndSortingRepository<E, ID>,
) : CrudService<ID, E> {

    override fun getById(id: ID): E {
        return repository.findById(id)
            .orElseThrow()
    }

    override fun getList(page: Pageable): List<E> {
        return repository.findAll(page).content
    }

    override fun create(entity: E): E {
        return repository.save(entity)
    }

    override fun update(entity: E): E {
        return repository.save(entity)
    }

    override fun delete(entity: E) {
        return repository.delete(entity)
    }
}