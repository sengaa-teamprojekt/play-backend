package dto;

public class OverallWorkingHoursDTO {

    public Integer employeeId;
    public String lastName;
    public String name;
    public Double workingHours;

    public OverallWorkingHoursDTO(Integer employeeId, String lastName, String name, Double workingHours) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.name = name;
        this.workingHours = workingHours;
    }

}
