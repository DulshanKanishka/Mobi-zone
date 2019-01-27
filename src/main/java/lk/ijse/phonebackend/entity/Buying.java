package lk.ijse.phonebackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Buying {
    @Id
    private String phonename;
    private String qty;
    private String buynigPrice;
    private String sellingPrice;
    private String description;
    private String supplier;

    public Buying(String phonename, String qty, String buynigPrice, String sellingPrice, String description, String supplier) {
        this.phonename = phonename;
        this.qty = qty;
        this.buynigPrice = buynigPrice;
        this.sellingPrice = sellingPrice;
        this.description = description;
        this.supplier = supplier;
    }

    public Buying() {
    }

    public String getPhonename() {
        return phonename;
    }

    public void setPhonename(String phonename) {
        this.phonename = phonename;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getBuynigPrice() {
        return buynigPrice;
    }

    public void setBuynigPrice(String buynigPrice) {
        this.buynigPrice = buynigPrice;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Buying{" +
                "phonename='" + phonename + '\'' +
                ", qty='" + qty + '\'' +
                ", buynigPrice='" + buynigPrice + '\'' +
                ", sellingPrice='" + sellingPrice + '\'' +
                ", description='" + description + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
