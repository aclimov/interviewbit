/**
 * Created by alex_
 * Checkpoint: Level 5
 * Unique Permutations
 */

 public class Solution {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    
	    if(a.size()<2){
	        res.add(a);
	        return res;
	    }
	    
	    //Collections.sort(a);
	    
	    
	    HashSet<ArrayList<Integer>> h  = new HashSet<ArrayList<Integer>>();
	    
	    gen(a, h, 0);
	    
	    Iterator it= h.iterator();
	    while(it.hasNext()){
	        res.add((ArrayList<Integer>)it.next());
	    }
	    return res;
	    
	}
	
 public static void gen(ArrayList<Integer>a, HashSet res, int i){
        if(i==a.size()-1){
           if(!res.contains(a)){
                res.add(new ArrayList(a));
            }
            return;
        }

        for(int j=i;j<a.size();j++){
            Collections.swap(a,i,j);
            gen(a,res,i+1);
            Collections.swap(a,i,j);
        }
    }
}
