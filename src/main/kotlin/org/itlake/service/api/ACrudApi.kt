package org.itlake.service.api

import org.itlake.service.model.Model

/**
 * API у которого Id DTO и Id Сущности совпадает
 */
abstract class ACrudApi<ID, IN, OUT, E : Model<ID>> : CrudApi<ID, IN, OUT, ID, E> {

    override fun getEntityByDtoId(dtoId: ID): E {
        return service.getById(dtoId)
    }
}