/*
Navicat MySQL Data Transfer

Source Server         : Mendes
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : transporte_escolar

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2021-02-06 18:28:19
*/

DROP DATABASE IF EXISTS `transporte_escolar`;
CREATE DATABASE `transporte_escolar` COLLATE utf8_general_ci; 

USE `transporte_escolar`;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `controlo_viatura`
-- ----------------------------
DROP TABLE IF EXISTS `controlo_viatura`;
CREATE TABLE `controlo_viatura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data_entrada` timestamp NULL DEFAULT NULL,
  `data_saida` timestamp NULL DEFAULT NULL,
  `viatura_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_controle_viatura_viatura` (`viatura_id`),
  CONSTRAINT `fk_controle_viatura_viatura` FOREIGN KEY (`viatura_id`) REFERENCES `viatura` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of controlo_viatura
-- ----------------------------
INSERT INTO `controlo_viatura` VALUES ('3', '2021-02-04 10:20:30', '2021-02-04 13:23:10', '1');

-- ----------------------------
-- Table structure for `manutencao`
-- ----------------------------
DROP TABLE IF EXISTS `manutencao`;
CREATE TABLE `manutencao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `data` date NOT NULL,
  `viatura_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_manutencao_viatura` (`viatura_id`),
  CONSTRAINT `fk_manutencao_viatura` FOREIGN KEY (`viatura_id`) REFERENCES `viatura` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manutencao
-- ----------------------------
INSERT INTO `manutencao` VALUES ('2', 'Uma simples reparacao no moter', '2021-02-03', '1');

-- ----------------------------
-- Table structure for `motorista`
-- ----------------------------
DROP TABLE IF EXISTS `motorista`;
CREATE TABLE `motorista` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pessoa_id` int(11) NOT NULL,
  `viatura_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_motorista_pessoa_id` (`pessoa_id`),
  KEY `fk_motorista_viatura_id` (`viatura_id`),
  CONSTRAINT `fk_motorista_pessoa_id` FOREIGN KEY (`pessoa_id`) REFERENCES `pessoa` (`id`) ON DELETE CASCADE,
  CONSTRAINT `fk_motorista_viatura_id` FOREIGN KEY (`viatura_id`) REFERENCES `viatura` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of motorista
-- ----------------------------
INSERT INTO `motorista` VALUES ('2', '7', '1');

-- ----------------------------
-- Table structure for `pessoa`
-- ----------------------------
DROP TABLE IF EXISTS `pessoa`;
CREATE TABLE `pessoa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `bi` varchar(45) NOT NULL,
  `telefone` varchar(17) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pessoa
-- ----------------------------
INSERT INTO `pessoa` VALUES ('1', 'Madara Uchiha', '53454b44', '9655345', 'funcionario');
INSERT INTO `pessoa` VALUES ('3', 'Dabi', '63565465gt444', '936548464', 'funcionario');
INSERT INTO `pessoa` VALUES ('6', 'Mendes Apolo', '92347865bg454', '926454363', 'motorista');
INSERT INTO `pessoa` VALUES ('7', 'Minato namikaze', '3464535gf053', '936457433', 'motorista');
INSERT INTO `pessoa` VALUES ('10', 'fulano', '653453', '9674676', 'motorista');

-- ----------------------------
-- Table structure for `usuario`
-- ----------------------------
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usuario
-- ----------------------------
INSERT INTO `usuario` VALUES ('1', 'mendes', '4md123');
INSERT INTO `usuario` VALUES ('3', 'teste', '123');

-- ----------------------------
-- Table structure for `viatura`
-- ----------------------------
DROP TABLE IF EXISTS `viatura`;
CREATE TABLE `viatura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `matricula` varchar(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of viatura
-- ----------------------------
INSERT INTO `viatura` VALUES ('1', 'Toyota', 'i10', '54gt35', 'Carro');
