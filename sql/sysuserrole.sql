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

 Date: 18/02/2020 13:42:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sysuserrole
-- ----------------------------
DROP TABLE IF EXISTS `sysuserrole`;
CREATE TABLE `sysuserrole`  (
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `role_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sysuserrole
-- ----------------------------
INSERT INTO `sysuserrole` VALUES ('1', '1');
INSERT INTO `sysuserrole` VALUES ('1', '2');
INSERT INTO `sysuserrole` VALUES ('2', '1');
INSERT INTO `sysuserrole` VALUES ('3', '1');
INSERT INTO `sysuserrole` VALUES ('7022d59966fe4fc4b460c4c3bd4365e7', '1');
INSERT INTO `sysuserrole` VALUES ('12185feabeaa495280bf88068a9d41f9', '2');
INSERT INTO `sysuserrole` VALUES ('d21cdcf229764416b40f8204151bcd50', '1');
INSERT INTO `sysuserrole` VALUES ('6ed22d9a8e6640278a316ff80a5fec00', '3');
INSERT INTO `sysuserrole` VALUES ('e337ee86de5544b79f39a2ed4df30608', '3');
INSERT INTO `sysuserrole` VALUES ('ce13bb76894644d8ae82eb9df908cc06', '1');
INSERT INTO `sysuserrole` VALUES ('36d8224337d04f81b5bd18bb15445155', '1');
INSERT INTO `sysuserrole` VALUES ('60c8030e580e4cc09accea66aeb107cc', '1');
INSERT INTO `sysuserrole` VALUES ('b7ce3af15ad84eaa85b2463af7912681', '1');
INSERT INTO `sysuserrole` VALUES ('2485789d2b684136aeecb3aef8adebb0', '2');
INSERT INTO `sysuserrole` VALUES ('af6ac7fa42a842749500fa8a7a5082a7', '2');
INSERT INTO `sysuserrole` VALUES ('26b070e380524fcaa52ecdf6ccb35a9b', '2');
INSERT INTO `sysuserrole` VALUES ('227db5a231c6410fb2fa59a5f871c10d', '2');
INSERT INTO `sysuserrole` VALUES ('6d0012ab76b24fd9904271754917ca37', '2');
INSERT INTO `sysuserrole` VALUES ('0a81fb2fb01d4e38a977210dcc7b10ef', '2');
INSERT INTO `sysuserrole` VALUES ('02ecf2cb97b442cd8e1832bcbd60e01d', '2');
INSERT INTO `sysuserrole` VALUES ('4f67534cf6784024be11de2d77c563c7', '2');
INSERT INTO `sysuserrole` VALUES ('59c1f215ca36416fb22c55873fa7ef87', '2');
INSERT INTO `sysuserrole` VALUES ('bd70f11c4a014db09b3330fea5d45ec8', '2');
INSERT INTO `sysuserrole` VALUES ('78f87501047f4cdea6919b6e5063aa20', '2');

SET FOREIGN_KEY_CHECKS = 1;
