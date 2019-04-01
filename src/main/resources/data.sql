INSERT INTO product(id, price, name, brief_description, description)VALUES (1, 33.20, 'Pierogi ruskie kręcone na kolanie', '12szt z surówką', 'Używamy ' ||
 '2 kolana, 4 łokcie i 1 język oraz mąkę krupczatkę trzykrotnie przesiewaną'), (2, 45.10, 'Pierogi nadziewane dziczyzną', '10szt z surówką', 'Używamy ' ||
 'od początku dzikich kurczaków i wszyscy klienci mówią, że smaczna ta dziczyzna'), (3, 21.00, 'Pierogi w onucach', '6szt z surówką', 'Używamy wyprane rok temu onuce i klienci mówią, że pycha'), (4, 19.90, 'Pierogi z makiem i rodzynkami', '9szt ', 'Używamy ' ||
 'maku z własnej pilnie strzeżonej uprawy w piwnicy u szwagra i rodzynek przemycanych prosto z Mongolii'),(5, 33.20, 'Pierogi z kapustą', '11szt z surówką', 'Używamy ' ||
 'pekińską kapustę sprowadzoną z Chin a wyhodowaną pod Warszawą, robot z Korei i musztardę z Francji a wszystko przyrządza nasz jednyny pracownik z Ukrainy');


 INSERT INTO customer_order(id, address, telephone, status )VALUES (1,'Kochanowskiego 23/1, 42-940 Warszawa', '123987345','NEW'),
 (2,'Pawlika 10/2, 34-230 Warszawa', '568123098','IN_PROGRESS'), (3,'Wojska Polskiego 4, 12-348 Warszawa', '543124984','COMPLETE'),
 (4,'Lubelska 3 54-890 Warszawa', '780123654','COMPLETE');

 INSERT INTO order_product (order_id,product_id)VALUES
(1,1),
(1,2),
(2,1),
(2,3),
(2,4),
(3,5),
(4,1),
(4,3),
(4,4);
