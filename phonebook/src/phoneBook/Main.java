package phoneBook;

import exceptions.RecordNotFound;

public class Main {

    public static void main(String[] args) throws RecordNotFound {

        PhoneBook phoneBook = new PhoneBook();
        Record record1 = new Record(1, "89131111111", "Test");
        Record record2 = new Record(2, "89131111111", "Test1");

        Record record3 = new Record(2, "89131111112", "Test");
        Record record4 = new Record(1, null, "Test");
        Record record5 = new Record(2, "89131234567", "");
        Record record6 = new Record(2, "89131234567", "Test2");

        Record record7 = new Record(3, "89131234567", "Test");

        phoneBook.createRecord(record1);
//        phoneBook.createRecord(record2);
//        phoneBook.createRecord(record3);
//
        phoneBook.updateRecord(record4);
//        phoneBook.updateRecord(record5);
//        phoneBook.updateRecord(record6);
//
//        phoneBook.print();
//
//        phoneBook.deleteRecord(2);
//
//        phoneBook.print();

        /*Throw RecordNotFound Exception*/
//        phoneBook.deleteRecord(2);

        /*Throw RecordNotFound Exception*/
//        phoneBook.updateRecord(record7);


    }

}
