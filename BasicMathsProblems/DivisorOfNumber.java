
public class DivisorOfNumber {
    public int divisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int n=36;
        DivisorOfNumber sol=new DivisorOfNumber();
        sol.divisor(n);
        
    }
    
}
