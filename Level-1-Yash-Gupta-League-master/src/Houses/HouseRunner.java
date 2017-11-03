package Houses;
public class HouseRunner {
	public static void main(String[] args) {
		HouseBuilder builder = new HouseBuilder();
		builder.moveToBottomLeft();
		for (int i = 0; i < 10; i++) {
			builder.colorHeight("small");
		}
}
}
