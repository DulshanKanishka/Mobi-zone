package lk.ijse.phonebackend.dto;

public class AdminSignDto {
    private String adminemail;
    private String AdminPassword;

    public AdminSignDto(String adminUserName, String adminPassword) {
        this.adminemail = adminUserName;
        this.AdminPassword = adminPassword;
    }

    public AdminSignDto() {
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
}
