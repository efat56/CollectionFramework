package que2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
	System.out.println("Enter movie name..");
//		String movie = sc.next();
//		
//		System.out.println("Enter song  name..");
//		String song = sc.next();
		
		
		//Song s1 = new Song(movie, song);
		Song s1 = new Song(sc.nextLine(), sc.nextLine());
		Song s2 = new Song(sc.nextLine(), sc.nextLine());
		Song s3 = new Song(sc.nextLine(), sc.nextLine());
		Song s4 = new Song(sc.nextLine(), sc.nextLine());
//		Song s2 = new Song(movie, song);
//		Song s3 = new Song(movie, song);
//		Song s4 = new Song(movie, song);
		
		PlayList p = new PlayList();
		p.addSong(s1);
		p.addSong(s2);
		p.addSong(s3);
		p.addSong(s4);
		
		
		for(Song  s : p.songs ) {
			s.play();
		}
		
		
		
	}

}
