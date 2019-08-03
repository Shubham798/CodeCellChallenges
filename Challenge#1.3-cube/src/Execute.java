public class Execute {
    public static void main(String[] args) {
        Cube c1= new Cube();
        double a=c1.cube(5);
        double b=c1.cube(500);
        double c=c1.cube(5000000000l);
        double answer=(a*b*c);
        answer%=1000007;
        System.out.println("The answer is "+answer);
    }
}
