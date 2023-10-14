package seminar_4;

public class MyStack {
    private String[] arr = new String[10];
    private int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(String s){
        if (size >= arr.length){
            String[] arr2 = new String[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = s;
    }

    String peek(){
        return arr[size-1];
    }

    String pop(){
        return arr[--size];
    }
}
