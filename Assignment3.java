import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class User {
    // User class code here...
}

class Exam {
    private String[] questions;
    private String[] options;
    private int[] answers;
    private Timer timer;
    private boolean isExamCompleted;

    public Exam() {
        questions = new String[] {
                "Question 1: What is the capital of France?",
                "Question 2: Who is the author of 'To Kill a Mockingbird'?",
                "Question 3: What is the chemical symbol for gold?"
        };

        options = new String[] {
                "a) London\nb) Paris\nc) Rome\nd) Madrid",
                "a) Harper Lee\nb) J.K. Rowling\nc) George Orwell\nd) Ernest Hemingway",
                "a) Au\nb) Ag\nc) Fe\nd) Cu"
        };

        answers = new int[] { 1, 0, 0 };
        isExamCompleted = false;
    }

    public void startExam() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting the exam. Good luck!");

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up! The exam will be automatically submitted.");
                isExamCompleted = true;
                timer.cancel();
            }
        }, 600000); // 10 minutes

        for (int i = 0; i < questions.length; i++) {
            if (isExamCompleted) {
                break;
            }

            System.out.println("\n" + questions[i]);
            System.out.println(options[i]);

            System.out.print("Enter your answer (a, b, c, or d): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("a") ||
                    answer.equalsIgnoreCase("b") ||
                    answer.equalsIgnoreCase("c") ||
                    answer.equalsIgnoreCase("d")) {
                if (answer.equalsIgnoreCase(String.valueOf((char) ('a' + answers[i])))) {
                    score++;
                }
            } else {
                System.out.println("Invalid answer. Skipping the question.");
            }
        }

        if (!isExamCompleted) {
            System.out.println("\nExam completed!");
            System.out.println("Your score: " + score + "/" + questions.length);
        }
    }
}

public class OE {
    private static User currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Online Examination System ---");
            System.out.println("1. Login");
            System.out.println("2. Update Profile and Password");
            System.out.println("3. Start Exam");
            System.out.println("4. Logout");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    updateProfileAndPassword();
                    break;
                case 3:
                    startExam();
                    break;
                case 4:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Simulating login with a hardcoded user
        if (username.equals("admin") && password.equals("admin123")) {
            currentUser = new User();
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static void updateProfileAndPassword() {
        if (currentUser == null) {
            System.out.println("Please login first.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new profile information: ");
        String profile = scanner.nextLine();
        currentUser.setProfile(profile);

        System.out.print("Enter new password: ");
        String password = scanner.nextLine();
        currentUser.setPassword(password);

        System.out.println("Profile and password updated successfully!");
    }

    private static void startExam() {
        if (currentUser == null) {
            System.out.println("Please login first.");
            return;
        }

        Exam exam = new Exam();
        exam.startExam();
    }

    private static void logout() {
        if (currentUser == null) {
            System.out.println("Please login first.");
            return;
        }

        currentUser = null;
        System.out.println("Logged out successfully!");
    }
}
