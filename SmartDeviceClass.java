import java.util.Scanner;

class SmartDevice {
    int co2level;
    double temp;
    String deviceName;

    SmartDevice(int co2level, double temp, String deviceName) {
        this.co2level = co2level;
        this.temp = temp;
        this.deviceName = deviceName;
    }

    void checkEnvironment() {
        if (co2level > 20) {
            System.out.println("Turn on vent. ");
        } else if (temp > 30) {
            System.out.println("Turn on the vent.");
        } else {
            System.out.println("Suitable environment. ");
        }
    }
}

public class SmartDeviceClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SmartDevice[] sd = new SmartDevice[3];

        for (int i = 0; i < 3; i++) {
            int co2level;
            double temp;
            String deviceName;

            System.out.println("Enter co2 level :");
            co2level = sc.nextInt();
            System.out.println("Enter temp level :");
            temp = sc.nextDouble();
            System.out.println("Enter Device name :");
            deviceName = sc.nextLine();
            sd[i] = new SmartDevice(co2level, temp, deviceName);
            sc.nextLine();
        }

        for (SmartDevice device : sd) {
            device.checkEnvironment();
        }
        sc.close();
    }
}
