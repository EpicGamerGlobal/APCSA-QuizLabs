import java.util.*;
public class Inflation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Finding Rate of Inflation");
        
        System.out.println("Enter in CPI of initial year");
        double CPI1 = s.nextDouble();
        
        System.out.println("Enter in CPI of next year");
        double CPI2 = s.nextDouble();
        
        double rof = rateOfInflation(CPI1,CPI2);
        System.out.printf("%.2d",rof);
        
        s.nextLine(); //clear buffer
        //method 2
        System.out.println("Finding Estimated CPI in N years");
        
        System.out.println("Enter in CPI of initial year");
        double future_CPI1 = s.nextDouble();
        
        System.out.println("Enter in current interest rate (ex 22.54)");
        double future_interest = s.nextDouble();
        
        System.out.println("Enter in the number of years");
        int future_years = s.nextInt();
        
        double future_CPI = futureCPI(future_CPI1, future_interest, future_years);
        System.out.println(future_CPI);
    }
    public static double rateOfInflation(double CPI1, double CPI2) {
        double rof = (CPI2 - CPI1) / CPI1;
        return rof * 100;
    }
    public static double futureCPI(double future_CPI1, double current_interest, int years) {
        double current_percentage = current_interest / 100;
        double futureCPI = future_CPI1 + Math.pow(1+current_percentage,years);
        return futureCPI;
    }
    
}