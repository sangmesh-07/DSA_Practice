public class Plaindromecheck{
    public boolean plaindromeCheck(String s,int i){
        if(i>=s.length()/2){
            return true;
        }
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
            return plaindromeCheck(s,i+1);

        
    }
    public static void main(String[] args){
        String s="madsm";
        Plaindromecheck obj=new Plaindromecheck();
        System.out.println(obj.plaindromeCheck(s, 0));
    }
}