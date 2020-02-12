public class Student {
    private final String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 一般这种无参构造需要写吗？　TODO
//    public Student() {
//        name = "Not Set";

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
//    }
}
