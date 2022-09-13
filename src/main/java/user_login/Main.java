package user_login;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import user_login.entity.User;
import user_login.service.CreateUserService;

public class Main {

    public static void main(String[] args) {

        CreateUserService createUserService = new CreateUserService();

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        createUserService.createUser(factory);
    }
}
