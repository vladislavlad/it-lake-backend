package org.itlake.service.repository

import org.itlake.service.model.TechType
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param

interface TechTypeRepository : PagingAndSortingRepository<TechType, Long> {

    fun findByName(@Param("name") name: String): List<TechType>
}
