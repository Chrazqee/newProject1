package pet;

public class Dog extends Pet {
    private String strain;  // 品种

    public String getStrain() {
        return this.strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
    
    public void catchDisk() {
        System.out.println("Dog is catching disk");
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void eat() {
        System.out.println("狗吃肉");
    }

}
