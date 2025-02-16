package ru.jpa_example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.jpa_example.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
}
