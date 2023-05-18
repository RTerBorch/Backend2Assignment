create table item (id Long not null, name varchar(30), price double, primary key (id)) engine=InnoDB;
create table item_seq (next_val bigint) engine=InnoDB;
insert into item_seq values ( 1 );