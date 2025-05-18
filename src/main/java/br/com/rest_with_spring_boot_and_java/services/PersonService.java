package br.com.rest_with_spring_boot_and_java.services;

import br.com.rest_with_spring_boot_and_java.exeption.ResoucesNotFoundExeption;
import br.com.rest_with_spring_boot_and_java.model.Person;
import br.com.rest_with_spring_boot_and_java.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    @Autowired
    private PersonRepository repository;

    public Person findPerson(Long id){
        logger.info("Finding one Person!");

        return repository.findById(id).orElseThrow(() -> new ResoucesNotFoundExeption("No records found for this id!") );
    }

    public List<Person> findAllPerson(){
        logger.info("Finding all Person!");
        return repository.findAll();
    }

    public Person createPerson(Person person){
        logger.info("creating one Person!");
        return repository.save(person);
    }

    public Person updatePerson(Person person){
        logger.info("updating one Person!");
        Person personPrevious = findPerson(person.getId());
        return repository.save(person);

    }

    public  void deletePerson(Long id){
        logger.info("deleting one Person!");
        Person person = findPerson(id);
        repository.delete( person );
    }


}
