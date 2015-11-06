# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table climate_service (
  id                        bigint auto_increment not null,
  root_service_id           bigint,
  creatorId                 bigint,
  name                      varchar(255),
  purpose                   varchar(255),
  url                       varchar(255),
  scenario                  varchar(255),
  create_time               datetime,
  version_no                varchar(255),
  constraint pk_climate_service primary key (id))
;

create table dataset (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  data_source_namein_web_interface varchar(255),
  agency_id                 varchar(255),
  instrumentId              bigint not null,
  publish_time_stamp        datetime,
  url                       varchar(255),
  physical_variable         varchar(255),
  cmip5var_name             varchar(255),
  units                     varchar(255),
  grid_dimension            varchar(255),
  source                    varchar(255),
  status                    varchar(255),
  responsible_person        varchar(255),
  variable_name_in_web_interface varchar(255),
  data_source_input_parameter_to_call_science_application_code varchar(255),
  variable_name_input_parameter_to_call_science_application_code varchar(255),
  comment                   varchar(255),
  start_time                datetime,
  end_time                  datetime,
  constraint pk_dataset primary key (id))
;

create table dataset_entry (
  id                        bigint auto_increment not null,
  version_no                varchar(255),
  register_time_stamp       datetime,
  register_note             varchar(255),
  count                     integer,
  latest_access_time_stamp  datetime,
  datasetId                 bigint not null,
  registorId                bigint not null,
  constraint pk_dataset_entry primary key (id))
;

create table dataset_log (
  id                        bigint auto_increment not null,
  dataSetId                 bigint not null,
  plot_url                  varchar(255),
  data_url                  varchar(255),
  originalDatasetId         bigint not null,
  outputDatasetId           bigint not null,
  constraint pk_dataset_log primary key (id))
;

create table instrument (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  description               varchar(255),
  launch_date               datetime,
  constraint pk_instrument primary key (id))
;

create table parameter (
  id                        bigint auto_increment not null,
  serviceId                 bigint not null,
  index_in_service          bigint,
  name                      varchar(255),
  data_range                varchar(255),
  rule                      varchar(255),
  purpose                   varchar(255),
  constraint pk_parameter primary key (id))
;

create table service_entry (
  id                        bigint auto_increment not null,
  serviceId                 bigint,
  version_no                varchar(255),
  registorId                bigint,
  register_time_stamp       datetime,
  register_note             varchar(255),
  count                     integer,
  latest_access_time_stamp  datetime,
  constraint pk_service_entry primary key (id))
;

create table user (
  id                        bigint auto_increment not null,
  user_name                 varchar(255),
  password                  varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  middle_initial            varchar(255),
  affiliation               varchar(255),
  title                     varchar(255),
  email                     varchar(255),
  mailing_address           varchar(255),
  phone_number              varchar(255),
  fax_number                varchar(255),
  research_fields           varchar(255),
  highest_degree            varchar(255),
  constraint pk_user primary key (id))
;

create table workflow (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  purpose                   varchar(255),
  create_time               datetime,
  version_no                varchar(255),
  root_workflow_id          bigint,
  constraint pk_workflow primary key (id))
;


create table DatasetAndService (
  datasetId                      bigint not null,
  climateServiceId               bigint not null,
  constraint pk_DatasetAndService primary key (datasetId, climateServiceId))
;

create table WorkflowAndUser (
  workflowId                     bigint not null,
  userId                         bigint not null,
  constraint pk_WorkflowAndUser primary key (workflowId, userId))
;

create table WorkflowAndClimateService (
  workflowId                     bigint not null,
  climateServiceId               bigint not null,
  constraint pk_WorkflowAndClimateService primary key (workflowId, climateServiceId))
;
alter table climate_service add constraint fk_climate_service_user_1 foreign key (creatorId) references user (id) on delete restrict on update restrict;
create index ix_climate_service_user_1 on climate_service (creatorId);
alter table dataset add constraint fk_dataset_instrument_2 foreign key (instrumentId) references instrument (id) on delete restrict on update restrict;
create index ix_dataset_instrument_2 on dataset (instrumentId);
alter table dataset_entry add constraint fk_dataset_entry_dataset_3 foreign key (datasetId) references dataset (id) on delete restrict on update restrict;
create index ix_dataset_entry_dataset_3 on dataset_entry (datasetId);
alter table dataset_entry add constraint fk_dataset_entry_user_4 foreign key (registorId) references user (id) on delete restrict on update restrict;
create index ix_dataset_entry_user_4 on dataset_entry (registorId);
alter table dataset_log add constraint fk_dataset_log_dataset_5 foreign key (dataSetId) references dataset (id) on delete restrict on update restrict;
create index ix_dataset_log_dataset_5 on dataset_log (dataSetId);
alter table dataset_log add constraint fk_dataset_log_originalDataset_6 foreign key (originalDatasetId) references dataset (id) on delete restrict on update restrict;
create index ix_dataset_log_originalDataset_6 on dataset_log (originalDatasetId);
alter table dataset_log add constraint fk_dataset_log_outputDataset_7 foreign key (outputDatasetId) references dataset (id) on delete restrict on update restrict;
create index ix_dataset_log_outputDataset_7 on dataset_log (outputDatasetId);
alter table parameter add constraint fk_parameter_climateService_8 foreign key (serviceId) references climate_service (id) on delete restrict on update restrict;
create index ix_parameter_climateService_8 on parameter (serviceId);
alter table service_entry add constraint fk_service_entry_climateService_9 foreign key (serviceId) references climate_service (id) on delete restrict on update restrict;
create index ix_service_entry_climateService_9 on service_entry (serviceId);
alter table service_entry add constraint fk_service_entry_user_10 foreign key (registorId) references user (id) on delete restrict on update restrict;
create index ix_service_entry_user_10 on service_entry (registorId);



alter table DatasetAndService add constraint fk_DatasetAndService_dataset_01 foreign key (datasetId) references dataset (id) on delete restrict on update restrict;

alter table DatasetAndService add constraint fk_DatasetAndService_climate_service_02 foreign key (climateServiceId) references climate_service (id) on delete restrict on update restrict;

alter table WorkflowAndUser add constraint fk_WorkflowAndUser_workflow_01 foreign key (workflowId) references workflow (id) on delete restrict on update restrict;

alter table WorkflowAndUser add constraint fk_WorkflowAndUser_user_02 foreign key (userId) references user (id) on delete restrict on update restrict;

alter table WorkflowAndClimateService add constraint fk_WorkflowAndClimateService_workflow_01 foreign key (workflowId) references workflow (id) on delete restrict on update restrict;

alter table WorkflowAndClimateService add constraint fk_WorkflowAndClimateService_climate_service_02 foreign key (climateServiceId) references climate_service (id) on delete restrict on update restrict;

# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table climate_service;

drop table dataset;

drop table DatasetAndService;

drop table dataset_entry;

drop table dataset_log;

drop table instrument;

drop table parameter;

drop table service_entry;

drop table user;

drop table workflow;

drop table WorkflowAndUser;

drop table WorkflowAndClimateService;

SET FOREIGN_KEY_CHECKS=1;

