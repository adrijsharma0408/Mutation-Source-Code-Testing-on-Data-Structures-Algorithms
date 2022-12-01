

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryExponentiationTest {
	@Test
	public void testCalculatePower() {
		assertEquals(1, BinaryExponentiation.calculatePower(1, 10000000));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 100000000));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 1000000000));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 10000000000L));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 100000000000L));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 1000000000000L));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 10000000000000L));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 100000000000000L));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 1000000000000000L));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 10000000000000000L));
		assertEquals(1, BinaryExponentiation.calculatePower(1, 100000000000000000L));

		BinaryExponentiation bn = new BinaryExponentiation();
		assertEquals(1, bn.power(1, 10000000));
		assertEquals(1, bn.power(1, 100000000));
		assertEquals(1, bn.power(1, 1000000000));
		assertEquals(1, bn.power(1, 10000000000L));
		assertEquals(1, bn.power(1, 100000000000L));
		assertEquals(1, bn.power(1, 1000000000000L));
		assertEquals(1, bn.power(1, 10000000000000L));
		assertEquals(1, bn.power(1, 100000000000000L));
		assertEquals(1, bn.power(1, 1000000000000000L));
		assertEquals(1, bn.power(1, 10000000000000000L));
		assertEquals(1, bn.power(1, 100000000000000000L));
	}
}