import  java.io.*;

class  con1{

    public static int g1, g2; 
    public con1(int x, int y){
        g1=x;
        g2=y;

    }

    public static int m;
    public  con1(){
        m=200;
    }
    public static void main(String args[]){
        int x=20; int y=30;
        con1 obj1=new con1(x,y);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(m);

    }

}