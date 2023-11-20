import java.util.List;
import java.util.Optional;

public class PersonService {
    public Optional<Person> findAnyPersonByName(String name, List<Person> personList){
        Optional<Person> personOptional = personList.stream()
                .filter(t -> t.getName().equals(name))
                .findAny();
    return personOptional;
        //FindAny
        // -> Daca mai multe entitati au ajuns la operatie terminala alegem oricare
        // -> Daca nici o entitate nu a ajuns la operatie terminala, returnam Optional.empty()
//        Optional<Person> personOptional = Optional.empty();
//        personOptional.isEmpty();
//        Person person = personOptional.get();
//        if(!personOptional.isEmpty()){
//            person = personOptional.get();
//        } else {
//            person = null;
//        }
//
//        person = personOptional.orElseGet(() -> null);
//        person = personOptional.orElse(new Person());
//        person = personOptional.orElseThrow(() - > new RuntimeException("Error"));
    }
}
