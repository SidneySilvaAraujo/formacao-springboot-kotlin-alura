package br.com.alura.forum.service

import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicoService(
private var topicos: List<Topico> = ArrayList(),
private val topicoViewMapper: TopicoViewMapper,
private val topicoFormMapper: TopicoFormMapper,
private val notFoundMessage: String = "Topico não encontrado!"
) {
fun listar(): List>TopicoView>{

}
}

