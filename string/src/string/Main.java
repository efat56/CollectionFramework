package string;

public class Main {

    public int fun1(int[] arr){
        int max = 0;
        for(int i=0; i< arr.length; i++){
            if(max>arr[i]){
                max=arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {10,20,50};
        //main.fun1(a);
        System.out.println(main.fun1(a));
    }
}
