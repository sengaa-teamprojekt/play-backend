package dto;

import java.util.List;

public class CalendarWeekOverviewDTO {

    public int year;
    public int calendarWeek;
    public List<WeeklyProjectHoursDTO> weeklyProjectHours;

    public CalendarWeekOverviewDTO(int year, int calendarWeek, List<WeeklyProjectHoursDTO> weeklyProjectHours) {
        super();
        this.year = year;
        this.calendarWeek = calendarWeek;
        this.weeklyProjectHours = weeklyProjectHours;
    }

}
