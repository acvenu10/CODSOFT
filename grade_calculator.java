import java.util.*;
class grade_calculator {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int a[]=new int[10]; 
     int sum=0;
     double avg;
    System.out.println("enter the number of subjects:");
   int n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
    System.out.print("marks of subject "+i+" is:");
    a[i]=sc.nextInt();
    sum=sum+a[i];
    }
    System.out.println("sum of student marks id::"+sum);
    avg=sum/n;
    System.out.println("average of the student:"+avg);
    if(avg<=100 && avg>90)
    {
        System.out.println("O grade");
    }
    else if(avg<=90 && avg>80)
    {
        System.out.println("A+ grade");
    }
    else if(avg<=80 && avg>70)
    {
        System.out.println(" A grade ");
    }
    else if(avg<=70 && avg<60)
    {
        System.out.println("B+ grade");
    }
    else if(avg<=60 && avg<50)
    {
        System.out.println("B grade");
    }
    else if(avg<=50 && avg<40)
    {
        System.out.println(" C+ grade");
    }
    else if(avg<=40 && avg<=35)
    {
        System.out.println(" JUST PASS ");
    }
    else
      {
        System.out.println("FAIL");
      }
   }
}