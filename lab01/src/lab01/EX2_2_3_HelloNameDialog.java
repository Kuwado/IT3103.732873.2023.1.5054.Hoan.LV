package lab01;
import javax.swing.JOptionPane;

public class EX2_2_3_HelloNameDialog {
		public static void main(String[] args) {
			String result;
			result = JOptionPane.showInputDialog("Please enter your name: ");
			JOptionPane.showMessageDialog(null, "Hi "+ result + "!");
			System.exit(0);
	}
}

