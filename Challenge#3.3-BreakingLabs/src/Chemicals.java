import java.util.*;

public class Chemicals {
    List a=new ArrayList();
    Chemicals(int []ar){
        for(int i=0;i<ar.length;i++)
            a.add(ar[i]);
    }
    int perform(){
        while (a.size()>1){
            Collections.sort(a);
            Collections.reverse(a);
            for(;;){
                int i=0;
                if(a.get(i)==a.get(i+1)){
                    a.remove(i);a.remove(i+1);break;
                }
                else{
                    a.set(1,((int)a.get(0)-(int)a.get(1)));
                    a.remove(0);
                    break;
                }
            }
        }
    if (a.size()==0)
        return 0;
    else
        return (int)a.get(0);
    }


}
