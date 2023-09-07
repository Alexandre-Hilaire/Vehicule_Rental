-- Adminer 4.8.1 MySQL 10.6.12-MariaDB-0ubuntu0.22.04.1 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

CREATE DATABASE `VehiculeRental` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci */;
USE `VehiculeRental`;

DROP TABLE IF EXISTS `clients`;
CREATE TABLE `clients` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(200) NOT NULL,
  `first_name` varchar(200) NOT NULL,
  `birthdate` date NOT NULL,
  `license_number` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;


DROP TABLE IF EXISTS `reservations`;
CREATE TABLE `reservations` (
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `km_estimate` int(11) NOT NULL,
  `estimated_price` int(11) NOT NULL,
  `id_clients` int(11) DEFAULT NULL,
  `car_id` int(11) DEFAULT NULL,
  KEY `id_clients` (`id_clients`),
  KEY `car_id` (`car_id`),
  CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`id_clients`) REFERENCES `clients` (`id`),
  CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`car_id`) REFERENCES `vehicules` (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;


DROP TABLE IF EXISTS `vehicules`;
CREATE TABLE `vehicules` (
  `car_id` int(11) NOT NULL AUTO_INCREMENT,
  `registration` varchar(10) NOT NULL,
  `brand` varchar(200) NOT NULL,
  `model` varchar(200) NOT NULL,
  `color` varchar(200) NOT NULL,
  `base_price` int(11) NOT NULL,
  `km_price` int(11) NOT NULL,
  `fiscal_horsepower` int(11) NOT NULL,
  `id_clients` int(11) DEFAULT NULL,
  PRIMARY KEY (`car_id`),
  KEY `id_clients` (`id_clients`),
  CONSTRAINT `vehicules_ibfk_1` FOREIGN KEY (`id_clients`) REFERENCES `clients` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;


-- 2023-09-07 12:09:45
