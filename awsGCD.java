class GCD
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        if(arr.length==1) return arr[0];
        // WRITE YOUR CODE HERE
        int min = arr[0];
        for(int elem : arr) {
            min=Math.min(min,elem);
        }
        while(!GCD(min,arr)) {
            min--;
        }
        return min;
    }
    // METHOD SIGNATURE ENDS
    boolean GCD(int num, int[] arr) {
        for(int elem:arr) {
            if(elem%num!=0) return false;
        }
        return true;
    }
