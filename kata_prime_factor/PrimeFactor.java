import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimeFactor {

	public List<Integer> getFactors(int i) {
		List<Integer> list = new ArrayList<>();	
		int temp = 2;
		while (temp < i) {
			while (i % temp == 0) {
				list.add(temp);
				i = i / temp;
			}
			temp++;
		}	
		
		if (i >1){
			list.add(i);
		}
		return list;
	}

}
