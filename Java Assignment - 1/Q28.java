// 28. Write a Java Program Find out Students Grades using Switch  Case 

public class Q28 {
    public static void main(String[] args) {
        int[] marks = {95, 88, 75, 62, 58};

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double percentage = (totalMarks / (double) (marks.length * 100)) * 100;

        System.out.println("Marks in 5 subjects: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);

        char grade = getGrade(percentage);
        System.out.println("Grade: " + grade);
    }

    public static char getGrade(double percentage) {
        int gradeCode = (int) (percentage / 10);

        switch (gradeCode) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            case 5:
                return 'E';
            default:
                return 'F';
        }
    }
}

