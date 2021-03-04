package com.ctt.uatzapi.model

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentManager
import com.ctt.uatzapi.ChamadasFragment
import com.ctt.uatzapi.ContatosFragment
import com.ctt.uatzapi.StatusFragment

class PagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    //equivalente ao ItemCount da RV
    //numero de fragments a serem colocadas
    override fun getCount(): Int {
        return 3
    }

    //relação entre Item/posição a fragment a ser exibida
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ContatosFragment()
            1 -> StatusFragment()
            2 -> ChamadasFragment()
            else -> ContatosFragment()
        }
    }

    //vem separado do import! Não esquecer de chama-lo
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Conversas"
            1 -> "Status"
            2 -> "Chamadas"
            else -> super.getPageTitle(position)
        }
    }
}