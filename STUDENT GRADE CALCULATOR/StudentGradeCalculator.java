import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter the marks for sub-"+i);
            total += sc.nextInt();
        }

        double percentage = total / 5.0;
        char grade;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Total: " + total+"/500");
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
