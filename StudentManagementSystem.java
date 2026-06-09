// Main Application
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem{
  
  static ArrayList<Student> students = new ArrayList<>();

  public static void addStudent(Scanner sc){
    System.out.print("Enter student id: ");
    String id = sc.nextLine();

    System.out.print("Enter student name: ");
    String name = sc.nextLine();

    System.out.print("Enter marks: ");
    double marks = sc.nextDouble();
    sc.nextLine();

    students.add(new Student(id,name,marks));
    System.out.println("Student added successfully.");
  }
  public static void displayStudents(){
    if(students.isEmpty()){
      System.out.println("No student records found.");
      return;
    }
    for(Student s : students){
      s.displayStudent();
    }
  }
  public static void searchStudent(String id){
    for(Student s : students){
      if(s.getStudentID().equals(id)){
        System.out.println("\nStudent found:");
        s.displayStudent();
        return;
      }
    }
    System.out.println("Student not found.");
  }
  public static void calculateAverage(){
    if(students.isEmpty()){
      System.out.println("No student records available.");
      return;
    }
    double total = 0;
    for(Student s : students){
      total+=s.getMarks();
    }
	// Calculate average marks
    double average = total/students.size();
    System.out.println("Average mark = " + average);
  }
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int choice = 0;

    while(choice!=5){
       System.out.println("\n---Student Grade Management System---");
       System.out.println("1. Add student");
       System.out.println("2. Display all students");
       System.out.println("3. Search student by id");
       System.out.println("4. Calculate average marks");
       System.out.println("5. Exit");
       System.out.println("Enter choice:");

      choice = sc.nextInt();
      sc.nextLine();

      switch(choice){
        case 1:
          addStudent(sc);
          break;
        case 2:
          displayStudents();
          break;
        case 3:
          System.out.print("Enter student id: ");
          String id = sc.nextLine();
          searchStudent(id);
          break;
        case 4:
          calculateAverage();
          break;
        case 5:
          System.out.println("Exit program...");
          break;
        default:
          System.out.println("Invalid choice!");
      }
    }
    sc.close();
  }
}