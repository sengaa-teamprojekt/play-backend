package dto;

public class WeeklyProjectHoursDTO {

    public int projectId;
    public String projectName;
    public double weeklyWorkingHours;

    public WeeklyProjectHoursDTO(int projectId, String projectName, double weeklyWorkingHours) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

}
