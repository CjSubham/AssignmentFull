package org.assignment.hibernate.HibernateMavenProject_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start Of The Code" );
       
        //Esblishing the connection
        
        Configuration cfg = new Configuration();
        cfg.configure("Hibernate_one.xml");
        SessionFactory fty = cfg.buildSessionFactory();
        
        //Creating Objects
        Products pro = new Products();
        pro.setProduct_id(1031);
        pro.setName("Mobile");
        pro.setPrice(18000);
        
        Session session = fty.openSession();
        Transaction txn = session.beginTransaction();
        
        session.save(pro);
        
        txn.commit();
        session.close();
        System.out.println("Records Saved");
        System.out.println(fty.isClosed());
        System.out.println(fty.isOpen());
        System.out.println(fty);
        
        System.out.println("End of the java Code");
        
    }
}
