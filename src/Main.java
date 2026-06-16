import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoursePlanner planner = new CoursePlanner();

        int choice;

        do {
            System.out.println("\n===== Student Course Planner =====");
            System.out.println("1. Add a course");
            System.out.println("2. List all courses");
            System.out.println("3. Search for a course by course code");
            System.out.println("4. Register a student in a course");
            System.out.println("5. Display all full courses");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter course code: ");
                    String code = scanner.nextLine();

                    System.out.print("Enter course name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter credits: ");
                    int credits = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter instructor name: ");
                    String instructor = scanner.nextLine();

                    System.out.print("Enter capacity: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine();

                    planner.addCourse(code, name, credits, instructor, capacity);
                    break;

                case 2:
                    planner.listAllCourses();
                    break;

                case 3:
                    System.out.print("Enter course code to search: ");
                    String searchCode = scanner.nextLine();

                    Course foundCourse = planner.searchCourse(searchCode);

                    if (foundCourse != null) {
                        System.out.println("Course found:");
                        foundCourse.displayCourse();
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter course code to register: ");
                    String registerCode = scanner.nextLine();
                    planner.registerStudentInCourse(registerCode);
                    break;

                case 5:
                    planner.displayFullCourses();
                    break;

                case 6:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
