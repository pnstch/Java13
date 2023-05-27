package org.example;

import javax.persistence.EntityManager;

public class CarDao {

    public void create(Car car) {
        EntityManager entityManager = DbConnector.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(car);

        entityManager.getTransaction().commit();
        System.out.println("Car passed");
    }

    public Car getCar(int id) {
        EntityManager entityManager = DbConnector.getEntityManager();
        return entityManager.find(Car.class, id);
    }
}
