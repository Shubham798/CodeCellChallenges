import java.util.*;

public class Execute {
    public static void main(String[] args) {
        System.out.println("ENTER THE DATA");
        int beg=0,end=0;
        String s;
        Scanner sc =new Scanner(System.in);
        s=sc.nextLine();
        ArrayList arr= new ArrayList();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                end=i;
                arr.add(s.substring(beg,end));
                beg=end+1;
            }
        }
        System.out.println("GIVEN DATA");
        Iterator i= arr.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        Set set2= new HashSet();
        Iterator i1= arr.iterator();
        System.out.println("\n");
        while (i1.hasNext()){
            String temp=(String)i1.next();
            String temp1=new String();
            boolean flagP= false, flagA=false;
            for (int j=0;j<temp.length();j++){
                char x=temp.charAt(j);
                if (x=='.'&&!flagP&&!flagA)
                    continue;
                else if(x=='@') {
                    flagP= false;
                    flagA= true;
                    temp1 = temp1.concat(Character.toString(x));
                }
                else if(x=='+'&&!flagA){
                    flagP=true;

                }
                else if (!flagP){
                    temp1 = temp1.concat(Character.toString(x));
                }

            }
            //System.out.println( temp1);
            set2.add(temp1);

        }
        System.out.println("UNIQUE ADDRESSES");
        Iterator i2= set2.iterator();
        int count=0;
        while (i2.hasNext()){
            count++;
            System.out.println(i2.next());
        }
        System.out.println("\n"+count);

    }
}
