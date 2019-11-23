-- auto-generated definition
create table train_region_station
(
    id           smallint(6) auto_increment
        primary key,
    region_id    smallint(6) null,
    station_abbr varchar(10) null,
    station_name varchar(50) null,
    constraint train_region_station_ibfk_1
        foreign key (region_id) references train_region (REGION_ID)
)
    charset = utf8;

create index fk_region_id
    on train_region_station (region_id);

