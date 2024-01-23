package prueba2.manager.logic;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-23T20:03:16")
@StaticMetamodel(Turn.class)
public class Turn_ { 

    public static volatile SingularAttribute<Turn, Long> number;
    public static volatile SingularAttribute<Turn, Date> onDate;
    public static volatile SingularAttribute<Turn, String> description;
    public static volatile SingularAttribute<Turn, Integer> personId;
    public static volatile SingularAttribute<Turn, Integer> id;
    public static volatile SingularAttribute<Turn, Boolean> done;

}