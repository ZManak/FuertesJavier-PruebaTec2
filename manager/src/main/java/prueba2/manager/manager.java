package prueba2.manager;

import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import prueba2.manager.logic.Person;
import prueba2.manager.logic.Turn;
import prueba2.manager.persistence.PersonJpaController;
import prueba2.manager.persistence.TurnJpaController;

public class manager {

    public static void main(String[] args) {

        PersonJpaController perJpa = new PersonJpaController();
        TurnJpaController turJpa = new TurnJpaController();

        long number = turJpa.getTurnCount() + 1;
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2024");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Person user01 = new Person("Mike");
        Turn turn01 = new Turn(number, date, "Turno de prueba", false, user01.getId());

        perJpa.create(user01);
        System.out.println("User created: " + user01.getName());

        turJpa.create(turn01);
        System.out.println("Turn created: " + turn01.getNumber());

    }

}
