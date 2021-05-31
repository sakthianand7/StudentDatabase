package src.studentdb;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students to be enrolled:");
        int numberOfstds = sc.nextInt();
        Student[] students = new Student[numberOfstds];
        for(int i=0;i<numberOfstds;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTution();
            System.out.println(students[i].toString());
        }
        
    }
    
}
