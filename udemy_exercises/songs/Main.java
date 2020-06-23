package udemy_exercises.songs;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Confessions of a Dangerous Mind", "Logic");
        album.addSong("Confessions of a Dangerous Mind", 4.44);
        album.addSong("Homicide", 3.4);
        album.addSong("Wannabe", 2.3 );
        album.addSong("clickbait", 3.1);
        album.addSong("Out of sight", 6.5);
        album.addSong("Icy", 3.5 );
        album.addSong("Cocaine", 2.3 );
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Confessions of a Dangerous Mind", playList);
        albums.get(0).addToPlaylist("Icy", playList);
        albums.get(0).addToPlaylist("Cocaine", playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() ==0 ){
            System.out.println("No songs in the playlist");
            return;
        } else{
            System.out.println("Now playing" + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing" + listIterator.next().toString());
                    } else {
                        System.out.println("The end is nigh");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("The end is really far away, like really.");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying" + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We're at the start of the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else{
                            System.out.println("The end is nigh!");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }

            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions, 0 to quit, 1 to play next song, 2 to play previous song, 3 to replay the current song, 4 to list songs in the playlist, 5 to list these actions again, 6 delete current song");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("====================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====================");
    }

}
