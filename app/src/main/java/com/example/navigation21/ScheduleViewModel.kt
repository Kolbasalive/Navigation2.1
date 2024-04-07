package com.example.navigation21

import com.example.navigation21.data.Schedule

class ScheduleViewModel {
    var schedule = mutableListOf<Schedule>()

    init {
        for (i in 1 until 5){
            var schedule = Schedule()
            schedule.numberLesson = i
        }
    }

}