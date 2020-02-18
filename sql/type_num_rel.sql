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

 Date: 18/02/2020 13:42:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for type_num_rel
-- ----------------------------
DROP TABLE IF EXISTS `type_num_rel`;
CREATE TABLE `type_num_rel`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `typeId` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌名id',
  `supplyId` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '供应商id',
  `num` int(10) NULL DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of type_num_rel
-- ----------------------------
INSERT INTO `type_num_rel` VALUES ('16d6dcb756c641ba8f93fbd36381a99d', '1', 'd4e2b9fbe99e40bab69d4525bdcdd9f7', 1);
INSERT INTO `type_num_rel` VALUES ('21f34312d62a4bc18eaab2815ce34cda', '1', 'fcf6e48926984e97870fe4cc44d5ce0a', 3);
INSERT INTO `type_num_rel` VALUES ('2d96f9fb487c44759054b8fb337e2424', '100', 'fcf6e48926984e97870fe4cc44d5ce0a', 5);
INSERT INTO `type_num_rel` VALUES ('31a24adfcc3b45518373966c652b99bb', '25', '265b7388822c40558fc522ecfa1c33d7', 6);
INSERT INTO `type_num_rel` VALUES ('328ed61e59994f9e8c46bc14e74b372b', '12', '74b7154c593943ca85e54fcc51110c0d', 21);
INSERT INTO `type_num_rel` VALUES ('36232d73bf074fcab534822a0205235e', '122', '74b7154c593943ca85e54fcc51110c0d', 22);
INSERT INTO `type_num_rel` VALUES ('477ca991ecd54f6a9a9553a3393020a8', '1', 'ad3f4b47f0d34be5a7a9acb44f2d88a8', 1);
INSERT INTO `type_num_rel` VALUES ('4dbf6206a7bd4caa95d0a4eab3058c0d', '1', '108450b3ccff4cac837f4fdef9ae3b53', 2);
INSERT INTO `type_num_rel` VALUES ('4f9daae6db1d411f97cfde87314ed84b', '1', '74b7154c593943ca85e54fcc51110c0d', 132);
INSERT INTO `type_num_rel` VALUES ('655a29faf40744558918ac301aa2d45e', '1', '5b82e4f7f30f4c2ebf2f222b7b7033b0', 2);
INSERT INTO `type_num_rel` VALUES ('6e40f8235d4c494caeeb8c1e7d460687', '108', '74b7154c593943ca85e54fcc51110c0d', 122);
INSERT INTO `type_num_rel` VALUES ('7a62878f8bda429e8f48876cb1ecf8e0', '1', '265b7388822c40558fc522ecfa1c33d7', 10);
INSERT INTO `type_num_rel` VALUES ('818007227da840eca22715b73a8ac276', '108', 'fcf6e48926984e97870fe4cc44d5ce0a', 5);
INSERT INTO `type_num_rel` VALUES ('891682c2727447be98057e26f39c00e5', '10', '290bc55b85a34d96ba75a061d2a7aceb', 1);
INSERT INTO `type_num_rel` VALUES ('8e8fe87b806c4b5bb37f78a784cdc72e', '10', '5b82e4f7f30f4c2ebf2f222b7b7033b0', 2);
INSERT INTO `type_num_rel` VALUES ('9a96a17c4265481592e8c01a60545b7b', '10', 'c1c0316eaaf14d3792054540e49bd9cb', 1);
INSERT INTO `type_num_rel` VALUES ('9b3c88ac218645f882a05a441ed7878f', '101', '108450b3ccff4cac837f4fdef9ae3b53', 12);
INSERT INTO `type_num_rel` VALUES ('b0a386be38b84886b1b58dc991044ee3', '101', '74b7154c593943ca85e54fcc51110c0d', 20);
INSERT INTO `type_num_rel` VALUES ('bb3ff3ecac684a1aa0e920946aa46012', '10', '265b7388822c40558fc522ecfa1c33d7', 20);
INSERT INTO `type_num_rel` VALUES ('bda82fe945c9413590c48f610ddbded0', '10', 'd4e2b9fbe99e40bab69d4525bdcdd9f7', 2);
INSERT INTO `type_num_rel` VALUES ('c78ee0bbaff54836b55586d77eeb9f09', '122', '265b7388822c40558fc522ecfa1c33d7', 21);
INSERT INTO `type_num_rel` VALUES ('cfb0a7f781c8426fbb33e269491b134a', '1', '290bc55b85a34d96ba75a061d2a7aceb', 2);
INSERT INTO `type_num_rel` VALUES ('e81e6ae2886d4297aa62a2c4046b9b54', '1', '786482dce85e436796cc0fbc94ff0352', 2);
INSERT INTO `type_num_rel` VALUES ('f76c3c5bf6ed4a768f3a28e10f6d9391', '1', 'c1c0316eaaf14d3792054540e49bd9cb', 4);

SET FOREIGN_KEY_CHECKS = 1;
