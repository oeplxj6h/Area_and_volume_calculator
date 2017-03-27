public class parallelepiped_calculator {
    private double a,b,c;
    public double return_a(){return a;}
    public double return_b(){return b;}
    public double return_c(){return c;}
    public parallelepiped_calculator(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double volume(){return a*b*c;}
    public double area(){return 2*(a*b+b*c+a*c);}
}