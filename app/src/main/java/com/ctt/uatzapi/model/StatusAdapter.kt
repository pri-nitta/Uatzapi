package com.ctt.uatzapi.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.uatzapi.MainActivity
import com.ctt.uatzapi.R

class StatusAdapter(private val listaStatus: MutableList<Status>) : RecyclerView.Adapter<StatusAdapter.StatusHolder>(){

    class StatusHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeStatus: TextView = view.findViewById(R.id.txtContato)
        val horaStatus: TextView = view.findViewById(R.id.txtMensagem)
        val fotoContato
                : ImageView =view.findViewById(R.id.imgContato)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_contato, parent, false) //pode quebrar o app se for true
        return StatusHolder(view)
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        listaStatus[position].imagem?.let{
            holder.fotoContato.setImageBitmap(it)
        }
        holder.nomeStatus.text= listaStatus[position].nome
        holder.horaStatus.text=listaStatus[position].hora
    }

    override fun getItemCount(): Int = listaStatus.size
}
