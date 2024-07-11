class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year = 2020;
    boolean isRainyMonth;

    WeatherCalendar(String monthOctober, int numberOfDaysInOctober) {
        month = monthOctober;
        numberOfDays = numberOfDaysInOctober;
    }

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays = rainyDays + 1;
    }
}