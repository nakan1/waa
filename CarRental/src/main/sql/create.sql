-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2014 at 02:45 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sinka`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE IF NOT EXISTS `booking` (
  `bookinId` int(11) NOT NULL AUTO_INCREMENT,
  `dateFrom` varchar(50) DEFAULT NULL,
  `dateTo` varchar(50) DEFAULT NULL,
  `confirmation_letter_sent` tinyint(1) DEFAULT NULL,
  `payementReceve` tinyint(1) DEFAULT NULL,
  `user_username` varchar(45) NOT NULL,
  `vehicle_registrationNumber` varchar(45) NOT NULL,
  PRIMARY KEY (`bookinId`),
  KEY `fk_booking_user1_idx` (`user_username`),
  KEY `fk_booking_vehicle1_idx` (`vehicle_registrationNumber`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`bookinId`, `dateFrom`, `dateTo`, `confirmation_letter_sent`, `payementReceve`, `user_username`, `vehicle_registrationNumber`) VALUES
(1, '2014-12-25', '2014-12-26', NULL, NULL, 'mo', '111'),
(2, '2014-12-18', '2014-12-25', NULL, NULL, 'mo', '111'),
(3, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(4, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(5, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(6, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(7, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(8, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(9, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(10, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(11, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(12, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(13, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(14, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(15, '', '', NULL, NULL, 'admin', '111'),
(16, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111'),
(17, '2014-12-18', '2014-12-25', NULL, NULL, 'admin', '111');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `vehicleCategoryCode` int(11) NOT NULL AUTO_INCREMENT,
  `vehicleCategoryDescription` varchar(225) NOT NULL,
  PRIMARY KEY (`vehicleCategoryCode`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`vehicleCategoryCode`, `vehicleCategoryDescription`) VALUES
(3, 'car'),
(4, 'cars');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `phone` varchar(45) NOT NULL,
  `address_line_1` varchar(45) DEFAULT NULL,
  `address_line_2` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `user_roles_userRolesId` int(11) NOT NULL,
  PRIMARY KEY (`username`),
  KEY `fk_user_user_roles1_idx` (`user_roles_userRolesId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `email`, `firstName`, `lastName`, `gender`, `phone`, `address_line_1`, `address_line_2`, `city`, `user_roles_userRolesId`) VALUES
('admin', '123456', '', '', '', '', '32433243', '', '', '', 1),
('mam', 'sdfsf', '', '', '', '', '24332423', '', '', '', 2),
('mamadou', '232323', 'diarra@gmail.com', 'sfd', '', '', '2343242', '', '', '', 1),
('mo', 'sdfs', '', '', '', '', '345345', '', '', '', 1),
('user', 'sdfdf', '', '', '', '', '435435435', '', '', '', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user_roles`
--

CREATE TABLE IF NOT EXISTS `user_roles` (
  `userRolesId` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userRolesId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `user_roles`
--

INSERT INTO `user_roles` (`userRolesId`, `ROLE`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE IF NOT EXISTS `vehicle` (
  `registrationNumber` varchar(45) NOT NULL,
  `curentMileage` double NOT NULL,
  `engineSize` varchar(45) DEFAULT NULL,
  `dailyHireRate` double DEFAULT NULL,
  `make` varchar(50) DEFAULT NULL,
  `category_vehicleCategoryCode` int(11) NOT NULL,
  `vehicleImage` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`registrationNumber`),
  KEY `fk_vehicle_category_idx` (`category_vehicleCategoryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`registrationNumber`, `curentMileage`, `engineSize`, `dailyHireRate`, `make`, `category_vehicleCategoryCode`, `vehicleImage`) VALUES
('111', 20, '3.5', 20, 'toyota', 3, ''),
('23s', 20, 'medium', 20, 'honda', 3, '\\resources\\images\\23s.png');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `fk_booking_user1` FOREIGN KEY (`user_username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_booking_vehicle1` FOREIGN KEY (`vehicle_registrationNumber`) REFERENCES `vehicle` (`registrationNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `fk_user_user_roles1` FOREIGN KEY (`user_roles_userRolesId`) REFERENCES `user_roles` (`userRolesId`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD CONSTRAINT `fk_vehicle_category` FOREIGN KEY (`category_vehicleCategoryCode`) REFERENCES `category` (`vehicleCategoryCode`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
