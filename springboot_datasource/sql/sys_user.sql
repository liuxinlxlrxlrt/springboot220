/*
Navicat MySQL Data Transfer

Source Server         : liuxin
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-03 21:38:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '高圆圆', '北京', '2020-12-03 21:24:17');
INSERT INTO `sys_user` VALUES ('2', '江疏影', '上海', '2020-12-03 21:24:17');
INSERT INTO `sys_user` VALUES ('3', '刘诗诗', '北京', '2020-12-03 21:24:17');
INSERT INTO `sys_user` VALUES ('4', '刘亦菲', '江苏', '2020-12-03 21:24:17');
INSERT INTO `sys_user` VALUES ('5', '许龄月', '云南', '2020-12-03 21:24:17');
INSERT INTO `sys_user` VALUES ('6', '单依纯', '浙江', '2020-12-03 21:24:17');
INSERT INTO `sys_user` VALUES ('7', '景甜', '香港', '2020-12-03 21:24:17');
