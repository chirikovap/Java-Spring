CREATE TABLE IF NOT EXISTS purchase (
id SERIAL PRIMARY KEY NOT NULL,
product varchar(50) NOT NULL,
price double NOT NULL
);