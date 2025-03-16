class Book extends GeneralObject {
    private String author;
    private int pages;
    public Book(String name, int id, String author, int pages) {
        super(name, id);
        this.author = author;
        this.pages = pages;
    }
    @Override
    public void displayDetails() {
        System.out.println("Book ID: " + id + ", Title: " + name + ", Author: " + author + ", Pages: " + pages);
    }
}
