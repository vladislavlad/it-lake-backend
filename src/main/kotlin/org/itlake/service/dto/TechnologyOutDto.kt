package org.itlake.service.dto

data class TechnologyOutDto(
    var name: String? = null,
    var description: String? = null,
    var type: TechTypeOutDto? = null,
    var parent: TechnologyOutDto? = null,
    var link: String? = null,
)
