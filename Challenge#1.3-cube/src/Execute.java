public class Execute {
    public static void main(String[] args) {
        Cube c1= new Cube();
        long a=c1.cube(5);
        long b=c1.cube(500);
        long c=c1.cube(5000000000l);
        long answer=(a*b*c);
        answer%=1000007;
        System.out.println("The answer is "+answer);
    }
}
