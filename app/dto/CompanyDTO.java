package dto;

import java.util.List;

public class CompanyDTO {

    public int companyId;
    public String companyName;
    public List<CompanyEmployeeDTO> employees;

    public CompanyDTO(int companyId, String companyName, List<CompanyEmployeeDTO> employees) {
        super();
        this.companyId = companyId;
        this.companyName = companyName;
        this.employees = employees;
    }

}
