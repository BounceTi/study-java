package phoneBook;

import exceptions.PhoneNumberAlreadyExists;
import exceptions.RecordNotFound;
import exceptions.RecordNotValid;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Record> recordList = new ArrayList<>();

    public PhoneBook() {
    }

    public List<Record> getAllRecords() {
        return recordList;
    }

    public void createRecord(Record record) {
        try {
            if (checkForRecord(record.getPhoneNumber())) {
                throw new PhoneNumberAlreadyExists();
            }
            recordList.add(record);
            System.out.println(record + " Successfully created");
        } catch (PhoneNumberAlreadyExists e) {
            System.out.println(record.getPhoneNumber() + " " + e.getMessage());
        }
    }

    public void updateRecord(Record record) throws RecordNotFound {
        try {
            Record r = checkForRecord(record.getId());
            if (record.getName().equals("") || record.getPhoneNumber().equals("")) {
                throw new RecordNotValid();
            }
            int index = recordList.indexOf(r);
            recordList.set(index, record);

        } catch (RecordNotValid e) {
            System.out.println(record + " " + e.getMessage());
        }
    }

    public void deleteRecord(long id) throws RecordNotFound {
        Record r = checkForRecord(id);
        recordList.remove(r);
        System.out.println("Phone number " + r.getPhoneNumber() + " deleted");
    }

    public void print() {
        System.out.println("\n" + "Phone Book:");
        for (Record r : recordList) {
            System.out.println(r);
        }
    }

    private boolean checkForRecord(String phoneNumber) {
        for (Record r : recordList) {
            return r.getPhoneNumber().equals(phoneNumber);
        }
        return false;
    }

    private Record checkForRecord(long id) throws RecordNotFound {
        for (Record r : getAllRecords()) {
            if (r.getId() == id) {
                return r;
            }
        }
        System.out.println("Record with id " + id + " does not exist");
        throw new RecordNotFound();
    }

}
