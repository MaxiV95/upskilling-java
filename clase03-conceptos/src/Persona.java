public class Persona implements Comparable<Persona> {
    private static final int MAYOR_EDAD = 18;
    private String name;
    private String lastName;
    private int age;

    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean esMayor() {
        return age >= MAYOR_EDAD;
    }

    @Override
    public String toString() {
        return name + "\t" + lastName + "\t(" + age + " años)";
    }

    @Override
    public int compareTo(Persona otraPersona) {
        int orden = this.name.compareTo(otraPersona.name); // para descendente: *-1
        if (orden == 0) {
            orden = this.lastName.compareTo(otraPersona.lastName);
        }
        return orden;
        //return Integer.compare(this.getAge(), otraPersona.getAge());
    }
}
