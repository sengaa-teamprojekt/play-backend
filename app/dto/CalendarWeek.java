package dto;

public class CalendarWeek implements Comparable<CalendarWeek> {

    public int year;
    public int week;

    public CalendarWeek(int year, int cw) {
        this.year = year;
        this.week = cw;
    }

    @Override
    public int compareTo(CalendarWeek week) {
        if (this.year == week.year && this.week == week.week) {
            return 0;
        } else if ((this.year == week.year && this.week < week.week) || (this.year < week.year)) {
            return -1;
        } else {
            return 1;
        }
    }
}
