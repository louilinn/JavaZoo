import java.util.Scanner;

public class InputHandler {

  private Scanner scanner = new Scanner(System.in);
  private Zoo zoo;

  public InputHandler(Zoo zoo) {
    this.zoo = zoo;

    run();
  }

  // display Menu
  public void displayMainMenu() {
    System.out.println("Vad vill du göra? ");
    System.out.println("A. Lägg till en plats");
    System.out.println("B. Lägg till ett djur");
    System.out.println("C. Hantera en plats");
    System.out.println("D. Hantera ett djur");
    System.out.println("E. Skriv ut information om Zooet ");
  }

  public void run() {
    boolean running = true;

    while (running) {
      displayMainMenu();
      String input = scanner.nextLine();
      switch (input) {
        case "A":
          break;
        case "B":

          addAnimal();
          break;
        case "C":

          break;
        case "D":

          break;
        case "E":

          break;
        default:
          break;
      }
    }
  }

  public void addAnimal() {
    System.err.println("Vilket djur vill du lägga till?");
    String typeOfAnimal = scanner.nextLine();

    switch (typeOfAnimal) {
      case "apa":
        Monkey monkey = new Monkey("Kalle", 0, false, false);
        zoo.addAnimalToDefaultPlace(monkey);
        System.out.println("La till apan: ");
        monkey.printBasicInfo();
        break;
      default:
        System.out.println("Just nu kan du bara lägga till apor. Skriv \"apa\"");
        break;
    }
  }

  //
}
