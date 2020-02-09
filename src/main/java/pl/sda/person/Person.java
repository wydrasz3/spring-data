package pl.sda.person;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
@Data
public class Person {

    @Id
    @Column(name = "PERSON_ID")
    @GeneratedValue
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;
}
