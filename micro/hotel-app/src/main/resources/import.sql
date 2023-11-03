    Create sequence Hotel_sequence start with 1 increment by 1;
    INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('Hotel_sequence'),1,5);
    INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('Hotel_sequence'),2,2);
    INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('Hotel_sequence'),3,3);
    INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('Hotel_sequence'),4,10);
    INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('Hotel_sequence'),5,30);