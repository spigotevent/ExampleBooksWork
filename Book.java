public class Book {

    String author;
    String title;

    String info ;

    public void book(String author, String title, String info) {

        this.author = author;
        this.title = title;

        this.info = info;
    }

    public Book() {


    }

    public String toStr() {

        return "(" + author + ") " + title + info;


    }


}
