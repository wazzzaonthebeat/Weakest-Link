import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainGamePlay extends Round {

	
	
	

	private static boolean name;

	public MainGamePlay(int aRound,int aCorrect, int aWrong, String aStatus, double aBank, double mBank, boolean menu, boolean name2) {
		super(aRound, aCorrect, aWrong, aStatus, aBank, mBank,menu);
		// TODO Auto-generated constructor stub
	//	super.repaint();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		round = 1;
		correct = 0;
		wrong = 0;
		status = "Neutral";
		bank = 0.00;
		bankMain = 0.00;
	//	timerTextMin = 1; 
		voting = false;
		menu = true;
		name = true;
		playerName = "none";
		newGame();
		frame = new JFrame("The Weakest Link");
		

			frame.setSize(1200, 750);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			System.out.println(bankMain);

		    MainGamePlay p = new MainGamePlay(round,correct,wrong, status,bank,bankMain,menu,name);

				//f.add(Background);
		//	frame.add(background);
			frame.add(p);
			frame.setVisible(true);
			
	}

}
