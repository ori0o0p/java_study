package impl;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World!";
        String[] reverseArr = str.split("");

        System.out.println(reverse(reverseArr));
    }

    public static String reverse(String[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            String tmp = arr[first];
            arr[first] = arr[last];
            arr[last] = tmp;

            first++;
            last--;
        }

        return String.join("", arr);
    }

}
