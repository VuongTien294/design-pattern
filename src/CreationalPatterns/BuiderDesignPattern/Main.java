package CreationalPatterns.BuiderDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Immutable Person object is initiated with build() method
        Person person = new Person.PersonBuilder()
                .id(666)
                .name("Levent")
                .surname("Divilioglu")
                .setOccupied(true)
                .build();

        System.out.println(person);
    }
}
