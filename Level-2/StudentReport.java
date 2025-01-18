class StudentReportDetails {
    String name;
    int rollNumber;
    double marks;

     public StudentReportDetails(String name, int rollNumber, double marks) {
         this.name = name;
         this.rollNumber = rollNumber;
         this.marks = marks;
     }
    public String calculateGrade(int marks){
         String grade="";
         if(marks >=85) grade= "Grade A";
         else if(marks>70 && marks<=84) grade ="Grade B";
         else if(marks>=60 && marks<=70) grade= "Grade C";
         else if(marks>=45 && marks<60) grade= "Grade D" ;
         else  grade= "Grade E";
         return  grade;

    }
    public  void display(String grade){
        System.out.println("Student's details :");
        System.out.println("The name of the student is "+name+" , roll number is "+rollNumber+" and marks is "+marks);
        System.out.println("And the grade obtained is "+ grade);
    }

 }

public  class StudentReport {
    public static void main(String[] args) {
    StudentReportDetails sd= new StudentReportDetails("Sweta Kumari Agrawal" , 50,95);
    String grade=sd.calculateGrade(95);
    sd.display(grade);
    }
}
