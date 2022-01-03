package org.tutorial_hibernate.HibernateMavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start Of Java Code" );
        
        //Establishing the connection
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernatemaven.xml");
        SessionFactory fty = cfg.buildSessionFactory();
        
        //Creating object
        tour tr = new tour();
        tr.setName("Subham");
        tr.setAge(23);
        tr.setMembers(3);
        tr.setDestination("Laddakh");
        
        Session session = fty.openSession();
        Transaction txn = session.beginTransaction();
        
        session.save(tr);
        
        
       txn.commit();
       session.close();
       System.out.println("Records Saved");
       
       System.out.println(fty.isClosed());
       System.out.println(fty.isOpen());
       System.out.println(fty);
       
       System.out.println("End of java code");
        
    }
}
