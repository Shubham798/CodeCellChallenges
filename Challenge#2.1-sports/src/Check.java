public class Check {
    int check(int price){
        int p=11,count=0;
        while (price!=0) {
            int a = price / (int) (Math.pow(2, p));
            if (a != 0) {
                count += a;
                price %= (int) Math.pow(2, p);
            }
            p--;
        }
        return count;
    }
}
