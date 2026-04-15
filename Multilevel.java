import java.util.Scanner;

class Device {
    String brandName;

    Device(String brandName) {
        this.brandName = brandName;
    }
    void showBrandName() {

    }
}

class Mobilephone extends Device {
    int screenSize;

    Mobilephone(int screenSize, String brandName) {
        super(brandName);
        this.screenSize = screenSize;
    }
    void showScreenSize() {

    }
}

class Smartphone extends Mobilephone {
    String os;

    Smartphone(String brandName, int screenSize, String os) {
        super(screenSize, brandName);
        this.os = os;
    }
    void showDeviceDetail() {
        System.out.println("You own the brnad : " + brandName);
        System.out.println("Your device screen size is : " + screenSize);
        System.out.println("And the Os is : " + os);
    }
}

public class Multilevel {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Smartphone sp = new Smartphone(" OnePlus nord ce2", 6, "Oxygen");
    sp.showDeviceDetail();
    sc.close();
    }
}
