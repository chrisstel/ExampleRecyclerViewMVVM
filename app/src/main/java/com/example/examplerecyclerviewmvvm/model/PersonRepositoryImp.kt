package com.example.examplerecyclerviewmvvm.model

import com.example.examplerecyclerviewmvvm.data.Person
import com.example.examplerecyclerviewmvvm.data.PersonProvider

class PersonRepositoryImp : PersonRepository {
    private val _personProvider = PersonProvider()

    override fun getPeople(): List<Person> = _personProvider.execute()
}