package user_login.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import user_login.entity.User;

import java.util.Scanner;

public class CreateUserService {

    public static final Scanner scanner = new Scanner(System.in);

    public void createUser(SessionFactory factory){

        try {
            Session session = factory.getCurrentSession();
            User user = new User();

            System.out.println("Please create your login:");

            user.setLogin(scanner.next());

            System.out.println("Please create your password:");

            user.setPassword(scanner.next());

            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();

            System.out.println("Done!");

        }
        finally {
            factory.close();
        }
    }
}
