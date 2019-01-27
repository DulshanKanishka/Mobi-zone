package lk.ijse.phonebackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AdminSign {
    @Id
    private String adminemail;
    private String AdminPassword;

    public AdminSign(String adminUserName, String adminPassword) {
        this.adminemail = adminUserName;
        this.AdminPassword = adminPassword;
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "AdminSign{" +
                "adminemail='" + adminemail + '\'' +
                ", AdminPassword='" + AdminPassword + '\'' +
                '}';
    }
}
