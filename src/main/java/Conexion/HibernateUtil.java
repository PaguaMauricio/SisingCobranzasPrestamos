/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.internal.SessionFactoryImpl;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author pagua
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            try {
                StandardServiceRegistry standardRegistry
                        = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
                Metadata metaData
                        = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                sessionFactory = metaData.getSessionFactoryBuilder().build();
            } catch (Throwable th) {
                System.err.println("Enitial SessionFactory creation failed" + th);
                throw new ExceptionInInitializerError(th);
            }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
