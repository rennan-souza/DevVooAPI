CREATE TABLE tb_flight_seat (
	id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	voo_id BIGINT,
	name VARCHAR(50) NOT NULL,
	available TINYINT(1),
	CONSTRAINT FOREIGN KEY (voo_id) REFERENCES tb_voo(id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(1, 'A1', true);	
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(1, 'A2', true);
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(1, 'B1', true);
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(1, 'B2', true);
	
	


INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(2, 'A1', true);	
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(2, 'A2', true);
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(2, 'B1', false);
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(2, 'B2', false);	
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(2, 'C1', false);	
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(2, 'C2', true);
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(2, 'D1', false);
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(2, 'D2', true);	
	
	
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(3, 'A1', false);	

INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(3, 'A1', false);
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(3, 'B1', true);	

INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(3, 'B1', true);		
	
INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(3, 'C1', false);	

INSERT INTO 
	tb_flight_seat (voo_id, name, available)
VALUES 
	(3, 'C1', false);