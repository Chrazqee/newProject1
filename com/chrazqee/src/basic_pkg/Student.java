package basic_pkg;

// 封装的概念：private
public class Student {
    private String name;
    private int age; // <关门>
    private String gender;
    private double score;

    // 构造函数
    // public Student() {
    // }

    // public Student(String name) {
    //     this.name = name;
    // }

    // public Student(String name, String gender) {
    //     this.name = name;
    //     this.gender = gender;
    // }

    // public Student(String name, String gender, double score) {
    //     this.name = name;
    //     this.gender = gender;
    //     this.score = score;
    // }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 封装 => set 和 get 方法：：<开窗>
    public void setAge(int age) {
        // 控制 成员变量 的赋值合法性
        if (age > 0 && age <= 130) {
            this.age = age;
        } else {
            throw new IllegalAccessError("年龄不合法");
        }
    }

    public int getAge() {
        return this.age;
    }

}
