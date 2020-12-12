package animals;

import abstraction.Animal;

public class Cat extends Animal {
    public Cat(String name, String color)
    {
        super(name, color);
    }
    public Cat()
    {
        System.out.println("Cat Constructor");
    }
    @Override
    public String sayHelloAbs()
    {
        return "My name is: " + name + " and my color is: " + color + " I'm cat :D";
    }
}
