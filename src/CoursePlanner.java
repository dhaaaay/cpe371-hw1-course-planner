import java.util.ArrayList;

public class CoursePlanner {
    private ArrayList<Course> courses;

    public CoursePlanner() {
        courses = new ArrayList<>();
    }

    public void addCourse(String courseCode, String courseName, int credits, String instructor, int capacity) {
        if (capacity <= 0) {
            System.out.println("Capacity must be greater than 0.");
            return;
        }

        Course course = new Course(courseCode, courseName, credits, instructor, capacity);
        courses.add(course);
        System.out.println("Course added successfully.");
    }

    public void listAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("\nAll Courses:");
        for (Course course : courses) {
            System.out.println("--------------------");
            course.displayCourse();
        }
    }

    public Course searchCourse(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public void registerStudentInCourse(String courseCode) {
        System.out.println("Registration feature will be added in the feature-registration branch.");
    }

    public void displayFullCourses() {
        boolean found = false;

        System.out.println("\nFull Courses:");

        for (Course course : courses) {
            if (course.isFull()) {
                System.out.println("--------------------");
                course.displayCourse();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No full courses.");
        }
    }
}
