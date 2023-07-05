package com.sacksoft.crudtask.Controller;

import com.sacksoft.crudtask.Entity.Person;
import com.sacksoft.crudtask.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;



    @GetMapping("/")
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> allPersons = personService.getAllPersons();
        return new ResponseEntity<>(allPersons, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        Person personById = personService.getPersonById(id);
        return new ResponseEntity<>(personById,HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity <Person> createPerson(@RequestBody Person person) {
        Person person1 = personService.createPerson(person);
        return new ResponseEntity<>(person1,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person updatedPerson) {
        Person person = personService.updatePerson(id, updatedPerson);
        return new ResponseEntity<>(person,HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }
}
