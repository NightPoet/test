package delegate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;  

public class Delegate implements InvocationHandler {

	private RealWorker realWorker = new RealWorker();
	
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("I am the delegate I can do something before the function.");
		arg1.invoke(realWorker, arg2);
		System.out.println("I am the delegate I can do something after the function.");
		return null;
	}

}
