import java.util.Scanner;
class Device{
    String Brandname;
    //constructor 
    Device(String a){
        Brandname = a;
    }
    void showbrandname(){
      System.out.println("Brand Name is: "+ Brandname);
    }
}

class MobilePhone extends Device{
     int screenSize;
    //constructor 
    MobilePhone(int a,String b){
        super(b);
        screenSize = a;
    }
    void ShowScreenSize(){
      System.out.println("Screen Size is: "+ screenSize);
    }
}

class SmartPhone extends MobilePhone{
    String os;
    SmartPhone(int a, String b, String os){
        super(a,b);
        this.os=os;
    }
    void ShowDevicedetail(){
        System.out.println("Os Is "+ os);
        ShowScreenSize();
        showbrandname();
    }
}

public class SmartPhoneClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int screenSize;
        String bn,os;
         System.out.println("Enter the Brand Name");
         bn= sc.nextLine();
         System.out.println("Enter the OS");
         os= sc.nextLine();
         System.out.println("Enter the Screen Size");
         screenSize= sc.nextInt();
    SmartPhone sp = new SmartPhone(screenSize,bn,os);
    sp.ShowDevicedetail();
    }
}

   