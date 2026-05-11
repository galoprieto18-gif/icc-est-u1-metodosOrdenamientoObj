package models;

public class Person {

    private String name;
    private int age;
    private int [] notas; 
    
    public Person(String name, int age, int [] notas) {
        this.name = name;
        this.age = age;
        this.notas = notas;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
    public int setAge(int age) {
        this.age = age;
        return age;
    }
    public int [] setNotas(int [] notas) {
        this.notas = notas;
        return notas;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int [] getNotas() {
        return notas;
    }
    @Override
    public String toString() {
        return "Person [name= " + name + ", age=" + age + ", vN=" + valueName() + ", avr=" + getPromedio() + "]";
    }
    public int getPromedio(){
        // (Calcular el promedio de las notas)/ cantidad de notas
        int suma = 0;
        for (int nota : notas){
            suma += nota;
        }
        return suma / notas.length;
    }
    // Ordenar el arreglo de personas por un valor de su nombre 
    // el valor del nombre sera la cantidad de letras 
    // donde las vocales valen 5 
    // consonantes valen el valor de la edad 
    // Ej: Juan 20                  Ej: Ana 80
    // 20 + 5 + 5 + 20 = 50         5 + 80 + 5 = 90
    public int valueName(){
        int value = 0;
        for (int i = 0; i < name.length(); i++){
            char letra = name.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                value += 5;
             else 
                value += age;
        }
        return value;
    }
}

 
