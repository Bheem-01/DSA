import java.util.*;
public class LinearSearch{
    public static int linear_Search(int number [], int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {10,20,30,40,50};
        int key = 40;
        int index = linear_Search(number, key);

        if(index == -1){
            System.out.println("Not Found");
        }else {
            System.out.println("Key is at index: "+ index);
        }
    }
}