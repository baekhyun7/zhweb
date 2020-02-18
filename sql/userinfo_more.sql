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

 Date: 18/02/2020 13:42:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for userinfo_more
-- ----------------------------
DROP TABLE IF EXISTS `userinfo_more`;
CREATE TABLE `userinfo_more`  (
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id',
  `telephone` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户电话',
  `sex` tinyint(5) NULL DEFAULT NULL COMMENT '性别',
  `QQ` int(15) NULL DEFAULT NULL COMMENT '用户QQ'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userinfo_more
-- ----------------------------
INSERT INTO `userinfo_more` VALUES ('839474635c71438f9593234720033e9a', '13422221111', NULL, 1234122);
INSERT INTO `userinfo_more` VALUES ('8fef0f1b998c49859ecdcc93e36e74e0', '13422221111', NULL, 1234122);
INSERT INTO `userinfo_more` VALUES ('651a0ccfa9704679a2bdd63b6ac9c108', '13422221111', NULL, 1234122);
INSERT INTO `userinfo_more` VALUES ('bbf5d0c2ba354afcb9244ff4a2e4d9b7', '13422221111', NULL, 1234122);
INSERT INTO `userinfo_more` VALUES ('59c25624ece7448fa6c0264fbb99ab21', '13422221111', NULL, 12344);
INSERT INTO `userinfo_more` VALUES ('6ae43e0135464fdc9d2fbfed24e39765', '13455556666', NULL, 12312444);
INSERT INTO `userinfo_more` VALUES ('81049fb66f3c4df48a52b90d0ce1fab2', '13456789098', NULL, 123444);
INSERT INTO `userinfo_more` VALUES ('db0b59f888f646e28ba1716f63fb4500', '13455533232', NULL, 12321312);
INSERT INTO `userinfo_more` VALUES ('c41408367c2a481b8d3b36696637c46d', '13422112211', NULL, 132131231);
INSERT INTO `userinfo_more` VALUES ('6ed22d9a8e6640278a316ff80a5fec00', '13422221111', 1, 1123213213);
INSERT INTO `userinfo_more` VALUES ('e337ee86de5544b79f39a2ed4df30608', '13408177171', 1, 1334460325);
INSERT INTO `userinfo_more` VALUES ('2', '13408177172', 1, 1334460325);
INSERT INTO `userinfo_more` VALUES ('bd70f11c4a014db09b3330fea5d45ec8', '13408177173', 1, 1334460325);
INSERT INTO `userinfo_more` VALUES ('78f87501047f4cdea6919b6e5063aa20', '13400211123', 1, 1334460333);

SET FOREIGN_KEY_CHECKS = 1;
