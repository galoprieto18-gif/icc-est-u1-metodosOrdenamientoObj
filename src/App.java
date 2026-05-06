import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person[] personas = { 

            new Person("Juan",  25),
            new Person("Ana",  19),
            new Person("Carlos",  30),
            new Person("Maria",  22),
            new Person( "Diego", 15),
        };
        System.out.println("Personas sin ordenar edad:");

        for (Person person: personas){ 
            System.out.println(person);
        }
        PersonController.sortPersonByAge(personas);
        System.out.println();
        System.out.println("Personas ordenadas por edad:");
        for(Person person: personas){
            System.out.println(person);
        }
        // Ordenar
        // Imprimir


      for (Person person: personas){ 
        System.out.println(person);
        }
        PersonController.sortPersonByName(personas);
        System.out.println();
        System.out.println("Personas ordenadas por nombre:");
        for(Person person: personas){
            System.out.println(person);
        }

}
}
