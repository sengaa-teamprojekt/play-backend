package dto;

public class ProjectDurationDTO {

    public int projectId;
    public String projectName;
    public int durationInDays;

    public ProjectDurationDTO(int projectId, String projectName, int durationInDays) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.durationInDays = durationInDays;
    }

}
