import java.util.Scanner;
public class first {
        
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            System.out.println("Enter The Base Of The Triangle:");
            double base = sc.nextDouble();
            Scanner sn = new Scanner (System.in);

            System.out.println("Enter The Height Of Triangle:");
            double height = sn.nextDouble();
            double area = 0.5*base*height;
            System.out.println("Area Of Triangle Is:" +area);
    
        }
    }