-- MySQL Script generated by MySQL Workbench
-- Wed Sep 12 22:01:14 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema bdTicketUnla
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdTicketUnla
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdTicketUnla` DEFAULT CHARACTER SET utf8 ;
USE `bdTicketUnla` ;

-- -----------------------------------------------------
-- Table `bdTicketUnla`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdTicketUnla`.`usuario` (
  `idUsuario` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `contraseña` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdTicketUnla`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdTicketUnla`.`cliente` (
  `idCliente` INT NOT NULL,
  `dni` INT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `fechaNacimiento` DATE NULL,
  PRIMARY KEY (`idCliente`),
  INDEX `fk_cliente_usuario` (`idCliente` ASC),
  CONSTRAINT `fk_cliente_usuario`
    FOREIGN KEY (`idCliente`)
    REFERENCES `bdTicketUnla`.`usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdTicketUnla`.`administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdTicketUnla`.`administrador` (
  `idAdministrador` INT NOT NULL,
  PRIMARY KEY (`idAdministrador`),
  INDEX `fk_admin_usuario` (`idAdministrador` ASC),
  CONSTRAINT `fk_administrador_usuario1`
    FOREIGN KEY (`idAdministrador`)
    REFERENCES `bdTicketUnla`.`usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdTicketUnla`.`vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdTicketUnla`.`vendedor` (
  `idVendedor` INT NOT NULL,
  PRIMARY KEY (`idVendedor`),
  INDEX `fk_vendedor_usuario` (`idVendedor` ASC),
  CONSTRAINT `fk_vendedor_usuario1`
    FOREIGN KEY (`idVendedor`)
    REFERENCES `bdTicketUnla`.`usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;