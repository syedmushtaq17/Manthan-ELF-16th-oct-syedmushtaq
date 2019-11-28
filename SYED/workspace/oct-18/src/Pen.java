
public abstract class Pen {

	int cost;
	void open() {
		System.out.println("opeen");
	}
	void close() {
		System.out.println("close");
	}
	abstract void color();
	abstract void write();
}
