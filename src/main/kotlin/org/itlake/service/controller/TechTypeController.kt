package org.itlake.service.controller

import org.itlake.service.api.TechTypeApi
import org.itlake.service.dto.TechTypeInDto
import org.itlake.service.dto.TechTypeOutDto
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
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/techTypes")
class TechTypeController(
    private val api: TechTypeApi
) {

    @GetMapping
    fun list(@RequestParam(defaultValue = "0") page: Int,
             @RequestParam(defaultValue = "20") size: Int): List<TechTypeOutDto> =
            api.getList(PageRequest.of(page, size))

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): TechTypeOutDto =
            api.getById(id)

    @PostMapping
    fun create(@Valid @RequestBody dto: TechTypeInDto): TechTypeOutDto =
            api.create(dto)

    @PatchMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @Valid @RequestBody dto: TechTypeInDto
    ): TechTypeOutDto =
            api.update(id, dto)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Long) =
            api.delete(id)
}
