package best.lviv.website.service.com.model;

import lombok.*;

import javax.persistence.*;


@Table(name = "user")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;

    public User() {
    }
}
