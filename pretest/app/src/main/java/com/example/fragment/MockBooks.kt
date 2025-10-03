package com.example.app.data

data class Book(val title: String, val author: String)

object MockBooks {
    val items: List<Book> = listOf(
        Book("Clean Code", "Robert C. Martin"),
        Book("Kotlin in Action", "Dmitry Jemerov"),
        Book("Android Apprentice", "raywenderlich Team")
    )
}
