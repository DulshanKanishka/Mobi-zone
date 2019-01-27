package lk.ijse.phonebackend.dto;

public class SignUpDto {
private String eMail;
private String password;

    public SignUpDto(String eMail, String password) {
        this.eMail = eMail;
        this.password = password;
    }

    public SignUpDto() {
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
}
