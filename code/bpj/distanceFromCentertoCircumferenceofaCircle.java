import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class distanceFromCentertoCircumferenceofaCircle
{
    public static void main(String[] args)
    {
        String area = "What is the area?";
        double oreo = Double.parseDouble(JOptionPane.showInputDialog(area));

        double milk = (oreo/Math.PI);
        double stufOreo = Math.sqrt(milk);

        DecimalFormat strawberryOreo = new DecimalFormat ("###.#");
        String goldenOreo = strawberryOreo.format(stufOreo);

        JOptionPane.showMessageDialog(null, "Radius of your circle is " + goldenOreo);
    }
}