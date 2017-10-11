package com.github.alexv1993.literals.main;

import com.github.alexv1993.literals.model.Literals;
import com.github.alexv1993.literals.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vendin on 11.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Literals literals = (Literals) context.getBean("literals");
        ShowManager showManager = (ShowManager) context.getBean("showManager");

        Session session = null;

        try {
            //session = HibernateUtil.getSessionFactory().getCurrentSession();
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            //Get Session
            //start transaction
            session.beginTransaction();
            //Save the Model object
            session.save(literals);
            //Commit transaction
            session.getTransaction().commit();
            System.out.println("Literals ID=" + literals.getID());
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            //terminate session factory, otherwise program won't end
            HibernateUtil.getSessionFactory().close();
        }

        showManager.show(literals.getI1());
        showManager.show(literals.getI2());
        showManager.show(literals.getI3());
        showManager.show(literals.getC());
        showManager.show(literals.getB());
        showManager.show(literals.getS());
        showManager.show(literals.getN1());
        showManager.show(literals.getN2());
        showManager.show(literals.getN3());
        showManager.show(literals.getF1());
        showManager.show(literals.getF2());
        showManager.show(literals.getF3());
        showManager.show(literals.getD1());
        showManager.show(literals.getD2());

    }
}
