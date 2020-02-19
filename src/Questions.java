import java.util.ArrayList;
import java.util.Random;

public class Questions {

	private ArrayList<String> questions;
	private ArrayList<String> options;
	private ArrayList<String> correctAnswers;
	private String correct;
	
	//consttuctor
	public Questions(){
		
		questions = new ArrayList<String>();
		options = new ArrayList<String>(); //same index as question
		correctAnswers = new ArrayList<String>();
		//lsit of all the questions
		questions.add("How many days are in a leap year?"); //1
			options.add("365-366-367-364");
			correctAnswers.add("B");
			
		questions.add("What is the capitol city of Morocco?"); //2
			options.add("Rabat-Gaborone-Berlin-Mbabane");
			correctAnswers.add("A");
			
		questions.add("Who founded Microsoft?"); //3
			options.add("Steve Jobs-Bill Gates-Thomas Edison-Nelson Mandela");
			correctAnswers.add("B");
			
		questions.add("Who founded Facebook?"); //4
			options.add("Mark Zuckerburg-Tim Crouch-Samsung-Jay Z");
			correctAnswers.add("A");
			
		questions.add("Which president could 'never tell a lie'?"); //5
			options.add("Donald Trump-Barack Obama-George Washington-Abrahim Lincoln");
			correctAnswers.add("D");
			
		questions.add("What species do human beings fall under?"); //6
			options.add("Homosapiens-Homoerectus-Lycaon pictus-Vulpes lagopus");
			correctAnswers.add("A");
			
		questions.add("What is a dongle?"); //7
			options.add("Flash Drive-Cell Phone Network-Toothpic-Mobile Hotspot");
			correctAnswers.add("D");
			
		questions.add("What is the primary language of address in Botswana?"); //7
			options.add("Spanish-Swahili-Setswana-Dutch");
			correctAnswers.add("C");
		
		questions.add("Grand Central Terminal, Park Avenue, New York is the world's..."); //7
			options.add("Largest railway station-Highest railway station-Longest railway station-None of the above");
			correctAnswers.add("A");

		questions.add("Entomology is the science that studies..."); //7
			options.add("Behavior of human beings-Insects-The origin and history of technical and scientific terms-The formation of rocks");
			correctAnswers.add("B");
		
		questions.add("Eritrea, which became the 182nd member of the UN in 1993, is in the continent of..."); //7
			options.add("Asia-Africa-Europe-South America");
			correctAnswers.add("B");
			
		questions.add("For which of the following disciplines is Nobel Prize awarded?"); //7
			options.add("Physics and Chemistry-Physiology or Medicine-Literature, Peace and Economics-All of the above");
			correctAnswers.add("D");
			
		questions.add("Hitler party which came into power in 1933 is known as..."); //7
			options.add("Labour Party-Ku Klux Klan-Nazi Party-Democratic Party");
			correctAnswers.add("C");
			
		questions.add("FFC stands for..."); //7
			options.add("Foreign Finance Corporation-Film Finance Corporation-Federation of Football Council-None of the above");
			correctAnswers.add("B");
			

		questions.add("Fastest shorthand writer was..."); //7
			options.add("Dr. G. D. Bist-J.R.D. Tata-J.M. Tagore-Khudada Khan");
			correctAnswers.add("A");
			

		questions.add("Epsom (England) is the place associated with..."); //7
			options.add("Horse racing-Polo-Shooting-Snooker");
			correctAnswers.add("A");
			

		questions.add("First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in..."); //7
			options.add("1965-1968-1958-1967");
			correctAnswers.add("D");
			

		questions.add("Galileo was an Italian astronomer who..."); //7
			options.add("Developed the telescope-Discovered four satellites of Jupiter-Discovered that the movement of pendulum produces a regular time measurement-All of the above");
			correctAnswers.add("D");
			
			
			//first loop
			questions.add("How many days are in a leap year?"); //1
			options.add("365-366-367-364");
			correctAnswers.add("B");
			
		questions.add("What is the capitol city of Morocco?"); //2
			options.add("Rabat-Gaborone-Berlin-Mbabane");
			correctAnswers.add("A");
			
		questions.add("Who founded Microsoft?"); //3
			options.add("Steve Jobs-Bill Gates-Thomas Edison-Nelson Mandela");
			correctAnswers.add("B");
			
		questions.add("Who founded Facebook?"); //4
			options.add("Mark Zuckerburg-Tim Crouch-Samsung-Jay Z");
			correctAnswers.add("A");
			
		questions.add("Which president could 'never tell a lie'?"); //5
			options.add("Donald Trump-Barack Obama-George Washington-Abrahim Lincoln");
			correctAnswers.add("D");
			
		questions.add("What species do human beings fall under?"); //6
			options.add("Homosapiens-Homoerectus-Lycaon pictus-Vulpes lagopus");
			correctAnswers.add("A");
			
		questions.add("What is a dongle?"); //7
			options.add("Flash Drive-Cell Phone Network-Toothpic-Mobile Hotspot");
			correctAnswers.add("D");
			
		questions.add("What is the primary language of address in Botswana?"); //7
			options.add("Spanish-Swahili-Setswana-Dutch");
			correctAnswers.add("C");
		
		questions.add("Grand Central Terminal, Park Avenue, New York is the world's..."); //7
			options.add("Largest railway station-Highest railway station-Longest railway station-None of the above");
			correctAnswers.add("A");

		questions.add("Entomology is the science that studies..."); //7
			options.add("Behavior of human beings-Insects-The origin and history of technical and scientific terms-The formation of rocks");
			correctAnswers.add("B");
		
		questions.add("Eritrea, which became the 182nd member of the UN in 1993, is in the continent of..."); //7
			options.add("Asia-Africa-Europe-South America");
			correctAnswers.add("B");
			
		questions.add("For which of the following disciplines is Nobel Prize awarded?"); //7
			options.add("Physics and Chemistry-Physiology or Medicine-Literature, Peace and Economics-All of the above");
			correctAnswers.add("D");
			
		questions.add("Hitler party which came into power in 1933 is known as..."); //7
			options.add("Labour Party-Ku Klux Klan-Nazi Party-Democratic Party");
			correctAnswers.add("C");
			
		questions.add("FFC stands for..."); //7
			options.add("Foreign Finance Corporation-Film Finance Corporation-Federation of Football Council-None of the above");
			correctAnswers.add("B");
			

		questions.add("Fastest shorthand writer was..."); //7
			options.add("Dr. G. D. Bist-J.R.D. Tata-J.M. Tagore-Khudada Khan");
			correctAnswers.add("A");
			

		questions.add("Epsom (England) is the place associated with..."); //7
			options.add("Horse racing-Polo-Shooting-Snooker");
			correctAnswers.add("A");
			

		questions.add("First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in..."); //7
			options.add("1965-1968-1958-1967");
			correctAnswers.add("D");
			

		questions.add("Galileo was an Italian astronomer who..."); //7
			options.add("Developed the telescope-Discovered four satellites of Jupiter-Discovered that the movement of pendulum produces a regular time measurement-All of the above");
			correctAnswers.add("D");
			//second loop
			
			questions.add("How many days are in a leap year?"); //1
			options.add("365-366-367-364");
			correctAnswers.add("B");
			
		questions.add("What is the capitol city of Morocco?"); //2
			options.add("Rabat-Gaborone-Berlin-Mbabane");
			correctAnswers.add("A");
			
		questions.add("Who founded Microsoft?"); //3
			options.add("Steve Jobs-Bill Gates-Thomas Edison-Nelson Mandela");
			correctAnswers.add("B");
			
		questions.add("Who founded Facebook?"); //4
			options.add("Mark Zuckerburg-Tim Crouch-Samsung-Jay Z");
			correctAnswers.add("A");
			
		questions.add("Which president could 'never tell a lie'?"); //5
			options.add("Donald Trump-Barack Obama-George Washington-Abrahim Lincoln");
			correctAnswers.add("D");
			
		questions.add("What species do human beings fall under?"); //6
			options.add("Homosapiens-Homoerectus-Lycaon pictus-Vulpes lagopus");
			correctAnswers.add("A");
			
		questions.add("What is a dongle?"); //7
			options.add("Flash Drive-Cell Phone Network-Toothpic-Mobile Hotspot");
			correctAnswers.add("D");
			
		questions.add("What is the primary language of address in Botswana?"); //7
			options.add("Spanish-Swahili-Setswana-Dutch");
			correctAnswers.add("C");
		
		questions.add("Grand Central Terminal, Park Avenue, New York is the world's..."); //7
			options.add("Largest railway station-Highest railway station-Longest railway station-None of the above");
			correctAnswers.add("A");

		questions.add("Entomology is the science that studies..."); //7
			options.add("Behavior of human beings-Insects-The origin and history of technical and scientific terms-The formation of rocks");
			correctAnswers.add("B");
		
		questions.add("Eritrea, which became the 182nd member of the UN in 1993, is in the continent of..."); //7
			options.add("Asia-Africa-Europe-South America");
			correctAnswers.add("B");
			
		questions.add("For which of the following disciplines is Nobel Prize awarded?"); //7
			options.add("Physics and Chemistry-Physiology or Medicine-Literature, Peace and Economics-All of the above");
			correctAnswers.add("D");
			
		questions.add("Hitler party which came into power in 1933 is known as..."); //7
			options.add("Labour Party-Ku Klux Klan-Nazi Party-Democratic Party");
			correctAnswers.add("C");
			
		questions.add("FFC stands for..."); //7
			options.add("Foreign Finance Corporation-Film Finance Corporation-Federation of Football Council-None of the above");
			correctAnswers.add("B");
			

		questions.add("Fastest shorthand writer was..."); //7
			options.add("Dr. G. D. Bist-J.R.D. Tata-J.M. Tagore-Khudada Khan");
			correctAnswers.add("A");
			

		questions.add("Epsom (England) is the place associated with..."); //7
			options.add("Horse racing-Polo-Shooting-Snooker");
			correctAnswers.add("A");
			

		questions.add("First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in..."); //7
			options.add("1965-1968-1958-1967");
			correctAnswers.add("D");
			

		questions.add("Galileo was an Italian astronomer who..."); //7
			options.add("Developed the telescope-Discovered four satellites of Jupiter-Discovered that the movement of pendulum produces a regular time measurement-All of the above");
			correctAnswers.add("D");
			
			
			
			//third loop
			questions.add("How many days are in a leap year?"); //1
			options.add("365-366-367-364");
			correctAnswers.add("B");
			
		questions.add("What is the capitol city of Morocco?"); //2
			options.add("Rabat-Gaborone-Berlin-Mbabane");
			correctAnswers.add("A");
			
		questions.add("Who founded Microsoft?"); //3
			options.add("Steve Jobs-Bill Gates-Thomas Edison-Nelson Mandela");
			correctAnswers.add("B");
			
		questions.add("Who founded Facebook?"); //4
			options.add("Mark Zuckerburg-Tim Crouch-Samsung-Jay Z");
			correctAnswers.add("A");
			
		questions.add("Which president could 'never tell a lie'?"); //5
			options.add("Donald Trump-Barack Obama-George Washington-Abrahim Lincoln");
			correctAnswers.add("D");
			
		questions.add("What species do human beings fall under?"); //6
			options.add("Homosapiens-Homoerectus-Lycaon pictus-Vulpes lagopus");
			correctAnswers.add("A");
			
		questions.add("What is a dongle?"); //7
			options.add("Flash Drive-Cell Phone Network-Toothpic-Mobile Hotspot");
			correctAnswers.add("D");
			
		questions.add("What is the primary language of address in Botswana?"); //7
			options.add("Spanish-Swahili-Setswana-Dutch");
			correctAnswers.add("C");
		
		questions.add("Grand Central Terminal, Park Avenue, New York is the world's..."); //7
			options.add("Largest railway station-Highest railway station-Longest railway station-None of the above");
			correctAnswers.add("A");

		questions.add("Entomology is the science that studies..."); //7
			options.add("Behavior of human beings-Insects-The origin and history of technical and scientific terms-The formation of rocks");
			correctAnswers.add("B");
		
		questions.add("Eritrea, which became the 182nd member of the UN in 1993, is in the continent of..."); //7
			options.add("Asia-Africa-Europe-South America");
			correctAnswers.add("B");
			
		questions.add("For which of the following disciplines is Nobel Prize awarded?"); //7
			options.add("Physics and Chemistry-Physiology or Medicine-Literature, Peace and Economics-All of the above");
			correctAnswers.add("D");
			
		questions.add("Hitler party which came into power in 1933 is known as..."); //7
			options.add("Labour Party-Ku Klux Klan-Nazi Party-Democratic Party");
			correctAnswers.add("C");
			
		questions.add("FFC stands for..."); //7
			options.add("Foreign Finance Corporation-Film Finance Corporation-Federation of Football Council-None of the above");
			correctAnswers.add("B");
			

		questions.add("Fastest shorthand writer was..."); //7
			options.add("Dr. G. D. Bist-J.R.D. Tata-J.M. Tagore-Khudada Khan");
			correctAnswers.add("A");
			

		questions.add("Epsom (England) is the place associated with..."); //7
			options.add("Horse racing-Polo-Shooting-Snooker");
			correctAnswers.add("A");
			

		questions.add("First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in..."); //7
			options.add("1965-1968-1958-1967");
			correctAnswers.add("D");
			

		questions.add("Galileo was an Italian astronomer who..."); //7
			options.add("Developed the telescope-Discovered four satellites of Jupiter-Discovered that the movement of pendulum produces a regular time measurement-All of the above");
			correctAnswers.add("D");
			
			
			
			//forth loop
			questions.add("How many days are in a leap year?"); //1
			options.add("365-366-367-364");
			correctAnswers.add("B");
			
		questions.add("What is the capitol city of Morocco?"); //2
			options.add("Rabat-Gaborone-Berlin-Mbabane");
			correctAnswers.add("A");
			
		questions.add("Who founded Microsoft?"); //3
			options.add("Steve Jobs-Bill Gates-Thomas Edison-Nelson Mandela");
			correctAnswers.add("B");
			
		questions.add("Who founded Facebook?"); //4
			options.add("Mark Zuckerburg-Tim Crouch-Samsung-Jay Z");
			correctAnswers.add("A");
			
		questions.add("Which president could 'never tell a lie'?"); //5
			options.add("Donald Trump-Barack Obama-George Washington-Abrahim Lincoln");
			correctAnswers.add("D");
			
		questions.add("What species do human beings fall under?"); //6
			options.add("Homosapiens-Homoerectus-Lycaon pictus-Vulpes lagopus");
			correctAnswers.add("A");
			
		questions.add("What is a dongle?"); //7
			options.add("Flash Drive-Cell Phone Network-Toothpic-Mobile Hotspot");
			correctAnswers.add("D");
			
		questions.add("What is the primary language of address in Botswana?"); //7
			options.add("Spanish-Swahili-Setswana-Dutch");
			correctAnswers.add("C");
		
		questions.add("Grand Central Terminal, Park Avenue, New York is the world's..."); //7
			options.add("Largest railway station-Highest railway station-Longest railway station-None of the above");
			correctAnswers.add("A");

		questions.add("Entomology is the science that studies..."); //7
			options.add("Behavior of human beings-Insects-The origin and history of technical and scientific terms-The formation of rocks");
			correctAnswers.add("B");
		
		questions.add("Eritrea, which became the 182nd member of the UN in 1993, is in the continent of..."); //7
			options.add("Asia-Africa-Europe-South America");
			correctAnswers.add("B");
			
		questions.add("For which of the following disciplines is Nobel Prize awarded?"); //7
			options.add("Physics and Chemistry-Physiology or Medicine-Literature, Peace and Economics-All of the above");
			correctAnswers.add("D");
			
		questions.add("Hitler party which came into power in 1933 is known as..."); //7
			options.add("Labour Party-Ku Klux Klan-Nazi Party-Democratic Party");
			correctAnswers.add("C");
			
		questions.add("FFC stands for..."); //7
			options.add("Foreign Finance Corporation-Film Finance Corporation-Federation of Football Council-None of the above");
			correctAnswers.add("B");
			

		questions.add("Fastest shorthand writer was..."); //7
			options.add("Dr. G. D. Bist-J.R.D. Tata-J.M. Tagore-Khudada Khan");
			correctAnswers.add("A");
			

		questions.add("Epsom (England) is the place associated with..."); //7
			options.add("Horse racing-Polo-Shooting-Snooker");
			correctAnswers.add("A");
			

		questions.add("First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in..."); //7
			options.add("1965-1968-1958-1967");
			correctAnswers.add("D");
			

		questions.add("Galileo was an Italian astronomer who..."); //7
			options.add("Developed the telescope-Discovered four satellites of Jupiter-Discovered that the movement of pendulum produces a regular time measurement-All of the above");
			correctAnswers.add("D");
			
			
			
			//fifth loop
			
			questions.add("How many days are in a leap year?"); //1
			options.add("365-366-367-364");
			correctAnswers.add("B");
			
		questions.add("What is the capitol city of Morocco?"); //2
			options.add("Rabat-Gaborone-Berlin-Mbabane");
			correctAnswers.add("A");
			
		questions.add("Who founded Microsoft?"); //3
			options.add("Steve Jobs-Bill Gates-Thomas Edison-Nelson Mandela");
			correctAnswers.add("B");
			
		questions.add("Who founded Facebook?"); //4
			options.add("Mark Zuckerburg-Tim Crouch-Samsung-Jay Z");
			correctAnswers.add("A");
			
		questions.add("Which president could 'never tell a lie'?"); //5
			options.add("Donald Trump-Barack Obama-George Washington-Abrahim Lincoln");
			correctAnswers.add("D");
			
		questions.add("What species do human beings fall under?"); //6
			options.add("Homosapiens-Homoerectus-Lycaon pictus-Vulpes lagopus");
			correctAnswers.add("A");
			
		questions.add("What is a dongle?"); //7
			options.add("Flash Drive-Cell Phone Network-Toothpic-Mobile Hotspot");
			correctAnswers.add("D");
			
		questions.add("What is the primary language of address in Botswana?"); //7
			options.add("Spanish-Swahili-Setswana-Dutch");
			correctAnswers.add("C");
		
		questions.add("Grand Central Terminal, Park Avenue, New York is the world's..."); //7
			options.add("Largest railway station-Highest railway station-Longest railway station-None of the above");
			correctAnswers.add("A");

		questions.add("Entomology is the science that studies..."); //7
			options.add("Behavior of human beings-Insects-The origin and history of technical and scientific terms-The formation of rocks");
			correctAnswers.add("B");
		
		questions.add("Eritrea, which became the 182nd member of the UN in 1993, is in the continent of..."); //7
			options.add("Asia-Africa-Europe-South America");
			correctAnswers.add("B");
			
		questions.add("For which of the following disciplines is Nobel Prize awarded?"); //7
			options.add("Physics and Chemistry-Physiology or Medicine-Literature, Peace and Economics-All of the above");
			correctAnswers.add("D");
			
		questions.add("Hitler party which came into power in 1933 is known as..."); //7
			options.add("Labour Party-Ku Klux Klan-Nazi Party-Democratic Party");
			correctAnswers.add("C");
			
		questions.add("FFC stands for..."); //7
			options.add("Foreign Finance Corporation-Film Finance Corporation-Federation of Football Council-None of the above");
			correctAnswers.add("B");
			

		questions.add("Fastest shorthand writer was..."); //7
			options.add("Dr. G. D. Bist-J.R.D. Tata-J.M. Tagore-Khudada Khan");
			correctAnswers.add("A");
			

		questions.add("Epsom (England) is the place associated with..."); //7
			options.add("Horse racing-Polo-Shooting-Snooker");
			correctAnswers.add("A");
			

		questions.add("First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in..."); //7
			options.add("1965-1968-1958-1967");
			correctAnswers.add("D");
			

		questions.add("Galileo was an Italian astronomer who..."); //7
			options.add("Developed the telescope-Discovered four satellites of Jupiter-Discovered that the movement of pendulum produces a regular time measurement-All of the above");
			correctAnswers.add("D");
	}
	
	//methods to get a random question
	public int getQuestion(){
		
		//find total number of questions
		int numberQuestions = questions.size();
		
		//pick a random question and remove it from the list
		Random myQuestion = new Random();
	
		//ensure that one of the questions in the array is picked
		int questionNumber = myQuestion.nextInt(numberQuestions);
		
		correct = correctAnswers.get(questionNumber);
		
		
		return questionNumber;
		
	}

	public String getQuestionText(int number) {
		// TODO Auto-generated method stub
		
		String selectQuestion = (String) questions.get(number);
		questions.remove(number);
		
		return selectQuestion;
	}

	public String getOptions(int questionNumber) {
		// TODO Auto-generated method stub
		
		String option = (String) options.get(questionNumber);
		options.remove(questionNumber);
		correctAnswers.remove(questionNumber);
		
		return option;
	}

	public String checkAnswer(String choice) {
		// TODO Auto-generated method stub
		
		if (correct.equals(choice)){
			
			System.out.println("Correct");
			return "correct";
			
		}else{
			
			System.out.println("Wrong");
			return "wrong";
		}
		
	}
}
