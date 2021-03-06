package com.ctt.uatzapi
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.uatzapi.model.Call
import com.ctt.uatzapi.model.CallAdapter

class ChamadasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_chamadas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listaCall = mutableListOf<Call>(
            Call(imagem = null, nome = "Ariane", horario = "Today, 14:00"),
            Call(imagem = null, nome = "Luara", horario = "Today, 10:53")
        )
        val rvCall = view.findViewById<RecyclerView>(R.id.listaChamadas)
        val adapterCall = CallAdapter(listaCall)
        rvCall.adapter = adapterCall
        rvCall.layoutManager = LinearLayoutManager(requireContext())
    }
}