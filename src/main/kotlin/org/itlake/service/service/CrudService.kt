package org.itlake.service.service

import org.itlake.service.model.Model
import org.springframework.data.domain.Pageable

interface CrudService<ID, E : Model<ID>> {
    fun getById(id: ID): E
    fun getList(page: Pageable): List<E>
    fun create(entity: E): E
    fun update(entity: E): E
    fun delete(entity: E)
}