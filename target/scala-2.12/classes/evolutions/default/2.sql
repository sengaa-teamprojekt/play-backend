# --- !Ups
--- inserts into table 'company'
INSERT INTO company (name) VALUES ('Hornbach');
INSERT INTO company (name) VALUES ('SAP');
INSERT INTO company (name) VALUES ('NTTL');



--- inserts into table 'employee'
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Huhn', 'Johannes', '1', '3', 'johannes');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Kaendler', 'Jonas', '0', '3', 'jaykay');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Hummels', 'Mats', '0', '1', 'mats');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Boateng', 'Jerome', '0', '1', 'jerome');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Schmelzer', 'Marcel', '0', '1', 'marcel');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Durm', 'Eric', '0', '1', 'eric');

INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Mueller', 'Johannes', '1', '2', 'johannes');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Reus', 'Marco', '0', '2', 'marco');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Goetze', 'Mario', '0', '2', 'mario');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Barta', 'Marc', '0', '2', 'marc');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Sancho', 'Jadon', '0', '2', 'jadon');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Schürrle', 'Andre', '0', '2', 'andre');

INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Vidal', 'Arturo', '1', '3', 'arturo');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Ballack', 'Michael', '1', '3', 'michael');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Neuer', 'Manuel', '0', '3', 'manuel');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Subotic', 'Neven', '0', '3', 'neven');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Weigl', 'Julian', '0', '3', 'julian');
INSERT INTO employee (last_name, name, is_controller, company_id, pw) VALUES ('Buerki', 'Roman', '0', '3', 'roman');



--- inserts into table 'project'
--- worked on projects
---Project 1
INSERT INTO project (description, estimated_working_hours) VALUES ('Lernen', '1650');
---Project 2
INSERT INTO project (description, estimated_working_hours) VALUES ('Sport', '100');
---Project 3
INSERT INTO project (description, estimated_working_hours) VALUES ('Job', '200');
---Project 4
INSERT INTO project (description, estimated_working_hours) VALUES ('Familie', '800');


---- not yet worked on projects
INSERT INTO project (description, estimated_working_hours) VALUES ('Buch_lesen', '30');
INSERT INTO project (description, estimated_working_hours) VALUES ('SharePoint_site', '250');
INSERT INTO project (description, estimated_working_hours) VALUES ('ERP', '535');

--- inserts into table 'task'
---! every employee can only work for one company. Is that always the case? 


----Project No 1 --------------------------
-- employee No. 1 works for project No. 1 in mai impelementing the IT architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '1', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '2', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '3', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '4', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '5', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '6', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '7', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '8', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '9', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '10', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '11', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '12', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '13', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '14', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '15', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '16', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '17', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '18', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '19', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '20', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '21', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '22', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '23', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '24', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '25', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '26', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '27', '5', '2017', 'Implement IT Architecture', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '28', '5', '2017', 'Implement IT Architecture', '1', '1');

--- employee No. 2 works for project No. 1 in mai impelementing the IT architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '1', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '2', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '3', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '4', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '5', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '6', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '7', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '8', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '9', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '10', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '11', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '12', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '13', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '14', '5', '2017', 'Implement IT Architecture', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '15', '5', '2017', 'Implement IT Architecture', '1', '2');

--- employee No. 3 works for project No. 1 in mai testing the IT architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '1', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '2', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '3', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '18', '4', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '5', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '6', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '7', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '8', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '9', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '10', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '19', '11', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '12', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '13', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '14', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '15', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '16', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '17', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '18', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '19', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '20', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '21', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '22', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '23', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '24', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '25', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '26', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '27', '5', '2017', 'Implement IT Architecture', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '28', '5', '2017', 'Implement IT Architecture', '1', '3');

--- employee No. 10 works for project No. 1 in mai impelementing the IT architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '16', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '17', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '20', '18', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '19', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '20', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '21', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '22', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '23', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '24', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '21', '25', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '26', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '27', '5', '2017', 'Implement IT Architecture', '1', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '28', '5', '2017', 'Implement IT Architecture', '1', '10');

--- building prototype
-- employee No. 1 works for project No. 1 in june building the prototype (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '1', '6', '2017', 'Build Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '2', '6', '2017', 'Build Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '3', '6', '2017', 'Build Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '4', '6', '2017', 'Build Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '5', '6', '2017', 'Build Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '6', '6', '2017', 'Build Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '7', '6', '2017', 'Build Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '8', '6', '2017', 'Build Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '9', '6', '2017', 'Build Prototype', '1', '1');


-- employee No. 2 works for project No. 1 in june building the prototype (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '1', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '2', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '3', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '4', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '5', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '6', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '7', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '8', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '9', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '10', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '11', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '12', '6', '2017', 'Build Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '13', '6', '2017', 'Build Prototype', '1', '2');


-- employee No. 16 works for project No. 1 in june building the prototype (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '10', '6', '2017', 'Build Prototype', '1', '16');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '23', '11', '6', '2017', 'Build Prototype', '1', '16');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '12', '6', '2017', 'Build Prototype', '1', '16');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '13', '6', '2017', 'Build Prototype', '1', '16');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '14', '6', '2017', 'Build Prototype', '1', '16');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '15', '6', '2017', 'Build Prototype', '1', '16');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '16', '6', '2017', 'Build Prototype', '1', '16');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '17', '6', '2017', 'Build Prototype', '1', '16');


--- test prototype
-- employee No. 1 works for project No. 1 in june test the prototype (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '18', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '19', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '20', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '21', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '22', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '23', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '24', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '25', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '26', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '27', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '28', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '29', '6', '2017', 'Test Prototype', '1', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '30', '6', '2017', 'Test Prototype', '1', '1');


-- employee No. 2 works for project No. 1 in june test the prototype (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '14', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '15', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '16', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '17', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '18', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '19', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '20', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '21', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '22', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '23', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '24', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '25', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '26', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '27', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '28', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '29', '6', '2017', 'Test Prototype', '1', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '30', '6', '2017', 'Test Prototype', '1', '2');


-- employee No. 3 works for project No. 1 in june building the prototype (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '24', '18', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '19', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '20', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '21', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '22', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '23', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '24', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '25', '25', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '26', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '27', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '28', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '29', '6', '2017', 'Test Prototype', '1', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '26', '30', '6', '2017', 'Test Prototype', '1', '3');

--------------------------------------------
--------------------------------------------
--------------------------------------------
----Project No. 2 --------------------------
--- employee No. 1 works for project No. 2 in march presenting the GUI 
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '9', '1', '3', '2017', 'Reasearch', '2', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '9', '2', '3', '2017', 'Reasearch', '2', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '9', '3', '3', '2017', 'Reasearch', '2', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '10', '6', '3', '2017', 'Reasearch', '2', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '10', '7', '3', '2017', 'Reasearch', '2', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '10', '8', '3', '2017', 'Reasearch', '2', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '10', '9', '3', '2017', 'Select Restaurant', '2', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '10', '10', '3', '2017', 'Select Restaurant', '2', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '10', '11', '3', '2017', 'Select Restaurant', '2', '1');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '10', '12', '3', '2017', 'Select Restaurant', '2', '1');

--- employee No. 2 works for project No. 2 in june presenting the GUI 
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '1', '6', '2017', 'Order Food', '2', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '22', '2', '6', '2017', 'Pick Up Food', '2', '2');



--------------------------------------------
--------------------------------------------
--------------------------------------------
----Project No. 3 --------------------------
--- employee No. 7 works for project No. 3 in february impelementing the UX architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '1', '2', '2017', 'Design Thinking', '3', '7');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '2', '2', '2017', 'Design Thinking', '3', '7');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '3', '2', '2017', 'Setup Scrum', '3', '7');

--- employee No. 9 works for project No. 3 in february impelementing the UX architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('6', '5', '4', '2', '2017', 'Fill Scrum with Data', '3', '9');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('10', '5', '5', '2', '2017', 'Send Invite to other users', '3', '9');

--- employee No. 10 works for project No. 3 in february impelementing the UX architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '1', '2', '2017', 'Implement UX Architecture', '3', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '2', '2', '2017', 'Implement UX Architecture', '3', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '3', '2', '2017', 'Implement UX Architecture', '3', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '4', '2', '2017', 'Implement UX Architecture', '3', '10');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '5', '2', '2017', 'Implement UX Architecture', '3', '10');

--- employee No. 18 works for project No. 3 in february impelementing the UX architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '6', '6', '2', '2017', 'Implement UX Architecture', '3', '18');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('6', '6', '7', '2', '2017', 'Implement UX Architecture', '3', '18');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('4', '6', '8', '2', '2017', 'Implement UX Architecture', '3', '18');

--- employee No. 12/18 works for project No. 3 in february testing the UX architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '6', '9', '2', '2017', 'Test UX Architecture', '3', '12');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '6', '10', '2', '2017', 'Test UX Architecture', '3', '18');


--- employee No. 11 works for project No. 3 in february impelementing the UX architecture (2017)
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '1', '2', '2017', 'Customer Relations', '3', '11');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '2', '2', '2017', 'Customer Relations', '3', '11');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '3', '2', '2017', 'Customer Relations', '3', '11');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '4', '2', '2017', 'Live Demo', '3', '11');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '5', '5', '2', '2017', 'Live Demo', '3', '11');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '6', '6', '2', '2017', 'Minor Adjustments', '3', '11');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('6', '6', '7', '2', '2017', 'Minor Adjustments', '3', '11');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('4', '6', '8', '2', '2017', 'Minor Adjustments', '3', '11');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '6', '9', '2', '2017', 'Selling Product', '3', '11');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '6', '10', '2', '2017', 'Selling Product', '3', '11');



--------------------------------------------
--------------------------------------------
--------------------------------------------
----Project No. 4 --------------------------
--------------------------------------------
--- employee No. 2 works for project No. 4 in august digging
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '1', '8', '2017', 'Digging', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '2', '8', '2017', 'Digging', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '3', '8', '2017', 'Digging', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '4', '8', '2017', 'Digging', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '5', '8', '2017', 'Digging', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '6', '8', '2017', 'Digging', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '7', '8', '2017', 'Digging', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '8', '8', '2017', 'Digging', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '9', '8', '2017', 'Digging', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '10', '8', '2017', 'Digging', '4', '2');


--- employee No. 3 works for project No. 4 in august digging deeper
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '1', '8', '2017', 'Digging deeper', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '2', '8', '2017', 'Digging deeper', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '3', '8', '2017', 'Digging deeper', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '4', '8', '2017', 'Digging deeper', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '5', '8', '2017', 'Digging deeper', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '31', '6', '8', '2017', 'Digging deeper', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '7', '8', '2017', 'Digging deeper', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '8', '8', '2017', 'Digging deeper', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '9', '8', '2017', 'Digging deeper', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '10', '8', '2017', 'Digging deeper', '4', '3');



--- employee No. 13 works for project No. 1 in august building the fundament
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '11', '8', '2017', 'Fundament', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '12', '8', '2017', 'Fundament', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '13', '8', '2017', 'Fundament', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '14', '8', '2017', 'Fundament', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '15', '8', '2017', 'Fundament', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '16', '8', '2017', 'Fundament', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '17', '8', '2017', 'Fundament', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '18', '8', '2017', 'Fundament', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '19', '8', '2017', 'Fundament', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '20', '8', '2017', 'Fundament', '4', '13');


--- employee No. 14 works for project No. 4 in august buidling walls
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '11', '8', '2017', 'Build Walls', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '12', '8', '2017', 'Build Walls', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '13', '8', '2017', 'Build Walls', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '14', '8', '2017', 'Build Walls', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '15', '8', '2017', 'Build Walls', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '16', '8', '2017', 'Build Walls', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '17', '8', '2017', 'Build Walls', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '18', '8', '2017', 'Build Walls', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '19', '8', '2017', 'Build Walls', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '20', '8', '2017', 'Build Walls', '4', '14');

--- employee No. 15 works for project No. 4 in august building walls
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '11', '8', '2017', 'Build Walls', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '12', '8', '2017', 'Build Walls', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '32', '13', '8', '2017', 'Build Walls', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '14', '8', '2017', 'Build Walls', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '15', '8', '2017', 'Build Walls', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '16', '8', '2017', 'Build Walls', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '17', '8', '2017', 'Build Walls', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '18', '8', '2017', 'Build Walls', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '19', '8', '2017', 'Build Walls', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('8', '33', '20', '8', '2017', 'Build Walls', '4', '15');


--- employee No. 2 works for project No. 4 in september Buidling the roof 
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '21', '9', '2017', 'Build Roof', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '22', '9', '2017', 'Build Roof', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '23', '9', '2017', 'Build Roof', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '24', '9', '2017', 'Build Roof', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '25', '9', '2017', 'Build Roof', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '26', '9', '2017', 'Build Roof', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '27', '9', '2017', 'Build Roof', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '29', '9', '2017', 'Build Roof', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '29', '9', '2017', 'Build Roof', '4', '2');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '30', '9', '2017', 'Build Roof', '4', '2');

--- employee No. 3 works for project No. 4 in september Buidling the roof 
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '21', '9', '2017', 'Build Roof', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '22', '9', '2017', 'Build Roof', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '23', '9', '2017', 'Build Roof', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '24', '9', '2017', 'Build Roof', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '25', '9', '2017', 'Build Roof', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '26', '9', '2017', 'Build Roof', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '27', '9', '2017', 'Build Roof', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '29', '9', '2017', 'Build Roof', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '29', '9', '2017', 'Build Roof', '4', '3');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '30', '9', '2017', 'Build Roof', '4', '3');

--- employee No. 13 works for project No. 4 in september Buidling the roof 
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '21', '9', '2017', 'Finish House', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '22', '9', '2017', 'Finish House', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '23', '9', '2017', 'Finish House', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '24', '9', '2017', 'Finish House', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '25', '9', '2017', 'Finish House', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '26', '9', '2017', 'Finish House', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '27', '9', '2017', 'Finish House', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '29', '9', '2017', 'Finish House', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '29', '9', '2017', 'Finish House', '4', '13');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '30', '9', '2017', 'Finish House', '4', '13');

--- employee No. 14 works for project No. 4 in september Buidling the roof 
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '21', '9', '2017', 'Finish House', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '22', '9', '2017', 'Finish House', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '23', '9', '2017', 'Finish House', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '24', '9', '2017', 'Finish House', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '25', '9', '2017', 'Finish House', '4', '14');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '26', '9', '2017', 'Finish House', '4', '14');

--- employee No. 15 works for project No. 4 in september Buidling the roof 
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '21', '9', '2017', 'Finish House', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '22', '9', '2017', 'Finish House', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '23', '9', '2017', 'Finish House', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '38', '24', '9', '2017', 'Finish House', '4', '15');
INSERT INTO task (time_spent, calendar_week, day, month, year, notes, project_id, employee_id) VALUES ('9', '39', '25', '9', '2017', 'Finish House', '4', '15');

# --- !Downs
