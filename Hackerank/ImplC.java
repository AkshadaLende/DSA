package Hackerank;

interface BaseI {
	void method();
}

class BaseC {
	public void method() {

		System.out.println("bad");
	}
}

class ImplC extends BaseC implements BaseI {
	public static void main(String[] s) {
		(new ImplC()).method();
	}
}
