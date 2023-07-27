package curs16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {

	@Test(invocationCount = 4)
	public void printCeva() {
		System.out.println("TestNg print");
	}
	
	@RunMultipleTimes(howManyTimes = 4)
	public void printAltceva() {
		System.out.println("Custom print");
	}
	
	@BeforeClass
	public void setup() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		TestExample testExample = new TestExample();
		
		for(Method method : testExample.getClass().getDeclaredMethods()) {
			
			if(method.isAnnotationPresent(RunMultipleTimes.class)) {
				
				RunMultipleTimes annotation = method.getAnnotation(RunMultipleTimes.class);
			
				for(int i=0; i<annotation.howManyTimes();i++) {
				
					method.invoke(testExample);

			}	
			
			
			}
			
			
		}
		
		
	}
	
}
