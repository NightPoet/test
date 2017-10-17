package delegate;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		Delegate delegate = new Delegate();
		WorkerInterface dynamiceProxy = (WorkerInterface) Proxy.newProxyInstance(
				WorkerInterface.class.getClassLoader(), new Class[] { WorkerInterface.class },
				delegate);

		dynamiceProxy.doSomething("Howard");
	}
}