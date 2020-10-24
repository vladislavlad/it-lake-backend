package org.itlake.service.service

import org.itlake.service.model.Model
import org.springframework.data.domain.Pageable

interface CrudService<ID, ENTITY : Model<ID>, CREATE_DTO, OUT_DTO> {
    fun getById(id: ID): ENTITY
    fun getList(page: Pageable): List<OUT_DTO>
    fun create(dto: CREATE_DTO): ENTITY
    fun update(dto: CREATE_DTO): ENTITY
    fun patch(dto: CREATE_DTO): ENTITY
    fun delete(id: ID)
}