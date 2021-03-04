package com.ctt.uatzapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.uatzapi.model.Contato
import com.ctt.uatzapi.model.ConversasAdapter

class ContatosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contatos, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaConversa = mutableListOf<Contato>(
            Contato(
                imagem = null,
                nome = "Henrique",
                ultimaMensagem = "Vou pagar a breja!",
                horarioMensagem = "8:01 pm"
            ),
            Contato(
                imagem = null,
                nome = "Priscila",
                ultimaMensagem = "Vou pagar a porção!",
                horarioMensagem = "8:05 pm"
            ),
            Contato(
                imagem = null,
                nome = "Andre",
                ultimaMensagem = "Vamos fazer um HH!",
                horarioMensagem = "7:57 pm")
        )

        val rvConversas = view.findViewById<RecyclerView>(R.id.listaContatos)

        val adapterContato = ConversasAdapter(listaConversa)
        rvConversas.adapter = adapterContato

        rvConversas.layoutManager = LinearLayoutManager()
    }

}