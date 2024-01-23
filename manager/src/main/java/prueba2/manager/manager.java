package prueba2.manager;

import prueba2.manager.logic.Person;
import prueba2.manager.persistence.PersonJpaController;

public class manager {

    public static void main(String[] args) {

        PersonJpaController perJpa = new PersonJpaController();

        Person user01 = new Person("Mike");

        perJpa.create(user01);

    }

}
