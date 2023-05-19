-- CREATE THE ITEMS DATABASE
create database if not exists db_items;
create user if not exists 'items_user'@'%' identified by 'ThePassword';
grant all on db_items.* to 'items_user'@'%';


-- CREATE THE CUSTOMERS DATABASE
create database if not exists db_customers;
create user if not exists 'customers_user'@'%' identified by 'ThePassword';
grant all on db_customers.* to 'customers_user'@'%';


-- CREATE THE ORDERS DATABASE
create database if not exists db_orders;
create user if not exists 'orders_user'@'%' identified by 'ThePassword';
grant all on db_orders.* to 'orders_user'@'%';
