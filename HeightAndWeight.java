public class HeightAndWeight {
  private int height;
  private int weight;

  public HeightAndWeight(int height, int weight) {
      this.height = height;
      this.weight = weight;
  }

  public int getHeight() {
      return height;
  }

  public int getWeight() {
      return weight;
  }

  @Override
  public String toString() {
      return "Height: " + height + " in. " +
             "Weight: " + weight + " lbs";
  }

  public double getBMI() {
      return convertPoundsToKgs(weight) / 
             Math.pow(convertInchesToMeters(height), 2);
  }

  public boolean healthyBMI() {
      double bmi = getBMI();
      return bmi >= 18.5 && bmi <= 24.9;
  }

  public String getDescript() {
      double bmi = getBMI();
      if (bmi < 18.5) {
          return "Underweight";
      } else if (bmi >= 18.5 && bmi <= 24.9) {
          return "Healthy weight";
      } else if (bmi >= 25 && bmi <= 29.9) {
          return "Overweight";
      } else {
          return "Obese";
      }
  }

  private double convertInchesToMeters(int inches) {
      return inches * 0.0254;
  }

  private double convertPoundsToKgs(int pounds) {
      return pounds * 0.453592;
  }
}