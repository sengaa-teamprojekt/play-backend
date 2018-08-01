package dto;

public class EmployeeProjectBudgetDTO {

    public int projectId;
    public String projectName;
    public double currentWorkingHours;
    public double estimatedWorkingHours;

    public EmployeeProjectBudgetDTO(int projectId, String projectName, double currentWorkingHours,
            double estimatedWorkingHours) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.currentWorkingHours = currentWorkingHours;
        this.estimatedWorkingHours = estimatedWorkingHours;
    }

}
