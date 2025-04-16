package javaCodes;

class Playlist {
	Song track;
	void playSong() {
		System.out.println("Now Playing: " + track.title);
		System.out.println("Artist: " + track.artist);
	}
}
 class Song {
	 String title;
	 String artist;
 }
public class MusicApp {

	public static void main(String[] args) {
		Song hitSong = new Song();
		hitSong.title = "Style";
		hitSong.artist = "Taylor Swift";
		Playlist myJams = new Playlist();
		myJams.track =hitSong;
		myJams.playSong();
		System.out.println("This song is fire! Its on my Playlist!");
		System.out.println("Song: "+ hitSong.title + "by "+ hitSong.artist);
		//playlist object destroyed 
		myJams = null;
		//access song through Playlist
		//myJams.playSong();
		//directly accessing the object 
		System.out.println("This song is fire! Its on my Playlist!");
		System.out.println("Song: "+ hitSong.title + "by "+ hitSong.artist);
	}

}
