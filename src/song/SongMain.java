package song;

public class SongMain {
	public static void main(String[] args) {
		Song s= new Song();
		s.setAlbum("Real");
		s.setYear(2010);
		s.setComposer("이민수");
		s.setTrack(3);
		s.setTitle("좋은날");
		s.setArtist("아이유");
		
		s.show();
		
		
       Song song1 = new Song("좋은날", "아이유", "Real", "김민수", 2010, 3);
       Song song2 = new Song( "러빙유", "씨스타", "", null, 0, 0 );
       Song song3 = new Song( "여수 밤바다", "버스커 버스커", "", null, 0, 0 );          
       song1.show();
       song2.show();
       song3.show();
	}
}

