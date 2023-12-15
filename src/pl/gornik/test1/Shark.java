package pl.gornik.test1;

public class Shark implements Swimable{
    private String name;

    public String getName() {
        return name;
    }

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("bul, bul...");
    }

    @Override
    public void swimming() {
        System.out.println("Pływam w oceanie...");
    }
}
