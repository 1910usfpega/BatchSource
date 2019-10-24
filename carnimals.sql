create table animals(
animal_id integer primary key,
name varchar(25),
species varchar(25)
);

create table cars(
car_id integer primary key,
name varchar(25),
car_type varchar(25)
);

alter table animals
add constraint fk_animals_animal_id
foreign key (animal_id) references cars(car_id);

alter table cars
add constraint fk_cars_car_id
foreign key (car_id) references animals(animal_id);