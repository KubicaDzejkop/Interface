package pl.gornik.test1;

public class Dog implements Runable{
    private String name;

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("hau, hau...");
    }

    @Override
    public void running() {
        System.out.println("Mogę biegać i skakać...");
    }

}
