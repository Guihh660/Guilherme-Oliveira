import javax.swing.JOptionPane;

public class GUIH {
  public static void main(String[] args) {
    String weightInput = JOptionPane.showInputDialog("Enter your weight in kilograms: ");
    double weight = Double.parseDouble(weightInput);
    String heightInput = JOptionPane.showInputDialog("Enter your height in meters: ");
    double height = Double.parseDouble(heightInput);
    double bmi = weight / (height * height);
    String message;
    if (bmi < 18.5) {
      message = "Underweight";
    } else if (bmi < 25) {
      message = "Normal weight";
    } else if (bmi < 30) {
      message = "Overweight";
    } else {
      message = "Obesity";
    }
    JOptionPane.showMessageDialog(null, "Your BMI is " + bmi + ". You are considered " + message + ".");
  }
}
