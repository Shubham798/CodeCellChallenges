import java.util.Arrays;

public class Execute {
    public static void main(String[] args) {
        String []s1="92 40 47 13 45 75 26 86 86 59 28 6 11 62 13 87 27 10 99 6 66 23 39 50 47 70 93 79 76 81 80 32 79 79 65 30 52 88 54 36 83 70 81 38 11 35 64 43 55 78 63 56 2 30 12 5 57 20 9 54 13 57 73 52 55 23 52 38 78 69 44 55 88 56 1 21 22 5 13 67 12 38 78 37 87 56 21 38 61 39 31 63 11 16 24 93 11 39 21 36".split(" ");
        String []s2="2 2 2 2 2".split(" ");
        String []s3="3 6 5 78 24".split(" ");
        String []s4="6 5 9 1 2 2 3".split(" ");
        String []s5="103 88 95 103 1024 102 91 93 92 102 91 101 100 97 95 95 89 104 94 88 90 95 90 5607 94 89 89 100 97 103 101 99 98 101 90 97 96 89 100 98 91 96 92 88 88 89 104 101 100 102 100 88 104 103 93 102 105 902 105 100 89 92 94 105 100 102 96 90 94 98 94 88 105 10 91 100 103 102 104 100000".split(" ");
        //int []a= {2, 2 ,2 ,2 ,2};
        int []a= Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
        int []b= Arrays.stream(s2).mapToInt(Integer::parseInt).toArray();
        int []c= Arrays.stream(s3).mapToInt(Integer::parseInt).toArray();
        int []d= Arrays.stream(s4).mapToInt(Integer::parseInt).toArray();
        int []e= Arrays.stream(s5).mapToInt(Integer::parseInt).toArray();
        Chemicals c1= new Chemicals(a);
        Chemicals c2= new Chemicals(a);
        Chemicals c3= new Chemicals(a);
        Chemicals c4= new Chemicals(a);
        Chemicals c5= new Chemicals(a);

        System.out.println(c1.perform()+c2.perform()+c3.perform()+c4.perform()+c5.perform());
    }
}
