package sources;
/**
 * Data Structure: Array of N elements
 * Interpretation: Set the id of p's root to the id of q's root
 * */
public class QuickUnion {
	
	private int ids[];
	//N array accesses
	public QuickUnion(int l){
		ids =  new int[l];
		for(int i = 0; i < ids.length; i++)
			ids[i] = i;
	}
	//Depth of p array accesses
	public int root(int p){
		while(ids[p]!=p)
			p = ids[p];
		return p;
	}
	//Depth of p array accesses, same as root
	public boolean find(int p, int q){
		return root(p) == root(q);
	}
	//Depth of p array accesses, same as root
	public void union(int p, int q){
		int p_root = root(p);
		int q_root = root(q);
		ids[p_root] = q_root;
	}
}
