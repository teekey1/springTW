insert into contact_details(id, city, email, street) values (1, 'Warsaw', 'tom@test.com', 'street1');
insert into contact_details(id, city, email, street) values (2, 'Cracow', 'pawel@test.com', 'street2');
insert into contact_details(id, city, email, street) values (3, 'Cracow', 'maciej@test.com', 'street3');

insert into users(id, name, surname, details_id) values (1, 'Tomek', 'Krogulec', '1');
insert into users(id, name, surname, details_id) values (2, 'Pawel', 'Kowalski', '2');
insert into users(id, name, surname, details_id) values (3, 'Maciej', 'Jedrzejczyk', '3');

insert into cars(id, brand, model, year, user_id) values (1, 'Tesla', 'Model S', 2010, 2);
insert into cars(id, brand, model, year, user_id) values (2, 'Lambo', 'Galardo', 2005, 2);
insert into cars(id, brand, model, year, user_id) values (3, 'Opel', 'Astra', 2015, 3);

insert into users_cars(users_id, cars_id) values (2, 1);
insert into users_cars(users_id, cars_id) values (2, 2);
insert into users_cars(users_id, cars_id) values (3, 3);