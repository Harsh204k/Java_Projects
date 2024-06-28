import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String heightString=JOptionPane.showInputDialog("What's your height (m)? ");
        double height=Double.parseDouble(heightString);
        int weight=Integer.parseInt(JOptionPane.showInputDialog("What's your weight (kg)?"));
        double bmi=weight/(height*height);
        JOptionPane.showMessageDialog(null, "Your BMI is: "+bmi+".");
    }
}
