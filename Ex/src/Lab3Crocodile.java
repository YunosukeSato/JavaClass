public class Lab3Crocodile extends Lab3Reptile{

  public Lab3Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String bone,
      String eggType) {
    super(height, weight, animalType, bloodType, skinType, bone, "Hard-shelled eggs");
  }
  
  public String showInfo() {
    return "Crocodile [Height: " + getHeight() +
    "Weight: " + getWeight() +
    "Animal type: " + getAnimalType() +
    "Blood type: " + getBloodType() +
    "Skin Type: " + getSkinType() +
    "Bone: " + getBone() +
    "Egg type: " + getEggType() +
    "]";
  }
}