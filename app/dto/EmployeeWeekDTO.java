package dto;

public class EmployeeWeekDTO {

    public String calendarWeek;
    public int year;
    public double workingHours;

    public EmployeeWeekDTO(String calendarWeek, int year, double workingHours) {
        super();
        this.calendarWeek = calendarWeek;
        this.year = year;
        this.workingHours = workingHours;
    }

}
