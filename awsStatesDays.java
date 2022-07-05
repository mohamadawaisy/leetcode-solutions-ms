// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;
import java.util.ArrayList;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
        int n = states.length;
        if(n<3) return arrayToList(states);
        if(days==0) return arrayToList(states);
        // WRITE YOUR CODE HERE
        int[] newStates = states.clone();
        if(states[1]==0) {
            newStates[0]=0;
        } else {
            newStates[0]=1;
        }
        for(int i=0;i<n-2;i++) {
            if(states[i]==states[i+2]) {
                newStates[i+1]=0;
            } else {
                newStates[i+1]=1;
            }
        }
        if(states[n-2]==0) {
            newStates[n-1]=0;
        } else {
            newStates[n-1]=1;
        }
        List<Integer> list = cellCompete(newStates,days-1);
        return list;
    }
    // METHOD SIGNATURE ENDS

    private List<Integer> arrayToList(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for(int val : arr) {
            list.add(val);
        }
        return list;
    }
}
