package p;

import java.util.List;

import sun.audio.AudioPlayer;

public class GameEnvironment {
	private Map _map;
	private String _mapFilePath;
	private boolean _replayMode;
	private List<RunnerDelegator> _runners;
	private List<Integer> _charaIndexes;
	private AudioPlayer _audioPlayer;
	private String _bgmFilePath;
}
