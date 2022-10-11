public class Lab3Birds extends Lab3Animal{
  private String features;
  private boolean canFly;
  
  

  public Lab3Birds(int height, int weight, String animalType, String bloodType, String features, boolean canFly) {
    super(height, weight, animalType, bloodType);
    this.features = features;
    this.canFly = canFly;
  }



  public String getFeatures() {
    return features;
  }



  public boolean isCanFly() {
    return canFly;
  }

  
}

