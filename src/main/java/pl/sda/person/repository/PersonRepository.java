package pl.sda.person.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.person.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
