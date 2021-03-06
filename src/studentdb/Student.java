package src.studentdb;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String courses="";
    private int year;
    private String studentID;
    private int tutionBalance;
    private static int costOfCourses = 500;
    private static int id = 16101;

    //Constructor to get name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = sc.nextLine();
        System.out.print ("Enter last name: ");
        this.lastName = sc.nextLine();
        System.out.print("Enter your year (1,2,3,4):");
        this.year = sc.nextInt();

        //call the method which generated unique ID
        generateStudentId();
    }

    //generate unique ID
    private void generateStudentId(){
        this.studentID = this.year + "" + id;
        id++;
    }

    //enroll the student in courses
    public void enroll(){
        do{
        System.out.print("Enter a course to enroll - Q to quit:");
        Scanner n = new Scanner(System.in);
        String course = n.nextLine();
        //when the user doesn't enter Quit
        if(!course.equals("Q")){
            courses = courses + '\n' + course;
            this.tutionBalance+=Student.costOfCourses;
        }
        else{
            break;
        }
    }//loop until there is no quit
    while(true);
    }

    //see balance
    public void viewBalance(){
        System.out.println("Your balance is: "+ this.tutionBalance);
    }

    //payTution
    public void payTution(){
        viewBalance();
        Scanner tution = new Scanner(System.in);
        System.out.print("How much you want to pay:");
        int payment = tution.nextInt();
        this.tutionBalance -= payment;
        System.out.println("You paid: " + payment);
        viewBalance();
    }

    //see the status
    public String toString(){
        return "Name: " +this.firstName + " "+ this.lastName + '\n' + "Student ID: " +this.studentID + "\nCourses Enrolled:" + courses +'\n' + "Tution Balance: "+this.tutionBalance;  
    }

    
}
