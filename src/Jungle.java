public class Jungle extends Place {

  public Jungle(String name, boolean isSafe) {
    super(name, false, isSafe, true);
  }

  public void printJungle() {
    System.out.println("Hey Jungle!");
  }
}
