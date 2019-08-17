public class Magic {
    long m,n,p,count=0;
    Magic(){}
    Magic(int m,int n, int p){
        this.m=m;
        this.n=n;
        this.p=p;
    }
    long check() {
        for (long i = m; i <= n; i++) {
            long no=i,rev,diff;
            String temp= Long.toString(i);
            StringBuffer temp2=new StringBuffer();
            temp2.append(temp);
            temp2.reverse();
            rev=Long.parseLong(temp2.toString());
            diff=no-rev;
            if(diff%p==0)
                count++;
        }
        return count;
    }
}
