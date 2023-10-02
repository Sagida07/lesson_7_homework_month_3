package com.example.lesson_7_homework_month_3

data class SongModel(
    var number: String? = null,
    var nameOfSong: String? = "Неизвестная песня",
    var singer: String? = "Неизвестный исполнитель",
    var lengthOfSong: String? = null)