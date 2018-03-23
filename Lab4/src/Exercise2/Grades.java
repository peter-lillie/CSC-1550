package Exercise2;

// ************************************************************
// Grades.java
//
// Use Student class to get test grades for two students
// and compute averages
//
// Contributors Peter Lillie, Kyle White, and Ricky Sethi
//
// ************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
//create student2, "Mike"
        Student student2 = new Student("Mike");
//input grades for Mary
        student1.inputGrades();
//print average for Mary
        System.out.println(student1.getAverage());
//input grades for Mike
        student2.inputGrades();
//print average for Mike
        System.out.println(student2.getAverage());
//printing the objects
        System.out.println(student1.printName() + "\n" + student2.printName());
    }
}
