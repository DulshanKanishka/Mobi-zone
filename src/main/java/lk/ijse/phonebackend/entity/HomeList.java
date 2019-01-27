package lk.ijse.phonebackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class HomeList {
    @Id
    private String namee;
    private String typee;
    private String Price;
    private String photo;

    public HomeList(String typee, String namee, String price, String photo) {
        this.typee = typee;
        this.namee = namee;
        this.Price = price;
        this.photo = photo;
    }

    public HomeList() {
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
        Price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "HomeList{" +
                "typee='" + typee + '\'' +
                ", namee='" + namee + '\'' +
                ", Price='" + Price + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
