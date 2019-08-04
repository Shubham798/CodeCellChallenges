import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;


        while (true) {
            System.out.println("Enter your choice\n1.New Date\n2.Show Sum\n3.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the date in dd/mm/yyyy form");
                    String input=sc.next();
                    int dd=Integer.parseInt(input.substring(0,2));
                    int mm=Integer.parseInt(input.substring(3,5));
                    float yy=Float.parseFloat(input.substring(6));

                    float days= dd+(31*(mm-1))+(365*(yy-1));
                    int rem= (int)days%7;
                    switch (rem){
                        case 0:
                            System.out.println("Sunday");
                            sum+=6;
                            break;
                        case 1:
                            System.out.println("Monday");
                            sum+=0;
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            sum+=1;
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            sum+=2;
                            break;
                        case 4:
                            System.out.println("Thursday");
                            sum+=3;
                            break;
                        case 5:
                            System.out.println("Friday");
                            sum+=4;
                            break;
                        case 6:
                            System.out.println("Saturday");
                            sum+=5;
                            break;
                    }
                    break;

                case 2:
                    System.out.println("The sum is "+sum);
                    break;
                case 3:
                    System.exit(1);
            }
        }
    }
}
