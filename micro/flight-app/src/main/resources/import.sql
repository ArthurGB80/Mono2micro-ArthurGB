    Create sequence flight_sequence start with 1 increment by 1;
    INSERT INTO flight(id, traveOrderId, fromAirport,toAirport) VALUES (nextval('flight_sequence'),1,'GRU', 'TS1');
    INSERT INTO flight(id, traveOrderId, fromAirport,toAirport) VALUES (nextval('flight_sequence'),2,'GRU', 'TS2');
    INSERT INTO flight(id, traveOrderId, fromAirport,toAirport) VALUES (nextval('flight_sequence'),3,'GRU', 'TS3');
    INSERT INTO flight(id, traveOrderId, fromAirport,toAirport) VALUES (nextval('flight_sequence'),4,'GRU', 'TS4');
    INSERT INTO flight(id, traveOrderId, fromAirport,toAirport) VALUES (nextval('flight_sequence'),5,'GRU', 'TS5');
