package org.itlake.service.controller

import org.itlake.service.api.TechnologyApi
import org.itlake.service.dto.TechnologyInDto
import org.itlake.service.dto.TechnologyOutDto
import org.springframework.data.domain.PageRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/technologies")
class TechnologyController(
        private val api: TechnologyApi
) {

    @GetMapping
    fun list(@RequestParam(defaultValue = "0") page: Int,
             @RequestParam(defaultValue = "20") size: Int): List<TechnologyOutDto> =
            api.getList(PageRequest.of(page, size))

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): TechnologyOutDto =
            api.getById(id)

    @PostMapping
    fun create(@RequestBody dto: TechnologyInDto): TechnologyOutDto =
            api.create(dto)

    @PatchMapping("/{id}")
    fun update(@PathVariable id: Long,
               @RequestBody dto: TechnologyInDto): TechnologyOutDto =
            api.update(id, dto)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Long) =
            api.delete(id)
}
