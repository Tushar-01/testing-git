// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the count 
// of required triplets 
static int CountTriplets(int[] arr, int n) 
{ 
    int ans = 0; 
    for (int i = 0; i < n - 1; i++) 
    { 
  
        // First element of the 
        // current sub-array 
        int first = arr[i]; 
        for (int j = i + 1; j < n; j++)  
        { 
  
            // XOR every element of 
            // the current sub-array 
            first ^= arr[j]; 
  
            // If the XOR becomes 0 then 
            // update the count of triplets 
            if (first == 0) 
                ans += (j - i); 
        } 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = {2, 5, 6, 4, 2}; 
    int n = arr.length; 
  
    System.out.println(CountTriplets(arr, n)); 
} 
}  
