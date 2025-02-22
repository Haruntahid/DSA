public class Binary {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9};

        int target = 7;
        int first = arr[0];
        int last = arr[arr.length-1];

        while (first < last) {
            int mid = (first + last)/2;
            if (arr[mid] == target) {
                System.out.println("Target found at index " + mid);
                break;
            }
            else if (arr[mid] < target) {
                first = mid + 1;
                if (arr[first] == target) {
                    System.out.println("Target found at index " + first);
                    break;
                }
            }
            else {
                last = mid - 1;
                if (arr[last] == target) {
                    System.out.println("Target found at index " + last);
                    break;
                }
            }
        }

    }
}
