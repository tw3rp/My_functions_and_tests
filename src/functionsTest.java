//the test cases names are self explanatory 

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class functionsTest {
	static int size=10; //initialize the size of the array
	static float[] rand_arr = new float[size];//allocate the new array
	private functions test;
	
	@Before
	public void setUp() throws Exception 
		{  //create a new instance of functions class
			test = new functions();
	    }
	
	@Test
	public final void testBinarySearch_if_it_is_the_first_element() 
	{
			Random r = new Random(); 
			for(int i=0; i<rand_arr.length; i++)
			{	
				rand_arr[i]=i+r.nextFloat(); 
				
			}
			System.out.println("searching for the first element "+rand_arr[0]+" in " + java.util.Arrays.toString(rand_arr));
			assertEquals(true,test.binarySearch(rand_arr,rand_arr[0]));		
	}
	@Test
	public final void testBinarySearch_if_it_is_the_last_element() 
	{
		System.out.println("searching for the last element "+rand_arr[size-1]+" in " + java.util.Arrays.toString(rand_arr));
		assertEquals(true,test.binarySearch(rand_arr,rand_arr[size-1]));
	}
	
	@Test
	public final void testBinarySearch_if_it_is_the_middle_element_even() 
	{
		System.out.println("searching for the middle element in even array "+rand_arr[size/2]+" in " + java.util.Arrays.toString(rand_arr));
		assertEquals(true,test.binarySearch(rand_arr,rand_arr[size/2]));
	}
	
	@Test
	public final void testBinarySearch_if_it_is_the_middle_element_odd() 
	{
		float[] rand_arr_odd = new float[size+1]; 
	    //Since the problem statement was for arrays and not array list increasing the size by 1 so we get an odd 
	    //sized array
	    Random r = new Random(); 
	    for(int i=0; i<rand_arr_odd.length; i++)
		{	
			rand_arr_odd[i]=i+r.nextFloat(); 
		}
	    System.out.println("searching for the middle element in odd array "+rand_arr_odd[size-1]+" in " + java.util.Arrays.toString(rand_arr_odd));
		assertEquals(true,test.binarySearch(rand_arr_odd,rand_arr_odd[size/2]));
	}
	
	@Test
	public final void testBinarySearch_if_it_is_in_the_odd_numbered_array() {
	    float[] rand_arr_odd = new float[size+1]; 
	    //Since the problem statement was for arrays and not array lists increasing the size by 1 so we get an odd 
	    //sized array
	    Random r = new Random(); 
	    for(int i=0; i<rand_arr_odd.length; i++)
		{	
			rand_arr_odd[i]=i+r.nextFloat(); 
		}
	    System.out.println("searching for the random element in odd array "+rand_arr_odd[size-1]+" in " + java.util.Arrays.toString(rand_arr_odd));
		assertEquals(true,test.binarySearch(rand_arr_odd,rand_arr_odd[size-1])); 
	}
	
	@Test
	public final void testBinarySearch_if_it_is_the_even_numbered_array() 
	{
		System.out.println("searching for the random element in even array "+rand_arr[size-1]+" in " + java.util.Arrays.toString(rand_arr));
		assertEquals(true,test.binarySearch(rand_arr,rand_arr[size-1]));
	}
	
	@Test
	public final void testBinarySearch_returns_true_if_every_element_present() 
	{
		for (int i = 0; i < rand_arr.length; i++) 
		{
        assertEquals(true,test.binarySearch(rand_arr,rand_arr[i]));
		}
	}
	
	@Test
	public final void testBinarySearch_returns_false_if_not_present_in_any_index() 
	{
		for (int i = 0; i < rand_arr.length; i++) 
		{
        assertEquals(false,test.binarySearch(rand_arr,3));
        }
	}
	
	
	@Test
	public final void testReverseString_for_a_lower_case() 
	{
		String reverse = test.ReverseString("google");
		assertEquals("elgoog",reverse);
	}
	
	@Test
	public final void testReverseString_for_single_space() 
	{
		String reverse = test.ReverseString("G O O G L E");
		assertEquals("E L G O O G",reverse);
	}
	
	@Test
	public final void testReverseString_for_special_character() 
	{
		String reverse = test.ReverseString("G O O G L E@");
		assertEquals("@E L G O O G",reverse);
	}
	
	@Test
	public final void testReverseString_return_false_if_it_doesnt_match() 
	{
		String reverse = test.ReverseString("G O O G L E@");
	 assertNotEquals("@E L GO O G",reverse);
	 //asserts not equals becomes true
	}
	
	@Test
	public final void testReverseString_with_slash_tags() {
		String reverse = test.ReverseString("G O O G L E@\n");
		 assertEquals("\n@E L G O O G",reverse);
	}
	
	@Test
	public final void testReverseString_with_zero_length() {
		String reverse = test.ReverseString("");
		 assertEquals("",reverse);
	}
	
	@Test
	public final void testReverseString_repeated_words() {
		String reverse = test.ReverseString("I am repeated repeated");
		 assertEquals("detaeper detaeper ma I",reverse);
	}
	
	@Test
	public final void testReverseString_with_null() {
		String reverse = test.ReverseString(null);
		assertEquals("The input is null",reverse);
	}
	
	@Test
	public final void testReverseString_check_for_just_spaces() {
		String reverse = test.ReverseString("           ");
		assertEquals("           ",reverse);
	}
	
	
	
	
}
