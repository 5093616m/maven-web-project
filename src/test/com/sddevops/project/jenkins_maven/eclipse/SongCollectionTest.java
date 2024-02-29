/**
 * 
 */
package com.sddevops.project.jenkins_maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class SongCollectionTest {
	private SongCollection sc;
	private Song s1;
	private Song s2;
	private Song s3;
	private Song s4;
	private Song s5;
	private Song s6;
	private final int SONG_COLLECTION_SIZE=4;
	private final String SONG_FIVE_ID = "005";
	private final String SONG_FIVE_TITLE = "Jam";		
	private final String SONG_FIVE_ARTIST = "Jimmy";
	private final String SONG_FIVE_SONG_LENGTH = "3.20";
	private final String SONG_EIGHT_ID = "008";
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		sc = new SongCollection();
		s1 = new Song("001","good 4 u","Olivia Rodrigo",3.59);
		s2 = new Song("002","Peaches","Justin Bieber",3.18);
		s3 = new Song("003","MONTERO","Lil Nas",2.3);
		s4 = new Song("004","bad guy","billie eilish",3.14);
		sc.addSong(s1);
		sc.addSong(s2);
		sc.addSong(s3);
		sc.addSong(s4);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		sc=null;
	}

	/**
	 * Test method for {@link com.sddevops.project.junit.maven.eclipse.SongCollection#getSongs()}.
	 */
	@Test
	void testGetSongs() {
		//fail("Not yet implemented");
		List<Song> testSc=sc.getSongs();
		assertEquals(testSc.size(),SONG_COLLECTION_SIZE);
	}

	/**
	 * Test method for {@link com.sddevops.project.junit.maven.eclipse.SongCollection#addSong(com.sddevops.project.junit.maven.eclipse.Song)}.
	 */
	@Test
	void testAddSong() {
		//fail("Not yet implemented")
		List<Song> testSc=sc.getSongs();
		//Assert that Song Collection is equals to Song Collection Size : 4
		assertEquals(SONG_COLLECTION_SIZE, testSc.size());
		//Act
		sc.addSong(s1);
		//Assert that Song Collection is equals to Song Collection Size + 1 : 5
		assertEquals(SONG_COLLECTION_SIZE+1, testSc.size());
	}

	/**
	 * Test method for {@link com.sddevops.project.junit.maven.eclipse.SongCollection#sortSongsByTitle()}.
	 */
	@Test
	void testSortSongsByTitle() {
		//fail("Not yet implemented");
		List<Song> sortedSongList=sc.sortSongsByTitle();
		assertEquals(sortedSongList.get(0).getTitle(),"MONTERO");
		assertEquals(sortedSongList.get(1).getTitle(),"Peaches");
		assertEquals(sortedSongList.get(2).getTitle(),"bad guy");
		assertEquals(sortedSongList.get(3).getTitle(),"good 4 u");
	}

	/**
	 * Test method for {@link com.sddevops.project.junit.maven.eclipse.SongCollection#sortSongsBySongLength()}.
	 */
	@Test
	void testSortSongsBySongLength() {
		//fail("Not yet implemented");
		List<Song> sortedSongByLengthList = sc.sortSongsBySongLength();
		assertEquals(sortedSongByLengthList.get(0).getSongLength(),3.59);
		assertEquals(sortedSongByLengthList.get(1).getSongLength(),3.18);
		assertEquals(sortedSongByLengthList.get(2).getSongLength(),3.14);
		assertEquals(sortedSongByLengthList.get(3).getSongLength(),2.3);
	}

	/**
	 * Test method for {@link com.sddevops.project.junit.maven.eclipse.SongCollection#findSongsById(java.lang.String)}.
	 */
	@Test
	void testFindSongsById() {
		//fail("Not yet implemented");
		//Arrange
		s5 = new Song("005","Jam","Jimmy",3.20);
		sc.addSong(s5);
		//Act
		Song songFound = sc.findSongsById("005");
		Song songNotFound = sc.findSongsById("008");
		//Assert
		assertEquals("Jimmy", songFound.getArtiste());
		assertNull(songNotFound);
		
	}

	/**
	 * Test method for {@link com.sddevops.project.junit.maven.eclipse.SongCollection#findSongByTitle(java.lang.String)}.
	 */
	@Test
	void testFindSongByTitle() {
		//fail("Not yet implemented");
		//Arrange
		s6 = new Song("006","Swipe","Gaga",3.00);
		sc.addSong(s6);
		//Act
		Song songFound = sc.findSongByTitle("Swipe");
		Song songNotFound = sc.findSongByTitle("None");
		//Assert
		assertEquals("Swipe", songFound.getTitle());
		assertNull(songNotFound);
		
	}

}
