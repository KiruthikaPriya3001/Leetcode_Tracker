// Last updated: 8/12/2026, 12:25:01 PM
class Solution {
	public int arrayNesting(int[] nums) {

		int max=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=-1){
				int length=0;
				int pos=i;
				while(nums[pos]!=-1){
					length++;
					int v=nums[pos];
					nums[pos]=-1;
					pos=v;
				}

				max=Math.max(length,max);

				if(max==nums.length) return max;
			}

		}

		return max!=0?max:1;
	}
}