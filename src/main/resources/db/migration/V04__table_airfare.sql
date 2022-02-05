CREATE TABLE tb_airfare (
	id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    voo_id BIGINT,
    flight_seat_id BIGINT,
    customer_id BIGINT,
    purchase_date TIMESTAMP DEFAULT NOW()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_airfare (voo_id, flight_seat_id, customer_id) VALUES (1, 2, 1);
UPDATE tb_flight_seat SET available = false WHERE id = 2;

INSERT INTO tb_airfare (voo_id, flight_seat_id, customer_id) VALUES (2, 5, 2);
UPDATE tb_flight_seat SET available = false WHERE id = 5;
INSERT INTO tb_airfare (voo_id, flight_seat_id, customer_id) VALUES (2, 6, 2);
UPDATE tb_flight_seat SET available = false WHERE id = 6;