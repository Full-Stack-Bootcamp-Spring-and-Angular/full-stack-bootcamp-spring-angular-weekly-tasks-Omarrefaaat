package main;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name ="person")
@Getter
@NoArgsConstructor
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name="birth_date")
    private LocalDate birthday;
    @OneToOne(mappedBy ="person")
    private Passport passport;

    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthday=" + birthday +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", Id=" + Id +
                '}';
    }
}
