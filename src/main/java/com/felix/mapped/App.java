package com.felix.mapped;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.felix.jpa");
        EntityManager entityManager = managerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Person person = new Person();
        person.setName("Doe");
        person.setAge(19);
        person.setDrivindLicence("Driving licence");

        entityManager.persist(person);

        entityManager.getTransaction().commit();


        entityManager.close();
        managerFactory.close();
    }
}
