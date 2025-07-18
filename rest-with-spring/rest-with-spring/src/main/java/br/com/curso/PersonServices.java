package br.com.curso;

import br.com.curso.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){

        logger.info("Finding all people.");

        List<Person> persons = new ArrayList<Person>();
        for(int i = 0; i < 8;i++) {
            Person person = mockPerson(i);
                persons.add(person);

        }
        return persons;
    }

    public Person create(Person person){

        logger.info("Creating person");

        return person;
    }

    public Person update(Person person){

        logger.info("Updating person");

        return person;
    }

    public void delete(String id){
        logger.info("Deleting person");
    }


    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("firstName " + i);
        person.setLastName("lastName" + i);
        person.setAddress("Curitiba - PR - BR");
        person.setGender("Male");
        return person;
    }

    public Person findById(String id){

        logger.info("Finding one person.");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Ernani");
        person.setLastName("Junior");
        person.setAddress("Curitiba - PR - BR");
        person.setGender("Male");
        return person;

    }

}
