
public class Music {
    String title;
    private  String duration;
    private String genre;
    Singer singer;


    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    Date releasedate;

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setSinger(Singer singer) {
        this.singer = singer;

    }
    public Music(String title, String duration, String genre, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;

        this.releasedate= releasedate;
    }
    public String toString(){
        return String.format("%s %s %s %s",title,duration,genre,releasedate);
}
public boolean equals(Music m) {
 if(this.title.equals(m.title)) {
            return true;
        }
 else{
            return false;
        }
    }
    public static void main(String[] args) {
       // Music m=new Music("title1","30minute","sad",new Singer ("ALi","MAle","Pakistani","03/04/2009" ));
        Singer singer=new Singer("Falak","male","PAKISTAN",new Date(23,32,32));
        Music m=new Music("Ijazat","4 minutes","Sad",singer);

        Music m1=new Music("title1","30minute","sad",new Singer ("ALi","MAle","Pakistani",new Date(3,4,2010)));
        System.out.println("Title: " + m.getTitle());
        System.out.println("Duration: " + m.getDuration());
        System.out.println("Genre: " + m.getGenre());
        System.out.println("Release Date: " + m.getReleasedate());
        System.out.println("Singer: " + m.getSinger());
        System.out.println(m.equals(m1));
        Singer s=new Singer("Falak shabir","male","PAKISTAN","2008");

    }
}