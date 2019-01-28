package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

@Entity
public class PhoneDetails {
    @Id
    private String name;
    private String brand;
    private String photo;
    private String technolodgy;
    private String twoGBands;
    private String threeGBands;
    private String fourGBands;
    private String speed;
    private String gprs;
    private String edge;
    private String announced;
    private String status;
    private String Dimentions;
    private String weight;
    private String sim;
    private String type;
    private String size;
    private String resolution;
    private String multitouch;
    private String emui;
    private String os;
    private String chipset;
    private String cpu;
    private String gpu;
    private String cardslot;
    private String internal;
    private String mainCamfeatures;
    private String mainCamVideos;
    private String selfiCamFeatures;
    private String selfieCamVideos;
    private String alertType;
    private String loudspeaker;
    private String lack;
    private String wlan;
    private String bluetooth;
    private String gps;
    private String radio;
    private String usb;
    private String sensorsMessaging;
    private String browser;
    private String color;
    private String other;
    private String price;

    
    public PhoneDetails(String name, String brand, String photo, String technolodgy, String twoGBands,
			String threeGBands, String fourGBands, String speed, String gprs, String edge, String announced,
			String status, String dimentions, String weight, String sim, String type, String size, String resolution,
			String multitouch, String emui, String os, String chipset, String cpu, String gpu, String cardslot,
			String internal, String mainCamfeatures, String mainCamVideos, String selfiCamFeatures,
			String selfieCamVideos, String alertType, String loudspeaker, String lack, String wlan, String bluetooth,
			String gps, String radio, String usb, String sensorsMessaging, String browser, String color, String other,
			String price) {
		
		this.name = name;
		this.brand = brand;
		this.photo = photo;
		this.technolodgy = technolodgy;
		this.twoGBands = twoGBands;
		this.threeGBands = threeGBands;
		this.fourGBands = fourGBands;
		this.speed = speed;
		this.gprs = gprs;
		this.edge = edge;
		this.announced = announced;
		this.status = status;
		this.Dimentions = dimentions;
		this.weight = weight;
		this.sim = sim;
		this.type = type;
		this.size = size;
		this.resolution = resolution;
		this.multitouch = multitouch;
		this.emui = emui;
		this.os = os;
		this.chipset = chipset;
		this.cpu = cpu;
		this.gpu = gpu;
		this.cardslot = cardslot;
		this.internal = internal;
		this.mainCamfeatures = mainCamfeatures;
		this.mainCamVideos = mainCamVideos;
		this.selfiCamFeatures = selfiCamFeatures;
		this.selfieCamVideos = selfieCamVideos;
		this.alertType = alertType;
		this.loudspeaker = loudspeaker;
		this.lack = lack;
		this.wlan = wlan;
		this.bluetooth = bluetooth;
		this.gps = gps;
		this.radio = radio;
		this.usb = usb;
		this.sensorsMessaging = sensorsMessaging;
		this.browser = browser;
		this.color = color;
		this.other = other;
		this.price = price;
	}

	public PhoneDetails() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTechnolodgy() {
        return technolodgy;
    }

    public void setTechnolodgy(String technolodgy) {
        this.technolodgy = technolodgy;
    }

    public String getTwoGBands() {
        return twoGBands;
    }

    public void setTwoGBands(String twoGBands) {
        this.twoGBands = twoGBands;
    }

    public String getThreeGBands() {
        return threeGBands;
    }

    public void setThreeGBands(String threeGBands) {
        this.threeGBands = threeGBands;
    }

    public String getFourGBands() {
        return fourGBands;
    }

    public void setFourGBands(String fourGBands) {
        this.fourGBands = fourGBands;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getGprs() {
        return gprs;
    }

    public void setGprs(String gprs) {
        this.gprs = gprs;
    }

    public String getEdge() {
        return edge;
    }

    public void setEdge(String edge) {
        this.edge = edge;
    }

    public String getAnnounced() {
        return announced;
    }

    public void setAnnounced(String announced) {
        this.announced = announced;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDimentions() {
        return Dimentions;
    }

    public void setDimentions(String dimentions) {
        Dimentions = dimentions;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getMultitouch() {
        return multitouch;
    }

    public void setMultitouch(String multitouch) {
        this.multitouch = multitouch;
    }

    public String getEmui() {
        return emui;
    }

    public void setEmui(String emui) {
        this.emui = emui;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCardslot() {
        return cardslot;
    }

    public void setCardslot(String cardslot) {
        this.cardslot = cardslot;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getMainCamfeatures() {
        return mainCamfeatures;
    }

    public void setMainCamfeatures(String mainCamfeatures) {
        this.mainCamfeatures = mainCamfeatures;
    }

    public String getMainCamVideos() {
        return mainCamVideos;
    }

    public void setMainCamVideos(String mainCamVideos) {
        this.mainCamVideos = mainCamVideos;
    }

    public String getSelfiCamFeatures() {
        return selfiCamFeatures;
    }

    public void setSelfiCamFeatures(String selfiCamFeatures) {
        this.selfiCamFeatures = selfiCamFeatures;
    }

    public String getSelfieCamVideos() {
        return selfieCamVideos;
    }

    public void setSelfieCamVideos(String selfieCamVideos) {
        this.selfieCamVideos = selfieCamVideos;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getLoudspeaker() {
        return loudspeaker;
    }

    public void setLoudspeaker(String loudspeaker) {
        this.loudspeaker = loudspeaker;
    }

    public String getLack() {
        return lack;
    }

    public void setLack(String lack) {
        this.lack = lack;
    }

    public String getWlan() {
        return wlan;
    }

    public void setWlan(String wlan) {
        this.wlan = wlan;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    public String getSensorsMessaging() {
        return sensorsMessaging;
    }

    public void setSensorsMessaging(String sensorsMessaging) {
        this.sensorsMessaging = sensorsMessaging;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    
    
    public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PhoneDetails [name=" + name + ", brand=" + brand + ", photo=" + photo + ", technolodgy=" + technolodgy
				+ ", twoGBands=" + twoGBands + ", threeGBands=" + threeGBands + ", fourGBands=" + fourGBands
				+ ", speed=" + speed + ", gprs=" + gprs + ", edge=" + edge + ", announced=" + announced + ", status="
				+ status + ", Dimentions=" + Dimentions + ", weight=" + weight + ", sim=" + sim + ", type=" + type
				+ ", size=" + size + ", resolution=" + resolution + ", multitouch=" + multitouch + ", emui=" + emui
				+ ", os=" + os + ", chipset=" + chipset + ", cpu=" + cpu + ", gpu=" + gpu + ", cardslot=" + cardslot
				+ ", internal=" + internal + ", mainCamfeatures=" + mainCamfeatures + ", mainCamVideos=" + mainCamVideos
				+ ", selfiCamFeatures=" + selfiCamFeatures + ", selfieCamVideos=" + selfieCamVideos + ", alertType="
				+ alertType + ", loudspeaker=" + loudspeaker + ", lack=" + lack + ", wlan=" + wlan + ", bluetooth="
				+ bluetooth + ", gps=" + gps + ", radio=" + radio + ", usb=" + usb + ", sensorsMessaging="
				+ sensorsMessaging + ", browser=" + browser + ", color=" + color + ", other=" + other + ", price="
				+ price + "]";
	}

	
}
