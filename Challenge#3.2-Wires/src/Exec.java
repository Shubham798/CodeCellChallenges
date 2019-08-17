public class Exec {
    public static void main(String[] args) {
        Wire w1=new Wire(10,5,2,3);
        Wire w2=new Wire(16,7,5,3);
        Wire w3=new Wire(10000,19,35,37);
        Wire w4=new Wire(2501,8,4,6);
        Wire w5=new Wire(10520,217,88,129);
        Wire w6=new Wire(300001,263,311,179);

        System.out.println(w1.pieces()+w2.pieces()+w3.pieces()+w4.pieces()+w5.pieces()+w6.pieces());
    }
}
