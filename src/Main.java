public class Main {
    public static void main(String[] args) {


        Reader reader = new Reader();
        reader.setBirthday("28.12.1991");
        reader.setFullName("Kuznetsov Alex");

        String [] books = new String[]{"Giant Without Honor", "Knight Of Reality", "Soldiers Without Time",
                                        "Spies Of The Eclipse", "Gangsters And Bandits" };
        reader.takeBook(books);
        reader.takeBook(5);
    }
}