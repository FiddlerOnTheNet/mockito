/*
 * Lauren Martini
 * lmartini
 * CSE 403
 * HW3: Test generation
 * 
 * A new test added to the Mockito unit test suite. This
 * should increase the test coverage for "Sets.java" from
 * 50% branch coverage to 100% branch coverage.
 */
package org.mockito.internal.util.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class LmartiniSetTest {

	/* Pass the newSet method a null value, to test that
	 * an IllegalArgumentException is thrown.
	*/
    @Test(expected = IllegalArgumentException.class)
    public void checkNewSetException() throws Exception {
        Set<Integer> badSet = new Set<Integer>(null);
    }

}
