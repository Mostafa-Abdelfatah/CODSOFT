import java.util.Scanner;

public class GradeCalculator {
    private int numOfSubjects = 0;
    private int totalGrades = 0;
    private Scanner in = new Scanner(System.in);
    private double average = 0;

    private void setNumberOfSubjects_and_totalGrades_average () {
        System.out.println("please enter the number of subjects: ");
        this.numOfSubjects = in.nextInt();
        System.out.println("please enter evey grade of each subject out of 100");
        for(int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Subject " + i +": ");
            int x = in.nextInt();
            System.out.println();
            totalGrades += x;

        }
        this.average = totalGrades / (numOfSubjects + 0.0);
    }

    void startCalculate () {
        setNumberOfSubjects_and_totalGrades_average();
        System.out.println("your total marks: " + totalGrades);
        System.out.printf("average percentage %.2f%s\n", average,"%");
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else if (average >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }

}
