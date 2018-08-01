package dto;

public class EmployeeProjectDTO {

    public int projectId;
    public String projectName;
    public double workingHours;

    public EmployeeProjectDTO(int projectId, String projectName, double workingHours) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.workingHours = workingHours;
    }
}
