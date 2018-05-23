package com.java.ds;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testQueueAddItemWhenQisEmpty() {
		QueueDS q = new QueueDS(10);
		assertTrue(q.add(10));
		
	}

}
