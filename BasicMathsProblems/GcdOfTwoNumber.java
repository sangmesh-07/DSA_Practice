public class GcdOfTwoNumber {
    public int Gcd(int a,int b){
        while(a>0 &&b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;  
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public static void main(String[] args){
        int a=12;
        int b=15;
        GcdOfTwoNumber sol=new GcdOfTwoNumber();
        System.out.println("Gcd of "+a+" and "+b+" is "+sol.Gcd(a,b));
    }
}
