public class Cube {
    long cube(long n){
        long sum=0;

            long x= n/3;
            long y= n%3;

            sum+=(x*18);
            if(y==1)
                sum+=1;
            else if (y==2)
                sum+=9;

            return sum;
    }

}
