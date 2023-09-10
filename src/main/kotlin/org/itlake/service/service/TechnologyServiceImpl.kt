package org.itlake.service.service

import org.itlake.common.service.ACrudService
import org.itlake.service.model.Technology
import org.itlake.service.repository.TechnologyRepository
import org.springframework.stereotype.Service

@Service
class TechnologyServiceImpl(
    private val repository: TechnologyRepository
) : ACrudService<Long, Technology>(repository), TechnologyService
