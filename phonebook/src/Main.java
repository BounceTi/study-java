import Exceptions.RecordNotFound;

public class Main {

    public static void main(String[] args) throws RecordNotFound {

        PhoneBook phoneBook = new PhoneBook();
        Record record1 = new Record(1, "89131111111", "Test");
        Record record2 = new Record(1, "89131111111", "Test");
        Record record3 = new Record(2, "89131111112", "Test2");

        phoneBook.createRecord(record1);
        System.out.println(phoneBook.getAllRecords().toString());
        phoneBook.createRecord(record2);
        phoneBook.createRecord(record3);
        phoneBook.deleteRecord(2);
        phoneBook.deleteRecord(2);

    }

}
