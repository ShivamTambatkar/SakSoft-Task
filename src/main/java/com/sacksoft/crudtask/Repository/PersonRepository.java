package com.sacksoft.crudtask.Repository;

import com.sacksoft.crudtask.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

