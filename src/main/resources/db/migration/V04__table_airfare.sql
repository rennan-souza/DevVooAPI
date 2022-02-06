CREATE TABLE tb_airfare (
	id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    voo_id BIGINT,
    flight_seat_id BIGINT,
    customer_id BIGINT,
    purchase_date TIMESTAMP DEFAULT NOW(),
    purchase_code VARCHAR(200),
    CONSTRAINT FOREIGN KEY (voo_id) REFERENCES tb_voo(id) ON DELETE CASCADE,
    CONSTRAINT FOREIGN KEY (flight_seat_id) REFERENCES tb_flight_seat(id) ON DELETE CASCADE,
    CONSTRAINT FOREIGN KEY (customer_id) REFERENCES tb_customer(id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_airfare (voo_id, flight_seat_id, customer_id, purchase_code) VALUES (1, 2, 1, '132413241322');
UPDATE tb_flight_seat SET available = false WHERE id = 2;

INSERT INTO tb_airfare (voo_id, flight_seat_id, customer_id, purchase_code) VALUES (2, 5, 2, '132413241323');
UPDATE tb_flight_seat SET available = false WHERE id = 5;
INSERT INTO tb_airfare (voo_id, flight_seat_id, customer_id, purchase_code) VALUES (2, 6, 2, '132413241324');
UPDATE tb_flight_seat SET available = false WHERE id = 6;