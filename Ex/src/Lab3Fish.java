public class Lab3Fish extends Lab3Animal{
  private String habitat;
  private boolean hasGills;

  public Lab3Fish(int height, int weight, String animalType, String bloodType) {
    super(height, weight, animalType, bloodType);
    habitat = "Live in water";
    hasGills = true;
  }

  public Lab3Fish(int height, int weight, String animalType, String bloodType, String habitat, boolean hasGills) {
    super(height, weight, animalType, bloodType);
    this.habitat = habitat;
    this.hasGills = hasGills;
  }

  public String getHabitat() {
    return habitat;
  }

  public boolean isHasGills() {
    return hasGills;
  }

}
