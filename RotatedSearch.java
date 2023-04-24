public class RotatedSearch {

    public static void main(String args[]) {
        int[] inputArray = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(getIndex(inputArray, target));
    }

    private static int getIndex(int[] inputArray, int target) {
        if(inputArray.length == 0)
            return -1;
        int start = 0;
        int end = inputArray.length - 1;
        while(start <= end)  {
            int mid = (start+end)/2;
            if(target == inputArray[mid]) {
                return mid;
            }
            if(inputArray[start] < inputArray[mid]) {
                if(target >= inputArray[start] && target < inputArray[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            } else{
                if(target > inputArray[mid] && target <= inputArray[end]){
                    start = mid+1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}

