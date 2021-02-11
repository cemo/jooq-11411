create table product (
    id bigint not null,
    brand_id bigint not null,
    category_id bigint not null,
    company_id integer not null,
    country varchar(255),
    primary key (id)
) engine=InnoDB