package classpractice;

public class DogClass {

int size;
String breed;
String name;

void bark()
{
    System.out.println("Bang! Bang!");
}
}

class DogTestDrive
{
    public static void main(String[] args) {
        DogClass d = new DogClass();
        d.size = 50;
        d.bark();
    }
}


class Movie
{
    String title;
    String genre;
    int rating;

    void playIt()
    {
        System.out.println("Playing the movie");
    }

public class MovieTestDrive
{
    public  void main(String[] args) {
        Movie one = new Movie();
        one.title= "Alien";
        one.genre= "Horror";
        one.rating=89;
        Movie two = new Movie();
        two.title="Indiana Jones";
        two.genre="Action";
        two.rating=99;
        two.playIt();
        Movie three = new Movie();
        three.title="Coming to America";
        three.genre="Comedy";
        three.rating=100;
    }
}



}

