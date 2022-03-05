import java.util.Objects;

public class Author {

    private Integer authorId;
    private  String name,country;
  private  Book book_author;

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", book_author=" + book_author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorId, author.authorId) && Objects.equals(name, author.name) && Objects.equals(country, author.country) && Objects.equals(book_author, author.book_author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, name, country, book_author);
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Book getBook_author() {
        return book_author;
    }

    public void setBook_author(Book book_author) {
        this.book_author = book_author;
    }
}
