/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : acloud

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 18/02/2020 13:42:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sysrolepermission
-- ----------------------------
DROP TABLE IF EXISTS `sysrolepermission`;
CREATE TABLE `sysrolepermission`  (
  `role_id` varchar(32) CHARACTER SET armscii8 COLLATE armscii8_general_ci NOT NULL COMMENT '角色id',
  `permission_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限id'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sysrolepermission
-- ----------------------------
INSERT INTO `sysrolepermission` VALUES ('1', '1');
INSERT INTO `sysrolepermission` VALUES ('1', '2');

SET FOREIGN_KEY_CHECKS = 1;
