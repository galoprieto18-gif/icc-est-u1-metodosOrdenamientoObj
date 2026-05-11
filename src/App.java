
import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person[] personas = { 

            new Person("Juan",  25, new int[]{10,15,20}),
            new Person("Ana",  19, new int[]{15,15,20}),
            new Person("Carlos", 30, new int[]{10,10,10}),
            new Person("Maria",  22, new int[]{20,15,20}),
            new Person( "Diego", 15, new int[]{20,10,20}),
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
        // ordenar
        System.out.println("\nPersonas ordenadas por promedio de notas:\n");
        PersonController PersonController3 = new PersonController();
        PersonController3.sortPersonByAvrNotas(personas);
        //imprimir
        for(Person person: personas){
            System.out.println(person);
        }
        // ordenar 
        System.out.println("\nPersonas ordenadas por valor de nombre:\n");
        PersonController modPersonController = new PersonController();
        modPersonController.sortPersonByvalueName(personas);
        //imprimir 
        for (Person person: personas){
            System.out.println(person);
        }
    }
}
