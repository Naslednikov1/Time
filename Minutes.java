import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Minutes {
    public static void main(String[] args) throws ParseException {
        Scanner var = new Scanner(System.in);
        System.out.println("Введите дату и время окончания пары в формате день.месяц.год часы:минуты");
        String EndTime = var.nextLine(); // Считываю дату и время
        Date StartTime = new Date();
        long StartTimeInMilliseconds = StartTime.getTime(); // Беру миллисекунды с 00:00:00 1 января 1970 до настоящего момента
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date EndTimeInDateClass = sdf.parse(EndTime); // Конвертирую введенные данные в класс Date
        long EndTimeInMilliseconds = EndTimeInDateClass.getTime(); // Получаю введенные данные в виде миллисекунд, прошедших с 00:00:00 1 января 1970
        long AllMilliseconds = EndTimeInMilliseconds - StartTimeInMilliseconds;
        long Hours = AllMilliseconds / 3600000; // Нахожу количество часов до конца пары
        long Minutes = AllMilliseconds / 60000 - Hours * 60; // Нахожу количество минут до конца пары
        long Seconds = AllMilliseconds / 1000 - Hours * 3600 - Minutes * 60; // Нахожу количество секунд до конца пары
        long Milliseconds = AllMilliseconds - Seconds * 1000 - Minutes * 60000 - Hours * 3600000; // Нахожу количество миллисекунд до конца пары
        System.out.println("До конца пары " + Hours + " час(-ов) " + Minutes + " минут(-ы) " + Seconds + " секунд(-ы) " + Milliseconds + " миллисекунд(-ы).");
            }
        }