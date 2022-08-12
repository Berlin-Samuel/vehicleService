create table user_details(
user_id int primary key,
user_name varchar2(20) not null,
aadhar_number varchar2(20) not null unique,
mobile_number number(15) not null unique,
user_email varchar2(30) not null unique,
user_password varchar2(20) not null);

desc user_details;
drop table user_details;

create table service_centre(
service_centre_id int primary key,
centre_location varchar2(20) not null,
centre_phone_number number(15) not null unique,
centre_email varchar2(30) not null unique,
centre_address varchar2(50) not null,
contact_person_name varchar2(20) not null,
contact_person_role varchar2(20) not null);

desc service_centre;
drop table service_centre;

create table vehicle_type(
vehicle_reg_number varchar(20) primary key,
vehicle_type varchar2(10)not null,
vehicle_color varchar2(10) not null,
vehicle_model varchar2(10)not null,
vehicle_date_purchase date not null,
vehicle_fc_date	date not null,
insurance_from	date not null,
insurance_to	date not null,
inurance_company_name varchar2(20) not null,
user_id int not null,
foreign key(user_id) references user_details(user_id));

desc vehicle_type;
drop table vehicle_type;

create table book_service(
booking_id int primary key,
service_centre_id int not null, 
foreign key(service_centre_id) references service_centre(service_centre_id),
vehicle_reg_number varchar2(20) not null,
foreign key(vehicle_reg_number) references vehicle_type(vehicle_reg_number),
user_id int not null,
foreign key(user_id) references user_details(user_id),
service_date date not null,
return_date date not null,
service_estimate_amount	int not null,
actual_service_amount	int not null);

desc book_service;
drop table book_service;

create table services(
service_detail_id int primary key,
service_type varchar2(20) not null,
service_charge int not null,
service_description varchar2(30) not null);

desc services;
drop table services;

create table service_details(
service_detail_id int not null,
foreign key(service_detail_id) references services(service_detail_id),
booking_id int not null,
foreign key (booking_id) references book_service(booking_id),
service_charges int not null,
service_date date not null);

desc service_details;
drop table service_details;

create table payment(
bill_number int primary key,
booking_id int not null,
foreign key(booking_id) references book_service(booking_id),
bill_amount int not null, 
bill_date date not null);

desc payment;
drop table payment;

