
CREATE TABLE retail_products (
	id VARCHAR(36),
	created_date BIGINT,
	created_by VARCHAR(255),
	updated_date BIGINT,
	updated_by VARCHAR(255),
	name VARCHAR(255),
	description TEXT,
	rating FLOAT,
	availability BOOLEAN,
	price NUMERIC(10, 2),
	expired_date BIGINT,
	stock_quantity INT,
	size FLOAT,
	size_unit VARCHAR(255),
	weight FLOAT,
	weight_unit VARCHAR(255)
);

CREATE TABLE ebook_products (
	id VARCHAR(36),
	created_date BIGINT,
	created_by VARCHAR(255),
	updated_date BIGINT,
	updated_by VARCHAR(255),
	name VARCHAR(255),
	description TEXT,
	rating FLOAT,
	availability BOOLEAN,
	price NUMERIC(10, 2),
	author VARCHAR(255),
	genre VARCHAR(255),
	publish_date BIGINT,
	language VARCHAR(255),
	number_of_pages INT
);
