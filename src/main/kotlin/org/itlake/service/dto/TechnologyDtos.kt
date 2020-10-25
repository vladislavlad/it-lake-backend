package org.itlake.service.dto

import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Validated
data class TechnologyInDto(
        @NotBlank var name: String,
        @NotBlank var description: String,
        @NotNull var typeId: Long,
        var parentId: Long? = null,
        var link: String? = null,
)

data class TechnologyOutDto(
        var name: String? = null,
        var description: String? = null,
        var type: TechTypeOutDto? = null,
        var parent: TechnologyOutDto? = null,
        var link: String? = null,
)