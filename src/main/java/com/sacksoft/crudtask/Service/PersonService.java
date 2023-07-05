package com.sacksoft.crudtask.Service;

import com.sacksoft.crudtask.Entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();
    Person getPersonById(Long id);
    Person createPerson(Person person);
    Person updatePerson(Long id, Person updatedPerson);
    void deletePerson(Long id);
}
