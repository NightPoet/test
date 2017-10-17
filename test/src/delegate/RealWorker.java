package delegate;

public class RealWorker implements WorkerInterface {
	public void doSomething(String name) {
		System.out.println("I am the real class I can do something for " + name);
	}
}
