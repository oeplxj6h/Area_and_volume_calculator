import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        System.out.print("Введите ''0'' для получения данных сферы и ''1'' для получения данных параллелепипеда: ");
        Scanner in=new Scanner(System.in);
        choice=in.nextInt();
        if(choice>0){
            double a,b,c;
            System.out.print("Введите измерения параллелепипеда (в произвольном порядке): ");
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            parallelepiped_calculator working_calculator=new parallelepiped_calculator(a,b,c);
            System.out.println("Измерения прямоугольного параллелепипеда (в порядке ввода: " + working_calculator.return_a() + "; " + working_calculator.return_b() + "; " + working_calculator.return_c());
            System.out.print("Объём параллелепипеда равен "+working_calculator.volume()+" кубических единиц; площадь поверхности параллелепипеда равна "+working_calculator.area()+" квадратных единиц.\n");
        }
        else{
            double radius;
            System.out.print("Введите радиус сферы: ");
            radius=in.nextInt();
            sphere_calculator working_calculator=new sphere_calculator(radius);
            System.out.println("Радиус сферы: "+working_calculator.return_radius());
            System.out.print("Объём сферы равен "+working_calculator.volume()+" кубических единиц; площадь поверхности сферы равна "+working_calculator.area()+" квадратных единиц.\n");
        }
    }
}