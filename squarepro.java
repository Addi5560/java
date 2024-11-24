
import java.util.Scanner;

 class squarepro {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();

        int area = side1*side2;

        System.out.print("area of the sqaere is: "+ area);
    }
    
}
 