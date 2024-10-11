import java.util.ArrayList;

public class Zoo {
  private String name;
  private ArrayList<Place> places = new ArrayList<>();

  public Zoo(String name) {
    this.name = name;
    addPlace(new Place("Välkomstplatsen", false, false, false));
  }

  public String getName() {
    return name;
  }

  public ArrayList<Place> getPlaces() {
    return places;
  }

  public void addPlace(Place place) {
    places.add(place);
  }

  public void addAnimalToDefaultPlace(Animal animal) {
    Place welcome = places.get(0);
    welcome.addAnimal(animal);
  }

  public void printAbout() {
    for (Place place : places) {
      place.printInfo();
    }
  }

}
