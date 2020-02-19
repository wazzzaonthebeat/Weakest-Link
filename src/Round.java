import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.util.TimerTask;
import java.awt.Image;
public class Round extends JPanel implements ActionListener, MouseListener, MouseMotionListener{

	//instance variables
	private JLabel labelUsername = new JLabel("Welcome: ");
	
	protected static String playerName;
	private JLabel correctPlayer,wrongPlayer,statusPlayer;

	protected JLabel scoreTitle;
	protected static Integer correct;

	protected static Integer wrong;
	protected static double bank;

	protected static double bankMain;
	protected static String status;
	private int width, height;

	private static int intellPlayer1;

	private static int intellPlayer2;

	private static int intellPlayer3;

	private static int intellPlayer4;

	private int timerTextMin;

	private int timerTextSecs;
	private JPanel Background;

	protected static JPanel GameTitle;

	protected JPanel PlayerPanel;

	private JPanel panelPlayer1;

	private JPanel panelPlayer2;

	private JPanel panelPlayer3;

	private JPanel panelPlayer4;

	private JPanel GameScreen;

	protected JPanel questionBox1;

	protected JPanel questionBox2;
	protected JLabel gameTitle;

	private JLabel labelPlayer1;

	private JLabel labelPlayer2;

	private JLabel labelPlayer3;

	private JLabel labelPlayer4;

	private JLabel questionText;
	private JSpinner minutesField;
	private JSpinner secondsField;

	private static int correctPlayer1;

	private static int correctPlayer2;

	private static int correctPlayer3;

	private static  int correctPlayer4;
	private static int wrongPlayer1;

	private static int wrongPlayer2;

	private static int wrongPlayer3;

	private static int wrongPlayer4;

	private int Level;
	private static String statusPlayer1;

	private static String statusPlayer2;

	private static String statusPlayer3;

	private static String statusPlayer4;
	
	private JLabel correctLabelPlayer1,correctLabelPlayer2,correctLabelPlayer3,correctLabelPlayer4,bankPlayer,timerText,timerTitle;
	private JLabel wrongLabelPlayer1,wrongLabelPlayer2,wrongLabelPlayer3,wrongLabelPlayer4,namePlayer;
	private JLabel statusLabelPlayer1,statusLabelPlayer2,statusLabelPlayer3,statusLabelPlayer4,choiceAText,choiceBText,choiceDText,choiceCText;
	
	private JButton choiceA,choiceB,choiceC,choiceD, passButton,bankButton;
	private JPanel choices,playerBox;

	protected JPanel timerBox;

	protected JPanel scoreBoard;
	private Questions questions = new Questions();
	private JLabel level1Text,level2Text,level3Text,level4Text,level5Text,level6Text,level7Text,level8Text,level9Text,level10Text;
	protected JPanel bankHolder;

	protected JPanel actionHolder;

	protected JPanel gameStatusHolder;
	private JLabel gameStatus;
	private JLabel bankText,bankLabel;
	
	
	private Border paddingBorder = BorderFactory.createEmptyBorder(10,10,10,10);
	private Border noPaddingBorder = BorderFactory.createEmptyBorder(0,0,0,0);

	private Border whiteBorder = BorderFactory.createLineBorder(Color.WHITE);
	private Border redBorder = BorderFactory.createLineBorder(Color.RED);
	private Border orangeBorder = BorderFactory.createLineBorder(Color.ORANGE);
	private JButton voteButton;
	private JPanel windowHolder;
	private JLabel windowMessage;
	private JLabel windowMessage2;

	public static JFrame frame;
	static Computer player1;

	static Computer player2;

	static Computer player3;

	static Computer  player4;
	
	private boolean running;
	private int seconds;
	
	Timer roundTimer;	//timer for count down (5 minutes)

	private Timer computerTimer;

	private boolean computerDone;

	private boolean p1done;

	private boolean p2done;

	private boolean p3done;

	private boolean p4done;

	private Timer player4Timer;

	private Timer player3Timer;

	private Timer player2Timer;

	private Timer player1Timer;

	private boolean windowOpen;

	protected static int round;
	protected Object Image;

	private JPanel panelStats;

	private JLabel labelStrongest;

	private JLabel labelWeakest;

	private JLabel labelText;

	private JPanel mainContent;

	private JLabel labelText2;

	private JPanel panelVote;

	private JButton buttonVote1;

	private JButton buttonVote2;

	private JButton buttonVote3;

	private JButton buttonVote4;

	protected  String strongestLink;

	private String weakestLink;

	private int playerVote;

	private JButton buttonNextRound;

	protected static boolean voting;

	protected static String newRound;
	
	private  Clip backgroundMusic,votingMusic,introMusic;
	protected static ArrayList elliminated = new ArrayList<Integer>();
	
	private static Round mainGamePanel;
	
	private ArrayList contestants = new ArrayList<Integer>();

	private JPanel GamePlayPanel;

	private int averageVote;

	private JPanel votes;

	private int p4vote;

	private int p3vote;

	private int p2vote;

	private int p1vote;

	private JComponent voteText1;

	private JLabel voteText2;

	private JLabel voteText3;
	protected static boolean menu;
	private JLabel voteText4;

	private JButton buttonSudden;

	private ArrayList<String> player1Votes;

	private ArrayList<String> player2Votes;

	private ArrayList<String> player3Votes;

	private ArrayList<String> player4Votes;

	private ArrayList<String> playerVotes;
	private ArrayList<String> playing = new ArrayList<String>();

	private JLabel background;

	private JButton buttonNewGame;

	private JButton buttonExitGame;

	private Clip suddenMusic;

	private JPanel emptyPlayer;

	private JPanel emptyPlayer1;

	private JPanel emptyPlayer2;

	private JPanel emptyPlayer3;

	private JPanel emptyPlayer4;

	private JPanel MenuPanel;

	private JButton startButton;

	private JButton quitButton;

	private JButton helpButton;

	private JPanel MenuButtons;

	private JTextField UserTextField;

	private JLabel UserTextLabel;

	private JButton startButton1;
	public static void main (String [] args){
		
		 frame = new JFrame("The Weakest Link");

		 frame.setSize(new Dimension(1200,800));		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menu = false;
		round = 0;
	

		 mainGamePanel = new Round(round,0,0,"Neutral",0.00,0.00,menu);
		
		
     
       // p.add(label);
		//	f.add(Background);
		newGame();
		
		frame.add(mainGamePanel);
		
		//frame.pack();
		frame.setVisible(true);
		
		
		
		
	}
	protected static void newGame() {
		// TODO Auto-generated method stub
		//initialise players
		 player1 = new Computer ();
			
			//update scores
			correctPlayer1 = player1.getCorrect();
			wrongPlayer1 = player1.getWrong();
			statusPlayer1 =	player1.getStatus();	
			intellPlayer1 = player1.getIntelligence();
			
	
		//	System.out.println(arg0);
		
		 player2 = new Computer ();
		
			//update scores
			correctPlayer2 = player2.getCorrect();
			wrongPlayer2 = player2.getWrong();
			statusPlayer2 =	player2.getStatus();	
			intellPlayer2 = player2.getIntelligence();
			
			
		 player3 = new Computer ();
			//update scores
			correctPlayer3 = player3.getCorrect();
			wrongPlayer3 = player3.getWrong();
			statusPlayer3 =	player3.getStatus();	
			intellPlayer3 = player3.getIntelligence();
			
			
		 player4 = new Computer ();
			//update scores
			correctPlayer4 = player4.getCorrect();
			wrongPlayer4 = player4.getWrong();
			statusPlayer4 =	player4.getStatus();	
			intellPlayer4 = player4.getIntelligence();
	}
	//create title text of game
	public void gameTitle (int textSize, Point size , Point position, Color color){
		
		//jpanel of title screebn
				GameTitle = new JPanel (new GridLayout (1,1));
				GameTitle.setSize(size.x,size.y);
				GameTitle.setLocation(position.x,position.y);
				GameTitle.setBackground(new Color(0,0,30));

				String title = "The Weakest Link - Round ";
				
				
				
				gameTitle = new JLabel(title+round ,SwingConstants.LEFT);
				gameTitle.setForeground(Color.WHITE);
				gameTitle.setLocation(position.x,position.y);
				gameTitle.setSize(size.x, size.y);
				gameTitle.setFont(new Font("Verdana", Font.PLAIN, textSize));
				gameTitle.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));

				System.out.println("New Game Title: "+"The Weakest Link! - Round "+round);
				GamePlayPanel.add(GameTitle);

				GameTitle.add(gameTitle);
	}
	
	public Round(int aRound,int aCorrect,int aWrong,String aStatus,double aBank,double mBank, boolean aMenu) {
		
		
		

		//check whether game or manu

		if (aMenu){

			if (playerName.equals("none")){

				MenuPanel = new JPanel ();
				MenuPanel.setSize(1200,750);
				MenuPanel.setLocation(0, 0);
				MenuPanel.setLayout(null);
				MenuPanel.setBackground(new Color (0,0,10));

				//jpanel of title screebn
				GameTitle = new JPanel (new GridLayout (1,1));
				GameTitle.setSize(1200,50);
				GameTitle.setLocation(0,0);
				GameTitle.setBackground(new Color(0,0,30));

				gameTitle = new JLabel("The Weakest Link!" ,SwingConstants.LEFT);
				gameTitle.setForeground(Color.WHITE);
				gameTitle.setFont(new Font("Verdana", Font.PLAIN, 30));
				gameTitle.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));


				//jpanel of title screebn
				MenuButtons = new JPanel (new GridLayout (3,1));
				MenuButtons.setSize(400,200);
				MenuButtons.setLocation((1200/2)-200,(800/2)-100);
				MenuButtons.setBackground(new Color(0,0,30));

				UserTextLabel = new JLabel("Please enter your name!");
				UserTextLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
				UserTextLabel.setForeground(Color.WHITE);
				UserTextLabel.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
				
				UserTextField = new JTextField();
				UserTextField.setBackground(Color.WHITE);
				UserTextField.setForeground(Color.BLACK);
				UserTextField.setFont(new Font("Verdana", Font.PLAIN, 20));	
				UserTextField.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
				
				
				startButton1 = new JButton("Start Game!");
				startButton1.setForeground(Color.WHITE);
				startButton1.setFont(new Font("Verdana", Font.PLAIN, 30));
				startButton1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
				startButton1.setBackground(new Color (0,0,10));
				startButton1.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						playerName = UserTextField.getText();
						
						round = 1;
						correct = 0;
						wrong = 0;
						status = "Neutral";
						bank = 0.00;
						bankMain = 0.00;
						//	timerTextMin = 1; 
						voting = false;
						menu = true;
						newGame();
						frame.dispose();
						frame = new JFrame("The Weakest Link");


						frame.setSize(1200, 750);
						frame.setResizable(false);
						frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

						System.out.println(bankMain);

						Round p = new Round(round,correct,wrong, status,bank,bankMain,menu);

						//f.add(Background);
						//	frame.add(background);
						frame.add(p);
						frame.setVisible(true);


					}


				});

				MenuPanel.add(GameTitle);
				MenuButtons.add(UserTextLabel);
				MenuButtons.add(UserTextField);
				MenuButtons.add(startButton1);
				MenuPanel.add(MenuButtons);
				
				this.add(MenuPanel);
				GameTitle.add(gameTitle);
				this.setLayout(null);
				this.validate();
		
				
			}else{
				//draw menu
				MenuPanel = new JPanel ();
				MenuPanel.setSize(1200,750);
				MenuPanel.setLocation(0, 0);
				MenuPanel.setLayout(null);
				MenuPanel.setBackground(new Color (0,0,10));


				//this.add(background);
				//	this.setBackground(new Color(0,0,0));
				try {
					// Open an audio input stream.
					URL url = this.getClass().getClassLoader().getResource("intro.wav");
					AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
					// Get a sound clip resource.
					backgroundMusic = AudioSystem.getClip();
					// Open audio clip and load samples from the audio input stream.
					backgroundMusic.open(audioIn);
					backgroundMusic.start();
					backgroundMusic.loop(999);
				} catch (UnsupportedAudioFileException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (LineUnavailableException e) {
					e.printStackTrace();
				}

				//jpanel of title screebn
				GameTitle = new JPanel (new GridLayout (1,1));
				GameTitle.setSize(1200,50);
				GameTitle.setLocation(0,0);
				GameTitle.setBackground(new Color(0,0,30));

				gameTitle = new JLabel("The Weakest Link!" ,SwingConstants.LEFT);
				gameTitle.setForeground(Color.WHITE);
				gameTitle.setFont(new Font("Verdana", Font.PLAIN, 30));
				gameTitle.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));


				//jpanel of title screebn
				MenuButtons = new JPanel (new GridLayout (3,1));
				MenuButtons.setSize(400,200);
				MenuButtons.setLocation((1200/2)-200,(800/2)-100);
				MenuButtons.setBackground(new Color(0,0,30));


				startButton = new JButton("Play The Weakest Link!");
				startButton.setForeground(Color.WHITE);
				startButton.setFont(new Font("Verdana", Font.PLAIN, 30));
				startButton.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
				startButton.setBackground(new Color (0,0,10));
				startButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						round = 1;
						correct = 0;
						wrong = 0;
						status = "Neutral";
						bank = 0.00;
						bankMain = 0.00;
						//	timerTextMin = 1; 
						voting = false;
						menu = false;
						newGame();
						frame.dispose();
						frame = new JFrame("The Weakest Link");
						backgroundMusic.stop();

						frame.setSize(1200, 750);
						frame.setResizable(false);
						frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

						System.out.println(bankMain);

						Round p = new Round(round,correct,wrong, status,bank,bankMain,menu);

						//f.add(Background);
						//	frame.add(background);
						frame.add(p);
						frame.setVisible(true);


					}


				});

				helpButton = new JButton("Help!");
				helpButton.setForeground(Color.WHITE);
				helpButton.setFont(new Font("Verdana", Font.PLAIN, 30));
				helpButton.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
				helpButton.setBackground(new Color (0,0,10));
				helpButton.addActionListener(new ActionListener(){

					private JLabel helpText;
					private JPanel helpPanel;
					private JButton backButton;

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						MenuButtons.setVisible(false);

						helpPanel = new JPanel (new GridLayout (1,1));
						helpPanel.setSize(600,400);
						helpPanel.setLocation((1200/2)-300,(800/2)-200);
						helpPanel.setBackground(new Color(0,0,30));


						helpText = new JLabel("<html> Weakest Link is a team quiz game show! "
								+ "<br> Objective is to earn as much money as possible with your four teamates!"
								+ "<br>Every multiple choice question you answer correct, you earn money and every wrong, you lose money!"
								+ "<br><br> To ensure you keep money you earned click the bank money button before you play! "
								+ "<br>  "
								+ "<br> Every round you and your team members vote for the weakest player until there is only two of you left! "
								+ "<br> At that point we play sudden death, first person to answer wrong loses!");
						helpText.setForeground(Color.WHITE);
						helpText.setFont(new Font("Verdana", Font.PLAIN, 20));
						helpText.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));

						backButton = new JButton("Back");
						backButton.setForeground(Color.WHITE);
						backButton.setFont(new Font("Verdana", Font.PLAIN, 30));
						backButton.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
						backButton.setBackground(new Color (0,0,10));
						backButton.setSize(600,50);
						backButton.setLocation((1200/2)-300,600);
						backButton.addActionListener(new ActionListener(){


							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								MenuButtons.setVisible(true);
								helpPanel.setVisible(false);
								backButton.setVisible(false);

							}



						});
						helpPanel.add(helpText);
						MenuPanel.add(helpPanel);
						MenuPanel.add(backButton);
						MenuPanel.repaint();

					}


				});

				quitButton = new JButton("Quit");
				quitButton.setForeground(Color.WHITE);
				quitButton.setFont(new Font("Verdana", Font.PLAIN, 30));
				quitButton.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
				quitButton.setBackground(new Color (0,0,10));
				quitButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						frame.dispose();
					}


				});

				MenuButtons.add(startButton);

				MenuButtons.add(helpButton);

				MenuButtons.add(quitButton);
				GameTitle.add(gameTitle);
				this.setLayout(null);
				this.validate();
				//	this.add(background);	

				MenuPanel.add(GameTitle);

				MenuPanel.add(MenuButtons);
				this.add(MenuPanel);GameTitle.add(gameTitle);
				this.setLayout(null);
				this.validate();


			}
			

		}else{
			//	super.setPreferredSize(new Dimension(1200, 750));
			correct = 0;
			wrong = 0;

			//player 1 reset 
			player1.resetCorrect();
			correctPlayer1 = 0;
			wrongPlayer1 = 0;

			//player 2 reset 
			player2.resetCorrect();
			correctPlayer2 = 0;
			wrongPlayer2 = 0;

			//player 3 reset 
			player3.resetCorrect();
			correctPlayer3 = 0;
			wrongPlayer3 = 0;

			//player 4 reset 
			player4.resetCorrect();
			correctPlayer4 = 0;
			wrongPlayer4 = 0;

			status = "Neutral";
			bank = aBank;
			bankMain = mBank;
			timerTextMin = 2;
			timerTextSecs = 30;
			//weakestLink = "null";

			GamePlayPanel = new JPanel ();
			GamePlayPanel.setSize(1200,750);
			GamePlayPanel.setBackground(new Color (0,0,0));
			GamePlayPanel.setLocation(0, 0);
			GamePlayPanel.setLayout(null);

			//set default strongest and weakest link

			defaultLinks ();
			playMusic();

			Image image = null;
			try {
				URL url = this.getClass().getClassLoader().getResource("background.jpg");
				image = ImageIO.read(url);
			} catch (IOException e) {
				e.printStackTrace();
			}


			background = new JLabel(new ImageIcon(image));
			background.setSize(1200,750);
			background.setLocation(0,0);
			background.setLayout(null);

			//	this.setBackground(new Color(0,0,0));

			this.setLayout(null);


			if (round < 0){

				//voting//
				statsBox();
			}
			else if (round == -5){

				// game over
			}else{

				//normal game play

				Point size = new Point (1200,50);
				Point location = new Point (0,0);
				int textSize = 20;
				Color color = Color.WHITE;
				newRound = String.valueOf(round);
				gameTitle(textSize, size,location, color );

				GameTitle.add(gameTitle);

				//main game panel

				//jpanel of welcome scree
				PlayerPanel = new JPanel (new GridLayout (4,1));

				PlayerPanel.setBackground(new Color (0,0,0,0));

				//create border

				//add attritubes of jpanel
				PlayerPanel.setLocation(0,50);
				PlayerPanel.setSize(310,410);
				GamePlayPanel.add(PlayerPanel);

				//enable on Click for chioces
				choices =  new JPanel (new GridLayout (1,4));

				choiceA =  new JButton ();
				choiceA.addActionListener(this);
				choiceB =  new JButton ();
				choiceB.addActionListener(this);
				choiceC =  new JButton ();
				choiceC.addActionListener(this);
				choiceD =  new JButton ();
				choiceD.addActionListener(this);

				choices.setVisible(false);

				//draw


				drawComputerBox();
				drawPlayerBox();
				drawTimer(timerTextSecs,timerTextMin);
				newGameStatus("|| Game Loading! ||");
				bank("start");
				//delay at begining of round

				Timer startRoundDelay = new Timer(5000,new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						drawQuestionBox();
						startTimer();
						gameStatus("|| Your turn to play! ||");

						GamePlayPanel.validate();
						GamePlayPanel.repaint();

						bank("start");
						System.out.println("Start Round!!");


					}


				});


				startRoundDelay.setRepeats(false);
				startRoundDelay.setInitialDelay(5000);
				startRoundDelay.start();
				startRoundDelay.setRepeats(false);

				drawScoreBoard(0);
				newDrawBank();
				playerActions();


				if (startRoundDelay.isRunning()){

					GamePlayPanel.revalidate();
					GamePlayPanel.repaint();



				}else{

					drawComputerBox();
					drawPlayerBox();
					drawScoreBoard(0);
					newDrawBank();
					playerActions();
					bank("me");
					GamePlayPanel.revalidate();
					GamePlayPanel.repaint();
				}
				choices.setVisible(true);

				GamePlayPanel.validate();
				GamePlayPanel.setBackground(new Color (0,0,0,0));
				this.validate();
				this.add(GamePlayPanel);

				this.add(background);	
			


			}
			GamePlayPanel.setBackground(new Color (0,0,0,0));
			this.add(background);	
		}

			

	}
		  
		  
	private void defaultLinks() {
		// TODO Auto-generated method stub
			
			if (player1.isOut()){


			}else {

				playing.add("1");
				System.out.println("Player 1 is in this round");
				
				
			}

			if (player2.isOut()){


			}else {

				playing.add("2");
				System.out.println("Player 2 is in this round");
			}

			if (player3.isOut()){


			}else {

				playing.add("3");
				System.out.println("Player 3 is in this round");
			}

			if (player4.isOut()){


			}else {

				playing.add("4");
				System.out.println("Player 4 is in this round");
			}
			
			playing.add("5");
			System.out.println("You are in this round");

			

			int numberOfPlayers = playing.size();
			
			
			
			Random myRandom = new Random();
			
			switch (myRandom.nextInt(numberOfPlayers)){
			
			case 1:
					player1.setStatus("Weakest Link");
					statusPlayer1 = "Weakest Link";
					weakestLink = "Player 1";
							
					player2.setStatus("Neutral");
					statusPlayer2 = "Neutral";
					
					player3.setStatus("Neutral");
					statusPlayer3 = "Neutral";
					
					player4.setStatus("Neutral");
					statusPlayer4 = "Neutral";
					
					status = "Strongest Link";
					strongestLink = playerName;
					break;
					

			case 2:
				player2.setStatus("Weakest Link");
				statusPlayer2 = "Weakest Link";
				weakestLink = "Player 2";
				strongestLink = playerName;
				player1.setStatus("Neutral");
				statusPlayer1 = "Neutral";
				
				player3.setStatus("Neutral");
				statusPlayer3 = "Neutral";
				
				player4.setStatus("Neutral");
				statusPlayer4 = "Neutral";
				
				status = "Strongest Link";
				strongestLink = playerName;
				break;
			case 3:
				player3.setStatus("Weakest Link");
				statusPlayer3 = "Weakest Link";
				
				player2.setStatus("Neutral");
				statusPlayer2 = "Neutral";
				
				player1.setStatus("Neutral");
				statusPlayer1 = "Neutral";
				
				player4.setStatus("Neutral");
				statusPlayer4 = "Neutral";
				
				status = "Strongest Link";
				
				weakestLink = "Player 3";
				strongestLink = playerName;
				break;
			case 4:
				
				player4.setStatus("Weakest Link");
				statusPlayer4 = "Weakest Link";
				
				player2.setStatus("Neutral");
				statusPlayer2 = "Neutral";
				
				player3.setStatus("Neutral");
				statusPlayer3 = "Neutral";
				
				player1.setStatus("Neutral");
				statusPlayer1 = "Neutral";
				
				status = "Strongest Link";
				
				weakestLink = "Player 4";
				strongestLink = playerName;
				break;
			case 5:
				
				player1.setStatus("Strongest Link");
				statusPlayer1 = "Strongest Link";
				
				player2.setStatus("Neutral");
				statusPlayer2 = "Neutral";
				
				player3.setStatus("Neutral");
				statusPlayer3 = "Neutral";
				
				player4.setStatus("Neutral");
				statusPlayer4 = "Neutral";
				
				status = "Weakest Link";
				
				weakestLink = playerName;
				strongestLink = "Player 1";
			}
			
	
	}
	private void playMusic() {
		// TODO Auto-generated method stub
			 
			
			try {
			         // Open an audio input stream.
			         URL url = this.getClass().getClassLoader().getResource("roundMusic.wav");
			         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			         // Get a sound clip resource.
			          backgroundMusic = AudioSystem.getClip();
			         // Open audio clip and load samples from the audio input stream.
			         backgroundMusic.open(audioIn);
			         backgroundMusic.start();
			      } catch (UnsupportedAudioFileException e) {
			         e.printStackTrace();
			      } catch (IOException e) {
			         e.printStackTrace();
			      } catch (LineUnavailableException e) {
			         e.printStackTrace();
			      }

	}
		private void newGameStatus(String status) {
		// TODO Auto-generated method stub
		gameStatusHolder =  new JPanel (new GridLayout (1,1));
		gameStatusHolder.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		gameStatusHolder.setBackground(Color.WHITE);
		gameStatusHolder.setLocation(10,480);
		gameStatusHolder.setSize(300,80);
		

		gameStatus = new JLabel(status,SwingConstants.CENTER);
		gameStatus.setForeground(Color.BLACK);
		gameStatus.setLocation(0,0);
		gameStatus.setSize(500, 40);
		gameStatus.setFont(new Font("Verdana", Font.PLAIN, 20));
		gameStatus.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		gameStatusHolder.add(gameStatus);
		GamePlayPanel.add(gameStatusHolder);

		contestants.add(1);
		contestants.add(2);
		contestants.add(3);
		contestants.add(4);
		contestants.add(5);
		
	}
	private void gameStatus(String status) {
		// TODO Auto-generated method stub
	
		gameStatus.setText(status);
		gameStatus.setForeground(Color.BLACK);
		gameStatus.setLocation(0,0);
		gameStatus.setSize(500, 40);
		gameStatus.setFont(new Font("Verdana", Font.PLAIN, 20));
		gameStatus.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		gameStatusHolder.add(gameStatus);
		gameStatusHolder.revalidate();
		GamePlayPanel.add(gameStatusHolder);

		
	}
	private void playerActions() {
		// TODO Auto-generated method stub
		
		actionHolder =  new JPanel (new GridLayout (2,1));
		actionHolder.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		actionHolder.setBackground(Color.BLACK);
		actionHolder.setLocation(880,470);
		actionHolder.setSize(300,80);
		
		passButton = new JButton("Pass");
		passButton.setForeground(Color.WHITE);
		passButton.setBackground(new Color (0,0,0));
		passButton.setLocation(0,0);
		passButton.setSize(500, 40);
		passButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		passButton.setBorder(BorderFactory.createLineBorder(Color.RED));
		passButton.addActionListener(this);
		
		
		bankButton = new JButton("Bank");
		bankButton.setForeground(Color.WHITE);
		bankButton.setBackground(new Color (100,100,100));
		bankButton.setLocation(0,0);
		bankButton.setSize(500, 40);
		bankButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		bankButton.setBorder(BorderFactory.createLineBorder(Color.RED));
		bankButton.addActionListener(this);
		
		
		actionHolder.add(passButton);
		actionHolder.add(bankButton);
		
		GamePlayPanel.add(actionHolder);

		
		
	}
	private void drawBank() {
		// TODO Auto-generated method stub
		
		
			
		
		
		NumberFormat currencyFormatter = new DecimalFormat("#0.00");
		
		bankText.setText("$ "+String.valueOf(currencyFormatter.format(bankMain)));
		
		bankHolder.add(bankText);
		GamePlayPanel.repaint();
		
	}
	private void newDrawBank() {
		// TODO Auto-generated method stub
		
		
			
		bankHolder =  new JPanel (new GridLayout (2,1));
		bankHolder.setBorder(BorderFactory.createCompoundBorder(whiteBorder,whiteBorder));
		bankHolder.setBackground(Color.BLACK);
		bankHolder.setLocation(430,480);
		bankHolder.setSize(340,80);
		
		bankLabel = new JLabel("|| Bank ||",SwingConstants.CENTER);
		bankLabel.setForeground(Color.WHITE);
		bankLabel.setLocation(0,0);
		bankLabel.setSize(500, 40);
		bankLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		bankLabel.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		
		NumberFormat currencyFormatter = new DecimalFormat("#0.00");
		
		bankText = new JLabel("$ "+String.valueOf(currencyFormatter.format(bankMain)),SwingConstants.CENTER);
		bankText.setForeground(Color.WHITE);
		bankText.setLocation(0,0);
		bankText.setSize(500, 40);
		bankText.setFont(new Font("Verdana", Font.PLAIN, 25));
		bankText.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		bankHolder.add(bankLabel);
		bankHolder.add(bankText);
		GamePlayPanel.remove(bankHolder);
		GamePlayPanel.add(bankHolder);

		
	}
	
	private void drawTimer(int seconds, int minutes) {
		// TODO Auto-generated method stub
		//create JPanel to create question box


		
		timerBox =  new JPanel (new GridLayout (2,1));
		timerBox.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		timerBox.setBackground(new Color (0,0,0));
		timerBox.setLocation(880,320);
		timerBox.setSize(300,100);
		
		
		timerTitle = new JLabel("Timer",SwingConstants.CENTER);
		timerTitle.setForeground(Color.WHITE);
		timerTitle.setLocation(0,0);
		timerTitle.setSize(500, 40);
		timerTitle.setFont(new Font("Verdana", Font.PLAIN, 20));
		timerTitle.setBorder(BorderFactory.createCompoundBorder(noPaddingBorder,paddingBorder));
		
		//
		timerText = new JLabel("",SwingConstants.CENTER);
		
		//timerText.setBackground(new Color(255,255,255));
		NumberFormat formatter = new DecimalFormat("#00");
		
		timerText.setText(minutes+":"+formatter.format(seconds));
		timerText.setForeground(Color.WHITE);
		timerText.setLocation(0,0);
		timerText.setSize(500, 40);
		timerText.setFont(new Font("Verdana", Font.PLAIN, 30));
		timerText.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		timerBox.add(timerTitle);
		timerBox.add(timerText);
		GamePlayPanel.remove(timerBox);
		GamePlayPanel.add(timerBox);
		timerBox.validate();
		//timerBox.repaint();
		//timerText.setLocation(90, 50);
		
	}
	
	private void updateTimer(double seconds, double minutes) {
		// TODO Auto-generated method stub
		//create JPanel to create question box
		//timerBox.setVisible(false);
		//this.remove(timerBox);
	//	timerBox =  new JPanel (new GridLayout (2,1));
		//
		NumberFormat formatter = new DecimalFormat("#00");
		
		timerText.setText(timerTextMin+":"+formatter.format(seconds));
		timerBox.add(timerTitle);
		timerBox.add(timerText);

		timerBox.setVisible(true);

		timerBox.validate();
		timerBox.repaint();
		//this.add(timerBox);
		
		//timerBox.repaint();
		//timerText.setLocation(90, 50);
		
	}

	private void startTimer() {
		//roundTimer.setDelay(1000);
		roundTimer = new Timer(1000, new ActionListener(){

		
			
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
				if(timerTextMin == 0 &&  timerTextSecs ==00){
					
					//when timer is done
					timerTextSecs = 0;
					timerTextMin = 0;
					timerBox.removeAll();
				//	gameStatus("|| Times Up! ||");
					
					updateTimer(timerTextSecs,timerTextSecs);
					
					GamePlayPanel.validate();
					GamePlayPanel.repaint();
					
					roundTimer.stop();
					windowOpen = true;
				
					
					System.out.println("Time up");
					
				//	roundOverWindow();
					//String voteRound = "-"+round;
					//System.out.println("Time for "+Integer.valueOf(voteRound));
				//	round = Integer.valueOf(voteRound);
					
					bank("start");
				//	GamePlayPanel.remove(panelStats);
				//	windowOpen = false;
				//	frame.setSize(1200, 750);
				//	frame.setResizable(false);
				//	frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
				//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					
					System.out.println(bankMain);
			//		Game vote = new Game(Integer.valueOf(voteRound),0,0,"Neutral",0.00,0.00);
				//	frame.add(vote);
				//	frame.validate();
					backgroundMusic.stop();
				//	frame.repaint();
					statsBox();
				}
				
				//update mintes and seconds
				if (timerTextSecs == 0){
					
					timerTextSecs = 60;
					timerTextMin = timerTextMin - 1;
					timerBox.removeAll();
					timerTextSecs = timerTextSecs - 1;
					updateTimer(timerTextSecs,timerTextSecs);
					
					
				}else{
					timerBox.removeAll();
					timerTextSecs = timerTextSecs - 1;
					updateTimer(timerTextSecs,timerTextSecs);
					
				}
				
				
				
			}

			
			
		});

		if (!voting){
		roundTimer.start();
		}

	}
	
	private void checkRound() {
		// TODO Auto-generated method stub
		
		panelVote =  new JPanel (new GridLayout (1,4));
		//panelStats.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panelVote.setBackground(new Color (0,0,0));
		panelVote.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		panelVote.setLocation(40,500);
		panelVote.setSize(800,100);
		//panelVote.setVisible(true);
		
		
		
		switch (round){
		
		case 1: //all player avaiable to vote
			
			buttonVote1 =  new JButton ("Player 1");
			buttonVote1.setBackground(new Color (0,0,0));
			buttonVote1.setForeground(new Color (255,255,255));
			buttonVote1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote1.addActionListener(this);	//	panelVote.setSize(800,100);
			buttonVote1.addMouseListener(this);
			
			buttonVote2 =  new JButton ("Player 2");
			buttonVote2.setBackground(new Color (0,0,0));
			buttonVote2.setForeground(new Color (255,255,255));
			buttonVote2.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote2.addActionListener(this);	//	panelVote.setSize(800,100);
			buttonVote2.addMouseListener(this);
				
			
			buttonVote3 =  new JButton ("Player 3");
			buttonVote3.setBackground(new Color (0,0,0));
			buttonVote3.setForeground(new Color (255,255,255));
			buttonVote3.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote3.addActionListener(this);	//	panelVote.setSize(800,100);
			buttonVote3.addMouseListener(this);
				
			buttonVote4 =  new JButton ("Player 4");
			buttonVote4.setBackground(new Color (0,0,0));
			buttonVote4.setForeground(new Color (255,255,255));
			buttonVote4.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote4.addActionListener(this);	//	panelVote.setSize(800,100);
			buttonVote4.addMouseListener(this);
			
			panelVote.add(buttonVote1);
			panelVote.add(buttonVote2);
			panelVote.add(buttonVote3);
			panelVote.add(buttonVote4);
			
			GamePlayPanel.add(panelVote);
			GamePlayPanel.repaint();
			break;
		case 2: //1 player avaiable to vote
			
			checkIfOut();

			break;
		
				
			
			
			
		case 3:
			checkIfOut();

			break;
		case 4:
		
			buttonSudden =  new JButton ("Continue");
			buttonSudden.setBackground(new Color (0,0,0));
			buttonSudden.setForeground(new Color (255,255,255));
			buttonSudden.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonSudden.addActionListener(this);	//	panelVote.setSize(800,100);
			buttonSudden.addMouseListener(this);
			buttonSudden.setFont(new Font("Verdana", Font.PLAIN, 30));
			
			System.out.println("Time for sudden death");
		
			panelVote.add(buttonSudden);
			GamePlayPanel.add(panelVote);
				GamePlayPanel.repaint();
			break;
		
		 default:
			
			buttonVote1 =  new JButton ("Player 1");
			buttonVote1.setBackground(new Color (0,0,0));
			buttonVote1.setForeground(new Color (255,255,255));
			buttonVote1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote1.addActionListener(this);	//	panelVote.setSize(800,100);
			buttonVote1.addMouseListener(this);
				
			buttonVote2 =  new JButton ("Player 2");
			buttonVote2.setBackground(new Color (0,0,0));
			buttonVote2.setForeground(new Color (255,255,255));
			buttonVote2.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote2.addActionListener(this);	//	panelVote.setSize(800,100);
			buttonVote2.addMouseListener(this);
			
			buttonVote3 =  new JButton ("Player 3");
			buttonVote3.setBackground(new Color (0,0,0));
			buttonVote3.setForeground(new Color (255,255,255));
			buttonVote3.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote3.addActionListener(this);	//	panelVote.setSize(800,100);
			buttonVote3.addMouseListener(this);
			
			buttonVote4 =  new JButton ("Player 4");
			buttonVote4.setBackground(new Color (0,0,0));
			buttonVote4.setForeground(new Color (255,255,255));
			buttonVote4.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote4.addActionListener(this);	//	panelVote.setSize(800,100);
			buttonVote4.addMouseListener(this);
			
			panelVote.add(buttonVote1);
			panelVote.add(buttonVote2);
			panelVote.add(buttonVote3);
			panelVote.add(buttonVote4);
			
			GamePlayPanel.add(panelVote);
			GamePlayPanel.repaint();
			break;
		}
		
		
		


	
	
	}
	
	private void suddenDeath() {	
//		super.setPreferredSize(new Dimension(1200, 750));
			correct = 0;
			wrong = 0;
		
			//player 1 reset 
			player1.resetCorrect();
			correctPlayer1 = 0;
			wrongPlayer1 = 0;
			
			//player 2 reset 
			player2.resetCorrect();
			correctPlayer2 = 0;
			wrongPlayer2 = 0;
			
			//player 3 reset 
			player3.resetCorrect();
			correctPlayer3 = 0;
			wrongPlayer3 = 0;
			
			//player 4 reset 
			player4.resetCorrect();
			correctPlayer4 = 0;
			wrongPlayer4 = 0;
			
			status = "Neutral";

		// TODO Auto-generated method stub
		
			
		
		
		GamePlayPanel.remove(panelStats);
		panelVote.remove(buttonSudden);
		GamePlayPanel = new JPanel ();
		GamePlayPanel.setSize(1200,750);
		GamePlayPanel.setLocation(0, 0);
		GamePlayPanel.setLayout(null);

		//set default strongest and weakest link
		
		defaultLinks ();
		
		try {
	         // Open an audio input stream.
	         URL url = this.getClass().getClassLoader().getResource("suddendeath.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	         suddenMusic = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         suddenMusic.open(audioIn);
	         suddenMusic.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
		
		
		 Image image = null;
	        try {
	            URL url = this.getClass().getClassLoader().getResource("background.jpg");
	            image = ImageIO.read(url);
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }

	       
	        JLabel background = new JLabel(new ImageIcon(image));
	        background.setSize(1200,750);
	        background.setLocation(0,0);
	        background.setLayout(null);
		
	//	this.setBackground(new Color(0,0,0));
	      
		this.setLayout(null);
		
		Point size = new Point (1200,50);
		Point location = new Point (0,0);
		int textSize = 20;
		Color color = Color.WHITE;
		 newRound = String.valueOf(round);
		 		gameTitle(textSize, size,location, color );
		
		GameTitle.add(gameTitle);

//main game panel
		
		//jpanel of welcome scree
		PlayerPanel = new JPanel (new GridLayout (4,1));
		PlayerPanel.setBackground(new Color (0,0,0,0));

		//create border
	//	PlayerPanel.setBorder(new EmptyBorder(10,10,10,10));	

		//add attritubes of jpanel
		PlayerPanel.setLocation(0,50);
		PlayerPanel.setSize(310,410);
		GamePlayPanel.add(PlayerPanel);

	
		
		
		
		
		//enable on Click for chioces
			choices =  new JPanel (new GridLayout (1,4));
		
			choiceA =  new JButton ();
			choiceA.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
						System.out.println("A");
					
					String check = questions.checkAnswer("A");
					if (check.equals("correct")){
						
						suddenCorrect(5);
						suddenComputerPlay();
					}else{
						
						suddenWrong(5);
					
					}
					
				}
				
				
			});
			choiceB =  new JButton ();
			choiceB.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("B");
					
					String check = questions.checkAnswer("B");
					if (check.equals("correct")){
						
						suddenCorrect(5);
						suddenComputerPlay();
					}else{
						
						suddenWrong(5);
						
					}
				}
				
			});
			choiceC =  new JButton ();
			choiceC.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("C");
					
					String check = questions.checkAnswer("C");
					if (check.equals("correct")){
						
						suddenCorrect(5);
						suddenComputerPlay();
					}else{
						
						suddenWrong(5);
						
					}
					
				}
				
			});
			choiceD =  new JButton ();
			choiceD.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("D");
					
					String check = questions.checkAnswer("D");
					if (check.equals("correct")){
						
						suddenCorrect(5);
						suddenComputerPlay();
					}else{
						
						//game over
						suddenWrong(5);
							
					}
					
				}
				
			});

			choices.setVisible(false);
			
		//draw
			
		
		drawComputerBox();
		drawPlayerBox();
		newGameStatus("|| Game Loading! ||");
		bank("start");
		//delay at begining of round
		
				Timer startRoundDelay = new Timer(5000,new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						drawQuestionBox();
						gameStatus("|| Your turn to play! ||");
						
						GamePlayPanel.validate();
						GamePlayPanel.repaint();
						
						bank("start");
						System.out.println("Start Round!!");
						
						
					}
					
					
				});
				
				
				startRoundDelay.setRepeats(false);
				startRoundDelay.setInitialDelay(5000);
				startRoundDelay.start();
				startRoundDelay.setRepeats(false);
		
		newDrawBank();
		playerActions();
	
			
		if (startRoundDelay.isRunning()){
	
			GamePlayPanel.revalidate();
			GamePlayPanel.repaint();
		
		
		
		}else{
			
			drawComputerBox();
			drawPlayerBox();
			newDrawBank();
			playerActions();
			bank("me");
			GamePlayPanel.revalidate();
			GamePlayPanel.repaint();
		}
		choices.setVisible(true);
		this.add(background);	
		GamePlayPanel.validate();
		GamePlayPanel.setBackground(new Color (0,0,0,0));
		this.validate();
		this.add(GamePlayPanel);
			
		
			
	
		
		
	}
	protected void suddenComputerPlay() {
		// TODO Auto-generated method stub
		
		//check who is still playing
		for (int index = 0; index < playing.size(); index++){
			
			System.out.println("Player remaining "+ playing.get(index));
		}
		
		int playerRemaining = Integer.valueOf(playing.get(0));
		
		switch (playerRemaining){
		
		case 1:
			
			//player one answers
			suddenPlay(1);
			
			break;
		case 2:
			
			suddenPlay(2);

			break;
		case 3:
			
			suddenPlay(3);

			break;
		case 4:
			suddenPlay(4);

			break;
		}
			
		
	}
	private void suddenPlay(int aPlayer) {
		// TODO Auto-generated method stub
		

		choiceA.setEnabled(false);
		choiceB.setEnabled(false);
		choiceC.setEnabled(false);
		choiceD.setEnabled(false);
	

		player1Timer = new Timer(2000, new ActionListener(){


	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
					gameStatus("|| Player 2's Turn! ||");

					
					String playerAnswer = null;
					
					switch (aPlayer){
					
					case 1:
						 playerAnswer = player1.playRound();
						break;
					case 2:
						 playerAnswer = player2.playRound();
						break;
					case 3:
						 playerAnswer = player3.playRound();
						break;
					case 4:
						 playerAnswer = player4.playRound();
						break;
					}
					
					
					
					System.out.println("PLayer "+aPlayer + " answered "+playerAnswer);
					if (playerAnswer.equals("correct")){

							suddenCorrect(aPlayer);
							playerTurn();
						//PlayerPanel.removeAll();
							PlayerPanel.remove(panelPlayer1);
							PlayerPanel.remove(panelPlayer2);
							PlayerPanel.remove(panelPlayer3);
							PlayerPanel.remove(panelPlayer4);
					}else {

						suddenWrong(aPlayer);
						
						switch (aPlayer){
						
						case 1:
							player1.setWrong();
							break;
						case 2:
							player2.setWrong();
							break;
						case 3:
							player3.setWrong();
							break;
						case 4:
							player4.setWrong();
							break;
						}
						
						
						PlayerPanel.remove(panelPlayer1);
						PlayerPanel.remove(panelPlayer2);
						PlayerPanel.remove(panelPlayer3);
						PlayerPanel.remove(panelPlayer4);
					}

					

			}


		});
		player1Timer.start();
		player1Timer.setRepeats(false);
	}
	protected void suddenWrong(int aPlayer) {
		// TODO Auto-generated method stub
		System.out.println("Player "+aPlayer+ " answered wrong!");
		
		clearFrame();

	    panelStats =  new JPanel (new GridLayout (4,1));
		//panelStats.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panelStats.setBackground(new Color (0,0,0));
		panelStats.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		panelStats.setLocation(40,100);
		panelStats.setSize(800,600);
		GamePlayPanel.setBackground(new Color (0,0,10));
		GamePlayPanel.remove(scoreTitle);
		
		suddenMusic.stop();
		try {
	         // Open an audio input stream.
	         URL url = this.getClass().getClassLoader().getResource("end.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	         votingMusic = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         votingMusic.open(audioIn);
	         votingMusic.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
		
		if (aPlayer == 5){
			labelText = new JLabel("You are the Weakest Link!",SwingConstants.CENTER);
			labelText.setForeground(Color.WHITE);
			labelText.setLocation(0,20);
			labelText.setSize(500, 40);
			labelText.setFont(new Font("Verdana", Font.PLAIN, 40));
			
			labelText2 = new JLabel("Goodbye!",SwingConstants.CENTER);
			labelText2.setForeground(Color.WHITE);
			labelText2.setLocation(0,20);
			labelText2.setSize(500, 40);
			labelText2.setFont(new Font("Verdana", Font.PLAIN, 30));
		
			buttonNewGame = new JButton ("New Game!");
			buttonNewGame.setForeground(Color.WHITE);
			buttonNewGame.setBackground(new Color (0,0,0));
			buttonNewGame.setBorder(BorderFactory.createCompoundBorder(orangeBorder,paddingBorder));
			buttonNewGame.addActionListener(new ActionListener (){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub

					round = 1;
					newGame();
					votingMusic.stop();
					bank("start");
					GamePlayPanel.remove(panelStats);
					windowOpen = false;
					frame.setSize(1200, 750);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					menu = false;
					
					System.out.println(bankMain);

					Round p = new Round(round,correct,wrong, status,bank,bankMain,menu);

					frame.add(p);
					frame.validate();
					
					frame.repaint();
		
				}
				
				
			});
			
			buttonNewGame.setFont(new Font("Verdana", Font.PLAIN, 30));
			

			buttonExitGame = new JButton ("Exit Game!");
			buttonExitGame.setForeground(Color.WHITE);
			buttonExitGame.setBackground(new Color (0,0,0));
			buttonExitGame.setBorder(BorderFactory.createCompoundBorder(orangeBorder,paddingBorder));
			buttonExitGame.addActionListener(new ActionListener (){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.dispose();
				}
				
			});
			
			buttonExitGame.setFont(new Font("Verdana", Font.PLAIN, 30));
			panelStats.add(labelText);
			panelStats.add(labelText2);
			panelStats.add(buttonNewGame);
			panelStats.add(buttonExitGame);
			
		
			
			Timer endRoundDelay = new Timer(2000,new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
						
				}
				
				
			});
			
			
			endRoundDelay.setRepeats(false);
			endRoundDelay.setInitialDelay(2000);
			endRoundDelay.start();
			endRoundDelay.setRepeats(false);
			
		
			
		}else{
			
			labelText = new JLabel("Congratulations!!",SwingConstants.CENTER);
			labelText.setForeground(Color.WHITE);
			labelText.setLocation(0,20);
			labelText.setSize(500, 40);
			labelText.setFont(new Font("Verdana", Font.PLAIN, 40));
			
			labelText2 = new JLabel("You are the Strongest Link!",SwingConstants.CENTER);
			labelText2.setForeground(Color.WHITE);
			labelText2.setLocation(0,20);
			labelText2.setSize(500, 40);
			labelText2.setFont(new Font("Verdana", Font.PLAIN, 30));
		
			buttonNewGame = new JButton ("New Game!");
			buttonNewGame.setForeground(Color.WHITE);
			buttonNewGame.setBackground(new Color (0,0,0));
			buttonNewGame.setBorder(BorderFactory.createCompoundBorder(orangeBorder,paddingBorder));
			buttonNewGame.addActionListener(new ActionListener (){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub

					round = 1;
					newGame();
					votingMusic.stop();
					bank("start");
					GamePlayPanel.remove(panelStats);
					windowOpen = false;
					frame.setSize(1200, 750);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					menu = false;
					
					System.out.println(bankMain);

					Round p = new Round(round,correct,wrong, status,bank,bankMain,menu);

					frame.add(p);
					frame.validate();
					
					frame.repaint();
		
				}
				
				
			});
			
			buttonNewGame.setFont(new Font("Verdana", Font.PLAIN, 30));
			

			buttonExitGame = new JButton ("Exit Game!");
			buttonExitGame.setForeground(Color.WHITE);
			buttonExitGame.setBackground(new Color (0,0,0));
			buttonExitGame.setBorder(BorderFactory.createCompoundBorder(orangeBorder,paddingBorder));
			buttonExitGame.addActionListener(new ActionListener (){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.dispose();
				}
				
			});
			
			buttonExitGame.setFont(new Font("Verdana", Font.PLAIN, 30));
			panelStats.add(labelText);
			panelStats.add(labelText2);
			panelStats.add(buttonNewGame);
			panelStats.add(buttonExitGame);
			
		}
		
		GamePlayPanel.add(panelStats);
		panelStats.validate();
		GamePlayPanel.repaint();
		
		bank("start");
	}
	protected void suddenCorrect(int aPlayer) {
		// TODO Auto-generated method stub
		System.out.println("Player "+aPlayer+ " answered correct!");

		//play sound
		try {
			// Open an audio input stream.
			URL url = this.getClass().getClassLoader().getResource("correct.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			// Get a sound clip resource.
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}

		questionBox1.remove(questionText);

		choices.setVisible(false);
		questionBox2.remove(choices);
		choiceA.setEnabled(true);
		choiceB.setEnabled(true);
		choiceC.setEnabled(true);
		choiceD.setEnabled(true);
	
		
		
		questionGenerator();
		updatePlayerBox();
		//drawComputerBox();
		//repaint();
	}
	private void checkIfOut() {
		// TODO Auto-generated method stub
		if (player1.isOut()){
			 
			//do nothing

		}else{
			

			buttonVote1 =  new JButton ("Player 1");
			buttonVote1.setBackground(new Color (0,0,0));
			buttonVote1.setForeground(new Color (255,255,255));
			buttonVote1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote1.addActionListener(this);
			buttonVote1.addMouseListener(this);
			//	panelVote.setSize(800,100);
			panelVote.add(buttonVote1);
		}
		
		if (player2.isOut()){
			 
			//do nothing

		}else{
			

			buttonVote2 =  new JButton ("Player 2");
			buttonVote2.setBackground(new Color (0,0,0));
			buttonVote2.setForeground(new Color (255,255,255));
			buttonVote2.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote2.addActionListener(this);
			buttonVote2.addMouseListener(this);
			//	panelVote.setSize(800,100);
			panelVote.add(buttonVote2);
		}
		
		
		if (player3.isOut()){
			 
			//do nothing

		}else{
			

			buttonVote3 =  new JButton ("Player 3");
			buttonVote3.setBackground(new Color (0,0,0));
			buttonVote3.setForeground(new Color (255,255,255));
			buttonVote3.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote3.addActionListener(this);
			buttonVote3.addMouseListener(this);
			//	panelVote.setSize(800,100);
			panelVote.add(buttonVote3);
		}
		
		if (player4.isOut()){
			 
			//do nothing

		}else{
			

			buttonVote4 =  new JButton ("Player 4");
			buttonVote4.setBackground(new Color (0,0,0));
			buttonVote4.setForeground(new Color (255,255,255));
			buttonVote4.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			buttonVote4.addActionListener(this);
			buttonVote4.addMouseListener(this);
			//	panelVote.setSize(800,100);
			panelVote.add(buttonVote4);
		}
		
		GamePlayPanel.add(panelVote);
		
	}
	private void computerPlay() {
		// TODO Auto-generated method stub
	
		
		choiceA.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		choiceB.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		choiceC.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		choiceD.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		
		bankButton.setEnabled(false);
		passButton.setEnabled(false);
		computerDone = false;
		 p1done = false;
		 p2done = false;
		 p3done = false;
		 p4done = true;
		
				computerPlayActions();
	
		
		if (computerDone){
			
			System.out.println("computer done");
			drawComputerBox();
			updateScoreBoard(Level);
			updatePlayerBox();
			playerTurn();
			
		};
	
		
	
	}
	private void computerPlayActions() {
		// TODO Auto-generated method stub
	
		Random doBank = new Random();

		int bankProb = 20;
		
		int time = 2500;
	//attempt to bank before playing 2/8 Chance of bank
		
	


		player4Timer = new Timer(time, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (player4.checkHasAnswered()){

					player4Timer.stop();
					//if player has answered do not perform any actions
				}else{

					
					//this player has answered
					player4.hasAnswered();
					System.out.println("Player 4 has already answered with round");
				
				
				if (windowOpen){
					GamePlayPanel.remove(actionHolder);
					GamePlayPanel.repaint();
					player4Timer.stop();
				}else{
					gameStatus("|| Your Turn! ||");
					System.out.println("PLayer 4");
					//attempt to bank before playing 2/20 Chance of bank
					int player4Bank = doBank.nextInt(bankProb);


					if (player4Bank == 5 ||player4Bank == 0){
						System.out.println("Bank");
						bank("comp4");
					}
					String player4Answer = player4.playRound();

					if (player4Answer.equals("correct")){

						correctCom();
						player4.setCorrect();
						correctPlayer4 = player4.getCorrect();
						PlayerPanel.removeAll();
						PlayerPanel.remove(panelPlayer1);
						PlayerPanel.remove(panelPlayer2);
						PlayerPanel.remove(panelPlayer3);
						PlayerPanel.remove(panelPlayer4);
						PlayerPanel.remove(emptyPlayer1);
						PlayerPanel.remove(emptyPlayer2);
						PlayerPanel.remove(emptyPlayer3);
						PlayerPanel.remove(emptyPlayer4);
						//PlayerPanel.removeAll();


					}else{
						wrongCom();
						player4.setWrong();
						wrongPlayer4 = player4.getWrong();
						PlayerPanel.removeAll();
						PlayerPanel.remove(panelPlayer1);
						PlayerPanel.remove(panelPlayer2);
						PlayerPanel.remove(panelPlayer3);
						PlayerPanel.remove(panelPlayer4);
						PlayerPanel.remove(emptyPlayer1);
						PlayerPanel.remove(emptyPlayer2);
						PlayerPanel.remove(emptyPlayer3);
						PlayerPanel.remove(emptyPlayer4);
						//PlayerPanel.removeAll();

					}
					p3done = false;
					p4done = false;

					//computerTimer.stop();
					if (windowOpen){


						//	statsBox();

					}else{
						drawComputerBox();
						updateScoreBoard(Level);
						calculateStrongWeakOnPlay(4);
					}
					playerTurn();

				}

				}
			}	
		});




		player3Timer = new Timer(time, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if (player3.checkHasAnswered()){


					player3Timer.stop();
					//if player has answered do not perform any actions
				}else{

					
					//this player has answered
					player3.hasAnswered();
					System.out.println("Player 3 has already answered with round");
				
				
				if (windowOpen){
					
					GamePlayPanel.remove(actionHolder);
					GamePlayPanel.repaint();
					player3Timer.stop();
				}else{

					if (player4.isOut()){


						//dont draw
					}else{
						gameStatus("|| Player 4's Turn! ||");

					}System.out.println("PLayer 3");
					//attempt to bank before playing 2/30 Chance of bank
					int player3Bank = doBank.nextInt(bankProb);

					if (player3Bank == 5 ||player3Bank == 0){
						System.out.println("Bank");
						bank("comp3");
					}
					String player3Answer = player3.playRound();

					if (player3Answer.equals("correct")){

						correctCom();
						player3.setCorrect();
						correctPlayer3 = player3.getCorrect();
						PlayerPanel.removeAll();
						PlayerPanel.remove(panelPlayer1);
						PlayerPanel.remove(panelPlayer2);
						PlayerPanel.remove(panelPlayer3);
						PlayerPanel.remove(panelPlayer4);
						PlayerPanel.remove(emptyPlayer1);
						PlayerPanel.remove(emptyPlayer2);
						PlayerPanel.remove(emptyPlayer3);
						PlayerPanel.remove(emptyPlayer4);
						//PlayerPanel.removeAll();


					}else{

						wrongCom();
						player3.setWrong();
						wrongPlayer3 = player3.getWrong();
						PlayerPanel.removeAll();
						PlayerPanel.remove(panelPlayer1);
						PlayerPanel.remove(panelPlayer2);
						PlayerPanel.remove(panelPlayer3);
						PlayerPanel.remove(panelPlayer4);
						PlayerPanel.remove(emptyPlayer1);
						PlayerPanel.remove(emptyPlayer2);
						PlayerPanel.remove(emptyPlayer3);
						PlayerPanel.remove(emptyPlayer4);
						//PlayerPanel.removeAll();

					}
					p3done = true;
					p2done = false;

					if (windowOpen){

						//statsBox();

					}else{
						drawComputerBox();
						updateScoreBoard(Level);
						calculateStrongWeakOnPlay(3);
					}
					player4Timer.setRepeats(false);
					player4Timer.start();

				}

			}
				
			}

		});



		player2Timer = new Timer(time, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if (player2.checkHasAnswered()){


					player2Timer.stop();
					//if player has answered do not perform any actions
				}else{

					
					//this player has answered
					player2.hasAnswered();
					System.out.println("Player 2 has already answered with round");
				
				
				if (windowOpen){
					GamePlayPanel.remove(actionHolder);
					GamePlayPanel.repaint();
					player2Timer.stop();
				}else{

					if (player3.isOut()){


						//dont draw
					}else{
						gameStatus("|| Player 3's Turn! ||");

					}System.out.println("PLayer 2");//attempt to bank before playing 2/8 Chance of bank
					int player2Bank = doBank.nextInt(bankProb);

					if (player2Bank == 5 ||player2Bank == 0){
						System.out.println("Bank");
						bank("comp2");
					}
					String player2Answer = player2.playRound();


					if (player2Answer.equals("correct")){

						correctCom();
						player2.setCorrect();
						correctPlayer2 = player2.getCorrect();
						PlayerPanel.removeAll();
						PlayerPanel.remove(panelPlayer1);
						PlayerPanel.remove(panelPlayer2);
						PlayerPanel.remove(panelPlayer3);
						PlayerPanel.remove(panelPlayer4);
						PlayerPanel.remove(emptyPlayer1);
						PlayerPanel.remove(emptyPlayer2);
						PlayerPanel.remove(emptyPlayer3);
						PlayerPanel.remove(emptyPlayer4);

						//PlayerPanel.removeAll();

					}else{

						wrongCom();
						player2.setWrong();
						wrongPlayer2 = player2.getWrong();
						PlayerPanel.removeAll();
						PlayerPanel.remove(panelPlayer1);
						PlayerPanel.remove(panelPlayer2);
						PlayerPanel.remove(panelPlayer3);
						PlayerPanel.remove(panelPlayer4);
						PlayerPanel.remove(emptyPlayer1);
						PlayerPanel.remove(emptyPlayer2);
						PlayerPanel.remove(emptyPlayer3);
						PlayerPanel.remove(emptyPlayer4);

						//PlayerPanel.removeAll();

					}
					p2done = true;
					p1done = false;

					if (windowOpen){


						//	statsBox();

					}else{
						drawComputerBox();
						updateScoreBoard(Level);
						calculateStrongWeakOnPlay(2);
					}


					player3Timer.setRepeats(false);
					player3Timer.start();
					
					if (player3.isOut()){
						
						gameStatus("|| Player 4's Turn! ||");
						
						player4Timer.setRepeats(false);
						player4Timer.start();
						player4Timer.setRepeats(false);
						
						if(player4.isOut()){
							gameStatus("|| Your Turn! ||");
							
							playerTurn();
						};
						
					}
				}

			}
			}
		});



		player1Timer = new Timer(time, new ActionListener(){




			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				//check first if the player has answered a question within this play round
				
				if (player1.checkHasAnswered()){


					player1Timer.stop();
					System.out.println("Player 1 has already answered with round");
					//if player has answered do not perform any actions
				}else{

					
					//this player has answered
					player1.hasAnswered();
					
					
					if (windowOpen){
						GamePlayPanel.remove(actionHolder);
						GamePlayPanel.repaint();

						player4Timer.stop();
					}else{
						if (player2.isOut()){


							//dont draw
						}else{
							gameStatus("|| Player 2's Turn! ||");

						}	int player1Bank = doBank.nextInt(10);

						if (player1Bank == 5 ||player1Bank == 0){
							System.out.println("Bank");
							bank("comp1");
						}


						String player1Answer = player1.playRound();

						System.out.println("PLayer 1");
						if (player1Answer.equals("correct")){



							player1.setCorrect();
							correctPlayer1 = player1.getCorrect();
							//	PlayerPanel.removeAll();
							panelPlayer1.removeAll();
							PlayerPanel.remove(panelPlayer1);
							PlayerPanel.remove(panelPlayer2);
							PlayerPanel.remove(panelPlayer3);
							PlayerPanel.remove(panelPlayer4);
							PlayerPanel.remove(emptyPlayer1);
							PlayerPanel.remove(emptyPlayer2);
							PlayerPanel.remove(emptyPlayer3);
							PlayerPanel.remove(emptyPlayer4);
							correctCom();
							//PlayerPanel.removeAll();

						}else {

							wrongCom();
							player1.setWrong();
							wrongPlayer1 = player1.getWrong();
							panelPlayer1.removeAll();
							PlayerPanel.remove(panelPlayer1);
							PlayerPanel.remove(panelPlayer2);
							PlayerPanel.remove(panelPlayer3);
							PlayerPanel.remove(panelPlayer4);
							PlayerPanel.remove(emptyPlayer1);
							PlayerPanel.remove(emptyPlayer2);
							PlayerPanel.remove(emptyPlayer3);
							PlayerPanel.remove(emptyPlayer4);
						}

						p1done = true;
						p4done = false;


						if (windowOpen){

						}else{
							drawComputerBox();
							updateScoreBoard(Level);
							calculateStrongWeakOnPlay(1);
						}




						player2Timer.setRepeats(false);
						player2Timer.start();

						if (player2.isOut()){
							gameStatus("|| Player 2's Turn! ||");


							player3Timer.setRepeats(false);
							player3Timer.start();
							player3Timer.setRepeats(false);
							if(player3.isOut()){

								gameStatus("|| Player 3's Turn! ||");


								player4Timer.setRepeats(false);

								player4Timer.start();
								player4Timer.setRepeats(false);

							}
						}

					}
				}
			}

		});

	player1Timer.setRepeats(false);
	
	if (windowOpen){

		GamePlayPanel.remove(actionHolder);
		GamePlayPanel.remove(scoreBoard);
	//	statsBox();
		
	}else{
		
	if (player1.isOut()){
		player2Timer.setRepeats(false);
		gameStatus("|| Player 2's Turn! ||");
		
		player2Timer.start();
		player2Timer.setRepeats(false);
		
		if (player2.isOut()){
			gameStatus("|| Player 3's Turn! ||");
			
		player3Timer.setRepeats(false);
			
			player3Timer.start();
			player3Timer.setRepeats(false);
			
			if (player3.isOut()){
				
				gameStatus("|| Player 4's Turn! ||");
				
				player4Timer.setRepeats(false);
				player4Timer.start();
				player4Timer.setRepeats(false);
				
			}
		}
			//dont draw
		}else{
			gameStatus("|| Player 1's Turn! ||");
			player1Timer.start();
			
		}
	
	}

		
		
	}

private void calculateStrongWeakOnPlay(int aPlayer) {
		// TODO Auto-generated method stub
	//calcultate strongest link
			int status1 = 0;
			int status2 = 0;
			int status3 = 0;
			int status4 = 0;
			int statusPl = 0;


			ArrayList <Integer> checkStatus = new ArrayList<Integer>();
			
			//who is playing
			System.out.println("Player "+aPlayer + " is has played, check status!");
				
			
			if(player1.isOut()){

				System.out.println("player 1 is out so cant answer");
				checkStatus.add(100);
			}else{

				if (player1.getWrong() == 0){
					status1 = player1.getCorrect();
					checkStatus.add(status1);
				}else if (player1.getCorrect()== 0){
					
					status1 =  Integer.valueOf("-"+player1.getWrong());
					checkStatus.add(status1);
					
				}	else{
				
					status1 = player1.getCorrect()/player1.getWrong();
					checkStatus.add(status1);
				}


			}

			//player 2

			if (player2.isOut()){

				System.out.println("player 2 is out so cant answer");
				checkStatus.add(100);

			}else{
				if (player2.getWrong() == 0){
					status2 = player2.getCorrect();
					checkStatus.add(status2);
				}else if (player2.getCorrect() == 0){
					status2 =  Integer.valueOf("-"+player2.getWrong());
					checkStatus.add(status2);
					
				}	
					else{
				
					status2 = player2.getCorrect()/player2.getWrong();
					checkStatus.add(status2);
				}


			}


			//player 3

			if(player3.isOut()){

				System.out.println("player 3 is out so cant answer");
				checkStatus.add(100);

			}else if(player3.getCorrect() ==0 ){
				
				status3 = player3.getWrong();
				checkStatus.add(status3);
			}
				
				
				else{
				if (player3.getWrong() == 0){
					status3 =  Integer.valueOf("-"+player3.getCorrect());
					checkStatus.add(status3);
				}else{
					status3 = player3.getCorrect()/player3.getWrong();
					checkStatus.add(status3);
				}

			}


			//player 4

			if (player4.isOut()){

				System.out.println("player 4 is out so cant answer");
				checkStatus.add(100);

			}else{

				if (player4.getWrong() == 0){
					status4 = player4.getCorrect();
					checkStatus.add(status4);
				}else if(player4.getCorrect() == 0){
					
					status4 =  Integer.valueOf("-"+player4.getWrong());
					checkStatus.add(status4);
				}
					
					else{
					status4 = player4.getCorrect()/player4.getWrong();
					checkStatus.add(status4);

				}



			}



			//player 
			if (wrong == 0){
				statusPl = correct;
				checkStatus.add(statusPl);
			}else if(correct ==0){
				statusPl = Integer.valueOf("-"+wrong);
				checkStatus.add(statusPl);
				
				
			}else{
			

				statusPl = correct/wrong;
				checkStatus.add(statusPl);
			}



			
			
			//find the strongest link using max Index
			
			int maxIndex = 0;
			for (int index = 0; index < checkStatus.size(); index++){
				
				
				double test = checkStatus.get(index);
			
				if (test == 100){
					System.out.println("Should be here strong");
				}else{
					if ( test > checkStatus.get(maxIndex)) {
						
						
						maxIndex = index;
						}
				}
				
				System.out.println("hello strong " +checkStatus.get(index));
			

			}

			//set all to neutral
			statusPlayer1 = "Neutral";
			statusPlayer2 = "Neutral";
			statusPlayer3 = "Neutral";
			statusPlayer3 = "Neutral";
			status = "Neutral";
			
			player1.setStatus("Neutral");
			player2.setStatus("Neutral");
			player3.setStatus("Neutral");
			player4.setStatus("Neutral");

			
			int Strongest = maxIndex +1;
			
			System.out.println("Index of the strongest link is "+Strongest);
			
			
			
			switch (Strongest){

			case 1:

				if (player1.isOut()){

					player1.setStatus("Knocked Out");

				}else{
					player1.setStatus("Strongest Link");
					
					
					
					statusPlayer1 = "Strongest Link";
					strongestLink = "Player 1";
					
					System.out.println("Player 1 is new strongest");
				}
				break;
			case 2:
				if (player2.isOut()){

					player2.setStatus("Knocked Out");

				}else{

					strongestLink = "Player 2";
					player2.setStatus("Strongest Link");
					statusPlayer2 = "Strongest Link";
					System.out.println("Player 2 is new strongest");
				}
				break;
			case 3:

				if (player3.isOut()){

					player3.setStatus("Knocked Out");

				}else{

					strongestLink = "Player 3";
					player3.setStatus("Strongest Link");
					statusPlayer3 = "Strongest Link";
					System.out.println("Player 3 is new strongest");
				}
				break;
			case 4:

				if (player4.isOut()){

					player4.setStatus("Knocked Out");

				}else{

					strongestLink = "Player 4";
					player4.setStatus("Strongest Link");
					statusPlayer4 = "Strongest Link";
					System.out.println("Player 4 is new strongest");
				}
				break;

			case 5:
				strongestLink = playerName;
				status = "Strongest Link";
				System.out.println("You are the Strongest Link");
			}
			
			
			
		//find the weaest link - using minIndex
			
			int minIndex = 0;
			for (int index = 0; index < checkStatus.size(); index++){
				
				
				double test = checkStatus.get(index);
			
				if ( test < checkStatus.get(minIndex)) {

					if (test == 100){

						System.out.println("Should be here weak");
					}else{
						minIndex = index;
					}
				}

				System.out.println("hello weak " +checkStatus.get(index));
				
			}

			int Weakest = minIndex +1;
			
			System.out.println("Index of the weakest link is "+Weakest);
			
			switch (Weakest){
			
			case 1:

				if (player1.isOut()){
					
					player1.setStatus("Knocked Out");
						
				}else{
				
				player1.setStatus("Weakest Link");
				weakestLink = "Player 1";
				statusPlayer1 = "Weakest Link";
				System.out.println("player 1 is the Weakest Link");

				}
				break;
				
			case 2:
				if (player2.isOut()){
							
							player2.setStatus("Knocked Out");
								
						}else{
						weakestLink = "Player 2";
						System.out.println("player 2 is the Weakest Link");
						player2.setStatus("Weakest Link");
						statusPlayer2 = "Weakest Link";
						}
				break;
				
				
				
			case 3:
				
				if (player3.isOut()){
					
					player3.setStatus("Knocked Out");
						
				}else{
				weakestLink = "Player 3";
				System.out.println("player 3 is the Weakest Link");
				player3.setStatus("Weakest Link");
				statusPlayer3 = "Weakest Link";
				}
				break;
			case 4:
				
				if (player4.isOut()){
					
					player4.setStatus("Knocked Out");
						
				}else{
					weakestLink = "Player 4";
				System.out.println("player 4 is the Weakest Link");
				player4.setStatus("Weakest Link");
				statusPlayer4 = "Weakest Link";
				}
				break;
				
			case 5:
				weakestLink = playerName;
				status = "Weakest Link";
				System.out.println("You are the Weakest Link");
			}
	}
	protected void updateScoreBoard(int aLevel) {
		// TODO Auto-generated method stub
		int labelFontSize = 20;
		int labelFontSizeSmall = 12;
		//draw title
		
		level1Text.setForeground(Color.WHITE);
		
		
		level2Text.setForeground(Color.WHITE);
		
		level3Text.setForeground(Color.WHITE);
		
		level4Text.setForeground(Color.WHITE);
		

		level5Text.setForeground(Color.WHITE);
		
		level6Text.setForeground(Color.WHITE);

		level7Text.setForeground(Color.WHITE);
		
		level8Text.setForeground(Color.WHITE);
		
		level9Text.setForeground(Color.WHITE);

		
		level10Text.setForeground(Color.WHITE);
		
		//set score
		switch (aLevel){
		
		case 0:
		
			level1Text.setBorder(BorderFactory.createCompoundBorder(orangeBorder,paddingBorder));
			level1Text.setForeground(Color.ORANGE);
			break;
		case 1:
			level2Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level2Text.setForeground(Color.ORANGE);
			break;
		case 2:
			level3Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level3Text.setForeground(Color.ORANGE);
			break;
		case 3:
			level4Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level4Text.setForeground(Color.ORANGE);
			break;
		case 4:
			level5Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level5Text.setForeground(Color.ORANGE);
			break;
		case 5:
			level6Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level6Text.setForeground(Color.ORANGE);
			break;
		case 6:
			level7Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level7Text.setForeground(Color.ORANGE);
			break;
		case 7:
			level8Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level8Text.setForeground(Color.ORANGE);
			break;
		case 8:
			level9Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level9Text.setForeground(Color.ORANGE);
			break;
		case 9:
			level10Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level10Text.setForeground(Color.ORANGE);
			break;
		}
		
		//add labels to score board
		scoreBoard.add(level10Text);
		scoreBoard.add(level9Text);
		scoreBoard.add(level8Text);
		scoreBoard.add(level7Text);
		scoreBoard.add(level6Text);
		scoreBoard.add(level5Text);
		scoreBoard.add(level4Text);
		scoreBoard.add(level3Text);
		scoreBoard.add(level2Text);
		scoreBoard.add(level1Text);
		
		scoreBoard.revalidate();
		GamePlayPanel.add(scoreTitle);
		GamePlayPanel.add(scoreBoard);
		
	
		if (windowOpen){

			GamePlayPanel.remove(actionHolder);
			GamePlayPanel.remove(scoreBoard);
			//statsBox();
			
		}
	}
		private void drawScoreBoard(int aLevel) {
		// TODO Auto-generated method stub\
		
		
		int labelFontSize = 20;
		int labelFontSizeSmall = 12;
		//draw title
		
		
		
				scoreTitle = new JLabel("Score Board",SwingConstants.CENTER);
				scoreTitle.setForeground(Color.WHITE);
				scoreTitle.setBackground(new Color (0,0,0));
				scoreTitle.setLocation(450,45);
				scoreTitle.setSize(300, 40);
				scoreTitle.setFont(new Font("Verdana", Font.PLAIN, 20));
			//	scoreTitle.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
				
			
		
		
		scoreBoard =  new JPanel (new GridLayout (10,1));
		scoreBoard.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		scoreBoard.setBackground(new Color (0,0,0));
		scoreBoard.setLocation(450,80);
		scoreBoard.setSize(300,400);
		
		level1Text = new JLabel("$ 10",SwingConstants.CENTER);
		level1Text.setForeground(Color.WHITE);
		level1Text.setLocation(0,0);
		level1Text.setSize(500, 40);
		level1Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
	//	level1Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
		
		
		level2Text = new JLabel("$ 20",SwingConstants.CENTER);
		level2Text.setForeground(Color.WHITE);
		level2Text.setLocation(0,0);
		level2Text.setSize(500, 40);
		level2Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		//level2Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
		
		level3Text = new JLabel("$ 50",SwingConstants.CENTER);
		level3Text.setForeground(Color.WHITE);
		level3Text.setLocation(0,0);
		level3Text.setSize(500, 40);
		level3Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		//level3Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
		
		level4Text = new JLabel("$ 100",SwingConstants.CENTER);
		level4Text.setForeground(Color.WHITE);
		level4Text.setLocation(0,0);
		level4Text.setSize(500, 40);
		level4Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		//level4Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
		
		level5Text = new JLabel("$ 250",SwingConstants.CENTER);
		level5Text.setForeground(Color.WHITE);
		level5Text.setLocation(0,0);
		level5Text.setSize(500, 40);
		level5Text.setAlignmentX(CENTER_ALIGNMENT);
		level5Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		//level5Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
		
		level6Text = new JLabel("$ 500",SwingConstants.CENTER);
		level6Text.setForeground(Color.WHITE);
		level6Text.setLocation(0,0);
		level6Text.setSize(500, 40);
		level6Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		//level6Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
		
		level7Text = new JLabel("$ 1 000",SwingConstants.CENTER);
		level7Text.setForeground(Color.WHITE);
		level7Text.setLocation(0,0);
		level7Text.setSize(500, 40);
		level7Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		//level7Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
		
		level8Text = new JLabel("$ 2 500",SwingConstants.CENTER);
		level8Text.setForeground(Color.WHITE);
		level8Text.setLocation(0,0);
		level8Text.setSize(500, 40);
		level8Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		//level8Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
		
		level9Text = new JLabel("$ 5 000",SwingConstants.CENTER);
		level9Text.setForeground(Color.WHITE);
		level9Text.setLocation(0,0);
		level9Text.setSize(500, 40);
		level9Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		//level9Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
				
		level10Text = new JLabel("$ 10 000",SwingConstants.CENTER);
		level10Text.setForeground(Color.WHITE);
		level10Text.setLocation(0,0);
		level10Text.setSize(500, 40);
		level10Text.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		//level10Text.setBorder(BorderFactory.createCompoundBorder(redBorder,paddingBorder));
		
		//set score
		switch (aLevel){
		
		case 0:
		
			level1Text.setBorder(BorderFactory.createCompoundBorder(orangeBorder,paddingBorder));
			level1Text.setForeground(Color.ORANGE);
			break;
		case 1:
			level2Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level2Text.setForeground(Color.ORANGE);
			break;
		case 2:
			level3Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level3Text.setForeground(Color.ORANGE);
			break;
		case 3:
			level4Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level4Text.setForeground(Color.ORANGE);
			break;
		case 4:
			level5Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level5Text.setForeground(Color.ORANGE);
			break;
		case 5:
			level6Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level6Text.setForeground(Color.ORANGE);
			break;
		case 6:
			level7Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level7Text.setForeground(Color.ORANGE);
			break;
		case 7:
			level8Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level8Text.setForeground(Color.ORANGE);
			break;
		case 8:
			level9Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level9Text.setForeground(Color.ORANGE);
			break;
		case 9:
			level10Text.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			level10Text.setForeground(Color.ORANGE);
			break;
		}
		
		//add labels to score board
		scoreBoard.add(level10Text);
		scoreBoard.add(level9Text);
		scoreBoard.add(level8Text);
		scoreBoard.add(level7Text);
		scoreBoard.add(level6Text);
		scoreBoard.add(level5Text);
		scoreBoard.add(level4Text);
		scoreBoard.add(level3Text);
		scoreBoard.add(level2Text);
		scoreBoard.add(level1Text);
		
		GamePlayPanel.add(scoreTitle);
		GamePlayPanel.add(scoreBoard);
	
		
		GamePlayPanel.validate();
		GamePlayPanel.repaint();
		if (windowOpen){
		 
				//statsBox();
			
		}
	}
	
	private void drawPlayerBox() {

		// TODO Auto-generated method stub
		
		int labelFontSize = 20;
		int labelFontSizeSmall = 12;
		int optionPanelSize_x = 500;
		int optionPanelSize_y = 200;
		
		
		//create JPanel to create question box
		playerBox =  new JPanel (new GridLayout (5,1));
		playerBox.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		playerBox.setBackground(new Color (0,0,0));
		playerBox.setLocation(880,60);
		playerBox.setSize(300,250);
		
		
		namePlayer = new JLabel(playerName);
		namePlayer.setForeground(Color.WHITE);
		namePlayer.setLocation(0,0);
		namePlayer.setSize(500, 40);
		namePlayer.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		namePlayer.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		
		correctPlayer = new JLabel("Questions Correct: "+correct.toString());
		correctPlayer.setForeground(Color.WHITE);
		correctPlayer.setLocation(0,0);
		correctPlayer.setSize(500, 40);
		correctPlayer.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
		correctPlayer.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		wrongPlayer = new JLabel("Questions Wrong: "+wrong.toString());
		wrongPlayer.setForeground(Color.WHITE);
		wrongPlayer.setLocation(0,0);
		wrongPlayer.setSize(500, 40);
		wrongPlayer.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
		wrongPlayer.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		statusPlayer = new JLabel("Your Status: "+status);
		statusPlayer.setForeground(Color.WHITE);
		statusPlayer.setLocation(0,0);
		statusPlayer.setSize(500, 40);
		statusPlayer.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
		statusPlayer.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		NumberFormat currencyFormatter = new DecimalFormat("#0.00");
		
	
		bankPlayer = new JLabel("You Banked: $"+currencyFormatter.format(bank));
		bankPlayer.setForeground(Color.WHITE);
		bankPlayer.setLocation(0,0);
		bankPlayer.setSize(500, 40);
		bankPlayer.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
		bankPlayer.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		
		playerBox.add(namePlayer);
		playerBox.add(correctPlayer);
		playerBox.add(wrongPlayer);
		playerBox.add(statusPlayer);
		playerBox.add(bankPlayer);
		playerBox.revalidate();
		playerBox.repaint();
		GamePlayPanel.add(playerBox);
		
		
	}
	private void updatePlayerBox() {

		// TODO Auto-generated method stub
		
		int labelFontSize = 20;
		int labelFontSizeSmall = 12;
		int optionPanelSize_x = 500;
		int optionPanelSize_y = 200;
		
		
		
			
		correctPlayer.setText("Questions Correct: "+correct.toString());
		correctPlayer.setForeground(Color.WHITE);
		correctPlayer.setLocation(0,0);
		correctPlayer.setSize(500, 40);
		correctPlayer.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
		correctPlayer.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		wrongPlayer.setText("Questions Wrong: "+wrong.toString());
		wrongPlayer.setForeground(Color.WHITE);
		wrongPlayer.setLocation(0,0);
		wrongPlayer.setSize(500, 40);
		wrongPlayer.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
		wrongPlayer.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		statusPlayer.setText("Your Status: "+status);
		statusPlayer.setForeground(Color.WHITE);
		statusPlayer.setLocation(0,0);
		statusPlayer.setSize(500, 40);
		statusPlayer.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
		statusPlayer.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		NumberFormat currencyFormatter = new DecimalFormat("#0.00");
		
	
		bankPlayer.setText("You Banked: $"+currencyFormatter.format(bank));
		bankPlayer.setForeground(Color.WHITE);
		bankPlayer.setLocation(0,0);
		bankPlayer.setSize(500, 40);
		bankPlayer.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
		bankPlayer.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		
		
		playerBox.add(namePlayer);
		playerBox.add(correctPlayer);
		playerBox.add(wrongPlayer);
		playerBox.add(statusPlayer);
		playerBox.add(bankPlayer);
		playerBox.revalidate();
		playerBox.repaint();
		GamePlayPanel.add(playerBox);
		
		
	}

	private void drawQuestionBox() {
		// TODO Auto-generated method stub
		int labelFontSize = 20;
		int labelFontSizeSmall = 12;
		int optionPanelSize_x = 500;
		int optionPanelSize_y = 200;
		
		
		//create JPanel to create question box
		questionBox1 =  new JPanel (new GridLayout (1,1));
		questionBox1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		questionBox1.setBackground(new Color (0,0,0));
		questionBox1.setLocation((width/2)+50,580);
		questionBox1.setSize(1100,50);
		
		//create JPanel to create question box
				questionBox2 =  new JPanel (new GridLayout (1,4));
				questionBox2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
				questionBox2.setBackground(new Color (0,0,0));
				questionBox2.setLocation((width/2)+50,630);
				questionBox2.setSize(1100,50);
		
		questionGenerator();
		//create Question text and optinos
		
		
		//add questinoBox to JFRame
		GamePlayPanel.add(questionBox1);
		GamePlayPanel.add(questionBox2);
		
		

	}

	private void questionGenerator() {

		int labelFontSize = 10;
		
		//generate question 1
				
				int questionNumber = questions.getQuestion();
				String question = questions.getQuestionText(questionNumber);
				
				questionText = new JLabel(question,SwingConstants.CENTER);
				questionText.setForeground(Color.WHITE);
				questionText.setLocation(0,0);
				questionText.setSize(500, 40);
				questionText.setFont(new Font("Verdana", Font.PLAIN, 12));
						
				//get all options
				String allOptions = questions.getOptions(questionNumber);
				
				//split string into array
				
				String[] option = allOptions.split("-");
				
			
				
				//create JPanel for choices
				choices.setBorder(BorderFactory.createLineBorder(Color.CYAN));
				choices.setBackground(Color.GRAY);
				choices.setLocation(10,580);
				choices.setSize(900,100);
						
						//create text boxes for options
						choiceA.setText("A) "+option[0]);
						//choiceA.setBorder(BorderFactory.createLineBorder(Color.CYAN));
						choiceA.setBackground(Color.BLACK);
						choiceA.setLocation(10,580);
						choiceA.setSize(900,100);
						choiceA.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
						choiceA.setForeground(Color.WHITE);
				
						//create text boxes for options
						choiceB.setText("B) "+option[1]);
						//choiceB.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
						choiceB.setBackground(Color.BLACK);
						choiceB.setLocation(10,580);
						choiceB.setSize(900,100);
						choiceB.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
						choiceB.setForeground(Color.WHITE);
							
						//create text boxes for options
						choiceC.setText("C) "+option[2]);
						//choiceC.setBorder(BorderFactory.createLineBorder(Color.GREEN));
						choiceC.setBackground(Color.BLACK);
						choiceC.setLocation(10,580);
						choiceC.setSize(900,100);
						choiceC.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
						choiceC.setForeground(Color.WHITE);
						
						//create text boxes for options
						choiceD.setText("D) "+option[3]);
						//choiceD.setBorder(BorderFactory.createLineBorder(Color.RED));
						choiceD.setBackground(Color.BLACK);
						choiceD.setLocation(10,580);
						choiceD.setSize(900,100);
						choiceD.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
						choiceD.setForeground(Color.WHITE);
						
						choices.add(choiceA);
						choices.add(choiceB);
						choices.add(choiceC);
						choices.add(choiceD);
				
						
						questionBox1.add(questionText);	
						questionBox2.add(choices);
						
						choices.setVisible(true);
					//choices.repaint();
	}

	private void drawComputerBox() {
		// TODO Auto-generated method stub
		
		int labelFontSize = 15;
		int labelFontSizeSmall = 10;
		int playerPanelSize_x = 500;
		int playerPanelSize_y = 200;

		panelPlayer1 =  new JPanel (new GridLayout (4,1));
		panelPlayer1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panelPlayer1.setBackground(new Color (0,0,10));
		panelPlayer1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
	
		
		labelPlayer1 = new JLabel("Player 1");
		labelPlayer1.setForeground(Color.WHITE);
		labelPlayer1.setLocation(width/2,0);
		labelPlayer1.setSize(500, 40);
		labelPlayer1.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		
			//correct
	
			correctLabelPlayer1 = new JLabel("Correct: "+correctPlayer1);
			correctLabelPlayer1.setForeground(Color.WHITE);
			correctLabelPlayer1.setLocation(width/2,0);
			correctLabelPlayer1.setSize(500, 40);
			correctLabelPlayer1.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
			
			//incorrect
			wrongLabelPlayer1 = new JLabel("Incorrect: "+wrongPlayer1);
			wrongLabelPlayer1.setForeground(Color.WHITE);
			wrongLabelPlayer1.setLocation(width/2,0);
			wrongLabelPlayer1.setSize(500, 40);
			wrongLabelPlayer1.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
			
			
			//status
			statusLabelPlayer1 = new JLabel("Player Status: "+statusPlayer1);
			statusLabelPlayer1.setForeground(Color.WHITE);
			statusLabelPlayer1.setLocation(width/2,0);
			statusLabelPlayer1.setSize(500, 40);
			statusLabelPlayer1.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
			
			panelPlayer1.add(labelPlayer1);
			panelPlayer1.add(correctLabelPlayer1);
			panelPlayer1.add(wrongLabelPlayer1);
			panelPlayer1.add(statusLabelPlayer1);
			panelPlayer1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		
		//player two
		panelPlayer2 =  new JPanel (new GridLayout (4,1));
		panelPlayer2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panelPlayer2.setBackground(new Color (0,0,12));
		panelPlayer2.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
				
		
		labelPlayer2 = new JLabel("Player 2");
		labelPlayer2.setForeground(Color.WHITE);
		labelPlayer2.setLocation(width/2,0);
		labelPlayer2.setSize(500, 40);
		labelPlayer2.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));

		
		//correct
		
				correctLabelPlayer2 = new JLabel("Correct: "+correctPlayer2);
				correctLabelPlayer2.setForeground(Color.WHITE);
				correctLabelPlayer2.setLocation(width/2,0);
				correctLabelPlayer2.setSize(500, 40);
				correctLabelPlayer2.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
				
				//incorrect
				wrongLabelPlayer2 = new JLabel("Incorrect: "+wrongPlayer2);
				wrongLabelPlayer2.setForeground(Color.WHITE);
				wrongLabelPlayer2.setLocation(width/2,0);
				wrongLabelPlayer2.setSize(500, 40);
				wrongLabelPlayer2.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
				
				
				//status
				statusLabelPlayer2 = new JLabel("Player Status: "+statusPlayer2);
				statusLabelPlayer2.setForeground(Color.WHITE);
				statusLabelPlayer2.setLocation(width/2,0);
				statusLabelPlayer2.setSize(500, 40);
				statusLabelPlayer2.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
				
				panelPlayer2.add(labelPlayer2);
				panelPlayer2.add(correctLabelPlayer2);
				panelPlayer2.add(wrongLabelPlayer2);
				panelPlayer2.add(statusLabelPlayer2);
		

		//player three
		panelPlayer3 =  new JPanel (new GridLayout (4,1));
		panelPlayer3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		panelPlayer3.setBackground(new Color (0,0,14));
		panelPlayer3.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		
		labelPlayer3 = new JLabel("Player 3");
		labelPlayer3.setForeground(Color.WHITE);
		labelPlayer3.setLocation(width/2,0);
		labelPlayer3.setSize(500, 40);
		labelPlayer3.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));
		
			//correct
			
			correctLabelPlayer3 = new JLabel("Correct: "+correctPlayer3);
			correctLabelPlayer3.setForeground(Color.WHITE);
			correctLabelPlayer3.setLocation(width/2,0);
			correctLabelPlayer3.setSize(500, 40);
			correctLabelPlayer3.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
			
			//incorrect
			wrongLabelPlayer3 = new JLabel("Incorrect: "+wrongPlayer3);
			wrongLabelPlayer3.setForeground(Color.WHITE);
			wrongLabelPlayer3.setLocation(width/2,0);
			wrongLabelPlayer3.setSize(500, 40);
			wrongLabelPlayer3.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
			
			//status
			statusLabelPlayer3 = new JLabel("Player Status: "+statusPlayer3);
			statusLabelPlayer3.setForeground(Color.WHITE);
			statusLabelPlayer3.setLocation(width/2,0);
			statusLabelPlayer3.setSize(500, 40);
			statusLabelPlayer3.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
			
			panelPlayer3.add(labelPlayer3);
			panelPlayer3.add(correctLabelPlayer3);
			panelPlayer3.add(wrongLabelPlayer3);
			panelPlayer3.add(statusLabelPlayer3);

			
		//player four
		panelPlayer4 =  new JPanel (new GridLayout (4,1));
		panelPlayer4.setBorder(BorderFactory.createLineBorder(Color.RED));
		panelPlayer4.setBackground(new Color (0,0,16));
		panelPlayer4.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		
		labelPlayer4 = new JLabel("Player 4");
		labelPlayer4.setForeground(Color.WHITE);
		labelPlayer4.setLocation(width/2,0);
		labelPlayer4.setSize(500, 40);
		labelPlayer4.setFont(new Font("Verdana", Font.PLAIN, labelFontSize));

		//correct
		
				correctLabelPlayer4 = new JLabel("Correct: "+correctPlayer4);
				correctLabelPlayer4.setForeground(Color.WHITE);
				correctLabelPlayer4.setLocation(width/2,0);
				correctLabelPlayer4.setSize(500, 40);
				correctLabelPlayer4.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
				
				//incorrect
				wrongLabelPlayer4 = new JLabel("Incorrect: "+wrongPlayer4);
				wrongLabelPlayer4.setForeground(Color.WHITE);
				wrongLabelPlayer4.setLocation(width/2,0);
				wrongLabelPlayer4.setSize(500, 40);
				wrongLabelPlayer4.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
				
				
				//status
				statusLabelPlayer4 = new JLabel("Player Status: "+statusPlayer4);
				statusLabelPlayer4.setForeground(Color.WHITE);
				statusLabelPlayer4.setLocation(width/2,0);
				statusLabelPlayer4.setSize(500, 40);
				statusLabelPlayer4.setFont(new Font("Verdana", Font.PLAIN, labelFontSizeSmall));
				
				panelPlayer4.add(labelPlayer4);
				panelPlayer4.add(correctLabelPlayer4);
				panelPlayer4.add(wrongLabelPlayer4);
				panelPlayer4.add(statusLabelPlayer4);
				
				emptyPlayer1 =  new JPanel ();
				emptyPlayer1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				emptyPlayer1.setBackground(new Color (0,0,16));
				emptyPlayer1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
					
				emptyPlayer2 =  new JPanel ();
				emptyPlayer2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				emptyPlayer2.setBackground(new Color (0,0,16));
				emptyPlayer2.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
				
				emptyPlayer3 =  new JPanel ();
				emptyPlayer3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				emptyPlayer3.setBackground(new Color (0,0,16));
				emptyPlayer3.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
				
				emptyPlayer4 =  new JPanel ();
				emptyPlayer4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				emptyPlayer4.setBackground(new Color (0,0,16));
				emptyPlayer4.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			
		if (player1.isOut()){
		
			PlayerPanel.add(emptyPlayer1);
		}else{
			PlayerPanel.add(panelPlayer1);
		}	
		
		if (player2.isOut()){
		
			PlayerPanel.add(emptyPlayer2);
		}else{
			PlayerPanel.add(panelPlayer2);
		}	
		
		if (player3.isOut()){
		
			PlayerPanel.add(emptyPlayer3);
		}else{
			PlayerPanel.add(panelPlayer3);
		}	
		
		if (player4.isOut()){
		
			PlayerPanel.add(emptyPlayer4);
		}else{
			PlayerPanel.add(panelPlayer4);
		}
				
		
	}

	//method to draw voting statistics
	protected void statsBox(){
		
		  //find strongest and weeakest
		calculateStrongWeakOnPlay(0);
		
		//play sound
				try {
			         // Open an audio input stream.
			         URL url = this.getClass().getClassLoader().getResource("loser.wav");
			         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			         // Get a sound clip resource.
			          votingMusic = AudioSystem.getClip();
			         // Open audio clip and load samples from the audio input stream.
			          votingMusic.open(audioIn);
			       //  clip.loop(999);
			          votingMusic.start();
			         
			      } catch (UnsupportedAudioFileException e) {
			         e.printStackTrace();
			      } catch (IOException e) {
			         e.printStackTrace();
			      } catch (LineUnavailableException e) {
			         e.printStackTrace();
			      }
	    //clear frame
		clearFrame();
	
		
	GamePlayPanel.remove(scoreBoard);
	GamePlayPanel.remove(bankHolder);
	GamePlayPanel.remove(scoreTitle);
	GamePlayPanel.remove(actionHolder);
	
	GamePlayPanel.setBackground(new Color (0,0,10));
	
		
		//draw new stuff
		
	    panelStats =  new JPanel (new GridLayout (2,1));
		panelStats.setBackground(new Color (0,0,0));
		panelStats.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		panelStats.setLocation(40,100);
		panelStats.setSize(800,400);

		if (round == 4){
			
			
			labelText = new JLabel("Round is over!",SwingConstants.CENTER);
			labelText.setForeground(Color.WHITE);
			labelText.setLocation(0,20);
			labelText.setSize(500, 40);
			labelText.setFont(new Font("Verdana", Font.PLAIN, 50));
		
			mainContent = new JPanel (new GridLayout(3,1));
			mainContent.setBackground(new Color(0,0,0,200));
		
					
			labelText2 = new JLabel("<html>Time for sudden death!<br><br> First person to answer incorrectly loses!</html>",SwingConstants.CENTER);
			labelText2.setForeground(Color.WHITE);
			labelText2.setLocation(width/2,0);
			labelText2.setSize(500, 40);
			labelText2.setFont(new Font("Verdana", Font.PLAIN, 15));
			
			
		}else{
		
		labelText = new JLabel("Time to vote for the Weakest Link!",SwingConstants.CENTER);
		labelText.setForeground(Color.WHITE);
		labelText.setLocation(0,20);
		labelText.setSize(500, 40);
		labelText.setFont(new Font("Verdana", Font.PLAIN, 30));
	
		mainContent = new JPanel (new GridLayout(3,1));
		mainContent.setBackground(new Color(0,0,0,200));
	
		
		labelStrongest = new JLabel("The Strongest Link is: "+strongestLink,SwingConstants.CENTER);
		labelStrongest.setForeground(Color.WHITE);
		labelStrongest.setLocation(width/2,0);
		labelStrongest.setSize(500, 40);
		labelStrongest.setFont(new Font("Verdana", Font.PLAIN, 35));
		
		labelWeakest = new JLabel("The Weakest Link is: "+weakestLink,SwingConstants.CENTER);
		labelWeakest.setForeground(Color.PINK);
		labelWeakest.setLocation(width/2,0);
		labelWeakest.setSize(500, 40);
		labelWeakest.setFont(new Font("Verdana", Font.PLAIN, 35));
		
		labelText2 = new JLabel("Who will you vote for?",SwingConstants.CENTER);
		labelText2.setForeground(Color.WHITE);
		labelText2.setLocation(width/2,0);
		labelText2.setSize(500, 40);
		labelText2.setFont(new Font("Verdana", Font.PLAIN, 20));

		mainContent.add(labelStrongest);
		mainContent.add(labelWeakest);
		}
		
		//GamePlayPanel.add(background);
	//	GamePlayPanel.add(panelStats);
		panelStats.add(labelText);
		panelStats.add(mainContent);
		mainContent.add(labelText2);
		
		
		// new window
		
	
		
		
		//delay to allow for round end
		
		Timer endRoundDelay = new Timer(2000,new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				checkRound();
				
				changeToVote();
				
				bank("start");

				System.out.println("Done!!");
				
				
			}
			
			
		});
		
		
		endRoundDelay.setRepeats(false);
		endRoundDelay.setInitialDelay(2000);
		endRoundDelay.start();
		endRoundDelay.setRepeats(false);
		
	}

	
	protected void changeToVote() {
		// TODO Auto-generated method stub
		GamePlayPanel.remove(scoreBoard);
		GamePlayPanel.remove(scoreTitle);
		GamePlayPanel.remove(actionHolder);
		GamePlayPanel.add(panelStats);
		GamePlayPanel.validate();
		GamePlayPanel.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		
		
		//check whetehr selected answer is correct
		if (choiceA ==event.getSource()){
			System.out.println("A");
			
			
			//reset players have answered
			player1.resetHasAnswered();
			player2.resetHasAnswered();
			player3.resetHasAnswered();
			player4.resetHasAnswered();
			
			String check = questions.checkAnswer("A");
			if (check.equals("correct")){
				
				correct();
				computerPlay();
			}else{
				
				wrong();
				computerPlay();
			}
			
		}	if (choiceB ==event.getSource()){
			
			//reset players have answered
			player1.resetHasAnswered();
			player2.resetHasAnswered();
			player3.resetHasAnswered();
			player4.resetHasAnswered();
			
			String check = questions.checkAnswer("B");
			if (check.equals("correct")){

				correct();
				computerPlay();
			}else{
				wrong();
				computerPlay();
			}
			
		}	if (choiceC ==event.getSource()){
			
			//reset players have answered
			player1.resetHasAnswered();
			player2.resetHasAnswered();
			player3.resetHasAnswered();
			player4.resetHasAnswered();
			
			System.out.println("C");
			String check = questions.checkAnswer("C");
			if (check.equals("correct")){
				
			correct();
			computerPlay();
				
			}else{
				wrong();
				computerPlay();
			}
			
		}	if (choiceD ==event.getSource()){
			
			//reset players have answered
			player1.resetHasAnswered();
			player2.resetHasAnswered();
			player3.resetHasAnswered();
			player4.resetHasAnswered();
			
			System.out.println("D");
			
			String check = questions.checkAnswer("D");
			if (check.equals("correct")){
				
				correct();
				computerPlay();
			}else{
				wrong();
				computerPlay();
			}
			
		}
			
		
		//playerAction buttons
		
		if (passButton ==event.getSource()){
			
			wrong++;
			questionBox1.remove(questionText);
			choices.setVisible(false);
			questionBox2.remove(choices);
			questionGenerator();
			Level = 0;
			updateScoreBoard(Level);
			
			player1.resetHasAnswered();
			player2.resetHasAnswered();
			player3.resetHasAnswered();
			player4.resetHasAnswered();


			computerPlay();
			updatePlayerBox();
			drawBank();
		}
		
		if (bankButton ==event.getSource()){
			
	
			
			bank("me");
			
		}
		
		
		
		// voting click events
		if(buttonVote1 ==event.getSource()){
		
		
			playerVote = 1;
			System.out.println("You voted Player "+playerVote+" as the weakest link");
			GamePlayPanel.repaint();
			Vote(1);
				
		}
		if(buttonVote2 ==event.getSource()){
			
			playerVote = 2;
			System.out.println("You voted Player "+playerVote+" as the weakest link");
			GamePlayPanel.repaint();
			Vote(2);
				
		}if(buttonVote3 ==event.getSource()){
		
			playerVote = 3;
			System.out.println("You voted Player "+playerVote+" as the weakest link");
			GamePlayPanel.repaint();
			Vote(3);
				
		}if(buttonVote4 ==event.getSource()){
		
			playerVote = 4;
			System.out.println("You voted Player "+playerVote+" as the weakest link");
			GamePlayPanel.repaint();
			Vote(4);
				
		}
		
		if(buttonNextRound==event.getSource()){
			
			votingMusic.stop();
			bank("start");
			GamePlayPanel.remove(panelStats);
			windowOpen = false;
			frame.setSize(1200, 750);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
menu = false;
			System.out.println(bankMain);

			Round p = new Round(round,correct,wrong, status,bank,bankMain,menu);

			frame.add(p);
			frame.validate();
			
			frame.repaint();
			
		}
		if(buttonSudden ==event.getSource()){
			
			
			choiceA.removeActionListener(this);
			choiceB.removeActionListener(this);
			choiceC.removeActionListener(this);
			choiceD.removeActionListener(this);
			
			votingMusic.stop();
			bank("start");
			GamePlayPanel.remove(panelStats);
			GamePlayPanel.remove(buttonSudden);
			windowOpen = false;
			frame.setSize(1200, 750);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			System.out.println(bankMain);

			
			suddenDeath();
				
			frame.repaint();
			
		}
	}


	private void Vote(int aPlayerVote) {
		// TODO Auto-generated method stub
		
		 player1Votes = new ArrayList<String>();
		 player2Votes = new ArrayList<String>();
		 player3Votes = new ArrayList<String>();
		 player4Votes = new ArrayList<String>();
		 playerVotes = new ArrayList<String>();
		
	
		if (round==4){
			
			//sudden death
		//	suddenDeath();
		}
		else{
			
			//regular voting
			
			//player vote
			playerVote(aPlayerVote);
			
			//player 1 vote
			if (player1.isOut()){
				
				//do nothing
				System.out.println("Player 1 is out");
			}else{
				
				computerVote(1);	
					
			}
			
			//player 2 vote
		
			if (player2.isOut()){
				
				//do nothing
				System.out.println("Player 2 is out");
			}else{
				
				computerVote(2);	
					
			}
		 
			
			//player 3 vote
			if (player3.isOut()){
				System.out.println("Player 3 is out");
				//do nothing
			}else{
				
				computerVote(3);	
					
			}

			//player 4 vote
			if (player4.isOut()){
				
				//do nothing
				System.out.println("Player 4 is out");
				
			}else{
				
				computerVote(4);	
					
			}
		 
			calculateVotes();

		}
	
		
		
		player1Votes.clear();
		player2Votes.clear();
		player3Votes.clear();
		player4Votes.clear();
		
		GamePlayPanel.remove(panelStats);
		GamePlayPanel.remove(panelVote);
		GamePlayPanel.repaint();
		round ++;
		nextRound(round);
		
	}

	private void calculateVotes() {
		// TODO Auto-generated method stub
		
		//find the biggest array
		int playerVoteSize = playerVotes.size();
		System.out.println("you got: "+playerVoteSize);
		
		int player1VoteSize = player1Votes.size();
		System.out.println("player 1 got: "+player1VoteSize);
		
		int player2VoteSize = player2Votes.size();
		System.out.println("player 2 got: "+player2VoteSize);
		
		int player3VoteSize = player3Votes.size();
		System.out.println("player 3 got: "+player3VoteSize);
		
		int player4VoteSize = player4Votes.size();
		System.out.println("player 4 got: "+player4VoteSize);
		
		ArrayList <Integer> votes = new ArrayList<Integer>();
		votes.add(player1VoteSize);
		votes.add(player2VoteSize);
		votes.add(player3VoteSize);
		votes.add(player4VoteSize);
		votes.add(playerVoteSize);
		
		
		//index of highest votes
		System.out.println("Value of highest voted player "+ Collections.max(votes));
		System.out.println("Index of highest voted player "+ votes.indexOf(Collections.max(votes)));
	
		int indexOfWeakest = votes.indexOf(Collections.max(votes));
		
		switch (indexOfWeakest){
		
		case 0:
			averageVote = 1;
			break;

		case 1:
			averageVote = 2;
			break;

		case 2:
			averageVote = 3;
			break;

		case 3:
			averageVote = 4;
			break;
			

		case 4:
			averageVote = 5;
			break;
		}
				 


		
		System.out.println("The weakest link is: "+averageVote);
		
		if (averageVote==1){
			
			player1.setOut();
			contestants.remove(1);
			
		}	if (averageVote==2){
			
			player2.setOut();
			contestants.remove(2);
		}	if (averageVote==3){
			
			player3.setOut();
			contestants.remove(3);
		}	if (averageVote==4){
			contestants.remove(4);
			player4.setOut();
			
		}	if (averageVote==5){
			
			//contestants.remove(5);
			System.out.println("You are out!");
		}
	
	}
	private void computerVote(int aPlayer) {
		// TODO Auto-generated method stub
		switch (aPlayer){

		case 1:

			p1vote = player1.vote(weakestLink,1,contestants);

			//add p1 vote to list
			switch (p1vote){

			case 1: player1Votes.add("p1 vote");
			break;
			case 2:
				player2Votes.add("p1 vote");
				break;
			case 3:
				player3Votes.add("p1 vote");
				break;
			case 4:
				player4Votes.add("p1 vote");
				break;
			case 5: playerVotes.add("p1 vote");
			break;
			}
			System.out.println("Player 1 votes Player "+p1vote+" as the weakest link");
		case 2:
			p2vote =player2.vote(weakestLink,2,contestants);

			//add p1 vote to list
			switch (p2vote){

			case 1: player1Votes.add("p2 vote");
			break;
			case 2:
				player2Votes.add("p2 vote");
				break;
			case 3:
				player3Votes.add("p2 vote");
				break;
			case 4:
				player4Votes.add("p2 vote");
				break;
			case 5: playerVotes.add("p2 vote");
			break;
			}
			System.out.println("Player 2 votes Player "+p2vote+" as the weakest link");




		case 3:

			p3vote =player3.vote(weakestLink,3,contestants);
			//add p3 vote to list
			switch (p3vote){

			case 1: player1Votes.add("p3 vote");
			break;
			case 2:
				player2Votes.add("p3 vote");
				break;
			case 3:
				player3Votes.add("p3 vote");
				break;
			case 4:
				player4Votes.add("p3 vote");
				break;
			case 5: playerVotes.add("p3 vote");
			break;
			}
			System.out.println("Player 3 votes Player "+p3vote+" as the weakest link");
		case 4:
			p4vote =player4.vote(weakestLink,4,contestants);
			//add p1 vote to list
			switch (p4vote){

			case 1: player1Votes.add("p4 vote");
			break;
			case 2:
				player2Votes.add("p4 vote");
				break;
			case 3:
				player3Votes.add("p4 vote");
				break;
			case 4:
				player4Votes.add("p4 vote");
				break;
			case 5: playerVotes.add("p4 vote");
			break;
			}
			System.out.println("Player 4 votes Player "+p4vote+" as the weakest link");
		}



	}
	private void playerVote(int aPlayerVote) {

	// TODO Auto-generated method stub
		System.out.println("You voted Player "+aPlayerVote+" as the weakest link");
		 //add player vote to list
		 switch (aPlayerVote){
		 
		 case 1: 
			 
			 player1Votes.add("p1 vote");
		 		break;
		 case 2:
			 player2Votes.add("p1 vote");
		 		break;
		 case 3:
			 player3Votes.add("p1 vote");
		 		break;
		 case 4:
			 player4Votes.add("p1 vote");
		 		break;
		 case 5: playerVotes.add("p1 vote");
	 		break;
	 		
		 }
	}
	private void nextRound(int round2) {
		// TODO Auto-generated method stub
		weakestLink = "You";
		//stop voting music
		
		panelStats =  new JPanel (new GridLayout (4,1));
		//panelStats.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panelStats.setBackground(new Color (0,0,0));
		panelStats.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		panelStats.setLocation(40,100);
		panelStats.setSize(800,600);
		//panelStats.setVisible(true);
		// frame.add(panelStats);
		GamePlayPanel.remove(questionBox1);
		GamePlayPanel.remove(questionBox2);
		
		//if the player is voted out
		if (averageVote == 5){
			
			
			labelText = new JLabel("You are the Weakest Link!",SwingConstants.CENTER);
			labelText.setForeground(Color.WHITE);
			labelText.setLocation(0,20);
			labelText.setSize(500, 40);
			labelText.setFont(new Font("Verdana", Font.PLAIN, 40));
			
			labelText2 = new JLabel("Goodbye!",SwingConstants.CENTER);
			labelText2.setForeground(Color.WHITE);
			labelText2.setLocation(0,20);
			labelText2.setSize(500, 40);
			labelText2.setFont(new Font("Verdana", Font.PLAIN, 30));
			
			votes = new JPanel (new GridLayout(1,4));
			votes.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
			votes.setBackground(new Color (0,0,0));

			
			buttonNewGame = new JButton ("New Game!");
			buttonNewGame.setForeground(Color.WHITE);
			buttonNewGame.setBackground(new Color (0,0,0));
			buttonNewGame.setBorder(BorderFactory.createCompoundBorder(orangeBorder,paddingBorder));
			buttonNewGame.addActionListener(new ActionListener (){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub

					round = 1;
					newGame();
					votingMusic.stop();
					bank("start");
					GamePlayPanel.remove(panelStats);
					windowOpen = false;
					frame.setSize(1200, 750);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);  // places frame in the middle of the screen
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					menu = false;
					
					System.out.println(bankMain);

					Round p = new Round(round,correct,wrong, status,bank,bankMain,menu);

					frame.add(p);
					frame.validate();
					
					frame.repaint();
		
				}
				
				
			});
			
			buttonNewGame.setFont(new Font("Verdana", Font.PLAIN, 30));
			

			buttonExitGame = new JButton ("Exit Game!");
			buttonExitGame.setForeground(Color.WHITE);
			buttonExitGame.setBackground(new Color (0,0,0));
			buttonExitGame.setBorder(BorderFactory.createCompoundBorder(orangeBorder,paddingBorder));
			buttonExitGame.addActionListener(new ActionListener (){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.dispose();
				}
				
			});
			
			buttonExitGame.setFont(new Font("Verdana", Font.PLAIN, 30));
			panelStats.add(labelText);
			panelStats.add(labelText2);
			panelStats.add(buttonNewGame);
			panelStats.add(buttonExitGame);
		
			
		}else{
			
		//if computer is voted out
		labelText = new JLabel("Player "+averageVote+ " is the Weakest Link!",SwingConstants.CENTER);
		labelText.setForeground(Color.WHITE);
		labelText.setLocation(0,20);
		labelText.setSize(500, 40);
		labelText.setFont(new Font("Verdana", Font.PLAIN, 40));
		
		labelText2 = new JLabel("Time for the next round of the Weakest Link!",SwingConstants.CENTER);
		labelText2.setForeground(Color.WHITE);
		labelText2.setLocation(0,20);
		labelText2.setSize(500, 40);
		labelText2.setFont(new Font("Verdana", Font.PLAIN, 30));
		
		votes = new JPanel (new GridLayout(1,4));
		votes.setBorder(BorderFactory.createCompoundBorder(paddingBorder,paddingBorder));
		votes.setBackground(new Color (0,0,0));
		
		
		if (p1vote == 0){
			
			voteText1 = new JLabel("Player 1 is out!",SwingConstants.CENTER);
			voteText1.setForeground(Color.WHITE);
			voteText1.setLocation(0,20);
			voteText1.setSize(500, 40);
			voteText1.setFont(new Font("Verdana", Font.PLAIN, 12));
			voteText1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			
		}else{
			voteText1 = new JLabel("Player 1 Voted for: "+ p1vote,SwingConstants.CENTER);
			voteText1.setForeground(Color.WHITE);
			voteText1.setLocation(0,20);
			voteText1.setSize(500, 40);
			voteText1.setFont(new Font("Verdana", Font.PLAIN, 12));
			voteText1.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		}
		
		if (p2vote == 0){
			
			voteText2 = new JLabel("Player 2 is out!",SwingConstants.CENTER);
			voteText2.setForeground(Color.WHITE);
			voteText2.setLocation(0,20);
			voteText2.setSize(500, 40);
			voteText2.setFont(new Font("Verdana", Font.PLAIN, 12));
			voteText2.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			
		}else{
			voteText2 = new JLabel("Player 2 Voted for: "+ p2vote,SwingConstants.CENTER);
			voteText2.setForeground(Color.WHITE);
			voteText2.setLocation(0,20);
			voteText2.setSize(500, 40);
			voteText2.setFont(new Font("Verdana", Font.PLAIN, 12));
			voteText2.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		}
		
		if (p3vote == 0){
			
			voteText3 = new JLabel("Player 3 is out!",SwingConstants.CENTER);
			voteText3.setForeground(Color.WHITE);
			voteText3.setLocation(0,20);
			voteText3.setSize(500, 40);
			voteText3.setFont(new Font("Verdana", Font.PLAIN, 12));
			voteText3.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			
		}else{
			voteText3 = new JLabel("Player 3 Voted for: "+ p3vote,SwingConstants.CENTER);
			voteText3.setForeground(Color.WHITE);
			voteText3.setLocation(0,20);
			voteText3.setSize(500, 40);
			voteText3.setFont(new Font("Verdana", Font.PLAIN, 12));
			voteText3.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		}
		
		if (p4vote == 0){
			
			voteText4 = new JLabel("Player 4 is out!",SwingConstants.CENTER);
			voteText4.setForeground(Color.WHITE);
			voteText4.setLocation(0,20);
			voteText4.setSize(500, 40);
			voteText4.setFont(new Font("Verdana", Font.PLAIN, 12));
			voteText4.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
			
		}else{
			voteText4 = new JLabel("Player 4 Voted for: "+ p4vote,SwingConstants.CENTER);
			voteText4.setForeground(Color.WHITE);
			voteText4.setLocation(0,20);
			voteText4.setSize(500, 40);
			voteText4.setFont(new Font("Verdana", Font.PLAIN, 12));
			voteText4.setBorder(BorderFactory.createCompoundBorder(whiteBorder,paddingBorder));
		}
		
		
		votes.add(voteText1);
		votes.add(voteText2);
		votes.add(voteText3);
		votes.add(voteText4);
	
		buttonNextRound = new JButton ("Continue!");
		buttonNextRound.setForeground(Color.WHITE);
		buttonNextRound.setBackground(new Color (0,0,0));
		buttonNextRound.setBorder(BorderFactory.createCompoundBorder(orangeBorder,paddingBorder));
		buttonNextRound.addActionListener(this);
		buttonNextRound.addMouseListener(this);
		buttonNextRound.setFont(new Font("Verdana", Font.PLAIN, 30));
		
		//update stats panel
		panelStats.add(labelText);
		panelStats.add(labelText2);
		panelStats.add(votes);
		panelStats.add(buttonNextRound);
		
		
		
		}
		
		
		
		GamePlayPanel.add(panelStats);
		panelStats.validate();
		GamePlayPanel.repaint();
		
		bank("start");
	}
	private void clearFrame() {
		// TODO Auto-generated method stub

		//statsBox();
		System.out.println("Cleared!! Success");
	//	this.scoreBoard.setVisible(false);
		
		GamePlayPanel.remove(scoreTitle);
		GamePlayPanel.remove(scoreBoard);//remove all the panels
		GamePlayPanel.remove(PlayerPanel);
		GamePlayPanel.remove(questionBox1);
		GamePlayPanel.remove(questionBox2);
		GamePlayPanel.remove(timerBox);
		GamePlayPanel.remove(actionHolder);
		GamePlayPanel.remove(gameStatusHolder);
		GamePlayPanel.remove(bankHolder);
	
		

	     //this.add(labelText2);
	   //  this.repaint();
	//frame.repaint();
	}
	
	private void bank(String who) {
		// TODO Auto-generated method stub
		
		if (who.equals("start")){
			
			
			
		}else{
		//play sound
			clearJPanel();
		try {
	         // Open an audio input stream.
	         URL url = this.getClass().getClassLoader().getResource("bank2.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
		
	
		double bankedAmount = 0.00;
		if (Level == 1){
			
		 bankedAmount = 10;
			
		}else if (Level == 1){
			
		 bankedAmount = 20;
			
		}else if (Level == 2){
			
		 bankedAmount = 50;
			
		}else if (Level == 3){
			
		 bankedAmount = 100;
			
		}else if (Level == 4){
			
		 bankedAmount = 250;
			
		}else if (Level == 5){
			
		 bankedAmount = 500;
			
		}else if (Level == 6){
			
		 bankedAmount = 1000;
			
		}else if (Level == 7){
			
		 bankedAmount = 2500;
			
		}else if (Level == 8){
			
		 bankedAmount = 5000;
			
		}else if (Level == 9){
			
		 bankedAmount = 10000;
			
		}
		
		//reset bank level
		Level = 0;
		
	//	questionBox1.remove(questionText);
		choices.setVisible(false);
	
		//update main bank
		bankMain = bankMain +bankedAmount;
		
		if (who.equals("me")){
			
			bank = bank + bankedAmount;
			
		}
		
		if (who.equals("comp1")){
			
			player1.bank(bankedAmount);
		}if (who.equals("comp2")){
			
			player2.bank(bankedAmount);
		}if (who.equals("comp3")){
			
			player3.bank(bankedAmount);
		}if (who.equals("comp4")){
			
			player4.bank(bankedAmount);
		}
		
		
		System.out.println(bankMain);
		//redraw.
		if (windowOpen){
			
		//	statsBox();
			this.remove(bankHolder);

			this.remove(scoreBoard);

			this.remove(actionHolder);
		}{
		
			updateScoreBoard(Level);
	
		
			updatePlayerBox();
		
			drawBank();
			
			GamePlayPanel.validate();
			GamePlayPanel.setBackground(new Color (0,0,0,0));
			this.validate();
			this.add(background);	
			this.add(GamePlayPanel);
			}
		choices.setVisible(true);
		
		}
	}
	private void clearJPanel() {
		// TODO Auto-generated method stub

		this.remove(GamePlayPanel);
		
		this.add(GamePlayPanel);
	}
	private void playerTurn() {
		// TODO Auto-generated method stub
		
		if (windowOpen){
			GamePlayPanel.remove(actionHolder);
			GamePlayPanel.remove(scoreBoard);
			//statsBox();
			
		}else{
			
			updateScoreBoard(Level);
		}
		
		//update question
		choices.setVisible(false);
		questionBox1.remove(questionText);
		questionBox2.remove(choices);
		
		choiceA.setEnabled(true);
		choiceB.setEnabled(true);
		choiceC.setEnabled(true);
		choiceD.setEnabled(true);
		bankButton.setEnabled(true);
		passButton.setEnabled(true);
		questionGenerator();
		//playerBox.removeAll();
		updatePlayerBox();
		}
	private void wrong() {
		// TODO Auto-generated method stub
		
		//play sound
		try {
	         // Open an audio input stream.
	         URL url = this.getClass().getClassLoader().getResource("wrong.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
		
		
		wrong ++;
		Level = 0;
		updateScoreBoard(Level);
		//update question
		choices.setVisible(false);
		questionBox1.remove(questionText);
		questionBox2.remove(choices);
		
		choiceA.setEnabled(false);
		choiceB.setEnabled(false);
		choiceC.setEnabled(false);
		choiceD.setEnabled(false);
		questionGenerator();
		//playerBox.removeAll();
		updatePlayerBox();
		
//	repaint();
	}
	private void wrongCom() {
		// TODO Auto-generated method stub
		//play sound
				try {
			         // Open an audio input stream.
			         URL url = this.getClass().getClassLoader().getResource("wrong.wav");
			         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			         // Get a sound clip resource.
			         Clip clip = AudioSystem.getClip();
			         // Open audio clip and load samples from the audio input stream.
			         clip.open(audioIn);
			         clip.start();
			      } catch (UnsupportedAudioFileException e) {
			         e.printStackTrace();
			      } catch (IOException e) {
			         e.printStackTrace();
			      } catch (LineUnavailableException e) {
			         e.printStackTrace();
			      }
				
		Level = 0;
		updateScoreBoard(Level);
		//update question
		choices.setVisible(false);
		questionBox1.remove(questionText);
		questionBox2.remove(choices);
		
		choiceA.setEnabled(false);
		choiceB.setEnabled(false);
		choiceC.setEnabled(false);
		choiceD.setEnabled(false);
		questionGenerator();
		//playerBox.removeAll();
		updatePlayerBox();
		
//	repaint();
	}
	private void correct() {
		// TODO Auto-generated method stub
		//play sound
				try {
			         // Open an audio input stream.
			         URL url = this.getClass().getClassLoader().getResource("correct.wav");
			         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			         // Get a sound clip resource.
			         Clip clip = AudioSystem.getClip();
			         // Open audio clip and load samples from the audio input stream.
			         clip.open(audioIn);
			         clip.start();
			      } catch (UnsupportedAudioFileException e) {
			         e.printStackTrace();
			      } catch (IOException e) {
			         e.printStackTrace();
			      } catch (LineUnavailableException e) {
			         e.printStackTrace();
			      }
				
		questionBox1.remove(questionText);
		
		choices.setVisible(false);
		questionBox2.remove(choices);
		choiceA.setEnabled(false);
		choiceB.setEnabled(false);
		choiceC.setEnabled(false);
		choiceD.setEnabled(false);
		questionGenerator();
		Level ++;
		updateScoreBoard(Level);
		correct ++;
		//choices.repaint();
	//	playerBox.removeAll();
		updatePlayerBox();
		//repaint();
	}

	private void correctCom() {
		// TODO Auto-generated method stub
		
		//play sound
				try {
			         // Open an audio input stream.
			         URL url = this.getClass().getClassLoader().getResource("correct.wav");
			         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			         // Get a sound clip resource.
			         Clip clip = AudioSystem.getClip();
			         // Open audio clip and load samples from the audio input stream.
			         clip.open(audioIn);
			         clip.start();
			      } catch (UnsupportedAudioFileException e) {
			         e.printStackTrace();
			      } catch (IOException e) {
			         e.printStackTrace();
			      } catch (LineUnavailableException e) {
			         e.printStackTrace();
			      }
				
		questionBox1.remove(questionText);
		
		choices.setVisible(false);
		questionBox2.remove(choices);
		choiceA.setEnabled(false);
		choiceB.setEnabled(false);
		choiceC.setEnabled(false);
		choiceD.setEnabled(false);
		questionGenerator();
		Level ++;
		updateScoreBoard(Level);
		
		//choices.repaint();
	//	playerBox.removeAll();
		updatePlayerBox();
		//repaint();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent event) {
	
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
