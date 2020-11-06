package proj2;
import java.util.Scanner;
public class dayscalc {
public static void main(String[] args)
{
System.out.println("Input the number of minutes");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int hrs=n/60;
int days=hrs/24;
int year;
if(days>365)
{
year=days/365;
days=days%365;
System.out.println(n+" minutes is approximately "+ year+" years "+days+" days");
}
else {
System.out.println(n+" minutes is approximately "+days+" days");
}
sc.close();
}
}
