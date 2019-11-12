import java.util.stream.IntStream;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.rangeClosed(1, 5)
			.forEach(i -> System.out.println(i));
	}

}
