/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : test-dev

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-12-19 15:24:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_config
-- ----------------------------
DROP TABLE IF EXISTS `sys_config`;
CREATE TABLE `sys_config` (
  `id` varchar(50) NOT NULL,
  `version` bigint(20) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `value` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_config
-- ----------------------------
INSERT INTO `sys_config` VALUES ('SITE_VERSION', '0', '项目发布版本号', '20181123001');

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `uuid` varchar(32) NOT NULL,
  `version` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `content` varchar(1000) NOT NULL,
  `create_time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('d388746b5d424f02829e45bf159016d9', '0', '64', 'LOGIN', '用户【test04】成功登陆系统', '2018-11-21 15:07:40');
INSERT INTO `sys_log` VALUES ('a8ed79f5d71a439594bbbc06dcd159b7', '0', '64', 'LOGIN', '用户【test04】成功登陆系统', '2018-11-21 15:11:09');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` bigint(20) NOT NULL COMMENT '菜单ID',
  `version` bigint(20) NOT NULL DEFAULT '0' COMMENT '版本',
  `icon` varchar(30) DEFAULT NULL COMMENT '菜单ICON',
  `identifier` varchar(50) DEFAULT NULL COMMENT '权限标识',
  `name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父节点',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `type` varchar(10) NOT NULL COMMENT '类型',
  `url` varchar(255) DEFAULT NULL COMMENT 'URL',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('11', '0', 'fa-check', '', 'test', '0', '0', 'MENU', '');
INSERT INTO `sys_menu` VALUES ('99', '0', 'fa-laptop', 'sys:mgr', '系统管理', '0', '99', 'MENU', '');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) DEFAULT '0',
  `loginname` varchar(20) NOT NULL COMMENT '登录名（字母+数字+下划线）',
  `password` varchar(32) NOT NULL COMMENT '密码，加密存储',
  `mobile` varchar(20) DEFAULT NULL COMMENT '注册手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '注册邮箱',
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`loginname`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '0', 'waren', 'e10adc3949ba59abbe56e057f20f883e', '13770801121', '', '2018-11-14 14:02:54', '2018-11-14 14:03:20');
INSERT INTO `sys_user` VALUES ('61', '0', 'test01', 'e10adc3949ba59abbe56e057f20f883e', '18812345678', 'root@qq.com', '2018-11-19 16:33:53', '2018-11-21 10:45:05');
INSERT INTO `sys_user` VALUES ('62', '0', 'test02', 'e10adc3949ba59abbe56e057f20f883e', '13770801121', 'root@qq.com', '2018-11-20 13:32:45', '2018-11-26 10:54:04');
INSERT INTO `sys_user` VALUES ('63', '0', 'test03', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-20 13:32:52', '2018-11-20 13:32:52');
INSERT INTO `sys_user` VALUES ('64', '0', 'test04', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-20 13:32:59', '2018-11-20 13:32:59');
INSERT INTO `sys_user` VALUES ('65', '0', 'test05', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-20 13:33:08', '2018-11-20 13:33:08');
INSERT INTO `sys_user` VALUES ('66', '0', 'test06', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-20 13:33:17', '2018-11-20 13:33:17');
INSERT INTO `sys_user` VALUES ('67', '0', 'test07', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-20 13:33:26', '2018-11-20 13:33:26');
INSERT INTO `sys_user` VALUES ('68', '0', 'test08', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-20 13:33:35', '2018-11-20 13:33:35');
INSERT INTO `sys_user` VALUES ('69', '0', 'test09', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-20 13:33:42', '2018-11-20 13:33:42');
INSERT INTO `sys_user` VALUES ('70', '0', 'test10', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-20 13:33:50', '2018-11-20 13:33:50');
INSERT INTO `sys_user` VALUES ('71', '0', 'test11', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-22 17:24:07', '2018-11-22 17:24:07');
INSERT INTO `sys_user` VALUES ('72', '0', 'test12', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-22 19:45:11', '2018-11-22 19:45:11');
INSERT INTO `sys_user` VALUES ('73', '0', 'test13', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-22 19:46:28', '2018-11-22 19:46:28');
INSERT INTO `sys_user` VALUES ('76', '0', 'test14', 'e10adc3949ba59abbe56e057f20f883e', '', '', '2018-11-22 19:48:16', '2018-11-22 19:48:16');
