create table book_seller_sc.user (
    id varchar(80) not null primary key,
    user_name varchar (80),
    password varchar(80),
    email varchar(80),
    first_name varchar(80),
    last_name varchar(80),
    created_time timestamp,
    updated_time timestamp,
    role varchar(10)
);

create table book_seller_sc.book (
    id varchar(80) not null primary key,
    name varchar(80),
    description varchar(255),
    price decimal,
    created_time timestamp,
    updated_time timestamp
);

create table book_seller_sc.purchase (
    id varchar(80) not null primary key,
    user_id varchar(80),
    book_id varchar(80),
    price decimal,
    purchase_time timestamp
)