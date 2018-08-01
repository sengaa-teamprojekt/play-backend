package dto;

public class EmployeeMonthDTO {

    public String month;
    public int year;
    public double workingHours;

    public EmployeeMonthDTO(String month, int year, double workingHours) {
        super();
        this.month = month;
        this.year = year;
        this.workingHours = workingHours;
    }
}
