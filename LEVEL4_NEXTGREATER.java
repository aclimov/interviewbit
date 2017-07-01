/**
 * Created by alex_
 * Checkpoint: Level 4
 * NEXTGREATER
 */

 public class Solution {
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
	    ArrayList<Integer> res = new ArrayList();
	    
	    if(a==null||a.size()==0) return res;
	    if(a.size()==1) return new ArrayList(Arrays.asList(-1));
	    
	    
	    Deque<Integer> q = new LinkedList<Integer>();
	    
	    int i=a.size()-1;
	    
	     while(i>=0){
	         int v = a.get(i);
	         while(!q.isEmpty()&&q.peek()<=v){
	           q.pop();
	         } 
	         
	         if(q.isEmpty()){
	           res.add(-1);
	           q.push(v);
	       }else{
	           res.add(q.peek());
	           q.push(v);
	       }
	       i--;
	    }
	    
	    Collections.reverse(res);
	    return res;
	}
}
