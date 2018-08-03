# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table company (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  constraint pk_company primary key (id)
);

create table employee (
  id                            bigint auto_increment not null,
  last_name                     varchar(255) not null,
  name                          varchar(255) not null,
  is_controller                 boolean default false not null,
  company_id                    bigint not null,
  pw                            varchar(255) not null,
  constraint pk_employee primary key (id)
);

create table partner (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  email                         varchar(255) not null,
  password                      varchar(255) not null,
  url                           varchar(255) not null,
  constraint pk_partner primary key (id)
);

create table project (
  id                            bigint auto_increment not null,
  description                   varchar(255) not null,
  estimated_working_hours       double default 0.00 not null,
  constraint pk_project primary key (id)
);

create table style (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  constraint pk_style primary key (id)
);

create table task (
  id                            bigint auto_increment not null,
  time_spent                    double default 0.00 not null,
  calendar_week                 integer not null,
  day                           integer not null,
  month                         integer not null,
  year                          integer not null,
  notes                         varchar(255),
  project_id                    bigint not null,
  employee_id                   bigint,
  constraint pk_task primary key (id)
);

alter table employee add constraint fk_employee_company_id foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_employee_company_id on employee (company_id);

alter table task add constraint fk_task_project_id foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_task_project_id on task (project_id);

alter table task add constraint fk_task_employee_id foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_task_employee_id on task (employee_id);


# --- !Downs

alter table employee drop constraint if exists fk_employee_company_id;
drop index if exists ix_employee_company_id;

alter table task drop constraint if exists fk_task_project_id;
drop index if exists ix_task_project_id;

alter table task drop constraint if exists fk_task_employee_id;
drop index if exists ix_task_employee_id;

drop table if exists company;

drop table if exists employee;

drop table if exists partner;

drop table if exists project;

drop table if exists style;

drop table if exists task;

