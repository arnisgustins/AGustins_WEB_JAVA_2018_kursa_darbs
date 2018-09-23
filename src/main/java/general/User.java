package general;

import lombok.Data;

import static utils.RandomGenerator.*;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String password;

    public User() {
        this.firstName = generateRandomString();
        this.lastName = generateRandomString();
        this.mobileNumber = generateRandomPhoneNumber();
        this.email = generateRandomEmail();
        this.password = generateRandomString();
    }

}
