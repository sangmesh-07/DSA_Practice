public class Print1ToN{
    public void print1Ton(int n){
        if(n==0)
        return ;
        print1Ton(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        int n=5;
        Print1ToN reu=new Print1ToN();
        reu.print1Ton(n);
    }

}