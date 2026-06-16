public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private String instructor;
    private int capacity;
    private int registeredStudents;

    public Course(String courseCode, String courseName, int credits, String instructor, int capacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
        this.capacity = capacity;
        this.registeredStudents = 0;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public boolean isFull() {
        return registeredStudents >= capacity;
    }

    public boolean registerStudent() {
        if (!isFull()) {
            registeredStudents++;
            return true;
        }
        return false;
    }

    public void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor: " + instructor);
        System.out.println("Capacity: " + capacity);
        System.out.println("Registered Students: " + registeredStudents);
    }
}
