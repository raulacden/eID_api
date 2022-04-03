package rsp.eid.api.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilsTests {


	@Test
	void calculateBiggestDifference_emptyInputList() {
		List<Integer> list = Collections.emptyList();
		int diff = Utils.calculateBiggestDifference(list);
		assertEquals(0, diff);
	}
	
	@Test
	void calculateBiggestDifference_oneValueInputList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		int diff = Utils.calculateBiggestDifference(list);
		assertEquals(0, diff);
	}
	
	@Test
	void calculateBiggestDifference_exampleOneInputList() {
		List<Integer> list = List.of(1,1,1);
		int diff = Utils.calculateBiggestDifference(list);
		assertEquals(0, diff);
	}
	
	@Test
	void calculateBiggestDifference_exampleTwoInputList() {
		List<Integer> list = List.of(1,2,3);
		int diff = Utils.calculateBiggestDifference(list);
		assertEquals(2, diff);
	}
	
	@Test
	void calculateBiggestDifference_exampleThreeInputList() {
		List<Integer> list = List.of(3,2,1);
		int diff = Utils.calculateBiggestDifference(list);
		assertEquals(0, diff);
	}
	
	@Test
	void calculateBiggestDifference_exampleFourInputList() {
		List<Integer> list = List.of(1,2,3,4);
		int diff = Utils.calculateBiggestDifference(list);
		assertEquals(3, diff);
	}

}
