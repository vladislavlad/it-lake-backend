package org.itlake.service.api

import org.itlake.common.api.IdentIdCrudApi
import org.itlake.service.dto.TechnologyInDto
import org.itlake.service.dto.TechnologyOutDto
import org.itlake.service.model.Technology

interface TechnologyApi : IdentIdCrudApi<Long, TechnologyInDto, TechnologyOutDto, Technology>