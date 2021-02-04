
// Author Pranjal Bhardwaj
// Enrollment E19CSE432

public class BubbleSort {
	public static void main(String[] args) {
		int temp[] = {9,8,7,6,5,4,3,2,1,0};
		System.out.print("Unsorted Array: ");
		for(int i = 0;i < temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		for(int i = 0;i < temp.length;i++) {
			for(int j = 0;j < temp.length-1;j++) {
				if(temp[j] > temp[j+1]) {
					int flag = temp[j];
					temp[j] = temp[j+1];
					temp[j+1] = flag;
				}
			}
		}
		System.out.print("\nSorted Array: ");
		for(int i = 0;i < temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}
}
