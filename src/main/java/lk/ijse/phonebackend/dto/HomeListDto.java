package lk.ijse.phonebackend.dto;

public class HomeListDto {
    private String typee;
    private String namee;
    private String Price;
    private String photo;

    public HomeListDto(String typee, String namee, String price, String photo) {
        this.typee = typee;
        this.namee = namee;
        this.Price = price;
        this.photo = photo;
    }

    public HomeListDto() {
    }

    public String getTypee() {
        return typee;
    }

    public void setTypee(String typee) {
        this.typee = typee;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
