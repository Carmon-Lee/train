-- auto-generated definition
create table train_order
(
    id           int auto_increment
        primary key,
    user_id      int         null,
    station_id   smallint(6) null,
    ticket_count tinyint     null,
    ticket_price float       null,
    constraint train_order_ibfk_1
        foreign key (user_id) references train_user (id)
)
    charset = utf8;

create index fk_user_id
    on train_order (user_id);

