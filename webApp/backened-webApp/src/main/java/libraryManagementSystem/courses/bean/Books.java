package libraryManagementSystem.courses.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Books {
    @Id
    @GeneratedValue
    private long id;
    private String author;
    private String name;

    public Books() {
        //entity should have a default constructor to make the program run
    }

    public Books(long id, String author, String name){
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
