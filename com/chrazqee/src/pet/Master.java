package pet;

public class Master {
    // 方法重载
    // public void feed(Dog dog) {
    //     dog.eat();
    // }

    // public void feed(Penguin penguin) {
    //     penguin.eat();
    // }

    // 使用多态
    public void feed(Pet pet) {  // 父类类型引用指向子类对象
        pet.eat();
    }

    // 不使用多态
    // public Dog getDog() {
    //     return new Dog();
    // }

    // public Penguin getPenguin() {
    //     return new Penguin();
    // }

    // 使用多态
    public Pet getPet(String type) {
        // if (type == "dog") {
        //     return new Dog();
        // } else {
        //     return new Penguin();
        // }
        if (type.equals("dog")) {
            return new Dog();
        } else {
            return new Penguin();
        }
    }

    public void play(Pet pet) {
        if (pet instanceof Dog) { // instanceof 关键字，判断对象是否为某个类的实例
            Dog dog = (Dog) pet;  // 向下转型；强制类型转换成为子类类型
            dog.catchDisk();
        } else {
            Penguin penguin = (Penguin) pet;
            penguin.swim();
        }
    }

    public static void main(String[] args) {
        Master master = new Master();
        Pet pet = master.getPet("penguin");
        master.feed(pet);
        master.play(pet);
        // master.feed(new Dog());
        // master.feed(new Penguin());
    }
}
