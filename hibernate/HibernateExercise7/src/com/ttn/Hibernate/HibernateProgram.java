package com.ttn.Hibernate;
import org.hibernate.Session;
import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by randhir on 5/7/17.
 */
public class HibernateProgram
{
    public static void main(String[] args)  throws Exception
    {
         Author author=new Author();
         author.setAge(20);
         author.setLastName("Kumar");
         author.setFirstName("Randhir");
         String dob="19/10/1993";
         Date date=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
         author.setDOB(date);

        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
