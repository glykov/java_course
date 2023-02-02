public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // author.toString() will be called automatically to convert object to string during concatenation
    public String toString() {
        return "Author: " + author + ", Title: " + title + ", Year published " + year;
    }

    public int hasCode() {
        int result = author.hashCode();
        result += title.hashCode();
        result += year;
        return result;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        Book that = (Book)other;
        return this.author.equals(that.author) 
                && this.title.equals(that.title)
                && this.year == that.year;
    }
}
