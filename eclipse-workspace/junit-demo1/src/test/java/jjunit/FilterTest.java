package jjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FilterTest {

	@Test
	public void testmyFilter() {
		DBUitl db=mock(DBUitl.class);
		
		Filter f =new Filter(db);
		
		when(db.getNames()).thenReturn(Arrays.asList("Amith","BAnu","Ankith","Sumith"));
		
		List<String> myList=f.myFilter();
		assertEquals(2,myList.size());
	}
}
