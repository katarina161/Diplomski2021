/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 8.0.22 : Database - maestral
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`maestral` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `maestral`;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(250) COLLATE utf8_vietnamese_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

/*Data for the table `category` */

insert  into `category`(`id`,`name`) values 
(1,'One Piece'),
(2,'Dresses and Skirts'),
(3,'T-Shirts'),
(4,'Sweaters & Hoodies');

/*Table structure for table `invoice` */

DROP TABLE IF EXISTS `invoice`;

CREATE TABLE `invoice` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `number` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `partner` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `date` date NOT NULL,
  `total` double NOT NULL DEFAULT '0',
  `processed` tinyint(1) NOT NULL DEFAULT '0',
  `canceled` tinyint(1) NOT NULL DEFAULT '0',
  `user_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `invoice` */

insert  into `invoice`(`id`,`number`,`partner`,`date`,`total`,`processed`,`canceled`,`user_id`) values 
(2,'INV-10022021-1','Petar Petrovic','2021-03-29',14160,0,0,1),
(3,'INV-10022021-2','Ivana Ivanovic','2021-02-16',207960,1,1,1),
(7,'INV-14022021-1','Jovan Markovic','2021-02-14',115920,0,0,5),
(8,'INV-14022021-2','Miodrag Radulovic','2021-02-16',36960,1,1,1),
(16,'INV-10022021-2','Ivana Ivanovic','2021-02-16',-207960,1,1,1),
(18,'INV-16022021-1','Test','2021-02-16',13140,1,1,1),
(23,'INV-20022021-1','A','2021-03-16',10740,1,0,1),
(28,'INV-29032021-1','Ivan Ivanović','2021-03-29',17820,0,0,1),
(29,'INV-14022021-2','Miodrag Radulovic','2021-02-16',-36960,1,1,1),
(30,'INV-29032021-2','Testing','2021-03-29',58800,1,0,1),
(31,'INV-16022021-1','Test','2021-02-16',-13140,1,1,1);

/*Table structure for table `invoice_item` */

DROP TABLE IF EXISTS `invoice_item`;

CREATE TABLE `invoice_item` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `invoice_id` bigint unsigned NOT NULL,
  `order_number` int NOT NULL,
  `product_article` int NOT NULL,
  `size` int NOT NULL,
  `quantity` int NOT NULL DEFAULT '0',
  `price` double NOT NULL,
  `total` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `invoice_id` (`invoice_id`),
  KEY `product_article` (`product_article`),
  CONSTRAINT `invoice_item_ibfk_1` FOREIGN KEY (`invoice_id`) REFERENCES `invoice` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `invoice_item_ibfk_2` FOREIGN KEY (`product_article`) REFERENCES `product` (`article`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `invoice_item` */

insert  into `invoice_item`(`id`,`invoice_id`,`order_number`,`product_article`,`size`,`quantity`,`price`,`total`) values 
(4,2,1,338,62,20,708,14160),
(5,3,1,338,62,100,708,70800),
(6,3,2,338,68,100,708,70800),
(7,3,3,338,74,70,708,49560),
(8,3,4,395,80,10,840,8400),
(9,3,5,395,86,10,840,8400),
(10,7,1,368,74,30,588,17640),
(11,7,2,368,80,30,588,17640),
(12,7,3,23,92,50,576,28800),
(13,7,4,23,86,50,576,28800),
(14,7,5,23,80,20,576,11520),
(15,7,6,23,80,20,576,11520),
(16,8,1,338,62,20,708,14160),
(17,8,2,338,68,10,708,7080),
(18,8,3,377,62,10,708,7080),
(19,8,4,23,92,15,576,8640),
(28,23,1,1,62,1,120,120),
(29,23,2,377,62,15,708,10620),
(35,18,1,377,62,5,708,3540),
(36,18,2,377,68,5,708,3540),
(37,18,3,377,74,5,708,3540),
(38,18,4,395,62,3,840,2520),
(39,28,1,338,62,10,708,7080),
(40,28,2,395,62,10,840,8400),
(41,28,3,307,62,5,468,2340),
(42,30,1,367,80,100,588,58800);

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `article` int NOT NULL,
  `name` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(800) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` double NOT NULL,
  `price_with_vat` double NOT NULL,
  `category_id` int NOT NULL,
  PRIMARY KEY (`article`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `product_chk_1` CHECK ((`price` >= 0)),
  CONSTRAINT `product_chk_2` CHECK ((`price_with_vat` >= 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `product` */

insert  into `product`(`article`,`name`,`description`,`price`,`price_with_vat`,`category_id`) values 
(1,'Nov naziv','Izmenjen opis proizvoda',150,180,1),
(13,'sun','sunny',1000,1200,2),
(23,'Batman','White bloesw with black sleeves',480,576,4),
(307,'CHEERFULLY','Cheerfull pink blouse with hearted smiley   face',390,468,3),
(338,'Girl Doctor','White one piece with pink shirt print and \nheart shaped stratoscope',590,708,1),
(367,'Minnie Mouse','Pink blouse with Minnie Mouse print',490,588,4),
(368,'Mickey Mouse','Blue hoodie with Mickey Mouse print',490,588,4),
(377,'Little Gentleman','Black one piece with red tie',590,708,1),
(395,'Princess dress','White dress with black stripes',700,840,2),
(822,'Ballerina','Red skirt with bow',650,780,2);

/*Table structure for table `product_size` */

DROP TABLE IF EXISTS `product_size`;

CREATE TABLE `product_size` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `product_article` int NOT NULL,
  `size_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `size_id` (`size_id`),
  KEY `product_size_ibfk_1` (`product_article`),
  CONSTRAINT `product_size_ibfk_1` FOREIGN KEY (`product_article`) REFERENCES `product` (`article`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `product_size_ibfk_2` FOREIGN KEY (`size_id`) REFERENCES `size` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `product_size` */

insert  into `product_size`(`id`,`product_article`,`size_id`) values 
(1,822,3),
(2,822,4),
(3,822,5),
(21,368,1),
(30,368,4),
(38,23,5),
(39,23,3),
(40,368,2),
(41,368,3),
(44,338,1),
(45,338,2),
(46,338,3),
(47,377,1),
(48,377,2),
(49,377,3),
(50,395,1),
(51,395,2),
(52,395,3),
(53,395,4),
(54,395,5),
(55,822,1),
(56,822,2),
(57,23,4),
(58,23,6),
(59,367,6),
(60,367,5),
(61,367,4),
(67,1,4),
(69,307,1),
(70,307,2),
(71,307,3),
(72,1,1),
(73,1,2),
(74,1,3),
(75,13,1);

/*Table structure for table `size` */

DROP TABLE IF EXISTS `size`;

CREATE TABLE `size` (
  `id` int NOT NULL AUTO_INCREMENT,
  `number` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `size` */

insert  into `size`(`id`,`number`) values 
(1,62),
(2,68),
(3,74),
(4,80),
(5,86),
(6,92);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `first_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `admin` tinyint(1) DEFAULT '0',
  `image` bigint DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `image` (`image`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`image`) REFERENCES `user_image` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`first_name`,`last_name`,`admin`,`image`) values 
(1,'admin','admin','Katarina','Novakovic',1,6),
(2,'rooney','tit','Rodney','Trotter',0,3),
(5,'delboy','tit','Derek','Trotter',1,2),
(11,'delboy*100*','123412341234','Derek','Trotter',0,2);

/*Table structure for table `user_image` */

DROP TABLE IF EXISTS `user_image`;

CREATE TABLE `user_image` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `path` varchar(2000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user_image` */

insert  into `user_image`(`id`,`path`) values 
(1,'images/unknown.png'),
(2,'images/Derek_Trotter.jpeg'),
(3,'images/Rodney_Trotter.jpeg'),
(4,'images/Albert_Trotter.jpeg'),
(5,'images/Boycie.jpeg'),
(6,'images/Katarina_Novakovic.jpeg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
