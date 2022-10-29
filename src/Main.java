public class Main {
    public static void main(String[] args) {
        Author rowling = new Author("Joanne", "Rowling");
        Author tolkien = new Author("John", "Tolkien");
        Book harryPotter = new Book("Harry Potter", rowling, 1998);
        Book hobbit = new Book("Hobbit", tolkien, 1991);
        harryPotter.setYearOfThePublication(1995);
        System.out.println("harryPotter.getYearOfThePublication() = " + harryPotter.getYearOfThePublication());
        System.out.println(hobbit.toString());
    }

    public static void putTheBookInTheLibrary(Book[] array, Book book) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == null) {
                array[i] = book;
                return;
            }
        }
        System.out.println("Нет места!");
    }
    public static void printArrayBook(Book[] array) {
        for (Book a : array) {
            System.out.println(a);
        }
    }

    public static void printLibrary(Book[] array) {
        for (int i=0; i< array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].getAuthor()+": "+array[i].getName()+": "+array[i].getYearOfThePublication());
            }
        }
    }
}