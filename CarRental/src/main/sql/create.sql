-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sinka
-- -----------------------------------------------------
-- fianal waa project
DROP SCHEMA IF EXISTS `sinka` ;

-- -----------------------------------------------------
-- Schema sinka
--
-- fianal waa project
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sinka` ;
USE `sinka` ;

-- -----------------------------------------------------
-- Table `sinka`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sinka`.`user` ;

CREATE TABLE IF NOT EXISTS `sinka`.`user` (
  `username` VARCHAR(45) NOT NULL,
  `password` DECIMAL(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NOT NULL,
  `address_line_1` VARCHAR(45) NULL,
  `address_line_2` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  PRIMARY KEY (`username`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sinka`.`category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sinka`.`category` ;

CREATE TABLE IF NOT EXISTS `sinka`.`category` (
  `vehicleCategoryCode` INT NOT NULL AUTO_INCREMENT,
  `vehicleCategoryDescription` VARCHAR(225) NOT NULL,
  PRIMARY KEY (`vehicleCategoryCode`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sinka`.`user_roles`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sinka`.`user_roles` ;

CREATE TABLE IF NOT EXISTS `sinka`.`user_roles` (
  `userRolesId` INT NOT NULL AUTO_INCREMENT,
  `user_username` VARCHAR(45) NOT NULL,
  `ROLE` VARCHAR(45) NULL,
  PRIMARY KEY (`userRolesId`),
  INDEX `fk_user_roles_user1_idx` (`user_username` ASC),
  CONSTRAINT `fk_user_roles_user1`
    FOREIGN KEY (`user_username`)
    REFERENCES `sinka`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sinka`.`vehicle`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sinka`.`vehicle` ;

CREATE TABLE IF NOT EXISTS `sinka`.`vehicle` (
  `registrationNumber` VARCHAR(45) NOT NULL,
  `curentMileage` DOUBLE NOT NULL,
  `engineSize` VARCHAR(45) NULL,
  `dailyHireRate` DOUBLE NULL,
  `category_vehicleCategoryCode` INT NOT NULL,
  PRIMARY KEY (`registrationNumber`),
  INDEX `fk_vehicle_category_idx` (`category_vehicleCategoryCode` ASC),
  CONSTRAINT `fk_vehicle_category`
    FOREIGN KEY (`category_vehicleCategoryCode`)
    REFERENCES `sinka`.`category` (`vehicleCategoryCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sinka`.`booking`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sinka`.`booking` ;

CREATE TABLE IF NOT EXISTS `sinka`.`booking` (
  `bookinId` INT NOT NULL AUTO_INCREMENT,
  `dateFrom` DATETIME NULL,
  `dateTo` DATETIME NULL,
  `confirmation_letter_sent` TINYINT(1) NULL,
  `payementReceve` TINYINT(1) NULL,
  `user_username` VARCHAR(45) NOT NULL,
  `vehicle_registrationNumber` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`bookinId`),
  INDEX `fk_booking_user1_idx` (`user_username` ASC),
  INDEX `fk_booking_vehicle1_idx` (`vehicle_registrationNumber` ASC),
  CONSTRAINT `fk_booking_user1`
    FOREIGN KEY (`user_username`)
    REFERENCES `sinka`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_booking_vehicle1`
    FOREIGN KEY (`vehicle_registrationNumber`)
    REFERENCES `sinka`.`vehicle` (`registrationNumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sinka`.`user_copy1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sinka`.`user_copy1` ;

CREATE TABLE IF NOT EXISTS `sinka`.`user_copy1` (
  `username` VARCHAR(45) NOT NULL,
  `password` DECIMAL(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NOT NULL,
  `address_line_1` VARCHAR(45) NULL,
  `address_line_2` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  PRIMARY KEY (`username`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
