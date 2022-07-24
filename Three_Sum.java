import java.util.*;

class Three_Sum{
	
		public HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		
		public static void main(String[] args){
			Three_Sum ts = new Three_Sum();
			Scanner in = new Scanner(System.in);
			System.out.print("Enter values (ex 1,-2,0,1) > ");
			String s = in.nextLine();
			String[] sa = s.split(",");
			int[] nums = new int[sa.length];
			for(int i=0; i<sa.length; i++){
				nums[i] = Integer.parseInt(sa[i]);;
			}
			for(int i=0; i<nums.length; i++){
				ts.findAllPossibleCombos(i, nums);
			}
			ts.print();
		}
		
		private void findAllPossibleCombos(int i, int[] nums){
			for(int j=0; j<nums.length; j++){
				for(int k=0; k<nums.length; k++){
					if(i != j && i != k && j != k){
						int sum = nums[i] + nums[j] + nums[k];
						if(sum == 0){
							LinkedList<Integer> list = new LinkedList<Integer>();
							list.add(nums[i]);
							list.add(nums[j]);
							list.add(nums[k]);
							if(!map.containsValue(list)){
								map.put(i, list);
							}
						}	
					}
				}
			}
		}
		
		private void print(){
			if(map.isEmpty()){
				System.out.println("[]");
			}
			else{
				System.out.println(map.values());
			}
		}
}
