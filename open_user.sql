/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : dreamland

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2018-06-12 15:18:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for open_user
-- ----------------------------
DROP TABLE IF EXISTS `open_user`;
CREATE TABLE `open_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `u_id` bigint(20) NOT NULL,
  `open_id` varchar(255) DEFAULT NULL,
  `access_token` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `open_type` varchar(255) DEFAULT NULL,
  `expired_time` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_uid` (`id`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
