package accountmanager;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Account {

    private String fullName;
    private LocalDate dateOfBirth;
    private String email;
    private String password;
    private boolean blocked;

    public Account(String fullName, LocalDate dateOfBirth, String email, String password, boolean blocked) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return  fullName + "," +
                dateOfBirth + "," +
                email + "," +
                password + "," +
                blocked + "\n";
    }
}
