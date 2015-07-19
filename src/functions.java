/*read me file is included and explains the requirements and other setup procedures*/
public class functions {
	//binarySearch return the found value	
	public  boolean binarySearch(float[] randarr,float value)
	{	
		if(binarySearch(randarr,0,randarr.length-1,value))
		{	//the key is present in the array
			return true;
		}
		else
		{	// the key is not present in the array
			return false;
		}
	}
	//private recursive call for the binary search function
	private  boolean binarySearch(float [] rand_arr,int first,int last, float key)
	{
		if(first>last)
		{	//impossible case in case of negative condition
			return false;
		}
		int middle= (first + last)/2;
		//get the root node
		if(rand_arr[middle] == key)
		{	//check if it is the root node	
			return true;
		}		
		else if(rand_arr[middle] < key)
		{	//check if key is less than the root then update the root node
			return binarySearch(rand_arr, middle+1, last, key);
		}
		else
		{	//check if it is greater than the root node then update the root node 
			return binarySearch(rand_arr,first, middle-1, key);
			
		}		
	}	
	//Reverse String returns the reversed string 
	public String ReverseString(String to_be_reversed)
	{	//initialize the string to null 
		if(to_be_reversed != null)
		{
		String reversed_string="";
		int length = to_be_reversed.length();
		for(int i= length-1; i>=0 ; i--)
		{
			//concatenate individually to the reversed string
			reversed_string = reversed_string + to_be_reversed.charAt(i);
		}
		return reversed_string;
		}	
		else 
		{
			return "The input is null";
		}
	}
}


