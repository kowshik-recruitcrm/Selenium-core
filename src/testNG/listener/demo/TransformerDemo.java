package testNG.listener.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TransformerDemo implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// not implemented
		
		String testCaseToDisable = "logout";
		
		if(testMethod.getName().equalsIgnoreCase(testCaseToDisable)) {
			
			annotation.setEnabled(false);
			
		}
	}

}
/*
The TransformerDemo class implements the IAnnotationTransformer interface from TestNG. This interface allows programmatically altering the behavior of test methods at runtime by modifying their associated annotations. In this specific implementation, the logic disables a specific test case (logout) dynamically during the test execution phase.

Code Walkthrough
Interface Implementation

The IAnnotationTransformer interface contains a single method:
java
Copy code
void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod);
This method is called by TestNG before any test method is executed.
The ITestAnnotation object allows access to modify test-related attributes dynamically, such as:
Enabling or disabling a test case.
Setting priority or timeout.
Assigning retry logic.
Logic Explanation

java
Copy code
String testCaseToDisable = "logout";
This variable holds the name of the test case to disable (logout in this example).
java
Copy code
if (testMethod.getName().equalsIgnoreCase(testCaseToDisable)) {
    annotation.setEnabled(false);
}
The testMethod parameter contains metadata about the test method currently being inspected.
testMethod.getName() retrieves the name of the method.
If the name matches the test case to be disabled (logout), the setEnabled(false) method is called on the annotation object, effectively disabling the test.
Result

Any test case with the name logout will not run when TestNG executes the suite because the annotation has been dynamically modified to mark it as disabled.

*/