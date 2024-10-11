import java.util.ArrayList;

public class Place {
  private String name;
  private boolean isAquarium;
  private boolean isSafe;
  private boolean hasTrees;
  private ArrayList<Animal> animals = new ArrayList<>();

  public Place(String name, boolean isAquarium, boolean isSafe, boolean hasTrees) {
    this.name = name;
    this.isAquarium = isAquarium;
    this.isSafe = isSafe;
    this.hasTrees = hasTrees;
  }

  public void printInfo() {
    System.out.println("This place is called " + name + ".");
    if (isAquarium) {
      System.out.println("It is an aquarium");
    }

    if (isSafe) {
      System.out.println("It is safe!");
    } else {
      System.out.println("IT IS NOT SAFE!");
    }

    if (hasTrees) {
      System.out.println("It has trees");
    }

    System.out.println("These animals live here: ");
    for (Animal animal : animals) {
      animal.printBasicInfo();
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isAquarium() {
    return isAquarium;
  }

  public void setAquarium(boolean isAquarium) {
    this.isAquarium = isAquarium;
  }

  public boolean isSafe() {
    return isSafe;
  }

  public void setSafe(boolean isSafe) {
    this.isSafe = isSafe;
  }

  public boolean isHasTrees() {
    return hasTrees;
  }

  public void setHasTrees(boolean hasTrees) {
    this.hasTrees = hasTrees;
  }

  public ArrayList<Animal> getAnimals() {
    return animals;
  }

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }

}
