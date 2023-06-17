import java.util.Objects;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return " Автор " + this.name + " " + this.lastName;

    }

    public boolean equals(Object  author1) {
        if(author1 != null){
            return false;
        }
         if(this.getClass() != author1.getClass()){
             return false;
         }
         Author author = (Author) author1;
        return name.equals(author.getName());
    }

    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
