package main;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "passport")
@NoArgsConstructor

public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;
    @Column(name = "passport_no")
    private String passportNo;
    @Column(name ="expiry_date")
    private LocalDate expiryDate;



    public Passport(String passportNo, LocalDate  expiryDate) {
        this.passportNo = passportNo;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "Id=" + Id +
                ", person=" + person +
                ", passportNo='" + passportNo + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
