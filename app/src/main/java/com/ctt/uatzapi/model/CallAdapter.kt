package com.ctt.uatzapi.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.uatzapi.R

class CallAdapter(private val listaCall: MutableList<Call>) : RecyclerView.Adapter<CallAdapter.CallHolder>(){
    class CallHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeCall: TextView = view.findViewById(R.id.txtNomeCall)
        val horaCall: TextView = view.findViewById(R.id.txtHorarioCall)
        val fotoCall: ImageView = view.findViewById(R.id.imgCall)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_chamadas, parent, false)
        return CallHolder(view)
    }

    override fun onBindViewHolder(holder: CallHolder, position: Int) {
        listaCall[position].imagem?.let{
            holder.fotoCall.setImageBitmap(it)
        }
        holder.nomeCall.text= listaCall[position].nome
        holder.horaCall.text=listaCall[position].horario
    }

    override fun getItemCount(): Int = listaCall.size
}
