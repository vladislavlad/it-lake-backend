package org.itlake.service.service

import org.modelmapper.ModelMapper

interface WithTransformation<E, U, D> {
    val mapper: ModelMapper

    fun toEntity(dto: U): E = mapper.map(dto, getEntityClass())

    fun toDto(entity: E): D = mapper.map(entity, getDtoClass())

    fun toDtoList(entities: Iterable<E>): List<D> = entities.map { toDto(it) }

    fun updateFields(updateDto: U, entity: E) = mapper.map(updateDto, entity)

    fun getEntityClass(): Class<E>

    fun getDtoClass(): Class<D>
}
