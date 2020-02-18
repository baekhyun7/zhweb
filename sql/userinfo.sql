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

 Date: 18/02/2020 13:42:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `user_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '加密密码的盐',
  `state` int(10) NULL DEFAULT NULL COMMENT '用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.  ',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'admin', 'admin', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', 0);
INSERT INTO `userinfo` VALUES ('2', 'haha', 'haha', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL);
INSERT INTO `userinfo` VALUES ('211b371885ef436eaada07ea7b2513d3', 'zhang', 'zhang', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL);
INSERT INTO `userinfo` VALUES ('3', '1', '1', 'c4ca4238a0b923820dcc509a6f75849b', NULL, NULL);
INSERT INTO `userinfo` VALUES ('59c25624ece7448fa6c0264fbb99ab21', 'qwer', 'qwer', '962012d09b8170d912f0669f6d7d9d07', NULL, NULL);
INSERT INTO `userinfo` VALUES ('651a0ccfa9704679a2bdd63b6ac9c108', 'a', 'a', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL);
INSERT INTO `userinfo` VALUES ('6ed22d9a8e6640278a316ff80a5fec00', '11', '11', '6512bd43d9caa6e02c990b0a82652dca', NULL, NULL);
INSERT INTO `userinfo` VALUES ('7022d59966fe4fc4b460c4c3bd4365e7', 'si', 'si', 'ac5585d98646d255299c359140537783', NULL, NULL);
INSERT INTO `userinfo` VALUES ('78f87501047f4cdea6919b6e5063aa20', 'zzz', 'zzz', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL);
INSERT INTO `userinfo` VALUES ('839474635c71438f9593234720033e9a', 'zhangh', 'zhangh', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL);
INSERT INTO `userinfo` VALUES ('8fef0f1b998c49859ecdcc93e36e74e0', 'zhanghh', 'zhanghh', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL);
INSERT INTO `userinfo` VALUES ('bbf5d0c2ba354afcb9244ff4a2e4d9b7', 'a1', 'a1', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL);
INSERT INTO `userinfo` VALUES ('bd70f11c4a014db09b3330fea5d45ec8', 'zhang1', 'zhang1', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL);
INSERT INTO `userinfo` VALUES ('c41408367c2a481b8d3b36696637c46d', 'qwert', 'qwert', 'a384b6463fc216a5f8ecb6670f86456a', NULL, NULL);
INSERT INTO `userinfo` VALUES ('db0b59f888f646e28ba1716f63fb4500', 'qw11', 'qw11', '698d51a19d8a121ce581499d7b701668', NULL, NULL);
INSERT INTO `userinfo` VALUES ('e337ee86de5544b79f39a2ed4df30608', 'xiaqi', 'xiaqi', '3530650fc0b44eed47dc95b8eecc9343', NULL, NULL);
INSERT INTO `userinfo` VALUES ('fb0334ee4ead4e77ac3a24ece46bc003', 'zz', 'zz', 'c4ca4238a0b923820dcc509a6f75849b', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
