/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : myproject

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 30/11/2020 20:18:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_attention
-- ----------------------------
DROP TABLE IF EXISTS `t_attention`;
CREATE TABLE `t_attention`  (
  `attention_id` int(10) NOT NULL COMMENT '关注id 关注表的id',
  `u_id` int(10) NOT NULL COMMENT '被关注人id',
  `m_id` int(10) NOT NULL COMMENT '本人id',
  `attention_time` datetime(6) NOT NULL COMMENT '关注时间',
  `status` int(10) NOT NULL COMMENT '状态（0：可用，1：已删除）',
  PRIMARY KEY (`attention_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
