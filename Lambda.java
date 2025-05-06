package tb課題;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

		IntStream.rangeClosed(1, 9999)
				.forEach(i -> {
					String time = LocalTime.now().format(formatter);
					System.out.println(time + " " + i);
				});

	}

}
