package tw.jimmy.lab;

public interface Test {
	default void showDefault() {
		System.out.println("This is Test.showDefault().");
	}

	static void showStatic() {
		System.out.println("This is Test.showStatic()");
	}

	void showUnimplement();
}
