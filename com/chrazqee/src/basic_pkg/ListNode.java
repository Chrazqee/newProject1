package basic_pkg;

public class ListNode {
    int val;
    ListNode next;
    // 三种类的构造函数; 用 public 修饰符确保别的包内的类可以调用这些构造函数
    // 注意，构造方法没有返回值类型；不能用 '.' 去调用
    // 没有构造方法，编译器会自动创建一个无参的构造方法
    // 实际上, 下列三个不同的构造函数就是方法重载
    public ListNode() {}  
    
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val; 
        this.next = next;
    }
}
