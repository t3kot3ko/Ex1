package p;

public class Player {
	private String name;
	private int score;
	private String _id;
	
	public String getUserInfo(){
		return this.name + "(" + _id + ") : " + score;
	}
}
