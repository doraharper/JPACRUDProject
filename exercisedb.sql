-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema exercisedb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `exercisedb` ;

-- -----------------------------------------------------
-- Schema exercisedb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `exercisedb` DEFAULT CHARACTER SET utf8 ;
USE `exercisedb` ;

-- -----------------------------------------------------
-- Table `exercise`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `exercise` ;

CREATE TABLE IF NOT EXISTS `exercise` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `skill_level` ENUM('BEGINNER', 'INTERMEDIATE', 'EXPERT') NULL,
  `category` ENUM('Bodyweight', 'weights', 'YO!ga', 'Fun') NULL,
  `description` VARCHAR(1000) NULL,
  `link` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO bunzosteel@localhost;
 DROP USER bunzosteel@localhost;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'bunzosteel'@'localhost' IDENTIFIED BY 'workit';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'bunzosteel'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `exercise`
-- -----------------------------------------------------
START TRANSACTION;
USE `exercisedb`;
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, 'Muster Thruster', 'EXPERT', 'WEIGHTS', 'You really have to muster all your energy for this, and then some. ', NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, 'Holy Snatch!', 'EXPERT', 'WEIGHTS', NULL, NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, '(You\'ll be) DEADlift', '', 'WEIGHTS', NULL, NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, 'The Dreaded Burpee', '', 'FUN', 'One of the simplest, yet effective bodyweight workouts. Simply put, you throw yourself to lay flat on the ground then throw yourself up in the air like you just don\'t care.', NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, 'Squat it Like It\'s Hot', '', 'BODYWEIGHT', NULL, NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, 'jumping-star', 'BEGINNER', 'BODYWEIGHT', NULL, NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, 'sit-up', 'BEGINNER', 'BODYWEIGHT', NULL, NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, 'mountain climbers', 'BEGINNER', 'FUN', NULL, NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, 'The French Roast Toast', 'INTERMEDIATE ', 'FUN', 'This is exactly what is sounds like, delicious breakfast food and not an actual workout. You are welcome. Also, let me know if you have a recipe!', NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, 'Garland Pose', NULL, 'YO!ga', 'Get into a deep squat and place your elbows on the inside of your knees while putting your hands together. This might be helpful after ', NULL);
INSERT INTO `exercise` (`id`, `name`, `skill_level`, `category`, `description`, `link`) VALUES (DEFAULT, '', NULL, NULL, NULL, NULL);

COMMIT;
