/**
 * Created by alex_
 * Checkpoint: Level 3
 * NUMRANGE
 */

public class Solution {
	public int numRange(ArrayList<Integer> a, int b, int c) {
	    int count=0;
        Deque<Integer> q = new LinkedList<Integer>();
	    
	    if(a.size()==0) return count;
	    if(a.size()==1&& a.get(0)>=b&&a.get(0)<=c){
	        return 1;
	    }
        
       int sum=0;
       for(int i=0;i<a.size();i++){
           int v = a.get(i);
           if(v>c){continue;}
           
           sum = v;
           
           if(v>=b&&v<=c){
               count++;
           }
           
           for(int j=i+ 1;j<a.size();j++){
               int x = a.get(j);
               
               if(x>c){
                   break;
               }
               sum+=x;
               if(sum>=b&&sum<=c){
                   count++;
               }else if(sum>c){
                   break;
               }
           }           
       }
        
	    return count;
	}
	
	
}
