package tqs.tomas.ua.TqsStack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.function.Executable;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TqsStackApplicationTests {

	TqsStack tqsStack = new TqsStack();

	@Test
	@DisplayName("A stack is empty on construction")
	void assertIsEmpty() {
		assertTrue(tqsStack.isEmpty());
	}

	@Test
	@DisplayName("A stack has size 0 on construction")
	void assertSizeZero() {
		assertEquals(0, tqsStack.size());
	}

	@Test
	@DisplayName("After n pushes to an empty stack, n > 0, the stack is not empty and its size is n")
	void assertNPushes() {
		tqsStack.push(2.0);
		assertFalse(tqsStack.isEmpty());
		assertEquals(1, tqsStack.size());
	}

	@Test
	@DisplayName("If one pushes x then pops, the value popped is x")
	void assertOnePushOnePop() {
		tqsStack.push(2.0);
		assertEquals(2.0, tqsStack.pop());
	}

	@Test
	@DisplayName("If one pushes x then peeks, the value returned is x, but the size stays the same")
	void assertOnePushOnePeek() {
		tqsStack.push(2.0);
		assertEquals(2.0, tqsStack.peek());
		assertEquals(1, tqsStack.size());
	}

	@Test
	@DisplayName("If the size is n, then after n pops, the stack is empty and has a size 0")
	void assertNPops() {
		tqsStack.push(2.0);
		tqsStack.pop();
		assertTrue(tqsStack.isEmpty());
		assertEquals(0, tqsStack.size());
	}

	@Test
	@DisplayName("Popping from an empty stack does throw a NoSuchElementException")
	void assertEmptyPop() {
		assertThrows(NoSuchElementException.class, new Executable() {
			public void execute() throws Throwable {
				tqsStack.pop();
			}
		});	}

	@Test
	@DisplayName("Popping from an empty stack does throw a NoSuchElementException")
	void assertEmptyPeek() {
		assertThrows(NoSuchElementException.class, new Executable() {
			public void execute() throws Throwable {
				tqsStack.peek();
			}
		});	}

	@Test
	@DisplayName("Popping from an empty stack does throw a NoSuchElementException")
	void assertFullStack() {
		TqsStack tqsStack_bounded = new TqsStack(1);
		tqsStack_bounded.push(1.0);
		assertThrows(IllegalStateException.class, new Executable() {
			public void execute() throws Throwable {
				tqsStack_bounded.push(1.0);
			}
		});	}
}
