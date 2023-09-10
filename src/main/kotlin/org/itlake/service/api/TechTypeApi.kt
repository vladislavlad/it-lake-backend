package org.itlake.service.api

import org.itlake.common.api.IdentIdCrudApi
import org.itlake.service.dto.TechTypeInDto
import org.itlake.service.dto.TechTypeOutDto
import org.itlake.service.model.TechType

interface TechTypeApi : IdentIdCrudApi<Long, TechTypeInDto, TechTypeOutDto, TechType>
