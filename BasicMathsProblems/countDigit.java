package BasicMathsProblems;

public class countDigit {
    public int countDigits(int n){
        int count=0;
        while(n>0){
            int digit=n%10;
            count++;
            n=n/10;

        }
        return count;
    }
    public static void main(String[] args) {
        int n=12345;
        countDigit sol=new countDigit();
        int result=sol.countDigits(n);
        System.out.println("Number of digits in "+n+" is: "+result);
    }
    
}
