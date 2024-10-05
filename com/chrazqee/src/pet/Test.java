package pet;

public class Test {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.eat();
        // 向上转型，建立在 继承 + 重写 的基础上
        Pet pet = new Dog();  // 无法调用 Dog 类中特有的方法，即需要子类中重写父类中的方法
        pet.eat();  // 调用的是 父类 中的方法，执行的是 子类 中的方法
    }
}
