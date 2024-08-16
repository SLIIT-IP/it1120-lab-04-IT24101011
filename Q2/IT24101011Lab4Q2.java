import java.util.Scanner;

public class IT24101011Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter exam marks (out of 100): ");
        int examMarks = scanner.nextInt();

        System.out.print("Enter lab submission marks (out of 100): ");
        int labSubmissionMarks = scanner.nextInt();

               if (examMarks < 0 || examMarks > 100 ) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }
		if (labSubmissionMarks < 0 || labSubmissionMarks > 100 ) {
			System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
	}

        
        System.out.print("Enter the percentage given for the exam: ");
        int examPercentage = scanner.nextInt();

        System.out.print("Enter the percentage given for the lab submission: ");
        int labPercentage = scanner.nextInt();

                if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

               double finalMark = (examMarks * (examPercentage / 100.0)) + (labSubmissionMarks * (labPercentage / 100.0));

                System.out.println("Final mark: " + finalMark);

        scanner.close();
    }
}