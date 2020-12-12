package shapes;

import abstraction.Figura;

public class Circle extends Figura {
    public double r;

    // konstruktor z arguemtnem pobierajacy promien od uzytkownika
    public Circle(double r) 
    {
        this.r = r;
    }
    // IMPLEMENTUJEMY KOD
    @Override
    public double pole() {
        // WZOR NA POLE:
        return Math.PI * Math.pow(r, 2);
    }
}
