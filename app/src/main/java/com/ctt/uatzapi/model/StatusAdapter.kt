package com.ctt.uatzapi.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.uatzapi.R

class StatusAdapter(private val listaStatus: MutableList<Status>) : RecyclerView.Adapter<StatusAdapter.StatusHolder>(){

    class StatusHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeStatus: TextView = view.findViewById(R.id.txtNome)
        val horaStatus: TextView = view.findViewById(R.id.txtHorario)
        val fotoStatus: ImageView =view.findViewById(R.id.imgStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_status, parent, false)
        return StatusHolder(view)
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        listaStatus[position].imagemS?.let{
            holder.fotoStatus.setImageBitmap(it)
        }
        holder.nomeStatus.text= listaStatus[position].nomeS
        holder.horaStatus.text=listaStatus[position].horaS
    }

    override fun getItemCount(): Int = listaStatus.size
}
