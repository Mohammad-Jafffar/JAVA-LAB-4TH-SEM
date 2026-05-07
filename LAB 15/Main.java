
/**
 * make a program in java where we have student class which will have id, name, marks of 3 subjects
 * Constructor to set name and id funciton to set marks of all three subjects.
 * In the main function make an array of Student class use loop to keep adding students 
 * at the end save the student array to file using ObjectInputStream object serialization.
 */
import java.io.*;
import java.util.Scanner;

// Implement Serializable so java know this class can be converted to bytes
class Student implements Serializable {
    private int id;
    private String name;
    private int java, dbms, os;

    // Constructor to initialize ID and Name
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to set marks for the subjects
    public void getMarks(int java, int dbms, int os) {
        this.java = java;
        this.dbms = dbms;
        this.os = os;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an array to hold 4 student objects
        Student[] student = new Student[4];

        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter the detail  for " + (i + 1) + " : ");
            System.out.print("ID :");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer (Clear the "Enter" key from the buffer so name isn't skipped)

            System.out.print("Name: ");
            String name = sc.nextLine();

            // Creating the objects
            student[i] = new Student(id, name);

            System.out.println("Enter the marks for the subjects JAVA , DBMS, OS:");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            sc.nextLine();// clear buffer again for the next loop iteration

            // Set the marks using method
            student[i].getMarks(n1, n2, n3);
        }
        // Serilizarion - saving the array to a file
        // ObjectOutputStream converts the objects into the binary format you saw
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"))) {

            oos.writeObject(student); // Write the entire array at once
            System.out.println("Saved the data");

        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
