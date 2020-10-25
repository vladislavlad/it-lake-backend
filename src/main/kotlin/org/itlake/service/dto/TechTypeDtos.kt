package org.itlake.service.dto

data class TechTypeInDto(
        var name: String? = null,
        var color: String? = null,
)

data class TechTypeOutDto(
        var id: Long? = null,
        var name: String? = null,
        var color: String? = null,
)