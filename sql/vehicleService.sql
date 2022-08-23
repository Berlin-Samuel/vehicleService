create table user_details(
user_id int primary key,
user_name varchar2(20) not null,
aadhar_number varchar2(20) not null unique,
mobile_number number(15) not null unique,
user_email varchar2(30) not null unique,
user_password varchar2(20) not null);
 
select * from user_details;
desc user_details;

create table service_centre(
service_centre_id int primary key,
centre_location varchar2(20) not null,
centre_phone_number number(15) not null unique,
centre_email varchar2(30) not null unique,
centre_address varchar2(200) not null,
contact_person_name varchar2(20) not null,
contact_person_role varchar2(20) not null);

select * from service_centre;
desc service_centre;

create table vehicle_type(
vehicle_reg_number varchar(20) primary key,
vehicle_type varchar2(10)not null,
vehicle_color varchar2(10) not null,
vehicle_model varchar2(10)not null,
vehicle_date_purchase date not null,
vehicle_fc_date	date not null,
insurance_to date not null,
user_id int not null,
foreign key(user_id) references user_details(user_id));

select * from vehicle_type;
desc vehicle_type;

create table book_service(
booking_id int primary key,
service_centre_id int not null, 
foreign key(service_centre_id) references service_centre(service_centre_id),
vehicle_reg_number varchar2(20) not null,
foreign key(vehicle_reg_number) references vehicle_type(vehicle_reg_number),
user_id int not null,
foreign key(user_id) references user_details(user_id),
service_date date not null);

select * from book_service;
desc book_service;

create table services(
service_detail_id int primary key,
service_type varchar2(20) not null,
service_charge int not null,
service_description varchar2(30) not null);

select * from services;
desc services;

create table service_details(
service_detail_id int not null,
foreign key(service_detail_id) references services(service_detail_id),
booking_id int not null,
foreign key (booking_id) references book_service(booking_id),
service_charges int not null,
service_date date not null);

select * from service_details;
desc service_details;

create table payment(
bill_number int primary key,
booking_id int not null,
foreign key(booking_id) references book_service(booking_id),
bill_amount int not null, 
bill_date date not null);

select * from payment;
desc payment;

select * from admin;
INSERT INTO admin (admin_Id,admin_Name,phone_number,admin_Email,admin_password )
VALUES (1,'berlin',9597385762,'berlin@gmail.com','1234');
INSERT INTO admin (admin_Id,admin_Name,phone_number,admin_Email,admin_password )
VALUES (2,'samuel',636026077,'samuel@gmail.com','abcd');
commit;

select * from admin;
desc admin;

create sequence user_id_ref start with 100000 increment by 1;
create sequence service_centre_id_ref start with 1000 increment by 1;

commit;