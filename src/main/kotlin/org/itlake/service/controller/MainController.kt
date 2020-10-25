package org.itlake.service.controller

import org.itlake.service.api.TechTypeApi
import org.itlake.service.api.TechnologyApi
import org.itlake.service.util.TemplateUtils.Template.MAIN
import org.itlake.service.util.TemplateUtils.showTemplate
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class MainController(
        private val typesApi: TechTypeApi,
        private val techsApi: TechnologyApi
) {

    @GetMapping(path = ["/", "/index", "/main"])
    fun main(): ModelAndView {

        val parameters = mapOf(
                "types" to typesApi.getList(Pageable.unpaged()),
                "techs" to techsApi.getList(Pageable.unpaged())
        )
        return showTemplate(MAIN, parameters)
    }
}