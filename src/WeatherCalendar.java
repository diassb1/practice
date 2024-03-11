public class WeatherCalendar {
    private String month;
    private int numberOfDays;
    private int rainyDays = 0;
    private boolean isRainyMonth = false;
    private int year;
    {
        year = 2023;
    }

    public WeatherCalendar(String month, int numberOfDays) {
        this.month = month;
        this.numberOfDays = numberOfDays;
    }

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays++;
    }

    public String getMonth() {
        return month;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getRainyDays() {
        return rainyDays;
    }

    public boolean isRainyMonth() {
        return isRainyMonth;
    }

    public void setRainyMonth(boolean rainyMonth) {
        isRainyMonth = rainyMonth;
    }

    public int getYear() {
        return year;
    }

}