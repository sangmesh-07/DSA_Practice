
class ReverseArray {
    public void reverse(int[] arr,int i,int n){
        if(i>=n/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverse(arr, i+1, n);
    } 
    public static void main(String[] args) {
        int[] arr={1,4,32,5,6};
        ReverseArray obj=new ReverseArray();
        obj.reverse(arr, 0, arr.length);
        for (int idx = 0; idx < arr.length; idx++) {
            Object elem = arr[idx];
            System.out.print(elem + " ");
        }
    }

    
}