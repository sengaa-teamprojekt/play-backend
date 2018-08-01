package services;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import dto.CalendarWeekOverviewDTO;
import dto.CompanyDTO;
import dto.CompanyEmployeeDTO;
import dto.EmployeeMonthDTO;
import dto.EmployeeProjectBudgetDTO;
import dto.EmployeeProjectDTO;
import dto.EmployeeWeekDTO;
import dto.MgmtProjectBudgetDTO;
import dto.MgmtProjectDTO;
import dto.OverallWorkingHoursDTO;
import dto.ProjectDurationDTO;
import dto.ProjectStaffingDTO;
import dto.CalendarWeek;
import dto.WeeklyProjectHoursDTO;
import io.ebean.Ebean;
import io.ebean.SqlRow;
import models.Partner;
import models.Employee;
import models.Project;

public class DatabaseService {

    public static List<EmployeeWeekDTO> queryWeeklyWorkingHours(Integer employeeId) {
        String sql = "select year, calendar_week, sum(time_spent) as working_hours from task where employee_id = (:employeeId) group by (year, calendar_week) order by year desc, calendar_week asc;";
        List<SqlRow> sqlRows = Ebean.createSqlQuery(sql).setParameter("employeeId", employeeId).findList();
        List<EmployeeWeekDTO> weeks = new ArrayList<>();
        for (SqlRow sqlRow : sqlRows) {
            weeks.add(new EmployeeWeekDTO(sqlRow.getString("calendar_week"), sqlRow.getInteger("year"),
                    sqlRow.getDouble("working_hours")));
        }
        return weeks;
    }

    public static List<EmployeeMonthDTO> queryMonthlyWorkingHours(Integer employeeId) {
        String sql = "select year, month, sum(time_spent) as working_hours from task where employee_id = (:employeeId) group by (year, month) order by year desc, month asc;";
        List<SqlRow> sqlRows = Ebean.createSqlQuery(sql).setParameter("employeeId", employeeId).findList();
        List<EmployeeMonthDTO> months = new ArrayList<>();
        for (SqlRow sqlRow : sqlRows) {
            months.add(new EmployeeMonthDTO(sqlRow.getString("month"), sqlRow.getInteger("year"),
                    sqlRow.getDouble("working_hours")));
        }
        return months;
    }

    public static List<EmployeeProjectDTO> queryEmployeeProjects(Integer employeeId) {
        String sql = "select p.id as id, p.description as description, sum(t.time_spent) as working_hours from task t, project p where t.employee_id = (:employeeId) and t.project_id = p.id group by t.project_id;";
        List<SqlRow> sqlRows = Ebean.createSqlQuery(sql).setParameter("employeeId", employeeId).findList();
        List<EmployeeProjectDTO> projects = new ArrayList<>();
        for (SqlRow sqlRow : sqlRows) {
            projects.add(new EmployeeProjectDTO(sqlRow.getInteger("id"), sqlRow.getString("description"),
                    sqlRow.getDouble("working_hours")));
        }
        return projects;
    }

    public static List<EmployeeProjectBudgetDTO> queryEmployeeProjectBudget(Integer employeeId) {
        String sql = "select p.id as id, p.description as description, sum(t.time_spent) as current_working_hours, p.estimated_working_hours as estimated_working_hours from task t, project p where t.employee_id = (:employeeId) and t.project_id = p.id group by t.project_id;";
        List<SqlRow> sqlRows = Ebean.createSqlQuery(sql).setParameter("employeeId", employeeId).findList();
        List<EmployeeProjectBudgetDTO> projectBudgets = new ArrayList<>();
        for (SqlRow sqlRow : sqlRows) {
            projectBudgets.add(new EmployeeProjectBudgetDTO(sqlRow.getInteger("id"), sqlRow.getString("description"),
                    sqlRow.getDouble("current_working_hours"), sqlRow.getDouble("estimated_working_hours")));
        }
        return projectBudgets;
    }

    public static List<OverallWorkingHoursDTO> queryEmployeeWorkingHours(Integer employeeId) {
        String sql = "select e.id, e.last_name, e.name, sum(t.time_spent) as working_hours from employee e, task t where e.id = t.employee_id and e.id = (:employeeId) group by e.id;";
        SqlRow sqlRow = Ebean.createSqlQuery(sql).setParameter("employeeId", employeeId).findOne();
        OverallWorkingHoursDTO employeeWorkingHours = new OverallWorkingHoursDTO(sqlRow.getInteger("id"),
                sqlRow.getString("last_name"), sqlRow.getString("name"), sqlRow.getDouble("working_hours"));
        sql = "select e.id, e.last_name, e.name, sum(t.time_spent) as working_hours from employee e, task t where e.id = t.employee_id and e.id != (:employeeId) group by e.id;";
        List<SqlRow> sqlRows = Ebean.createSqlQuery(sql).setParameter("employeeId", employeeId).findList();
        List<OverallWorkingHoursDTO> overallWorkingHours = new ArrayList<>();
        overallWorkingHours.add(employeeWorkingHours);
        for (SqlRow sqlRow1 : sqlRows) {
            overallWorkingHours.add(new OverallWorkingHoursDTO(sqlRow1.getInteger("id"), sqlRow1.getString("last_name"),
                    sqlRow1.getString("name"), sqlRow1.getDouble("working_hours")));
        }
        return overallWorkingHours;
    }

    public static List<MgmtProjectDTO> queryHoursPerProject() {
        String sql = "select p.id as id, p.description as description, sum(t.time_spent) as working_hours from project p, task t where p.id = t.project_id group by p.id";
        List<SqlRow> sqlRows = Ebean.createSqlQuery(sql).findList();
        List<MgmtProjectDTO> projects = new ArrayList<>();
        for (SqlRow sqlRow1 : sqlRows) {
            projects.add(new MgmtProjectDTO(sqlRow1.getInteger("id"), sqlRow1.getString("description"),
                    sqlRow1.getDouble("working_hours")));
        }
        return projects;
    }

    public static List<MgmtProjectBudgetDTO> queryProjectBudgets() {
        String sql = "select p.id as id, p.description as description, sum(t.time_spent) as current_working_hours, p.estimated_working_hours as estimated_working_hours from task t, project p where t.project_id = p.id group by t.project_id;";
        List<SqlRow> sqlRows = Ebean.createSqlQuery(sql).findList();
        List<MgmtProjectBudgetDTO> projectBudgets = new ArrayList<>();
        for (SqlRow sqlRow : sqlRows) {
            projectBudgets.add(new MgmtProjectBudgetDTO(sqlRow.getInteger("id"), sqlRow.getString("description"),
                    sqlRow.getDouble("current_working_hours"), sqlRow.getDouble("estimated_working_hours")));
        }
        return projectBudgets;
    }

    public static List<ProjectStaffingDTO> queryProjectStaffing() {
        String sql = "select id, description from project;";
        List<SqlRow> projectSqlRows = Ebean.createSqlQuery(sql).findList();
        List<ProjectStaffingDTO> projectStaffing = new ArrayList<>();
        for (SqlRow projectRow : projectSqlRows) {
            List<CompanyDTO> companies = retrieveCompaniesInvolved(projectRow.getInteger("id"));
            projectStaffing.add(new ProjectStaffingDTO(projectRow.getInteger("id"), projectRow.getString("description"),
                    companies));
        }
        return projectStaffing;
    }

    public static List<CalendarWeekOverviewDTO> queryWeeklyHoursPerProject() {
        String sql = "select t.year, t.calendar_week from task t;";
        List<SqlRow> sqlRows = Ebean.createSqlQuery(sql).findList();
        List<CalendarWeek> weeks = new ArrayList<>();
        for (SqlRow sqlRow : sqlRows) {
            weeks.add(new CalendarWeek(sqlRow.getInteger("year"), sqlRow.getInteger("calendar_week")));
        }
        TreeSet<CalendarWeek> weekSet = new TreeSet<>(weeks);
        List<CalendarWeekOverviewDTO> weekOverview = new ArrayList<>();
        for (CalendarWeek cw : weekSet) {
            List<WeeklyProjectHoursDTO> weeklyProjectHours = retrieveWeeklyProjectHours(cw.year, cw.week);
            weekOverview.add(new CalendarWeekOverviewDTO(cw.year, cw.week, weeklyProjectHours));
        }
        return weekOverview;
    }

    private static List<WeeklyProjectHoursDTO> retrieveWeeklyProjectHours(int year, int week) {
        List<WeeklyProjectHoursDTO> weeklyProjectHours = new ArrayList<>();
        String sql = "select p.id as project_id, p.description as project_name, sum(t.time_spent) as weekly_hours from project p, task t where t.year = (:year) and t.calendar_week = (:week) and t.project_id = p.id group by t.project_id;";
        List<SqlRow> sqlRows = Ebean.createSqlQuery(sql).setParameter("year", year).setParameter("week", week)
                .findList();
        for (SqlRow sqlRow : sqlRows) {
            weeklyProjectHours.add(new WeeklyProjectHoursDTO(sqlRow.getInteger("project_id"),
                    sqlRow.getString("project_name"), sqlRow.getDouble("weekly_hours")));
        }
        return weeklyProjectHours;
    }

    private static List<CompanyDTO> retrieveCompaniesInvolved(int projectId) {
        List<CompanyDTO> companies = new ArrayList<>();
        String sql = "select t.employee_id as id, sum(t.time_spent) as working_hours from task t where t.project_id = (:projectId) group by t.employee_id;";
        List<SqlRow> employeeRows = Ebean.createSqlQuery(sql).setParameter("projectId", projectId).findList();
        List<CompanyEmployeeDTO> employeesTmp = new ArrayList<>();
        for (SqlRow employeeRow : employeeRows) {
            CompanyEmployeeDTO cdDTO = createCompanyEmployeeDTO(employeeRow.getInteger("id"),
                    employeeRow.getDouble("working_hours"));
            if (cdDTO == null) {
                continue;
            }
            employeesTmp.add(cdDTO);
        }
        List<Integer> companyIds = new ArrayList<>();
        for (CompanyEmployeeDTO employee : employeesTmp) {
            if (!companyIds.contains(employee.companyId)) {
                companyIds.add(employee.companyId);
            }
        }
        for (Integer companyId : companyIds) {
            List<CompanyEmployeeDTO> employees = new ArrayList<>();
            for (CompanyEmployeeDTO e : employeesTmp) {
                if (e.companyId == companyId) {
                    employees.add(e);
                }
            }
            companies.add(new CompanyDTO(companyId, Partner.find.query().where().idEq(companyId).findOne().getName(),
                    employees));
        }
        TreeSet<String> allCompanies = new TreeSet<>();
        String sql2 = "select name from company;";
        List<SqlRow> rows = Ebean.createSqlQuery(sql2).findList();
        for (SqlRow row : rows) {
            allCompanies.add(row.getString("name"));
        }
        TreeSet<String> involvedCompanies = new TreeSet<>();
        for (CompanyDTO co : companies) {
            involvedCompanies.add(co.companyName);
        }
        allCompanies.removeAll(involvedCompanies);
        for (String co2 : allCompanies) {
            companies.add(new CompanyDTO(0, co2, null));
        }
        return companies;
    }

    public static List<ProjectDurationDTO> queryProjectDuration() {
        List<ProjectDurationDTO> projectDuration = new ArrayList<>();
        List<Project> projects = Project.find.query().findList();
        for (Project project : projects) {
            projectDuration.add(new ProjectDurationDTO(Math.toIntExact(project.id), project.getName(),
                    project.getProjectDurationInDays()));
        }
        return projectDuration;
    }

    private static CompanyEmployeeDTO createCompanyEmployeeDTO(int employeeId, double workingHours) {
        Employee employee = Employee.find.query().where().idEq(employeeId).findOne();
        if (employee == null) {
            return null;
        }
        return new CompanyEmployeeDTO(employeeId, employee.getLastName(), employee.getName(), workingHours,
                employee.getCompanyId());
    }
}
