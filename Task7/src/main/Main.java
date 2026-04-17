package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        // define the Session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class)
                .buildSessionFactory();

        //define session
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

//        List<Person> list = session.createQuery("from Person").list();
//        list.forEach(System.out::println);
//        Passport passport = (Passport) session.get(Passport.class, 1);
//        System.out.println("Passport: " + passport);
        Person person = (Person) session.get(Person.class, 1);
        System.out.println(person);
//        Person person = new Person("omar","mohamed", LocalDate.of(1998, 6, 15));
//        Passport passport =new Passport("8545",LocalDate.of(2025, 6, 15));
//        passport.setPerson(person);
//        session.save(passport);
//        session.getTransaction().commit();

//        Query<User> query = session.createQuery("from User");
//        List<User> list = query.getResultList();
//        for (User user : list) {
//            session.save(user);
//        }
//        session.getTransaction().commit();
//        Query query = session.createQuery("from User");
//        query.setFirstResult(0);
//        query.setMaxResults(4);
//        List<User> users = query.list();
//        for (User user : users) {
//            System.out.println(user);
//        }


//        Query q = session.createQuery("update User set username=:username where id=:i");
//        q.setParameter("username", "mahmoud");
//        q.setParameter("i", 1);
//        int status = q.executeUpdate();
//        System.out.println("update status: " + status);
//        session.getTransaction().commit();

//        Query query = session.createQuery("from User");
//        List<User> list = query.getResultList();
//        for (User user : list) {
//            System.out.println(user);
//        }
//

//        User user = new User("Ahmed","root","ahmed952@gmail.com");
//        session.beginTransaction();
//        session.save(user);
//        session.getTransaction().commit();

//        session.beginTransaction();
//        User user =session.get(User.class,1);
//        System.out.println(user);


//    session.beginTransaction();
//    User user = session.get(User.class, 1);
//    user.setPassword("1234654");
//    session.save(user);
//    session.getTransaction().commit();

//        session.beginTransaction();
//        User user = session.get(User.class, 1);
//        session.delete(user);
//        session.getTransaction().commit();

    }

}
