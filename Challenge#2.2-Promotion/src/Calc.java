public class Calc {
    int calc(String[] x) {
        int sum = 0;
        int []a= new int[x.length];
        for (int i=0;i<x.length;i++) {
            a[i]=Integer.parseInt(x[i]);
        }
        //for (int i=0;i<a.length;i++)
          //  System.out.println(a[i]);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int m = (a[i]);
                int n = (a[j]);
                //System.out.println(m&n);
                sum+=(m&n);
            }
        }
        return (sum%101);
    }
}

