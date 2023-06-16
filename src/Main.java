import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Author dostoevskiy = new Author("Fedor", "Dostoevskiy");
        Book player = new Book("Player", dostoevskiy, 1867);
        Author esenin = new Author("Sergey", "Esenin");
        Book myDreams = new Book("My Dreams", esenin, 1919);
        myDreams.setPublicationYear(1917);
        player.setPublicationYear(1866);
        System.out.println(player);
        System.out.println(dostoevskiy.equals(esenin));
        System.out.println(player.equals(myDreams));
        System.out.println(esenin.hashCode());
        System.out.println(player.hashCode());
    }
}