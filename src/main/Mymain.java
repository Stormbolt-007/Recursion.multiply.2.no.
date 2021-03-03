package main;

public class Mymain {
    public static void main(String[] args){
        System.out.println(mul(6,4));
    }
    public static int mul(int a,int b){
        if(b == 0){
            return 0;
        }
        else{
            return a + mul(a, b-1);
        }
    }
}
