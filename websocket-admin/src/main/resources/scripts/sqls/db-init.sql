/*
Navicat MySQL Data Transfer

Source Server         : mysql.wms.studio
Source Server Version : 50528
Source Host           : mysql.wms.studio:3306
Source Database       : websocketchat

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2015-05-19 09:02:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(20) NOT NULL,
  `disable` bit(1) NOT NULL DEFAULT b'0',
  `disable_reason` varchar(255) NOT NULL,
  `email` varchar(30) NOT NULL,
  `name` varchar(10) NOT NULL,
  `password` varchar(80) NOT NULL,
  `register_time` datetime NOT NULL,
  `role` varchar(255) NOT NULL,
  `salt` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

