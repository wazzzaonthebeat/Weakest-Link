
public class Contestant extends Questions {

	private String status;
	private boolean isOut = false;
	public Contestant(){
		
		status = "Neutral";
	}
	

public String getStatus(){
	
	return status;
}



public boolean checkOut() {
	// TODO Auto-generated method stub

	return isOut;
}
}
