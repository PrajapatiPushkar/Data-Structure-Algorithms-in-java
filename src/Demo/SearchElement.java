package Demo;

/*Search the given element x in the array.  if present then return the index else return - 1.
input : arr[] = {1,5,3}; x = 5
output : 1
*/

public class SearchElement {
    public static void main(String[] args) {
        System.out.println("Welcome to searching array indexes: ");
        int[] arr = {10, 5, 3, 6, 2, 8, 4};
        int x = 10;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        System.out.println("Found the element at index :" + ans );
    }
}
