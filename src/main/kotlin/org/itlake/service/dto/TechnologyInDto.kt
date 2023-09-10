package org.itlake.service.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class TechnologyInDto(
    @NotBlank var name: String,
    @NotBlank var description: String,
    @NotNull var typeId: Long,
    var parentId: Long? = null,
    var link: String? = null,
)
