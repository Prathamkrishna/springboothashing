package practiceproject.springproject.productdata;

public class hashing {
    public static boolean[][] hashedArray = new boolean[1000][3];
    public static void create(int[] arr ,int n){
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
            if(arr[i] >= 0){
                hashedArray[arr[i]][1] = true;
            }
            else{
                int abc = Math.abs(arr[i]);
                System.out.println(abc);
                hashedArray[abc][2] = true;
            }
        }
        System.out.println(search(-2));
    }
    public static boolean search(int num){
        if(num >= 0){
            System.out.println("inside if");
            if(hashedArray[num][1]){
                return true;
            }
            else return false;
        }
        else{
            int abc = Math.abs(num);
            System.out.println("inside else");
            if(hashedArray[abc][2]){
                return true;
            }
            else return false;
        }
    }
}
