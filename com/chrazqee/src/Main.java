import func_pkg.Solution;
import basic_pkg.ListNode;
import basic_pkg.Student;


public class Main {
    public static void main(String[] args) {
        System.out.println("Strat main function...");
        Solution sol = new Solution();
        ListNode ans = sol.addTwoNumbers(null, null);
        System.out.println(ans);  // 对象 -> basic_pkg.ListNode@251a69d7

        // Student 类的测试
        Student stu = new Student();
        stu.setAge(15);
        System.out.println(stu.getAge());
    }
}
