package areteans.com.HotelManagement.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int userid;
    private String username;
    private String mobilenumber;
    private String gender;

    public User(int userid, String username, String mobilenumber, String gender) {
        this.userid = userid;
        this.username = username;
        this.mobilenumber = mobilenumber;
        this.gender = gender;
    }
}

