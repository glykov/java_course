public class Homework12 {
    public static void main(String[] args) {
        Author tolsoy = new Author("Лев", "Толстой");
        Author dostoevsky = new Author("Федор", "Достоевсий");

        Book warAndPeace = new Book("Война и мир", tolsoy, 1867);
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevsky, 1865);

        System.out.println("Книга " + warAndPeace.getBookName()
                + ", автор " + warAndPeace.getAuthor() + " год публикации " + warAndPeace.getYear());
        System.out.println("Книга " + crimeAndPunishment.getBookName()
                + ", автор " + crimeAndPunishment.getAuthor() + " год публикации " + crimeAndPunishment.getYear());
        crimeAndPunishment.setYear(1866);
        System.out.println("Книга " + crimeAndPunishment.getBookName()
                + ", автор " + crimeAndPunishment.getAuthor() + " год публикации " + crimeAndPunishment.getYear());
    }
}
