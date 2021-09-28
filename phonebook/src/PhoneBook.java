import Exceptions.PhoneNumberAlreadyExists;
import Exceptions.RecordNotFound;
import Exceptions.RecordNotValid;

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
        } catch (PhoneNumberAlreadyExists e) {
            e.getMessage();
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
            e.getMessage();
        }
    }

    public void deleteRecord(long id) throws RecordNotFound {
        Record r = checkForRecord(id);
        recordList.remove(r);

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
        throw new RecordNotFound();
    }

}
