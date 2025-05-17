package br.com.rest_with_spring_boot_and_java.services;

import br.com.rest_with_spring_boot_and_java.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findPerson(String id){
        logger.info("Finding one Person!");

         Person person = new Person();
         person.setId(counter.incrementAndGet());
         person.setFirstName("Leandro");
         person.setLastName("Costa");
         person.setAddress("Uberlândia - Minas Gerais - Brasil");
         person.setGender("Male");

         return person;

    }

    public List<Person> findAllPerson(){
        logger.info("Finding all Person!");
        // exemplo de criar um lista de person
        List<Person> persons = new ArrayList<Person>();

        Person person1 = new Person();
        person1.setId(counter.incrementAndGet());
        person1.setFirstName("Leandro");
        person1.setLastName("Costa");
        person1.setAddress("Uberlândia - Minas Gerais - Brasil");
        person1.setGender("Male");

        Person person2 = new Person();
        person2.setId(counter.incrementAndGet());
        person2.setFirstName("Leandro");
        person2.setLastName("Costa");
        person2.setAddress("Uberlândia - Minas Gerais - Brasil");
        person2.setGender("Male");

        persons.add(person1);
        persons.add(person2);
        
        return persons;

    }

    public Person createPerson(Person person){
        logger.info("creating one Person!");
        person.setId(counter.incrementAndGet());
        return person;

    }

    public Person updatePerson(Person person){
        logger.info("updating one Person!");
        return person;

    }

    public  void deletePerson(String id){
        logger.info("deleting one Person!");
    }


}
