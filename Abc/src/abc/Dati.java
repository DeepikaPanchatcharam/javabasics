package abc;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dati {
	public static void main(String[]args) {
		LocalTime obj=LocalTime.now();
		System.out.println(obj);
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDateTime dat=LocalDateTime.now();
		System.out.println(dat);
		
	}

}
