package org.itlake.service.api

import org.itlake.service.dto.TechTypeOutDto
import org.itlake.service.model.TechType
import org.itlake.service.service.TechTypeServiceImpl
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Component

@Component
class TechTypeApiImpl(
        override val mapper: ModelMapper,
        override val service: TechTypeServiceImpl,
        override val entityClass: Class<TechType> = TechType::class.java,
        override val outDtoClass: Class<TechTypeOutDto> = TechTypeOutDto::class.java,
) : TechTypeApi