package org.itlake.service.repository

import org.itlake.service.model.Technology
import org.springframework.data.repository.PagingAndSortingRepository

interface TechnologyRepository : PagingAndSortingRepository<Technology, Long>