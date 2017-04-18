/*
Navicat MySQL Data Transfer

Source Server         : 0.94
Source Server Version : 100114
Source Host           : localhost:3306
Source Database       : testboot

Target Server Type    : MYSQL
Target Server Version : 100114
File Encoding         : 65001

Date: 2017-04-18 17:54:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS=1;
