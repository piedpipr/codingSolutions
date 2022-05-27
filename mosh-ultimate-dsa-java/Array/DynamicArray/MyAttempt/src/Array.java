import java.util.Arrays;

public class Array {
    int[] myArray;
    int[] oldArray;
    public Array(int numberOfElements) {
        myArray = new int[numberOfElements];
    }
    public void insert(int element) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i]=element;
                break;
            }
            else if( i == myArray.length-1){
                oldArray = myArray;
                myArray = new int[oldArray.length + 1];
                for (int j = 0; j < oldArray.length; j++) myArray[j] 
= oldArray[j];
                myArray[i+1]=element;
                break;
            }

        }
    }
    public void removeAt(int index){
        oldArray = new int[myArray.length-1];
        for (int i = 0; i < oldArray.length; i++){
            if (i < index) {
                oldArray[i] = myArray[i];
            }
            else {
                oldArray[i] = myArray[i+1];
            }
        }
        myArray = oldArray;
    }
    public void print(){
        System.out.println(Arrays.toString(myArray));
    }
    public int indexOf(int i){
        return myArray[i];
    }


}
