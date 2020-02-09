import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.config.AppConfig;
import pl.sda.person.Person;
import pl.sda.person.repository.PersonRepository;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        PersonRepository personRepository = context.getBean(PersonRepository.class);

        Person person1 = new Person("Ania", "Kowalska");
        personRepository.save(person1);

        Person person2 = new Person("Michał", "Górski");
        personRepository.save(person2);

        System.out.println(personRepository.findAll());
    }
}
