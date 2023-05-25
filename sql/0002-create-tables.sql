use db_items;
create table item (id int not null, name varchar(30), price double, primary key (id)) engine=InnoDB;
create table item_seq (next_val bigint) engine=InnoDB;
insert into item_seq values ( 1 );


use db_customers;
create table customer (id int not null, name varchar(30), ssn varchar(30), primary key (id)) engine=InnoDB;
create table customer_seq (next_val bigint) engine=InnoDB;
insert into customer_seq values ( 1 );


use db_orders;
create table customer_order_seq (next_val bigint) engine=InnoDB
insert into customer_order_seq values ( 1 )
create table customer_order (id bigint not null, customer_id bigint, primary key (id)) engine=InnoDB
create table customer_order_itemidlist (customer_order_id bigint not null, itemidlist bigint) engine=InnoDB
alter table customer_order_itemidlist add constraint FK6c1ue67l4yqp88f787mmqnqfp foreign key (customer_order_id) references customer_order (id)
-- create table customer_order (id int not null, primary key (id)) engine=InnoDB;
-- create table customer_order_seq (next_val bigint) engine=InnoDB;
-- insert into customer_order_seq values ( 1 ); 
