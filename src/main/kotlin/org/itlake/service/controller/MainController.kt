package org.itlake.service.controller

import org.itlake.service.api.TechTypeApi
import org.itlake.service.util.TemplateUtils.Template.MAIN
import org.itlake.service.util.TemplateUtils.showTemplate
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class MainController(private val api: TechTypeApi) {

    @GetMapping(path = ["/","/main"])
    fun main(): ModelAndView {
        val list = api.getList(Pageable.unpaged())
        return showTemplate(MAIN, mapOf("tech" to list))
    }
}