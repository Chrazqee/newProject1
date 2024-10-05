package pet;

public class Penguin extends Pet {
    private String name;
    private String color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("企鹅吃鱼");
    }

    public void swim() {
        System.out.println("企鹅游泳");
    }

}
