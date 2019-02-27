/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50559
 Source Host           : localhost:3306
 Source Schema         :

 Target Server Type    : MySQL
 Target Server Version : 50559
 File Encoding         : 65001

 Date: 08/01/2019 16:17:02
*/
-- ----------------------------
-- 用户表（userinfo）
-- ----------------------------
CREATE TABLE `userinfo` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '账号',
  `name` varchar(255) DEFAULT NULL COMMENT '真实名称',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `salt` varchar(255) DEFAULT NULL COMMENT '盐',
  `state` varchar(255) DEFAULT NULL COMMENT '用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- 角色表（sysrole）
-- ----------------------------
CREATE TABLE `sysrole` (
  `id` varbinary(32) NOT NULL COMMENT 'id',
  `role` varchar(255) DEFAULT NULL COMMENT '角色标识程序中判断使用,',
  `description` varchar(255) DEFAULT NULL COMMENT '角色描述,UI界面显示使用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- 权限表（syspermission）
-- ----------------------------
CREATE TABLE `syspermission` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `resource_type` varchar(255) DEFAULT NULL COMMENT '资源类型',
  `url` varchar(255) DEFAULT NULL COMMENT '资源路径',
  `permission` varchar(255) DEFAULT NULL COMMENT '权限字符串',
  `parent_id` int(32) DEFAULT NULL COMMENT '父编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- 用户角色表（sysuserrole）
-- ----------------------------
CREATE TABLE `sysuserrole` (
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户id',
  `role_id` varchar(32) DEFAULT NULL COMMENT '角色id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- 角色权限表（sysrolepermission）
-- ----------------------------
CREATE TABLE `sysrolepermission` (
  `role_id` varchar(32) DEFAULT NULL COMMENT '角色id',
  `permission_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- 用户更多信息表（userinfo_more）
-- ----------------------------
CREATE TABLE `userinfo_more` (
`user_id` varchar(32) DEFAULT NULL COMMENT '用户id',
`telephone` varchar(15) DEFAULT NULL COMMENT '用户电话',
`address` varchar(255) DEFAULT NULL COMMENT '用户地址',
`QQ` int(15) DEFAULT NULL COMMENT '用户QQ'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;