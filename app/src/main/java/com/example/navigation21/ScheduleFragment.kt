package com.example.navigation21

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.navigation21.data.Schedule

class ScheduleFragment : Fragment() {

    private lateinit var schedule: Schedule
    private lateinit var textViewNumberLesson: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Надуваем макет для этого фрагмента
        val view = inflater.inflate(R.layout.fragment_schedule_list, container, false)

        textViewNumberLesson = view.findViewById(R.id.textViewNumberLesson) as TextView

        return view

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentManager = requireActivity().supportFragmentManager

        val imageViewBack = view.findViewById<ImageView>(R.id.imageViewBackArrow)

        imageViewBack.setOnClickListener {
            // Начинаем транзакцию фрагментов
            fragmentManager.beginTransaction()
                // Заменяем текущий фрагмент на другой фрагмент
                .replace(R.id.fragment_container, StartFragment.newInstance())
                // Добавляем транзакцию в стек возврата
                .addToBackStack(null)
                // Применяем изменения
                .commit()
        }

    }
    companion object {
        // Метод для создания экземпляра фрагмента
        fun newInstance(): ScheduleFragment {
            return ScheduleFragment()
        }
    }

}