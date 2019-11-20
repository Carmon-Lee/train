-- auto-generated definition
create table train_user
(
    id        int auto_increment
        primary key,
    name      varchar(20)      not null,
    full_name varchar(50)      not null,
    passwd    varchar(20)      not null,
    id_type   tinyint          not null,
    id_no     char(18)         not null,
    is_valid  char default 'Y' null,
    constraint k_id
        unique (id_type, id_no),
    constraint k_name
        unique (name)
)
    charset = utf8;

