package YuanFuDao;

import java.util.ArrayList;
import java.util.List;

public class CodeExample1 {
	public static int findMaxCrossingSubArray(List<Integer> array){
		int len = array.size();
		// 求整个数组的和,O(n)
		int sum = 0;
		for(int i = 0; i < len; i++){
			sum += array.get(i);
		}
		if(sum == 0){
			return len;
		}
		for(int j = 0; j < len; j++){
			if(array.get(j) * sum > 0){
				sum = sum - array.get(j);
				if(sum == 0){
					return len - j - 1;
			}
			}else{
				for(int k = len - 1; k > j; k--){
					sum -= array.get(k);
					if(sum == 0){
						return len - j - (len - k);
					}
				}
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(-1);
		arr.add(1);
		arr.add(1);
		System.out.println(findMaxCrossingSubArray(arr));
	}
}
