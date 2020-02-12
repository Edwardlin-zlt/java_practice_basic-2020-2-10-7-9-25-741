public class Teacher {
    private final String name;
    Student student;

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public void printDetail(){
        System.out.println("I'm a teacher, and my name is " + name);
        System.out.println("My student's name is " + student.getName() + ". And his score is " + student.getScore());
    }

    public void changeStuScore(int Score) {
        student.setScore(student.getScore() + Score);
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
