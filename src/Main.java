public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("That Tinh", "A best ", "123", 110f, 280);
        Book book = new Book("Dac Nhan Tam", "Sach hay", "366", 30.08f, "Author Name", 320, "Fiction");

        System.out.println("Information of MP3:");
        mp3.showInfo();

        System.out.println("\nInformation of Book:");
        book.showInfo();
    }
}
