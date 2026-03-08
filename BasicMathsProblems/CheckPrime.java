public class CheckPrime {
    public  int checkPrime(int n){
        int count=0;
        for(int i=1;i*i<n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println(n+" is a prime number");
        }
        return count;
    }
    public static void main(String[] args){
        int n=37;
        CheckPrime sol=new CheckPrime();
        sol.checkPrime(n);
    }
}
