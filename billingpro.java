import java.util.Scanner;
public class billingpro{
    public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    float pen = sc.nextFloat();
    float pencil = sc.nextFloat();
    float eraser = sc.nextFloat();
     
    float total = pen + pencil + eraser;
    System.out.println("bill is :" + total);

    float newtotal = total + (0.18f * total);
    System.out.println("bill with 18% tax:" + total);
  }
}
    
