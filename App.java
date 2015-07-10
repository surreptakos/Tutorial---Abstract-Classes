
public class App {

	public static void main(String[] args) {
		// Abstract class acts as a base for other classes
		// It can't do anything on its own (can't make an instance of it)
		// Can't instantiate abstract classes
		
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		car1.run();
		
		//Not allowed:
		// Machine machine1 = new Machine();
		
		
		/// When to use abstract class vs interface
		// 		Abstract classes are more strict/stronger statement
		//		Abstract classes define the structure/type the child class will be
		//		Classes can only have one parent class, but they can have multiple 
		//			interfaces
		//		Interfaces only require that the classes which implement them have 
		//			their method headers, like showInfo()
		//		A parent (abstract) class defines what the child class is, while
		//			an interface defines what an implementing class does
		//		You can actually code functionality in the abstract class
		
	}

}
