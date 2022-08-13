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

create table credit_facilities
(
    id           serial primary key,
    start_date   date       not null,
    end_date     date       not null,
    currency     varchar(3) not null,
    total_limit  decimal    not null,
    loan_type    varchar(3) not null,
    applicant_id integer    not null,
    constraint fk_applicant_id foreign key (applicant_id) references applicants (id),
    constraint start_date_end_date_check check (start_date <= end_date)
);

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