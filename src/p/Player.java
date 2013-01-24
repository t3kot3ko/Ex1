package p;

public class Player {
	private String _name;
	private int _score;
	private String _id;
	
	public String getUserInfo(){
		return this._name + "(" + _id + ") : " + _score;
	}
}
