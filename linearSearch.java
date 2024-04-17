import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6,7};
        System.out.println(search(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }
    static boolean search(int arr[],int target,int index){
        if(index == arr.length - 1){
            return false;
        }

        return arr[index] == target || search(arr, target, ++index);
    }
    static int findIndex(int arr[], int target,int index){
        if(index == arr.length - 1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target , ++index);
    }
    static ArrayList <Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[], int target,int index){
        if(index == arr.length - 1){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target , ++index);
    }


    // goal--> return the list
    //         don't take it in argument
    static void findAllIndex2(int arr[], int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length - 1){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target , ++index);
    }


}
