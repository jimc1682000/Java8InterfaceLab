package tw.jimmy.lab;

public class TestImpl implements Test {

	@Override
	public void showUnimplement() {
		System.out.println("This is TestImpl.showUnimplement().");
	}

	public static void showStatic() {
		System.out.println("This is TestImpl.showStatic().");
	}

}
