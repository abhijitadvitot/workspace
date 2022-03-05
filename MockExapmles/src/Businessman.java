package MockExamples;

import java.util.ArrayList;
import java.util.List;

public class Businessman {
    private PersonService personService;

    public Businessman(PersonService personService) {
        this.personService = personService;
    }
    public List<Person> findAllPerson(Person person){
        List<Person> people=new ArrayList<>();
        people.add(person);
        return people;

    }
}

