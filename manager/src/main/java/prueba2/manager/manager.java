package prueba2.manager;

import prueba2.manager.logic.Person;
import prueba2.manager.persistence.PersonJpaController;
import prueba2.manager.persistence.TurnJpaController;
import prueba2.manager.service.PersonService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class manager {

    public static void main(String[] args) {

        PersonJpaController perJpa = new PersonJpaController();
        TurnJpaController turJpa = new TurnJpaController();

        long number = turJpa.getTurnCount() + 1;
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2024");
        } catch (ParseException e) {
        }

        Person person = new Person("Wilson");
        perJpa.create(person);
        System.out.println("User created: " + person.getName());
        PersonService perSv = new PersonService();
        perSv.saveTicket(person, 7777, "report", sqlDate);
        
//        Person user01 = new Person("Mike");
//        Turn turn01 = new Turn(number, date, "Turno de prueba", false, user01);
//
//        perJpa.create(user01);
//        System.out.println("User created: " + user01.getName());
//
//        turJpa.create(turn01);
//        System.out.println("Turn created: " + turn01.getNumber());
//        System.out.println("Turn created: " + turn01.getPersonId());

        System.out.println("Turn count: " + turJpa.getTurnCount());

    }

}
