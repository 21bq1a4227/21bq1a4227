import java.util.Scanner;
public class ElectricityBillTest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ElectricityBill eb=new ElectricityBill();
        System.out.println("Enter consumer number:");
        eb.cnum=sc.next();
        System.out.println("enter consumer name:");
        eb.cname=sc.next();
        System.out.println("enter previous month readings");
        eb.pmr=sc.nextInt();
        System.out.println("enter current month readingsr");
        eb.cmr=sc.nextInt();
        System.out.println("enter 1 if eb connection is domestic,2 if commercial");
        eb.type=sc.nextInt();
        System.out.println("consumer name"+eb.cname());
        System.out.println("consumer numbrr"+eb.cnum());
        System.out.println(eb.amountcal());
    }
}
