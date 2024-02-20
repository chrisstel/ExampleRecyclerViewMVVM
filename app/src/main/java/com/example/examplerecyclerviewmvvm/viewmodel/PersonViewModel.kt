package com.example.examplerecyclerviewmvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplerecyclerviewmvvm.data.Person
import com.example.examplerecyclerviewmvvm.model.PersonRepository
import com.example.examplerecyclerviewmvvm.model.PersonRepositoryImp

typealias listOfPeople = List<Person>

class PersonViewModel : ViewModel()  {
    private val _liveData = MutableLiveData<listOfPeople>()
    val liveData: LiveData<listOfPeople> = _liveData

    private val personRepository: PersonRepository = PersonRepositoryImp()

    fun getPeople() {
        val response = personRepository.getPeople()
        _liveData.postValue(response)
    }
}