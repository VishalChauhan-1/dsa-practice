public class LinearSearch{
    public static int search(int n[],int key){
        for(int i=0;i<n.length;i++){
            if(n[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n[] = {2,5,3,1,8,5,6,9,13};
        int key = 88;

        int f = search(n,key);

        if(f == -1){
            System.out.print("key is not found");
        }else{
            System.out.print("key is found at "+f);
        }
    }
}
