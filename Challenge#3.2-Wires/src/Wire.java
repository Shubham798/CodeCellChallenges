public class Wire {
    private int n,x,y,z,tt;
    Wire(){}
    Wire(int a,int b,int c,int d){
        n=a;x=b;y=c;z=d;
    }
    int pieces(){
        int X,Y,Z;
        if (n%x!=0)
            X=-1;
        else
            X=n/x;
        if (n%y!=0)
            Y=-1;
        else
            Y=n/y;
        if (n%z!=0)
            Z=-1;
        else
            Z=n/z;
        tt=(X > Y ? (X > Z ? X : Z) : (Y > Z ? Y : Z));
        return (X > Y ? (X > Z ? X : Z) : (Y > Z ? Y : Z));
    }
}
