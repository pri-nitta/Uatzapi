package com.ctt.uatzapi.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.uatzapi.R
import com.ctt.uatzapi.model.Contato

class ConversasAdapter(private val listaContatos: MutableList<Contato>) : RecyclerView.Adapter<ConversasAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeContato: TextView = view.findViewById(R.id.txtContato)
        val ultimaMensagem: TextView = view.findViewById(R.id.txtMensagem)
        val horaMensagem: TextView = view.findViewById(R.id.txtHorario)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_contato, parent, false) //pode quebrar o app se for true
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nomeContato.text= listaContatos[position].nome
        holder.ultimaMensagem.text=listaContatos[position].ultimaMensagem
        holder.horaMensagem.text=listaContatos[position].horarioMensagem
    }

    override fun getItemCount(): Int {
        return listaContatos.size
    }
}