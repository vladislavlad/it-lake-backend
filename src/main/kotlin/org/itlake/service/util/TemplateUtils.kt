package org.itlake.service.util

import org.springframework.web.servlet.ModelAndView

/**
 * Удобное использование HTML шаблонов
 */
object TemplateUtils {

    fun showTemplate(template: Template): ModelAndView {
        return ModelAndView(template.templateName)
    }

    fun showTemplate(template: Template, parameters: Map<String, *>): ModelAndView {
        return ModelAndView(template.templateName, parameters)
    }

    /**
     * Константные названия Freemarker html-шаблонов
     */
    enum class Template(val templateName: String) {
        MAIN("main");
    }
}
