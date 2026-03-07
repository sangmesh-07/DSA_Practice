

public class ArmstrongNumber {
    public boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        
        return original==sum;
    }
    public static void main(String[] args) {
        int n=153;
        ArmstrongNumber sol=new ArmstrongNumber();
        boolean result=sol.isArmstrong(n);
        if(result){
            System.out.println(n+" is an Armstrong number.");
        }else{
            System.out.println(n+" is not an Armstrong number.");
        }
    }
    
}
