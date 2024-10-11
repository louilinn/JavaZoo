public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Zoo!");

        Zoo zoo = new Zoo("Värnamo Zoo");

        InputHandler input = new InputHandler(zoo);

        // Jungle calmJungle = new Jungle("Secret Jungle", true);
        // Jungle dangerJungle = new Jungle("Dangerous Jungle", false);

        // zoo.addPlace(calmJungle);
        // zoo.addPlace(dangerJungle);

        // Monkey monkey1 = new Monkey("Bob", 3, true, false);

        // calmJungle.addAnimal(monkey1);

        // calmJungle.printInfo();

        // calmJungle.printJungle();

        // monkey1.printType();
        // monkey1.specificMonkeyPrint();
        //
    }
}
