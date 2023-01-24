import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Reader {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private LocalDate birthday;
    private String phoneNumber;

    Reader(){}

    Reader(String fullName, int readerTicketNumber, String faculty, String birthday, String phoneNumber)
    {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        setBirthday(birthday);
        this.phoneNumber = phoneNumber;
    }
    public void setBirthday(String string) {
        this.birthday = LocalDate.parse(string, formatter);
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setReaderTicketNumber(int readerTicketNumber) {
        this.readerTicketNumber = readerTicketNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
       return this.birthday.format(formatter);
    }

    public String getFaculty() {
        return faculty;
    }

    public String getFullName() {
        return fullName;
    }

    public int getReaderTicketNumber() {
        return readerTicketNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " got " + numberOfBooks + " books");
        System.out.println();
    }

    public void takeBook(String [] books)
    {
        System.out.print(fullName +" got books: ");
        for(String book:books)
        {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " got " + numberOfBooks + " books");
        System.out.println();
    }

    public void returnBook(String [] books)
    {
        System.out.print(fullName +" got books: ");
        for(String book:books)
        {
            System.out.print(book + ", ");
        }
        System.out.println();
    }
}
