package ie.atu.week2.validation_2;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("person/createPerson")
public class PersonController {
    List<Person> personList = new ArrayList<>();

    @GetMapping
    public List<Person> getPersonList()
    {
        return personList;
    }

    @PostMapping
    public List<Person> addPerson(@Valid @RequestBody Person person)
    {
        personList.add(person);
        return personList;
    }
}
