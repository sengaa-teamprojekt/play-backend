package dto;

import java.util.List;

public class ProjectStaffingDTO {

    public int projectId;
    public String projectName;
    public List<CompanyDTO> companies;

    public ProjectStaffingDTO(int projectId, String projectName, List<CompanyDTO> companies) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.companies = companies;
    }

}
