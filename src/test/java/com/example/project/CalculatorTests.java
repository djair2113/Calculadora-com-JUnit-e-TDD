/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.soma(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void soma(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.soma(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
	@Test
	@DisplayName("1 - 1 = 0")
	void subtractsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.sub(1, 1), "1 - 1 should equal 0");
	}
	@Test
	@DisplayName("4 / 2  = 2")
	void divisionsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.divi(4, 2), "4/2  should equal 2");
	}
	@Test
	@DisplayName("2 * 5  = 10")
	void mutiplicationsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.muti(2, 5), "2 * 5 should equal 10");
	}
}

