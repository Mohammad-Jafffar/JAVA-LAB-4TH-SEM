import java.util.Scanner;
public class ArrayClass{
    public static void main(String[] agrs){

        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i <= 10; i++){
            System.out.println("Enter value for index"+ i);
            a[0] = sc.nextInt();
        }
                                                                                                                    
         for(int i=0; i <= 10; i++){
            System.out.println("Enter value of"+ i + " is " + a[i]);
        }

        sc.close();
    }
}
