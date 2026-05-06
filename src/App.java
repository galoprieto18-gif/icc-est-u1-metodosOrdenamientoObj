
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
        System.out.println("Personas sin ordenar:");
        for (Person person: personas){ 
            System.out.println(person);
        }

        // ordenar
        System.out.println("\nPersonas ordenadas por edad:\n");
        PersonController PersonController = new PersonController();
        PersonController.sortPersonByAge(personas);
        // imprimir
        for(Person person: personas){
            System.out.println(person);
        }

        // ordenar
        System.out.println("\nPersonas ordenadas por nombre:\n");
        PersonController PersonController2 = new PersonController();
        PersonController2.sortPersonByName(personas);
        //imprimir
        for(Person person: personas){
            System.out.println(person);
        }

    }
}
