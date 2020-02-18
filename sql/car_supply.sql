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

 Date: 18/02/2020 13:41:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for car_supply
-- ----------------------------
DROP TABLE IF EXISTS `car_supply`;
CREATE TABLE `car_supply`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '供应商名字',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of car_supply
-- ----------------------------
INSERT INTO `car_supply` VALUES ('108450b3ccff4cac837f4fdef9ae3b53', '14', '14', '14', '14');
INSERT INTO `car_supply` VALUES ('265b7388822c40558fc522ecfa1c33d7', '四川某某汽车供应商', '四川省成都市XXX', '18888882299', 'XXX');
INSERT INTO `car_supply` VALUES ('290bc55b85a34d96ba75a061d2a7aceb', '测试1', 'sada', '123', 'sada');
INSERT INTO `car_supply` VALUES ('302598055012441c8262fafa2f57964f', 'name', 'sada', '13256489963', 'sda');
INSERT INTO `car_supply` VALUES ('5b82e4f7f30f4c2ebf2f222b7b7033b0', '再来', '再来', '1234556', 'wqe');
INSERT INTO `car_supply` VALUES ('74b7154c593943ca85e54fcc51110c0d', '四川奇瑞供应商有限公司', '四川省成都市双流区', '13344663322', '本公司从事于低端汽车销售');
INSERT INTO `car_supply` VALUES ('786482dce85e436796cc0fbc94ff0352', '12', '12', '12', '12');
INSERT INTO `car_supply` VALUES ('ad3f4b47f0d34be5a7a9acb44f2d88a8', '13', '13', '13', '13');
INSERT INTO `car_supply` VALUES ('b476abdcd0c342adb4627df97914bd47', '1', '1', '1', '1');
INSERT INTO `car_supply` VALUES ('c1c0316eaaf14d3792054540e49bd9cb', '从新来过', '四川南充', '1234567', 'sdadsa');
INSERT INTO `car_supply` VALUES ('d4e2b9fbe99e40bab69d4525bdcdd9f7', '15', '15', '15', '15');
INSERT INTO `car_supply` VALUES ('ea454123804b480ba11567dc45942bb3', '似曾相识', '四川省成都市双流区', '18728190520', '该厂商蛀牙');
INSERT INTO `car_supply` VALUES ('ed48dea88e8041668253e8a1bf27a6f7', 'name check', 's5ad15wsa', '13256489962', '11');
INSERT INTO `car_supply` VALUES ('fcf6e48926984e97870fe4cc44d5ce0a', '情人节新增', '情人节', '123456', '1231456');

SET FOREIGN_KEY_CHECKS = 1;
