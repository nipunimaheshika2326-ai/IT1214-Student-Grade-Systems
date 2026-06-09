// Student Class
public class Student{
  private String studentID;
  private String studentName;
  private double marks;

  public Student(String studentID,String studentName,double marks){
    this.studentID=studentID;
    this.studentName=studentName;
    this.marks=marks;
  }
  public String getStudentID(){
    return studentID;
  }
  public String getStudentName(){
    return studentName;
  }
  public double getMarks(){
    return marks;
  }
  public void displayStudent(){
    System.out.println("Student ID: "+ studentID);
    System.out.println("Student Name: "+ studentName);
    System.out.println("Student Marks: "+ marks);
  }
}