package br.com.alura.forum.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello")
    fun mensagem(): String{
        return "Hello, word! atualisado"
    }

}