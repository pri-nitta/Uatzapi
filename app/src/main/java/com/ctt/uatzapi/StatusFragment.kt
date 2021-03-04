package com.ctt.uatzapi
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.uatzapi.model.StatusAdapter
import com.ctt.uatzapi.model.Status

class StatusFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaStatus = mutableListOf<Status>(
            Status(
                imagem = null,
                nome = "Rodrigo",
                hora = "Today, 19:31"
            ),
            Status(
                imagem = null,
                nome = "Suzy",
                hora = "Today, 15:45"
            ),
            Status(
                imagem = null,
                nome = "Carol",
                hora = "Today, 08:04"
            )
        )

        val rvStatus = view.findViewById<RecyclerView>(R.id.listaStatus)

        val adapterStatus = StatusAdapter(listaStatus)
        rvStatus.adapter = adapterStatus

        rvStatus.layoutManager = LinearLayoutManager(requireContext())
    }
}