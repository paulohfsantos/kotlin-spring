package com.ktspring.exercises

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import com.ktspring.exercises.helpers.Date

@RestController
@RequestMapping("/api")
class ExerciseOne {

    @GetMapping("/hello")
    @ResponseBody
    fun getHello(): String {
        return "Hello world!"
    }

    @GetMapping("/date")
    @ResponseBody
    fun getDateAttributes(
        @RequestParam(name = "start", required = false, defaultValue = "get")
        start: String,
        end: String
    ): String {
        val dt = Date()
        return dt.date(start, end)
    }
}