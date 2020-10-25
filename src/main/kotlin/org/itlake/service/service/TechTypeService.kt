package org.itlake.service.service

import org.itlake.service.model.TechType
import org.itlake.service.repository.TechTypeRepository
import org.springframework.stereotype.Service

@Service
class TechTypeService(private val repository: TechTypeRepository)
    : ACrudService<Long, TechType>(repository)
