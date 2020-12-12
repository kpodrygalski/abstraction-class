package abstraction;

public abstract class Animal {
    public String name;
    public String color;

    public Animal()
    {
        this.name = "default";
        this.color = "none";
        // System.out.println("NAME: " + name + " COLOR: " + color);
    }

    public Animal(String name,String color)
    {
        this.name = name;
        this.color = color;
    }
    public void sayHello()
    {
        System.out.println("My name is: " + name);
    }
    // ABSTRACT METHOD 
    public abstract String sayHelloAbs();
}
