-- -----------------------------------------------------
-- Database PortfolioLab
-- -----------------------------------------------------
#CREATE SCHEMA IF NOT EXISTS `charity-donation` DEFAULT CHARACTER SET utf8;
-- CREATE DATABASE IF NOT EXISTS `charity-donation` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `charity-donation`;

#drop table categories;
#drop table donations;
#drop table institutions;

/*insert institutions( name, description)
values
('Fundacja "Dbam o Zdrowie"', 'Cel i misja: Pomoc dzieciom z ubogich rodzin.'),
('Fundacja "A kogo"', 'Cel i misja: Pomoc wybudzaniu dzieci ze śpiączki.'),
( 'Fundacja “Dla dzieci"', 'Cel i misja: Pomoc osobom znajdującym się w trudnej sytuacji życiowej.'),
( 'Fundacja “Bez domu”', 'Cel i misja: Pomoc dla osób nie posiadających miejsca zamieszkania');
*/

-- Lista fundacji
/*insert institutions( name, description)
values
('Fundacja "TEST"', 'Cel i misja: TEST.');

select * from institutions;*/

-- Darowizny
/*delete from donations;
insert donations( quantity, pick_up_date, pick_up_time)
values
(1, '2022-07-01', '07:35'),
(3, '2022-07-05', '09:55'),
(2, '2022-07-07', '17:05'),
(1, '2022-07-11', '10:20'),
(3, '2022-07-11', '12:45');*/

select * from donations;
select ifnull( sum(quantity), 0), count(*) from donations;
