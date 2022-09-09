package br.com.alura.forum.service

import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpClientErrorException.NotFound
import java.util.stream.Collectors

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper,
    private val notFoundMessage: String = "Topico não encontrado!"
) {
    fun listar(): List>TopicoView>
    {
        return topicos.stream().map { t ->
            topicoViewMapper.map(t)
        }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().orElseThrow { NotFoundException(notFoundMessage) }
        return topicoViewMapper.map(topico)
    }

fun cadastrar(form: NovoTopicoForm): TopicoView{
val topico = topicoFormMapper.map(form)
    topico.id = topicos.size.toLong() + 1
topicos = topicos.plus(topico)
    return topicoViewMapper.map(topico)
}


}

