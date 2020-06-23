package udemy_exercises.songs;

class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}

/*
**Song Player w/ Java Classes**
     - **Song class** 
       - Title
       - Duration
     - **A song must exist in an album before it can be added to the playlist (so you can only play songs that you own.)**
*/
