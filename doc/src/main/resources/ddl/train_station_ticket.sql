-- auto-generated definition
create table train_station_ticket
(
    id           smallint(6) auto_increment
        primary key,
    station_id   smallint(6) null,
    ticket_count smallint(6) null
)
    charset = utf8;

