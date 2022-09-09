package br.com.alura.forum.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/topicos")

@RestController
class TopicoController(private val service: TopicoService) {

}

