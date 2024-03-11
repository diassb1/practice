import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        WeatherCalendar calendar = new WeatherCalendar("Октябрь", 31);
        String[] octoberWeather = new String[]{
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Дождь",
                "Дождь",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Солнечно",
                "Солнечно",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Дождь",
                "Дождь",
                "Дождь",
                "Облачно",
                "Дождь",
                "Облачно",
                "Дождь",
                "Дождь",
                "Дождь",
                "Солнечно",
                "Дождь",
                "Дождь",
                "Дождь",
                "Солнечно",
                "Дождь",
                "Солнечно",
                "Солнечно",
                "Облачно"
        };

        for (int i = 0; i < calendar.getNumberOfDays(); i++) {
            if (octoberWeather[i].equals("Дождь")) {
                calendar.addRainyDay();
            }
        }

        // Проверить, был ли месяц дождливым. Если да - установить значение isRainyMonth
        if (calendar.getRainyDays() > 15) {
            calendar.setRainyMonth(true);
        }

        System.out.println(calendar.getMonth() + " " + calendar.getYear() + " года. "
                + calendar.getRainyDays() + " дней шёл дождь.");

        // Проверить значение isRainyMonth
        if (calendar.isRainyMonth()){
            System.out.println("Это был дождливый месяц.");
        } else{
            System.out.println("Этот месяц был довольно сухим.");
        }
    }
}