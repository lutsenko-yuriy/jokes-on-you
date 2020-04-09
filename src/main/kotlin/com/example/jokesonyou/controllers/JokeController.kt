package com.example.jokesonyou.controllers

import com.example.jokesonyou.services.QuoteService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class JokeController(val service: QuoteService) {

    @RequestMapping(value = ["/", ""])
    fun showJoke(model: Model): String {
        model.addAttribute("joke", service.getJoke())
        return "chucknorris"
    }

}