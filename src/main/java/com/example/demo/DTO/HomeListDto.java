package com.example.demo.DTO;


public class HomeListDto {
	 private String namee;
	private String typee;
   
    private String Price;

    public HomeListDto(String namee, String typee, String price) {
		super();
		this.namee = namee;
		this.typee = typee;
		Price = price;
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

	@Override
	public String toString() {
		return "HomeListDto [typee=" + typee + ", namee=" + namee + ", Price=" + Price + "]";
	}

    
}
