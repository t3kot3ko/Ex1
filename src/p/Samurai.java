package p;

public class Samurai {
	private CharaState _state;
	private int stateCount;
	
	public String m(){
		return _state.toString() + stateCount;
	}
}
