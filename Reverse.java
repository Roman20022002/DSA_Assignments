import java.util.Arrays;

public class Reverse extends Stack<E> {

    public static int[] reverse(int[] list) {
        Stack<Integer> stack = new Stack<>(list.length);
        for(int i = 0; i < list.length; i++){
            stack.push(list[i]);
        }
        int[] reversedList = new int[list.length];
        for(int i = 0; i < stack.size(); i++){
            reversedList[i] = stack.pop();
        }
        list = reversedList;

        return list;
    }

    public static void main(String[] args) {
        // Every value in the argument array is a single element in the list
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        
        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }
}
