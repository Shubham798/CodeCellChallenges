public class Sports {
    public static void main(String[] args) {
        Check c= new Check();
        System.out.println(c.check(10));
        System.out.println(c.check(256));
        System.out.println(c.check(511));
        System.out.println(c.check(4097));
        System.out.println(c.check(8194));

        System.out.println(c.check(10)*c.check(256)*c.check(511)*c.check(4097)*c.check(8194));
    }
}
