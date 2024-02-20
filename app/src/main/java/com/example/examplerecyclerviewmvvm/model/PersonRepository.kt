package com.example.examplerecyclerviewmvvm.model

import com.example.examplerecyclerviewmvvm.data.Person

/**
 * Repository provides information taken from mock data source
 */
interface PersonRepository {

    /**
     * Returns list of [Person]
     */
    fun getPeople(): List<Person>
}