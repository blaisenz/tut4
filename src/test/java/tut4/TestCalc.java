package tut4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalc {

	@Test
	void test() {
		assert Calc.add(1,3)==5;
		assert Calc.subtract(4,1)==3;
	}

}
