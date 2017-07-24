package com.ttn.Hibernate;
import org.hibernate.Session;
import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;


/**
 * Created by randhir on 5/7/17.
 */
public class HibernateProgram
{
    public static void main(String[] args) {

      Author author=new Author();
      author.setFirstName("Randhir");
      author.setLastName("Kumar");
      author.setAge(20);
      SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
    }
}
