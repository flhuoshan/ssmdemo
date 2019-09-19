/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : exam

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-09-19 17:36:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for exam_record
-- ----------------------------
DROP TABLE IF EXISTS `exam_record`;
CREATE TABLE `exam_record` (
  `examid` varchar(255) NOT NULL,
  `examno` int(11) DEFAULT NULL,
  `starttime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `endtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `location` varchar(255) DEFAULT NULL,
  `teacherid` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`examid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of exam_record
-- ----------------------------
INSERT INTO `exam_record` VALUES ('123213', '123', '2019-09-18 16:55:07', '2019-09-18 16:55:10', '昆明市', '1233', '123');
INSERT INTO `exam_record` VALUES ('1239', null, '2019-09-18 18:58:45', '2019-09-18 18:58:45', null, null, null);
INSERT INTO `exam_record` VALUES ('332', '23', '2019-09-18 18:46:34', '2019-09-18 18:46:37', null, '123', '11');
INSERT INTO `exam_record` VALUES ('404dc822-2537-45d2-a431-57fd670b843b', '1', '2019-09-19 17:20:36', '2019-09-19 17:20:39', null, '124', null);
INSERT INTO `exam_record` VALUES ('88f6184c-517c-4fb3-aac8-a2a9456b7aff', null, '2019-09-19 17:30:41', '2019-09-19 17:30:43', null, '', null);
INSERT INTO `exam_record` VALUES ('942403c8-5d1e-46a0-8c33-3721e2e69768', null, null, null, null, null, null);
INSERT INTO `exam_record` VALUES ('b316daf7-c958-44af-b008-410331e3e257', null, null, null, null, null, null);
INSERT INTO `exam_record` VALUES ('bf4321eb-80d0-4bf0-a826-d46f577cf97c', null, null, null, null, null, null);
INSERT INTO `exam_record` VALUES ('cf7732b3-fce7-4cc0-8f8c-3daa96e4a5e0', null, '2019-09-19 16:53:34', '2019-09-19 16:53:37', null, null, null);
INSERT INTO `exam_record` VALUES ('d9daeef2-7b4c-4c20-a75e-825fba9341ff', '1', '2019-09-19 17:20:36', '2019-09-19 17:20:39', null, '124', null);
INSERT INTO `exam_record` VALUES ('e88b0fb8-9956-4656-8559-b50cd3985b5d', '1', '2019-09-19 16:55:19', '2019-09-19 16:55:22', null, '124', null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `userid` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `userrole` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_user
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacherid` varchar(31) NOT NULL COMMENT '教师编号',
  `name` varchar(127) DEFAULT '' COMMENT '教师名称',
  PRIMARY KEY (`teacherid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('123', 'cl');
INSERT INTO `teacher` VALUES ('124', 'cj');

-- ----------------------------
-- Table structure for techer_exam_rela
-- ----------------------------
DROP TABLE IF EXISTS `techer_exam_rela`;
CREATE TABLE `techer_exam_rela` (
  `examid` varchar(255) NOT NULL,
  `teacherid` varchar(255) NOT NULL,
  PRIMARY KEY (`teacherid`,`examid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of techer_exam_rela
-- ----------------------------
INSERT INTO `techer_exam_rela` VALUES ('88f6184c-517c-4fb3-aac8-a2a9456b7aff', '');
INSERT INTO `techer_exam_rela` VALUES ('404dc822-2537-45d2-a431-57fd670b843b', '124');
INSERT INTO `techer_exam_rela` VALUES ('d9daeef2-7b4c-4c20-a75e-825fba9341ff', '124');
