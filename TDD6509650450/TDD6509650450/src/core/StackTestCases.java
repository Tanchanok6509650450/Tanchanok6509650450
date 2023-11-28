package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {
	//TC1
		public void testCreateNewEmptyStack() {
			Stack st1 = new Stack(10);
			assertEquals(true,st1.isEmpty());
			
			assertEquals(0,st1.getSize());
		}

	//TC2
        public void testPushElmToTop() {
        	//create new stack
            Stack st2 = new Stack(10);
            Object element = "TestElement";
            try {
                st2.push(element);
                assertEquals(false, st2.isEmpty());
                assertEquals(element, st2.top());
            } catch (Exception e) {
                fail("Unexpected exception: " + e.getMessage());
            }
        }
        
    //TC3
        public void testPushMustBeSameType() {
        	//create new stack
            Stack st3 = new Stack(10);

            try {
                st3.push(13);
                st3.push(14);
                st3.push(15);
                assertEquals(false, st3.isEmpty());
                assertEquals(15, st3.top());

                st3.push("test");
                fail("Expected Error Not Thrown");
            } catch (Exception e) {
                assertEquals("All elements in the stack must be of the same type", e.getMessage());
            }
        }
      //TC4
        public void testLestInFirstOut() {
        	Stack st4 = new Stack(4);
        	try {
				st4.push(1);
				st4.push(2);
				assertEquals(2, st4.top());
				assertEquals(2, st4.pop());
				assertEquals(1, st4.pop());
			} catch (Exception e) {
				fail("Unexpected exception: " + e.getMessage());
			}

        }

        //TC5
        public void testCapacity() {
        	
        	Stack st5 = new Stack(5);

        	try {
				st5.push(1);
				st5.push(2);
				st5.push(3);
				st5.push(4);
				st5.push(5);
				st5.push(6);
				fail("Element Overflow (Stack size 5 but can add 6 Element)");
			} catch (Exception e) {
				assertEquals("Stack is Full", e.getMessage());
			}
        }
}

