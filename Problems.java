public class Problems {

	 public static void main(String[] args) {
	        int[] arr = {27, 11, 25, 4, 25, 10, 66, 6}; 
	        int n = arr.length; 
	        int sum = SumOfArray(arr, n); 
	        System.out.println("Sum of array: " + sum);
	        PrintCount(arr, n);
	        String name = "sravani";
	        char ch = 'i';
	        int result = findingFirstOccurance(name,ch);
	        System.out.println(result);
	    }

	    
	    public static int SumOfArray(int[] arr, int n) {
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum = sum + arr[i];  
	        }
	        return sum;  
	    }
	    public static void PrintCount(int[] arr, int n) {
	        int evenCount = 0;
	        int oddCount = 0;
	        
	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 2 == 0) {
	                evenCount++;  
	            } else {
	                oddCount++;   
	            }
	        }
	        
	        System.out.println("Even number count: " + evenCount);
	        System.out.println("Odd number count: " + oddCount);
	    }
	    public static int findingFirstOccurance(String name, char ch) { 
	    	char[] chArray = name.toCharArray();
	    	int n = chArray.length;
	    	for(int i = 0;i < n;i++) {
	    		if(chArray[i]==ch) {
	    			return i;
	    		}
	    	}
	    	return -1;
	    }
}
