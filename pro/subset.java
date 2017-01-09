package guvi;

public class array {
	public static void main(String[] arg){
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2={8,9,7};
		System.out.println(containsAll(arr1,arr2));
		
	}

	private static boolean containsAll(int[] arr1, int[] arr2) {
		int count=0;
		for(int z:arr2){
			for(int x:arr1){
				if(z==x){
					count=count+1;
								}	
			}
			
		}
				if(count== arr2.length){
			return true;
		}else{
		return false;
	}

}
}
