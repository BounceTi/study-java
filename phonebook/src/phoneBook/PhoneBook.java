package phoneBook;

import exceptions.PhoneNumberAlreadyExists;
import exceptions.RecordNotFound;
import exceptions.RecordNotValid;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Record> recordList = new ArrayList<>();

    public List<Record> getAllRecords() {
        return recordList;
    }

    public void createRecord(Record record) {
        try {
            if (checkForRecord(record.getPhoneNumber())) {
                throw new PhoneNumberAlreadyExists(record.getPhoneNumber());
            }
            recordList.add(record);
            System.out.println(record + " successfully created");
        } catch (PhoneNumberAlreadyExists e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateRecord(Record record) throws RecordNotFound {
        try {
            Record r = checkForRecord(record.getId());
            if (record.getName() == null || record.getPhoneNumber() == null
                    || record.getName().isBlank() || record.getPhoneNumber().isBlank()) {

                throw new RecordNotValid();
            }
            int index = recordList.indexOf(r);
            recordList.set(index, record);
            System.out.println(record + " has been updated");

        } catch (RecordNotValid e) {
            System.out.println(record + ": " + e.getMessage());
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
        for (Record r : recordList) {
            if (r.getId() == id) {
                return r;
            }
        }
        throw new RecordNotFound(id);
    }

}
