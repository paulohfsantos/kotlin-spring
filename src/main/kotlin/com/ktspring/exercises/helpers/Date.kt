package com.ktspring.exercises.helpers

import java.text.SimpleDateFormat
import java.util.*
import java.util.Date
import java.util.concurrent.TimeUnit

class Date {
    fun date(start: String, end: String): String {
        val dt = SimpleDateFormat(
            "dd/MM/yyyy",
            Locale.forLanguageTag("pt-br")
        )

        val first: Date = dt.parse(start)
        val second: Date = dt.parse(end)

        val formattedDate = second.time - first.time

        val time = TimeUnit.DAYS
        val days = time.convert(formattedDate, TimeUnit.MILLISECONDS)

        if (days.equals(0) || days < 0) {
            return "start date greater than end date"
        }

        val week = (days / 7).toInt()
        val month = (days / (365 / 12)).toInt()

        return "days difference: $days, week: $week and month: $month"
    }
}