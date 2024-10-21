package package1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//import java.util.List;

public class Album {
	
	private String name;
	private String artist;
	private SongList songs;
	
	
	public Album(String name, String artist, SongList songs) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = songs;
		
	}

	//private ArrayList<SongList> songs;
	
	

	

	//SongList songList = new SongList();
	

		// write code here
	    public boolean addSong(String title, double duration)
	    {
	    	
	        return songs.add(new Song(title, duration));
	    }
	    
	    public void addToPlayList(int trackNumber, LinkedList<Song> playList)
	    {
	    	Song song = songs.findSong(trackNumber);
	    	playList.add(song);
	    }
	    
	    public void addToPlayList(String title, LinkedList<Song> playList)
	    {
	    	Song song = songs.findSong(title);
	    	playList.add(song);
	    }
	    
	    class SongList extends Song{
	        public SongList(String title, double duration) {
				super(title, duration);
				// TODO Auto-generated constructor stub
			}

			private List<Song> songs = new ArrayList<>();
	        
	        
	        public boolean add(Song song)
	        {
	        	if(!songs.contains(song))
	        	{
	        		return false;
	        	}
				songs.add((SongList) song);
				return true;
	           
	        }
	        
	        @Override
			public Song findSong(String title)
	        {
	            for(Song s: songs)
	            {
	                if(!title.equals(s.getTitle()))
	                {
	                    return null;
	                }
	                else
	                {
	                    return s;
	                }
	            }
				return null;
	            
	        }
	        
	        @Override
			public Song findSong(int trackNumber)
	        {
	        	 int index = trackNumber - 1;
	             if ((index > 0) && (index < songs.size())) {
	                 return songs.get(index);
	             }
	             return null;
	        }
	    }
	}


