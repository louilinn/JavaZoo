public class Animal {
  private String name;
  private int age;
  private boolean canFly;
  private boolean isPredator;
  private int nbrOfLegs;
  private boolean isWaterAnimal;

  public Animal(String name, int age, boolean canFly, boolean isPredator, int nbrOfLegs, boolean isWaterAnimal) {
    this.name = name;
    this.age = age;
    this.canFly = canFly;
    this.isPredator = isPredator;
    this.nbrOfLegs = nbrOfLegs;
    this.isWaterAnimal = isWaterAnimal;
  }

  public void printType() {
    System.out.println("Unknown Type");
  }

  public void printBasicInfo() {
    System.out.println(this.name + " is " + this.age + " years old");
  }

  public void printExtendedInfo() {
    System.out.println(this.name + " is " + this.age + " years old");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  public boolean isPredator() {
    return isPredator;
  }

  public void setPredator(boolean isPredator) {
    this.isPredator = isPredator;
  }

  public int getNbrOfLegs() {
    return nbrOfLegs;
  }

  public void setNbrOfLegs(int nbrOfLegs) {
    this.nbrOfLegs = nbrOfLegs;
  }

  public boolean isWaterAnimal() {
    return isWaterAnimal;
  }

  public void setWaterAnimal(boolean isWaterAnimal) {
    this.isWaterAnimal = isWaterAnimal;
  }

}
