public class Homework13 {
    public static void main(String[] args) {
        Author author = new Author("John", "Tolkien");
        Book b1 = new Book("The Fellowship of the Ring", author, 1954);
        Book b2 = new Book("The Two Towers", author, 1954);
        Book b3 = new Book("The Return of the King", author, 1955);

        Author anotheAuthor = new Author("George", "Martin");
        Book b4 = new Book("A Game of Thrones", anotheAuthor, 1996);
        Book b5 = new Book("A Game of Thrones", anotheAuthor, 1996);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        if (b1.equals(b4)) {
            System.out.println("They are equal");
        } else {
            System.out.println(b1.getTitle() + " is not " + b4.getTitle());
        }

        if (b4.equals(b5)) {
            System.out.println(b4.getTitle() + " is " + b5.getTitle());
        } else {
            System.out.println(b4.getTitle() + " is not " + b5.getTitle());
        }
    }
}
