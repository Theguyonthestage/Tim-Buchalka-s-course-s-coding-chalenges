public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

}