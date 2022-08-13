drop table if exists loans;
drop table if exists credit_facilities;
drop table if exists applicants;

create table applicants
(
    id            serial primary key,
    first_name    varchar(50)  not null,
    last_name     varchar(50)  not null,
    contact_no    varchar      not null,
    email         varchar(100) not null,
    annual_salary decimal      not null,
    constraint uk_contact_no unique (contact_no),
    constraint uk_email unique (email)
);

insert into applicants (first_name, last_name, contact_no, email, annual_salary)
values ('Bob', 'Tan', '91234567', 'bob.tan@email.com', 48000);
insert into applicants (first_name, last_name, contact_no, email, annual_salary)
values ('Alice', 'Chan', '91234568', 'alice.chan@email.com', 60000);
insert into applicants (first_name, last_name, contact_no, email, annual_salary)
values ('Rayner', 'Lim', '91234569', 'rayner.lim@email.com', 32000);

create table credit_facilities
(
    id           serial primary key,
    start_date   date        not null,
    end_date     date        not null,
    currency     varchar(3)  not null,
    total_limit  decimal     not null,
    loan_type    varchar(10) not null,
    applicant_id integer     not null,
    constraint fk_applicant_id foreign key (applicant_id) references applicants (id),
    constraint start_date_end_date_check check (start_date <= end_date)
);

insert into credit_facilities (start_date, end_date, currency, total_limit, loan_type, applicant_id)
values (current_date, current_date + 1, 'SGD', 16000, 'CAR', 1);
insert into credit_facilities (start_date, end_date, currency, total_limit, loan_type, applicant_id)
values (current_date + 1, current_date + 2, 'SGD', 8000, 'HOME', 1);

create table loans
(
    id                 serial primary key,
    currency           varchar(3)       not null,
    amount             decimal          not null,
    start_date         date             not null,
    end_date           date             not null,
    interest_rate      double precision not null,
    credit_facility_id integer          not null,
    constraint fk_credit_facility_id foreign key (credit_facility_id) references credit_facilities (id),
    constraint start_date_end_date_check check (start_date <= end_date)
);