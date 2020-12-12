package app;

// import abstraction.Animal;
// import animals.Dog;
// import animals.Cat;
import shapes.Circle;
import shapes.Square;
import abstraction.Figura;

public class Application {
    public static void main(String[] args) {
        // Tworzymy obiekt klasa abstrakcyjna 
        // Animal myObj = new Animal(); -> ERROR!
        // Dog myDog = new Dog();
        // Dog myDog2 = new Dog("dogo1", "black");
        // System.out.println(myDog2.sayHelloAbs());

        // HERE WILL BE CAT OBJECTS
        // Cat myCat = new Cat("Mario", "white");
        // System.out.println(myCat.sayHelloAbs());
        // Circle myCircle = new Circle(5.0);
        // System.out.println(Math.round(myCircle.pole() * 100.0) / 100.0);
        Square mySquare = new Square(5.0);
        System.out.println(mySquare.pole());
        System.out.println("Dodaje to cos");
    }
}