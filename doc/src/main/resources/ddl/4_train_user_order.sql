-- auto-generated definition
create table train_user_order
(
    id  int auto_increment
        primary key,
    uid int null,
    oid int null,
    constraint train_user_order_ibfk_1
        foreign key (uid) references train_user (id),
    constraint train_user_order_ibfk_2
        foreign key (oid) references train_order (id)
)
    charset = utf8;

create index fk_oid
    on train_user_order (oid);

create index fk_uid
    on train_user_order (uid);

