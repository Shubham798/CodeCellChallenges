import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Execute {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter all the cases");
        String s[]= (sc.nextLine()).split(" ");
        int []x= Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        Magic a=new Magic(x[0],x[1],x[2]);
        Magic b=new Magic(x[3],x[4],x[5]);
        Magic c=new Magic(x[6],x[7],x[8]);
        Magic d=new Magic(x[9],x[10],x[11]);
        System.out.println(a.check()+b.check()+c.check()+d.check());
    }
}
