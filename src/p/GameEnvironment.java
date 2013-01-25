package p;

import java.util.List;

import sun.audio.AudioPlayer;

public class GameEnvironment {
	private Map _map;
	private String _mapFilePath;
	private boolean _replayMode;
	private List<RunnerDelegator> runners;
	private List<Integer> charaIndexes;
	private AudioPlayer audioPlayer;
	private String bgmFilePath;
	
	public String m(){
		return _map.toString() + _mapFilePath + runners.toString() + audioPlayer.toString();
	}
}
