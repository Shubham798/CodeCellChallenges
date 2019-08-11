/*I HAVEN'T TAKEN N AS INPUT FROM USER AS I DID IT WITHOUT USING N*/

import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sequence");
        String in=sc.nextLine();
        String  []a=in.split(" ");
        Calc c= new Calc();
        ans+=(c.calc(a));

        System.out.println("Enter sequence");
        in=sc.nextLine();
        a=in.split(" ");
        ans+=(c.calc(a));

        System.out.println("Enter sequence");
        in=sc.nextLine();
        a=in.split(" ");
        ans+=(c.calc(a));

        System.out.println("The answer is "+ans);
    }
}
