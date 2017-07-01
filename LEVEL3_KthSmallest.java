/**
 * Created by alex_
 * Checkpoint: Level 3
 * Kth Smallest Element in the ArrayBookmark Suggest Edit
 */

public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int kthsmallest(final List<Integer> a, int k) {
	    	    
	    PriorityQueue<Integer> mheap = new PriorityQueue(k,Collections.reverseOrder());
	    for(int i=0;i<a.size();i++){
	        mheap.offer(a.get(i));
	        
	        if(mheap.size()>k){
	            mheap.poll();
	        }
	    }
	    
	    return mheap.peek();
	     
	}
}
