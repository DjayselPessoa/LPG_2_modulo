SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for departamento
-- ----------------------------
DROP TABLE IF EXISTS `departamento`;
CREATE TABLE `departamento`  (
  `nome_depto` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `numero_depto` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`numero_depto`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for disciplina
-- ----------------------------
DROP TABLE IF EXISTS `disciplina`;
CREATE TABLE `disciplina`  (
  `nome` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `cod_disciplina` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `carga_horaria` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cod_disciplina`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ministra
-- ----------------------------
DROP TABLE IF EXISTS `ministra`;
CREATE TABLE `ministra`  (
  `siape` int(11) NOT NULL,
  `cod_disciplina` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `periodo` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`periodo`, `cod_disciplina`, `siape`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for professor
-- ----------------------------
DROP TABLE IF EXISTS `professor`;
CREATE TABLE `professor`  (
  `nome` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `siape` int(11) NOT NULL,
  `categoria` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `salario` int(11) NULL DEFAULT NULL,
  `cod_depto` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`siape`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;


SET FOREIGN_KEY_CHECKS = 1;


-- Script para povoamento (inserir os dados)

insert into professor values ('Maria', '1234', 'Adjunto 1', 1000, 'D001');
insert into professor values ('Pedro', '5678', 'Adjunto 2', 2000, 'D001');
insert into professor values ('José', '1122', 'Adjunto 1', 1500, 'D003');

insert into disciplina values ('Banco de Dados', 'IF976', '60h'); 
insert into disciplina values ('Programação 2', 'IF992', '60h');
insert into disciplina values ('Fundamentos de SI', 'IF973', '75h');

insert into departamento values ('Informação e Sistemas', 'D003');
insert into departamento values ('Tecnologia da Informação', 'D001');

insert into ministra values ('1234', 'IF973', '2013.1');
insert into ministra values ('1234', 'IF973', '2013.2');
insert into ministra values ('1234', 'IF992' , '2013.1');
insert into ministra values ('1234', 'IF965' , '2013.1');
insert into ministra values ('4466', 'IF976' , '2013.2');
insert into ministra values ('5678', 'IF973' , '2013.2');
insert into ministra values ('1122', 'IF973' , '2013.2');
insert into ministra values ('5678', 'IF973' , '2013.1');