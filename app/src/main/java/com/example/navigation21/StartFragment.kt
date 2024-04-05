package com.example.navigation21

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Надуваем макет для этого фрагмента
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    companion object {
        // Метод для создания экземпляра фрагмента
        fun newInstance(): StartFragment {
            return StartFragment()
        }
    }

    fun onImageClick(view: View) {}
}