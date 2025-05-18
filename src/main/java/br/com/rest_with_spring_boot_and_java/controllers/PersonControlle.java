package br.com.rest_with_spring_boot_and_java.controllers;

import br.com.rest_with_spring_boot_and_java.model.Person;
import br.com.rest_with_spring_boot_and_java.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.*;

@RequestMapping("/persons")
@RestController
public class PersonControlle {

    @Autowired
    private PersonService service;


   /**
    * aqui definimos o método get
    **/
    @RequestMapping(value = "/{id}",
    method = RequestMethod.GET,
    produces = APPLICATION_JSON_VALUE
    )
    public Person findIdPerson(
            @PathVariable("id") Long id
    ){
        return service.findPerson(id);
    }


    /*
    * quando não tem parametro na person/ ele vai por default.
    * exatamente para nosso métodos
    *   */
    @RequestMapping(
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE
    )

    public List<Person> findAllPersons(
    ){
        return service.findAllPerson();
    }


    /*
    criando um person via posti
     *   */
    @RequestMapping(
            method = RequestMethod.POST,
            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE
    )

    public Person createPersons(
           @RequestBody Person person
    ){

        return service.createPerson(person);
    }



    /*
    atualizamdo  um person via put
     *   */
    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE
    )
    public Person putPersons(@RequestBody Person person){
        return service.updatePerson(person);
    }


    /*
  atualizamdo  um person via put
   *   */
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.DELETE
    )
    public void putPersons(
         @PathVariable("id") Long id
    ){

        service.deletePerson(id);
    }



}
