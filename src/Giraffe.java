public class Giraffe extends Animal {
  private double neckLength;

  public Giraffe(String name, int age, double neckLength) {
    super(name, age, false, false, 4, false);
    this.neckLength = neckLength;
  }

  public double getNeckLength() {
    return neckLength;
  }

  public void setNeckLength(double neckLength) {
    this.neckLength = neckLength;
  }
}