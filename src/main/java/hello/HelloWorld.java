package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
	    System.out.println("This is test file demo");
      LocalTime currentTime = new LocalTime();
		  System.out.println("The current local time is: " + currentTime);
	    
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
