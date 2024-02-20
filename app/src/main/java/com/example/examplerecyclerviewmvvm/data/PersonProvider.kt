package com.example.examplerecyclerviewmvvm.data

class PersonProvider {
    fun execute() = (1..50).map {
        Person(
            name = "Vova",
            surname = "Pupkin"
        )
    }
}