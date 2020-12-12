package animals;

import abstraction.Animal;

public class Dog extends Animal {
    public Dog(String name,String color)
    {
        super(name, color);
    }
    
    public Dog() {
        // super();
        System.out.println("DOG constructor!");
    }

    @Override
    public String sayHelloAbs() {
        return "My name is: " + name + " and my color is: " + color + " and I AM DOG!!!"; 
    }
}
