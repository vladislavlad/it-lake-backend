create schema it_lake;

create table it_lake.tech_type
(
    id    bigserial primary key,
    name  varchar(64) not null unique,
    color varchar(6)  not null
);

create table it_lake.technologies
(
    id          bigserial primary key,
    name        varchar(64)                              not null unique,
    description varchar(256)                             not null,
    type_id     bigint references it_lake.tech_type (id) not null,
    parent_id   bigint references it_lake.technologies (id),
    link        varchar(1024)
);