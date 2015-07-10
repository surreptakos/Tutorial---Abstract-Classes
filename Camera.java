
public class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Starting camera.");
	}

	@Override
	public void doStuff() {
		System.out.println("Doing stuff.");
	}

	@Override
	public void shutdown() {
		System.out.println("Shutting off camera");
	}

}
