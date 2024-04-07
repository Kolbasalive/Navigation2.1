package com.example.navigation21

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.TRANSPARENT

        setContentView(R.layout.activity_main)

        // Добавление фрагмента в контейнер с id "fragment_container"
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, StartFragment.newInstance())
            .commit()
    }

}