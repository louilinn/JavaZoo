public class Monkey extends Animal {
  private boolean hasBananaCraving;

  public Monkey(String name, int age, boolean hasBananaCraving, boolean isPredator) {
    super(name, age, false, isPredator, 4, false);
    this.hasBananaCraving = hasBananaCraving;
  }

  public void printType() {
    System.out.println("This is a monkey!");
  }

  public void specificMonkeyPrint() {
    System.out.println("Monkey!");
  }

  public boolean isHasBananaCraving() {
    return hasBananaCraving;
  }

  public void setHasBananaCraving(boolean hasBananaCraving) {
    this.hasBananaCraving = hasBananaCraving;
  }

  public void printBasicInfo() { // overrides super method
    System.out.print(this.getName() + " is " + this.getAge() + " years old. ");
    if (hasBananaCraving) {
      System.out.println(this.getName() + " would really like a banana!");
    }
  }
}
