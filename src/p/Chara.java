package p;

public class Chara {
	protected Point location;
	protected Direction direction;
	private Point _defaultLocation;
	private int _score;
	
	public String getCharaInfo(){
		return location.toString() + direction.toString() + _defaultLocation.toString() + _score;
	}
}
