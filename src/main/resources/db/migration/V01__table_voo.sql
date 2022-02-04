CREATE TABLE tb_voo (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	time_to_go DATETIME,
	arrival_time DATETIME,
	airport_of_origin VARCHAR(200),
	destination_airport VARCHAR(200),
	number_of_seats INT,
	price DOUBLE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO 
	tb_voo (time_to_go, arrival_time, airport_of_origin, destination_airport, number_of_seats, price) 
VALUES 
	('2022-02-17-11:25:30', '2022-02-04-15:30:00', 'Congonhas SP', 'Santos Dumont RJ', 4, 359.99);
	
INSERT INTO 
	tb_voo (time_to_go, arrival_time, airport_of_origin, destination_airport, number_of_seats, price) 
VALUES 
	('2022-02-18-09:00:00', '2022-02-18-17:00:00', 'Internacional Guarulhos - SP', 'Internacional Salvador - BA', 8, 599.99);

INSERT INTO 
	tb_voo (time_to_go, arrival_time, airport_of_origin, destination_airport, number_of_seats, price) 
VALUES 
	('2022-02-19-08:30:00', '2022-02-19-16:00:00', 'Internacional Guarulhos - SP', 'Internacional Salvador - BA', 6, 499.89);