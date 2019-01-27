package lk.ijse.phonebackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SignUp {
    @Id
    private String eMail;
    private String password;

    public SignUp(String eMail, String password) {
        this.eMail = eMail;
        this.password = password;
    }

    public SignUp() {
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignUp{" +
                "eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
