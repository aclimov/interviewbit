/**
 * Created by alex_
 * Checkpoint: Level 5
 * Longest Consecutive
 */

 public class Solution {
	public int longestConsecutive(final List<Integer> a) {
	    if(a.size()<2){return a.size();}
	   HashSet<Integer> h = new HashSet();
	   
	    for(int i=0;i<a.size();i++){
	        h.add(a.get(i));
	    }
	    
	    
	    int i=0;
	    int maxlen=1;
	    
	    while(i<a.size()){
	        int counter=1;
	        int val = a.get(i);
	        while(h.contains(--val)){
	            counter++;
	            h.remove(val);
	        }
	        val = a.get(i);
	        while(h.contains(++val)){
	            counter++;
	            h.remove(val);
	        }
	        
	        maxlen = Math.max(maxlen, counter);
	        i++;
	    }
	    
	    return maxlen;
	    
	}
}
