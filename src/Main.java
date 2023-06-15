public class Main {
    public static void main(String[] args) {
        Author dostoevskiy = new Author("Fedor", "Dostoevskiy");
        Book player = new Book("Player", dostoevskiy, 1867);
        Author esenin = new Author("Sergey", "Esenin");
        Book myDreams = new Book("My Dreams", esenin, 1919);
        myDreams.setPublicationYear(1917);
        player.setPublicationYear(1866);
        System.out.println("Книга " + player.getTitle() + " опубликовано " + player.getPublicationYear() + " автор " + player.getAuthor().getName() + " " + player.getAuthor().getLastName());
        System.out.println("Книга " + myDreams.getTitle() + " опубликовано " + myDreams.getPublicationYear() + " автор " + myDreams.getAuthor().getName() + " " + myDreams.getAuthor().getLastName());
    }
}