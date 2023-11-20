insert into farmDetails values(7, "sam");
insert into farmDetails values(8, "john");
insert into farmDetails values(9, "ted");
insert into farmDetails values(10, "patrick");

INSERT INTO moisture_sensor (sensor_id, farm_id, zone, reading)
values 
 (1, 7, 1, 0.3),
 (2, 7, 2, 0.5),
 (3, 7, 3, 0.6),
 (4, 7, 4, 0.2);
 
INSERT INTO sprinkler (sprinkler_id, farm_id, status, zone)
values 
 (1, 7, 1, 1),
 (2, 7, 1, 2),
 (3, 7, 0, 3),
 (4, 7, 1, 4);
 
 
 select * from farm_details;
 INSERT INTO farm_details (farm_id, moisture_threshold, user_id)
values 
 (7,0.5,1),
 (8,0.3,3),
 (6,0.4,1),
 (5,0.6,2);
 
  update moisture_sensor s set s.reading=0.4 where farm_id=7 and sensor_id=1;
  update moisture_sensor s set s.reading=0.7 where farm_id=7 and sensor_id=2;
   update moisture_sensor s set s.reading=0.6 where farm_id=7 and sensor_id=3;
    update moisture_sensor s set s.reading=0.9 where farm_id=7 and sensor_id=4;