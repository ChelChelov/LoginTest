package user_login.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_db.users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

}
