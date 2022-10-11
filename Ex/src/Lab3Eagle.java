public class Lab3Eagle extends Lab3Birds{

  
  

 public Lab3Eagle(int height, int weight, String animalType, String bloodType, String features, boolean canFly) {
    super(height, weight, animalType, bloodType, features, canFly);
  }

 public String showInfo() {
  return "Eagle [Height: " + getHeight() +
  "Weight: " + getWeight() +
  "Animal type: " + getAnimalType() +
  "Blood type: " + getBloodType() +
  "features: " + getFeatures() +
  "canFly: " + isCanFly() +
  "]";
}

}