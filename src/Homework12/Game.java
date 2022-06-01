package Homework12;

public class Game {
    private static String title;

    private static String genre;

    private static int price;


    public Game(String title, String genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
