import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Operatii terminale -  suma, count, colectie, forEach, findAny, findAll, allmatch, anymatch
        //Operatii intermediare - filter, map, sort, limit, distinct, peek
        Stream.of("A", "B", "C")
                .forEach(t -> System.out.println(t));
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ion", 23));
        list.add(new Person("Vasile", 24));
        list.add(new Person("Andrei", 21));

        boolean isOver18 = list.stream()
                .allMatch(t -> t.getAge()>= 18);
        System.out.println(isOver18);

        list.stream()
                .anyMatch(t -> t.getAge() >=18);
//        list.stream()
//                .forEach(t -> t.setAge(1));
//        list.stream()
//                .peek(t -> t.setAge(1))
//                .collect(Collectors.toList());
//        System.out.println(list);

//        for(Person person: list){
//            person.setAge(1);
//        }
//        System.out.println(list);
//
//        List<Person> list2 = list.stream()
//                .map(t->new Person(t.getName(), 1))
//                .collect(Collectors.toList());
//
//        list.stream()
//                .map(t -> {
//                    t.setAge(1);
//                    return t;
//                })
//                .collect(Collectors.toList());
//
//        list = list.stream()
//                .map(t->new Person(t.getName(), 1))
//                .collect(Collectors.toList());

//        PersonService personService = new PersonService();
//        Optional<Person> personOptional = personService.findAnyPersonByName("Ion", list);
//        personOptional.ifPresent(t -> System.out.println(t));
//        personOptional.orElseThrow(() -> new RuntimeException("Nu a fos gasita asa persoana"));

        Stream.of(1, 2, 3, 4)
                .reduce(0, (a, b) -> a + b, Integer::sum);
        Stream.of("A", "B", "C", "D")
                .reduce("", (a, b) -> a+b);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(10);
        int val = list1.stream()
                .reduce(1, (a, b) -> a*b);
        System.out.println(val);

        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        Collections.reverse(strings);

        List<String> str = list.parallelStream()
                .filter(p -> p.getAge() < 18)
                .map(t -> t.getName())
                .collect(Collectors.toList());




    }
}