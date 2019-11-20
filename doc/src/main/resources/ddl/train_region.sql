-- auto-generated definition
create table train_region
(
    REGION_ID           smallint(6)  not null
        primary key,
    REGION_CODE         varchar(100) not null,
    REGION_NAME         varchar(100) not null,
    PARENT_ID           double       not null,
    REGION_LEVEL        double       not null,
    REGION_ORDER        double       not null,
    REGION_NAME_EN      varchar(100) not null,
    REGION_SHORTNAME_EN varchar(10)  not null
)
    charset = utf8;

