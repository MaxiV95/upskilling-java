/*
Esta interfaz define un único método llamado `compareTo()`, que se utiliza para
comparar un objeto con otro objeto del mismo tipo.
El objetivo principal de la interfaz `Comparable<T>` es proporcionar una forma de
comparar objetos y determinar su orden. Al implementar esta interfaz en una clase,
podemos definir cómo se debe realizar la comparación entre dos objetos de esa clase.
Esto es especialmente útil cuando necesitamos ordenar una lista de objetos según algún
criterio específico.
*/
interface Comparable<T> {
    int compareTo(T object);
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Comparación basada en la edad de las personas
        return Integer.compare(this.age, otherPerson.age);
    }
}

public class MainComparable {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        int result = person1.compareTo(person2);
        System.out.println(result);
        if (result < 0) {
            System.out.println(person1.getName() + " es menor que " + person2.getName());
        } else if (result > 0) {
            System.out.println(person1.getName() + " es mayor que " + person2.getName());
        } else {
            System.out.println(person1.getName() + " es igual a " + person2.getName());
        }
    }
}

