public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 101, "James Gosling", 450);
        Laptop laptop1 = new Laptop("XPS 15", 201, "Dell", 3.2);
        book1.displayDetails();
        laptop1.displayDetails();
        System.out.println("Computed Value for Book: " + book1.computeValue(10));
        System.out.println("Computed Value for Laptop: " + laptop1.computeValue(20));
    }
}
