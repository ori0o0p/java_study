package impl;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World!";
        char[] reverseArr = str.toCharArray();

        System.out.println(reverse(reverseArr));
    }

    public static String reverse(char[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            char tmp = arr[first];
            arr[first] = arr[last];
            arr[last] = tmp;

            first++;
            last--;
        }

        return new String(arr);
    }

}
