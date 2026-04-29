import java.util.Scanner;

public class k1 {
    public static void main(String[] args) {
        double width=0;
        double lengh=0;
        double area=0;
        Scanner x= new Scanner(System.in);
        System.out.println("Enter the Width: ");
        width=x.nextDouble();

        System.out.println("Enter the Lengh: ");
        lengh=x.nextDouble();

        area=lengh*width;

        System.out.println("The area Is: "+ area

        );

        x.close();
    }
    
}
