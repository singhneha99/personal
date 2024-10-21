package package1;

public class Song {

	//private int trackNumber;
	private String title;
	private double duration;
	
	
	
	public Song(String title, double duration) {
		//super();
		this.title = title;
		this.duration = duration;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	
	public String getTitle() {
		return title;
	}

	public double getDuration() {
		return duration;
	}

	public Song findSong(String title)
	{
		return null;
		
	}
	
	public Song findSong(int trackNumber)
    {
		return null;
    
    }
}
