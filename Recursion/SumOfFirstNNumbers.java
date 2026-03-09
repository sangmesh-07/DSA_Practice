public class SumOfFirstNNumbers {
    public void sumofNNumbers(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return ;
        }
         sumofNNumbers(i-1, sum+i);
    }
    public static void main(String[] args){
        int n=10;
        SumOfFirstNNumbers obj=new SumOfFirstNNumbers();
        obj.sumofNNumbers(n,0);

    }
    
}
