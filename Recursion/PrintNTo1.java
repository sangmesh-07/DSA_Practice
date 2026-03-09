public class PrintNTo1 {
    public void printNumbers(int i,int n){
        if(i<1)
        return ;
        System.out.println(i);
        printNumbers(i-1,n);
    }
    public static void main(String[] args){
        int n=5;
        PrintNTo1 reu=new PrintNTo1();
        reu.printNumbers(n, n);
    }
    
}
