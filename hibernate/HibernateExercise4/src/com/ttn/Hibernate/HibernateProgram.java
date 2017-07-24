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

        Author author1=new Author();
        author1.setAge(21);
        author1.setLastName("singh");
        author1.setFirstName("mohan");
        String dob1="19/08/1994";
       Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dob1);
        author1.setDOB(date1);

        Author author2=new Author();
        author2.setAge(27);
        author2.setLastName("Khan");
        author2.setFirstName("Amir");
        String dob2="19/05/1995";
          Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(dob2);
        author2.setDOB(date2);

        Author author3=new Author();
        author3.setAge(32);
        author3.setLastName("jain");
        author3.setFirstName("shubham");
        String dob3="14/01/1998";
       Date  date3=new SimpleDateFormat("dd/MM/yyyy").parse(dob3);
        author3.setDOB(date3);

        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        session.beginTransaction();
        session.save(author);
        session.save(author1);
        session.save(author2);
        session.save(author3);
        session.getTransaction().commit();
        session.close();
    }
}
