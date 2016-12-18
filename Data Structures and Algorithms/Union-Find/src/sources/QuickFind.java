package sources;

/**
 * Data Structure: Integer array of length N
 * Interpretation: Objects p and q are connected if they have the same ID
 * */
public class QuickFind {
	
	private int ids[];
	
	public QuickFind(int l){
		ids =  new int[l];
		for(int i = 0; i < ids.length; i++)
			ids[i] = l;
	}
	//2 array accesses
	public boolean find(int p, int q){
		return ids[p] == ids[q];
	}
	//2N+2 array accesses at most
	public void union(int p, int q){
		int pid = ids[p];
		int qid = ids[q];
		for(int i = 0; i < ids.length; i++)
			if(ids[i] == pid)
				ids[i] = qid;
	}	
}