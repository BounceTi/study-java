import lombok.Data;

@Data
public class Record {

    private long id;
    private String phoneNumber;
    private String name;

    public Record(long id, String phoneNumber, String name) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    //    public void printInfo() {
//        System.out.println("id = " + id +
//                " phoneNumber = " + phoneNumber +
//                " name = " + name);
//
//    }

}
