package com.example.navigation21

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Надуваем макет для этого фрагмента
        return inflater.inflate(R.layout.fragment_start, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val constraintLayoutSchedule = view.findViewById<ConstraintLayout>(R.id.constraintLayoutSchedule)
        val imageView = view.findViewById<ImageView>(R.id.imageViewMenu)

        constraintLayoutSchedule.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager

            // Начинаем транзакцию фрагментов
            fragmentManager.beginTransaction()
                // Заменяем текущий фрагмент на другой фрагмент
                .replace(R.id.fragment_container, ScheduleFragment.newInstance())
                // Добавляем транзакцию в стек возврата
                .addToBackStack(null)
                // Применяем изменения
                .commit()
        }

        imageView.setOnClickListener {
            val dialog = Dialog(requireContext())
            //val fragment = MenuFragment()
            //fragment.show(childFragmentManager, "menuFragment")

            dialog.setContentView(R.layout.fragment_menu)
            val window = dialog.window

            window?.setLayout(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            window?.setGravity(Gravity.END)

            dialog.show()

        }

    }


    companion object {
        // Метод для создания экземпляра фрагмента
        fun newInstance(): StartFragment {
            return StartFragment()
        }
    }



}

