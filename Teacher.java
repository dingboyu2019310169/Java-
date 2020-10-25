package School;
public class Teacher extends Member{
    private Course course;
    public Teacher(int id, String name, String gender, Course course) {
        super(id, name, gender);
        this.course = course;
    }

    public Teacher(int id, String name, String gender) {
        super(id, name, gender);
    }

    public Course getCourse()
    { return course; }

    public void setCourse(Course course)
    { this.course = course; }

    public String toString() {
        return getName();
    }

}