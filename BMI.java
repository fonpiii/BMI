import java.util.*;
class BMI {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.print("ENTER HIGHT (cm.) : ");
            double hight = sc.nextDouble();
            System.out.print("ENTER WEIGHT (kg.) : ");
            double weight = sc.nextDouble();

            double A = hight/100.00;
            double BMI = weight/(A*A);

				System.out.println("==================================");
                System.out.println("      BMI => : "+BMI);
				System.out.println("==================================");
    }
}