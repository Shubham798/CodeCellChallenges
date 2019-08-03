public class Cube {
    double cube(double n){
        double sum=0;
        for (double i=1;i<=n;i++) {
            double x = Math.pow(i, 3);
            sum+=x;
        }
        return sum;
    }
}
