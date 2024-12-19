import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Bank_Management extends JWindow {

	private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

	public Bank_Management () {

		JLabel lbImage    = new JLabel (new ImageIcon ("Splash.jpg"));
		Color cl = new Color (0, 0, 0);
		lbImage.setBorder (new LineBorder (cl, 1));

		getContentPane().add (lbImage, BorderLayout.CENTER);
		pack();

		setSize (getSize().width, getSize().height);
		setLocation (d.width / 2 - getWidth() / 2, d.height / 2 - getHeight() / 2);

		//show();

		for (int i = 0; i <= 1000; i++) { }

		new BankSystem ();

		toFront();
		dispose ();
		setVisible (false);

	}

	public static void main (String args[]) {
		
		new Bank_Management ();

	}

}
