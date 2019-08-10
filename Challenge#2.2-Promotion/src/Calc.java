import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Calc {
    int calc(String[] x) {
        int sum = 0;
        Set set = new HashSet();
        Collections.addAll(set, x);
        String[] a = new String[set.size()];
        set.toArray(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int m = Integer.parseInt(a[i]);
                int n = Integer.parseInt(a[j]);
                //System.out.println(m&n);
                sum+=(m&n);
            }
        }
        return (sum%101);
    }
}

