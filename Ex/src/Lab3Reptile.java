public class Lab3Reptile extends Lab3Animal{
  private String skinType;
  private String bone;
  private String eggType;

  public Lab3Reptile(int height, int weight, String animalType, String bloodType, String skinType, String bone,
      String eggType) {
    super(height, weight, animalType, bloodType);
    this.skinType = skinType;
    this.bone = bone;
    this.eggType = eggType;
  }

  public String getSkinType() {
    return skinType;
  }

  public String getBone() {
    return bone;
  }

  public String getEggType() {
    return eggType;
  }

  
  
}
