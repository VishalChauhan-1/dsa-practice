public class MaxInArray{
    public static int largest(int n[]){
        int large = Integer.MIN_VALUE;  // set infinity

        for(int i=1;i<n.length;i++){
            if(n[i] > large){
                large = n[i];
            }
        }
        return large;
    }
    public static void main(String args[]){
        int n[] = {2,5,4,3,10,6,8,7};

        System.out.print("Largest value is "+largest(n));
    }
}
