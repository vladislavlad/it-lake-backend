package org.itlake.service.api

import org.itlake.service.dto.TechTypeInDto
import org.itlake.service.dto.TechTypeOutDto
import org.itlake.service.model.TechType
import org.itlake.service.service.TechTypeService
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Component

@Component
class TechTypeApi(
        override val mapper: ModelMapper,
        override val service: TechTypeService,
        override val entityClass: Class<TechType> = TechType::class.java,
        override val outDtoClass: Class<TechTypeOutDto> = TechTypeOutDto::class.java,
) : ACrudApi<Long, TechTypeInDto, TechTypeOutDto, TechType>()