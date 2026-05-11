package controllers;

import models.Person;

public class PersonController {
    // Metodo que ordena un arreglo de persona
    // por su EDAD (age),con metodo insercion 

    public void sortPersonByAge(Person[]personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                personas[j + 1] = personas[j];
                j--;
    }
    personas[j + 1] = aux;
        }
    }
    public void sortPersonByName(Person[]personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }
    // Metodo ordena las personas segun el 
    // promedio de sus notas con seleccion
    public void sortPersonByAvrNotas(Person[]personas){
        for (int i = 0; i < personas.length; i++){
            int index = i;

            for (int j = i + 1; j < personas.length; j++){
                // Comparacion para actualizar el indice 
                if (personas[j].getPromedio() < personas[index].getPromedio()){
                    index = j; // actualizar el indice del menor elemento
                }  
            }
            // Pregunto si el index != de i 
            // entonces cambio posiciones
            if (i != index){
                Person aux = personas[i];
                personas[i] = personas[index];
                personas[index] = aux;
            }
        }
    }
    public void sortPersonByvalueName(Person[] personas) {
        
    }
    
}

