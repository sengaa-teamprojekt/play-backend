package dto;

public class Partner {


    public String employeeLastName;
    public String employeeName;
    public double workingHoursPerEmployee;
    public int companyId;

    public CompanyEmployeeDTO(int employeeId, String employeeLastName, String employeeName,
            double workingHoursPerEmployee, int companyId) {
        super();
        this.employeeId = employeeId;
        this.employeeLastName = employeeLastName;
        this.employeeName = employeeName;
        this.workingHoursPerEmployee = workingHoursPerEmployee;
        this.companyId = companyId;
    }

    public boolean belongToSameCompany(CompanyEmployeeDTO employee) {
        return this.companyId == employee.companyId;
    }
}
