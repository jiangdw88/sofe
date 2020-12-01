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

 Date: 30/11/2020 20:19:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment`  (
  `comment_id` int(10) NOT NULL COMMENT '评论表id',
  `u_id` int(10) NOT NULL COMMENT '被评论人id(文章人id)',
  `d_id` int(10) NOT NULL COMMENT '被评论动态id(文章id)',
  `content` int(10) NOT NULL COMMENT '评论内容',
  `content_time` datetime(6) NOT NULL COMMENT '评论时间',
  `status` int(10) NOT NULL COMMENT '状态（0：可用，1：已删除）',
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
