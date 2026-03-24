class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        int k = arr.length;
        List<List<Integer>> li = new ArrayList<>();
		int n = 1<<k;
		for(int i=0;i<n;i++) {
			List<Integer> t = new ArrayList<Integer>();
			for(int j=0;j<k;j++) {
				if((i&(1<<j))!=0) {
					t.add(arr[j]);
				}
			}
			li.add(t);
		}
		return li;
    }
}