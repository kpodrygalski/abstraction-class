package shapes;

import abstraction.Figura;

public class Square extends Figura {
    public double a;

    public Square(double a)
    {
        this.a = a;
    }
    @Override
    public double pole() {
        // WZOR NA POLE:
        return Math.pow(a,2);
    }
}
