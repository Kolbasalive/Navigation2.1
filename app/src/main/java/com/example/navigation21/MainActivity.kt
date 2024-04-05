package com.example.navigation21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Добавление фрагмента в контейнер с id "fragment_container"
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, StartFragment.newInstance())
            .commit()
    }
}