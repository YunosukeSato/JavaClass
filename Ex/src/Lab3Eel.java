public class Lab3Eel extends Lab3Fish{
  private String feature;

  public Lab3Eel(int height, int weight, String animalType, String bloodType, String habitat, boolean hasGills) {
    super(height, weight, animalType, bloodType, habitat, hasGills);
    this.feature = "Release electric charge";
  }

  public String getFeature() {
    return feature;
  }
  
  public String showInfo() {
    return "Eagle [Height: " + getHeight() +
    "Weight: " + getWeight() +
    "Animal type: " + getAnimalType() +
    "Blood type: " + getBloodType() +
    "Habitat: " + getHabitat() +
    "Has Gills: " + isHasGills() +
    "Feature: " + getFeature() +
    "]";
  }
}
