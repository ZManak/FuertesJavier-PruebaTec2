package prueba2.manager.logic;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import prueba2.manager.logic.Person;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-02-09T12:27:30")
@StaticMetamodel(Turn.class)
public class Turn_ { 

    public static volatile SingularAttribute<Turn, Long> number;
    public static volatile SingularAttribute<Turn, Date> onDate;
    public static volatile SingularAttribute<Turn, String> description;
    public static volatile SingularAttribute<Turn, Person> personId;
    public static volatile SingularAttribute<Turn, Integer> id;
    public static volatile SingularAttribute<Turn, Boolean> done;

}