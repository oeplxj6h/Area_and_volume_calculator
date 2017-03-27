public class sphere_calculator {
    private static final double pi = 3.14159265358979323846;
    private	double radius;
    public double return_radius(){return radius;}
    public sphere_calculator(double radius){this.radius=radius;}
    public double volume(){return 4.0/3.0*pi*radius*radius*radius;}
    public double area(){return 4*pi*radius*radius;}
}