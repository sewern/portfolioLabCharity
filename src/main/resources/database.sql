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

insert institutions( name, description)
values
('Fundacja "TEST"', 'Cel i misja: TEST.');

select * from institutions;
