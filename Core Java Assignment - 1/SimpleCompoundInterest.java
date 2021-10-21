import java.util .*;
class SimpleCompoundInterest
{
    public static void main (String argu[ ])
{
    double PA, rate, yr, SI,CI;
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the amount:");
    PA=sc.nextDouble();
    System.out.println("Enter the number of years:");
    yr=sc.nextDouble();
    System.out.println("Enter the rate of interest");
    rate=sc.nextDouble();
    SI=(PA * yr * rate)/100;
    CI=PA * Math.pow(1.0+rate/100.0,yr) - PA;
    System.out.println("Siple Interest="+SI);
    System.out.println("Compound Interest="+CI);
   }
}

/*
Output:
Enter the amount:
5000
Enter the number of years:
10
Enter the rate of interest
15
Siple Interest=7500.0
Compound Interest=15227.788678539535
*/
