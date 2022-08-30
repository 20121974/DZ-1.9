public class Main {
    public static void main(String[] args) {
        PersonServis personServis = new PersonServis();
        Person sarah = new Person("Sarah", 30);
        if (personServis.isAdult(sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("иди в школу");
        }
        System.out.println(sarah);
        sarah.increaseAge(-30);
    }

}