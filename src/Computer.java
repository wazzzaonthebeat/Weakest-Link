import java.util.ArrayList;
import java.util.Random;

public class Computer extends Contestant {

	private int score;
	private int correct;
	private int wrong;
	private String status;
	private double bank;
	private int intelligenceRandom, intelligence;
	private boolean isOut = false;
	private boolean answered = false;
	
	
	
	
	public Computer() {
		// TODO Auto-generated constructor stub
		score = 0;
		
		//generate player intelligence
		
		Random random = new Random();
		
		intelligenceRandom = random.nextInt(3);
		System.out.println(intelligenceRandom);
		
		switch (intelligenceRandom){
			
		case 0:
			//stupid
			intelligence = 1;
			
		case 1:
			//average
			intelligence = 2;
		case 2:			
			//smart
			intelligence = 3;
		}
		
			
	}
	
	public int getIntelligence (){
		
		Random random = new Random();
		
		intelligence = random.nextInt(3);
	
		return intelligence;
	}

	public void setIntelligence(int aInt) {
		// TODO Auto-generated method stub
		
		intelligence = aInt;
	}

	public String playRound() {
		// TODO Auto-generated method stub
		int checkAnswer = 0;
		String computerAnswer = "no answer";
		int range;
		
		Random myChoice = new Random();
		
		//intelligence
		
		switch (intelligence){
		
		case 0: //stupid
			
			range = myChoice.nextInt(10)+1;
			
			if (range <= 3){
			
				
				computerAnswer = "correct";
				
			}else{
				
				computerAnswer = "wrong";
			}
			
			
			
				break;
		case 1: 
			
			//neutral
			range = myChoice.nextInt(10)+1;
			
			//50/50
			if (range <= 5){
			
				
				computerAnswer = "correct";
				
			}else{
				
				computerAnswer = "wrong";
			}
			
			break;
		
		case 2:
			
			// more likey to have correct answer
			range = myChoice.nextInt(10)+1;
			
			if (range < 8){
			
				
				computerAnswer = "correct";
				
			}else{
				
				computerAnswer = "wrong";
			}
			
			break;
		}
		
		
		
		return computerAnswer;
		
	}

	
	public void setCorrect(){
		
		correct ++;
	}
	
	
	public int getCorrect(){
			
			return correct ;
	}
	
	
	public void setWrong(){
		 wrong ++;
	}
	
	public int getWrong(){
			
			return wrong ;
	}
	public String setStatus(String aStatus){
	
	  status = aStatus;
	  return status;
	}

	public void bank(double aBank) {
		// TODO Auto-generated method stub
		bank = bank  +aBank;
	}
	
	public double getBank() {
		// TODO Auto-generated method stub
		return bank;
	}

	public int vote(String aWeakestLink,int self, ArrayList contestants) {
		// TODO Auto-generated method stub
		Random Vote = new Random();
		int numberOfPlayers = contestants.size();
		int index = Vote.nextInt(numberOfPlayers);
		
		String link;
		System.out.println(aWeakestLink + " this is what we were looking at");
		
		if (aWeakestLink.length()==0){
		
			 link = "You";
			
			
		}else{
		
		 link = aWeakestLink.toString();
		}
		Integer myVote;
		
		if (link.equals("null")){
			
			 myVote = (Integer) contestants.get(Integer.valueOf(Vote.nextInt(numberOfPlayers)));
				
		}else{
			
			if (aWeakestLink.matches("[a-zA-Z]+")){
			
				myVote = 5;
				
				
			}else{
				myVote = Integer.valueOf(aWeakestLink.substring(7));
				
			}
			 
		}
		
		
		int prob = Vote.nextInt(9);
		
		switch (prob){
		
		case 1: if(self == myVote){
			return (int) contestants.get(index);
		}else{

			return myVote;
		}
		
		case 2: if(self ==myVote){
			return (int) contestants.get(index);
		}else{

			return myVote;
		}
		
		case 3: if(self ==myVote){
			return (int) contestants.get(index);
		}else{

			return myVote;
		}
		
		case 4: if(self ==myVote){
			return (int) contestants.get(index);
		}else{

			return myVote;
		}
		
		case 5: if(self ==myVote){
			return (int) contestants.get(index);
		}else{

			return myVote;
		}
		
		case 6: if(self ==myVote){
			return (int) contestants.get(index);
		}else{

			return myVote;
		}
		
		//pick a random player
		default: return (int) contestants.get(index);
		}
	}

	public void setOut() {
		// TODO Auto-generated method stub
		correct =-100;
		wrong = -100;
		status = "Out!";
		isOut = true;
		
		System.out.println("Player has been set as out!: "+isOut);
	}

	public boolean isOut() {

		System.out.println(isOut);
		// TODO Auto-generated method stub
		return isOut;
	}

	public void resetCorrect() {
		// TODO Auto-generated method stub
		correct = 0;
		wrong = 0;
	}

	public boolean hasAnswered() {
		// TODO Auto-generated method stub
		answered = true;
		return false;
	}
	
	public boolean resetHasAnswered() {
		// TODO Auto-generated method stub
		answered = false;
		return false;
	}
	
	public boolean checkHasAnswered() {
		// TODO Auto-generated method stub
		return answered;
	}

	

	
}
