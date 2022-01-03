package org.assignment.hibernatemaven.HibernateMavenProject_Two;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start Of Java Code" );
        
        //Establishing The Connection
        Configuration cfg = new Configuration();
        cfg.configure("HibernateMaven.xml");
        SessionFactory fty = cfg.buildSessionFactory();
        
        //Creating Objects
        Stocks stc = new Stocks();
        stc.setName("SBI");
        stc.setLTP(459.82);
        stc.setQuantity(50);
        stc.setStoploss(451.50);
        
        Session session = fty.openSession();
        Transaction txn = session.beginTransaction();
        session.save(stc);
        txn.commit();
        session.close();
        
        System.out.println("Records Saved");
        System.out.println(fty.isClosed());;
        System.out.println(fty.isOpen());
        System.out.println(fty);
        System.out.println("End of the java code");
        
    }
}
