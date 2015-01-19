/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50702
Source Host           : localhost:3306
Source Database       : dev

Target Server Type    : MYSQL
Target Server Version : 50702
File Encoding         : 65001

Date: 2015-01-19 23:03:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for persistent_logins
-- ----------------------------
DROP TABLE IF EXISTS `persistent_logins`;
CREATE TABLE `persistent_logins` (
  `USERNAME` varchar(55) DEFAULT NULL,
  `SERIES` varchar(32) NOT NULL,
  `TOKEN` varchar(55) DEFAULT NULL,
  `LAST_USED` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`SERIES`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Spring Remember me 持久化';

-- ----------------------------
-- Records of persistent_logins
-- ----------------------------

-- ----------------------------
-- Table structure for sys_authorities
-- ----------------------------
DROP TABLE IF EXISTS `sys_authorities`;
CREATE TABLE `sys_authorities` (
  `AUTHORITY_ID` varchar(32) NOT NULL,
  `AUTHORITY_MARK` varchar(255) DEFAULT NULL,
  `AUTHORITY_NAME` varchar(55) NOT NULL,
  `AUTHORITY_DESC` varchar(255) DEFAULT NULL,
  `MESSAGE` varchar(255) DEFAULT NULL,
  `ENABLED` char(1) DEFAULT NULL,
  `IS_SYS` char(1) DEFAULT NULL,
  `MODULE_ID` varchar(32) DEFAULT NULL,
  KEY `AUTHORITY_ID` (`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_authorities
-- ----------------------------

-- ----------------------------
-- Table structure for sys_authorities_resources
-- ----------------------------
DROP TABLE IF EXISTS `sys_authorities_resources`;
CREATE TABLE `sys_authorities_resources` (
  `ID` varchar(32) NOT NULL,
  `RESOURCE_ID` varchar(32) NOT NULL,
  `AUTHORITY_ID` varchar(32) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_SYS_AUTH_REFERENCE_SYS_AUTH` (`AUTHORITY_ID`),
  KEY `FK_SYS_AUTH_REFERENCE_SYS_RESO` (`RESOURCE_ID`),
  CONSTRAINT `FK_SYS_AUTH_REFERENCE_SYS_AUTH` FOREIGN KEY (`AUTHORITY_ID`) REFERENCES `sys_authorities` (`AUTHORITY_ID`),
  CONSTRAINT `FK_SYS_AUTH_REFERENCE_SYS_RESO` FOREIGN KEY (`RESOURCE_ID`) REFERENCES `sys_resources` (`RESOURCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_authorities_resources
-- ----------------------------

-- ----------------------------
-- Table structure for sys_modules
-- ----------------------------
DROP TABLE IF EXISTS `sys_modules`;
CREATE TABLE `sys_modules` (
  `MODULE_ID` varchar(32) NOT NULL,
  `MODULE_NAME` varchar(55) NOT NULL,
  `MODULE_DESC` varchar(255) DEFAULT NULL,
  `MODULE_TYPE` varchar(55) DEFAULT NULL,
  `PARENT` varchar(55) DEFAULT NULL,
  `MODULE_URL` varchar(255) DEFAULT NULL,
  `LEVEL` varchar(55) DEFAULT NULL,
  `LEAF` varchar(55) DEFAULT NULL,
  `APPLICATION` varchar(255) DEFAULT NULL,
  `CONTROLLER` varchar(255) DEFAULT NULL,
  `ENABLED` char(1) DEFAULT NULL,
  `PRIORITY` int(11) DEFAULT NULL,
  PRIMARY KEY (`MODULE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_modules
-- ----------------------------
INSERT INTO `sys_modules` VALUES ('818181ec4b028f87014b028f870e0000', '导航', '导航', '0', null, null, '0', null, null, null, '1', '0');
INSERT INTO `sys_modules` VALUES ('818181ec4b0291b6014b0291b6800000', '用户管理', '用户管理', '1', '818181ec4b028f87014b028f870e0000', null, '1', null, null, null, '1', '1');
INSERT INTO `sys_modules` VALUES ('818181ec4b029314014b029314d70000', '角色管理', '角色管理', '1', '818181ec4b028f87014b028f870e0000', null, '1', null, null, null, '1', '2');
INSERT INTO `sys_modules` VALUES ('818181ec4b02941c014b02941cf10000', '资源管理', '资源管理', '1', '818181ec4b028f87014b028f870e0000', null, '1', null, null, null, '1', '3');
INSERT INTO `sys_modules` VALUES ('818181ec4b029f70014b029f70150000', '用户列表', '用户列表', '2', '818181ec4b0291b6014b0291b6800000', null, '2', null, null, null, '1', '100');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a02d014b02a02da30000', '新增用户', '新增用户', '2', '818181ec4b0291b6014b0291b6800000', null, '2', null, null, null, '1', '101');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a1c6014b02a1c6620000', '角色列表', '角色列表', '2', '818181ec4b029314014b029314d70000', null, '2', null, null, null, '1', '103');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a23f014b02a23fa70000', '新增角色', '新增角色', '2', '818181ec4b029314014b029314d70000', null, '2', null, null, null, '1', '104');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a30e014b02a30e420000', '分配角色', '分配角色', '3', '818181ec4b029f70014b029f70150000', null, '2', null, null, null, '1', '105');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a7be014b02a7be280000', '资源列表', '资源列表', '2', '818181ec4b02941c014b02941cf10000', null, '2', null, null, null, '1', '107');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a812014b02a812fb0000', '添加资源', '添加资源', '2', '818181ec4b02941c014b02941cf10000', null, '2', null, null, null, '1', '108');

-- ----------------------------
-- Table structure for sys_resources
-- ----------------------------
DROP TABLE IF EXISTS `sys_resources`;
CREATE TABLE `sys_resources` (
  `RESOURCE_ID` varchar(32) NOT NULL,
  `RESOURCE_TYPE` varchar(55) DEFAULT NULL,
  `RESOURCE_NAME` varchar(255) DEFAULT NULL,
  `RESOURCE_DESC` varchar(255) DEFAULT NULL,
  `RESOURCE_PATH` varchar(255) DEFAULT NULL,
  `PRIORITY` int(11) DEFAULT NULL,
  `ENABLED` char(1) DEFAULT NULL,
  `IS_SYS` char(1) DEFAULT NULL,
  `MODULE_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`RESOURCE_ID`),
  KEY `FK_SYS_RESO_REFERENCE_SYS_MODU` (`MODULE_ID`),
  CONSTRAINT `FK_SYS_RESO_REFERENCE_SYS_MODU` FOREIGN KEY (`MODULE_ID`) REFERENCES `sys_modules` (`MODULE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resources
-- ----------------------------
INSERT INTO `sys_resources` VALUES ('818181ec4b027591014b027591ad0000', '0', '导航', null, '#', '0', '1', '1', null);

-- ----------------------------
-- Table structure for sys_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles`;
CREATE TABLE `sys_roles` (
  `ROLE_ID` varchar(32) NOT NULL COMMENT '角色ID',
  `ROLE_NAME` varchar(55) DEFAULT NULL COMMENT '角色名称',
  `ROLE_DESC` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `ENABLED` char(1) DEFAULT NULL COMMENT '是否可用',
  `IS_SYS` char(1) DEFAULT NULL COMMENT '是否系统权限',
  `MODULE_ID` varchar(32) DEFAULT NULL COMMENT '模块ID',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_roles
-- ----------------------------
INSERT INTO `sys_roles` VALUES ('818181ec4ad85c9a014ad85c9ad60000', '登录用户', '登录用户', '1', '0', null);
INSERT INTO `sys_roles` VALUES ('818181ec4ad85da7014ad85da78b0000', '系统管理员', '系统管理员', '1', '1', null);
INSERT INTO `sys_roles` VALUES ('818181ec4ad85ebd014ad85ebd2b0000', '普通用户', '普通用户', '1', '0', null);

-- ----------------------------
-- Table structure for sys_roles_authorities
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles_authorities`;
CREATE TABLE `sys_roles_authorities` (
  `ID` varchar(32) NOT NULL,
  `AUTHORITY_ID` varchar(32) NOT NULL,
  `ROLE_ID` varchar(32) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_SYS_ROLE_REFERENCE_SYS_ROLE` (`ROLE_ID`),
  KEY `FK_SYS_ROLE_REFERENCE_SYS_AUTH` (`AUTHORITY_ID`),
  CONSTRAINT `FK_SYS_ROLE_REFERENCE_SYS_AUTH` FOREIGN KEY (`AUTHORITY_ID`) REFERENCES `sys_authorities` (`AUTHORITY_ID`),
  CONSTRAINT `FK_SYS_ROLE_REFERENCE_SYS_ROLE` FOREIGN KEY (`ROLE_ID`) REFERENCES `sys_roles` (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_roles_authorities
-- ----------------------------

-- ----------------------------
-- Table structure for sys_roles_moudles
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles_moudles`;
CREATE TABLE `sys_roles_moudles` (
  `ID` varchar(32) NOT NULL,
  `MODULE_ID` varchar(32) NOT NULL,
  `ROLE_ID` varchar(32) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_SYS_ROLE_REFERENCE_SYS_MODU` (`MODULE_ID`),
  KEY `FK_SYS_ROLE_REFERENCE_SYS_ROLE2` (`ROLE_ID`),
  CONSTRAINT `FK_SYS_ROLE_REFERENCE_SYS_MODU` FOREIGN KEY (`MODULE_ID`) REFERENCES `sys_modules` (`MODULE_ID`),
  CONSTRAINT `FK_SYS_ROLE_REFERENCE_SYS_ROLE2` FOREIGN KEY (`ROLE_ID`) REFERENCES `sys_roles` (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_roles_moudles
-- ----------------------------

-- ----------------------------
-- Table structure for sys_users
-- ----------------------------
DROP TABLE IF EXISTS `sys_users`;
CREATE TABLE `sys_users` (
  `USER_ID` varchar(32) NOT NULL COMMENT '用户ID',
  `USERNAME` varchar(55) NOT NULL COMMENT '用户名',
  `NAME` varchar(55) DEFAULT NULL COMMENT '真实姓名',
  `PASSWORD` varchar(55) NOT NULL COMMENT '密码',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  `LAST_LOGIN_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '最后登录时间',
  `DEADLINE` timestamp NULL DEFAULT NULL COMMENT '过期时间',
  `LOGIN_IP` varchar(100) DEFAULT NULL COMMENT '最后登录IP地址',
  `DEPARTMENT_ID` varchar(32) DEFAULT NULL COMMENT '部门ID',
  `DEPARTMENT_NAME` varchar(55) DEFAULT NULL COMMENT '部门名称',
  `ENABLED` char(1) NOT NULL DEFAULT '0' COMMENT '是否可用',
  `ACCOUNT_NON_EXPIRED` char(1) DEFAULT NULL COMMENT '用户是否过期',
  `ACCOUNT_NON_LOCKED` char(1) DEFAULT NULL COMMENT '用户是否锁定',
  `CREDENTIALS_NON_EXPIRED` char(1) DEFAULT '' COMMENT '用户证书是否有效',
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `USERNAME` (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_users
-- ----------------------------
INSERT INTO `sys_users` VALUES ('818181ec4ad457c6014ad457c6dc0000', 'admin', '管理员', '21232f297a57a5a743894a0e4a801fc3', '2015-01-19 00:55:04', '2015-01-19 00:55:04', null, null, null, null, '1', '1', '1', '1');
INSERT INTO `sys_users` VALUES ('818181ec4ad46274014ad46274080000', 'abc', '管理员', '900150983cd24fb0d6963f7d28e17f72', '2015-01-10 23:07:10', '2015-01-10 23:07:10', null, null, null, null, '1', null, null, null);

-- ----------------------------
-- Table structure for sys_users_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_users_roles`;
CREATE TABLE `sys_users_roles` (
  `ID` varchar(32) NOT NULL,
  `ROLE_ID` varchar(32) NOT NULL,
  `USER_ID` varchar(32) NOT NULL,
  KEY `FK_SYS_USER_REFERENCE_SYS_ROLE` (`ROLE_ID`),
  KEY `FK_SYS_USER_REFERENCE_SYS_USER` (`USER_ID`),
  CONSTRAINT `FK_SYS_USER_REFERENCE_SYS_ROLE` FOREIGN KEY (`ROLE_ID`) REFERENCES `sys_roles` (`ROLE_ID`),
  CONSTRAINT `FK_SYS_USER_REFERENCE_SYS_USER` FOREIGN KEY (`USER_ID`) REFERENCES `sys_users` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_users_roles
-- ----------------------------
INSERT INTO `sys_users_roles` VALUES ('818181ec4ad8be3d014ad8be3d190000', '818181ec4ad85c9a014ad85c9ad60000', '818181ec4ad46274014ad46274080000');
