package dto;

public class MgmtProjectBudgetDTO {

    public int projectId;
    public String projectName;
    public double currentWorkingHours;
    public double estimatedWorkingHours;

    public MgmtProjectBudgetDTO(int projectId, String projectName, double currentWorkingHours,
            double estimatedWorkingHours) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.currentWorkingHours = currentWorkingHours;
        this.estimatedWorkingHours = estimatedWorkingHours;
    }

}
