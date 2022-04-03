package rsp.eid.api.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilsTests {


	@Test
	void calculateBiggestDifference_emptyInputList() {
		assertEquals(0, Utils.calculateBiggestDifference(Collections.emptyList()));
	}
	
	@Test
	void calculateBiggestDifference_oneValueInputList() {
		assertEquals(0, Utils.calculateBiggestDifference(List.of(1)));
	}
	
	@Test
	void calculateBiggestDifference_exampleOneInputList() {
		assertEquals(0, Utils.calculateBiggestDifference(List.of(1,1,1)));
	}
	
	@Test
	void calculateBiggestDifference_exampleTwoInputList() {
		assertEquals(2, Utils.calculateBiggestDifference(List.of(1,2,3)));
	}
	
	@Test
	void calculateBiggestDifference_exampleThreeInputList() {
		assertEquals(0, Utils.calculateBiggestDifference(List.of(3,2,1)));
	}
	
	@Test
	void calculateBiggestDifference_exampleFourInputList() {
		assertEquals(3, Utils.calculateBiggestDifference(List.of(1,2,3,4)));
	}

}
