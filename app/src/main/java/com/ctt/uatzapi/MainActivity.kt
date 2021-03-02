package com.ctt.uatzapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.uatzapi.model.Contato
import com.ctt.uatzapi.model.ConversasAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        val rvConversas = findViewById<RecyclerView>(R.id.listaContatos)
        val addContato = findViewById<Button>(R.id.btnAdd)

        val adapterContato = ConversasAdapter(listaConversa)
        rvConversas.adapter = adapterContato

        addContato.setOnClickListener{
            adapterContato.adicionarContato(
                Contato(imagem = null, nome = "Ana", ultimaMensagem = "Vou desinstalar o IntelliJ!", horarioMensagem = "7:00 pm" )
            )
        }

        rvConversas.layoutManager = LinearLayoutManager(this)

        }
//        companion object{
//            const val CHAVE_INTENT = "chaveIntent"
//            val listaConversaEstatica = mutableListOf<Contato>()
 //   }
}