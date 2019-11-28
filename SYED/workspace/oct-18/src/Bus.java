
public interface Bus {
	default void  Bus() {
		System.out.println("construct");
	}
 default void move() {
	 System.out.println("bus");
 }
}
