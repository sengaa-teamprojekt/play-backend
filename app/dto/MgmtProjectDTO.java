package dto;

public class MgmtProjectDTO {

    public int projectId;
    public String projectName;
    public double workingHours;

    public MgmtProjectDTO(int projectId, String projectName, double workingHours) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.workingHours = workingHours;
    }
}
