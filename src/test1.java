import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test1 {

	@Test
	void test() {
		int[] arr = {14};

		int[] arr1 = {1,4,5,7,12,23,44,67,89,100,120,121,122};
		
		int[] arr2 = {-10,-4,5,12,23,44,67,89,100,120,121,122,200,210,
				222,300,301,303,500};
		
		assertEquals(sortu5recursion.some_search(arr, 10), -1);
		assertEquals(sortu5recursion.some_search(arr, 14), 0);
		
		assertEquals(sortu5recursion.some_search(arr1, 0), -1);
		assertEquals(sortu5recursion.some_search(arr1, 150), -1);
		assertEquals(sortu5recursion.some_search(arr1, 4), 1);
		assertEquals(sortu5recursion.some_search(arr1, 121), 11);
		assertEquals(sortu5recursion.some_search(arr1, 23), 5);
		
		assertEquals(sortu5recursion.some_search(arr2, 55), -1);
		assertEquals(sortu5recursion.some_search(arr2, 12), 3);
	}

}
