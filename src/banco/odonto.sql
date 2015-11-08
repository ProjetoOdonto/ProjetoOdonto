/*
SQLyog Ultimate v9.51 
MySQL - 5.6.26-log : Database - odontomax
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`odontomax` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `odontomax`;

/*Table structure for table `agendamentos` */

DROP TABLE IF EXISTS `agendamentos`;

CREATE TABLE `agendamentos` (
  `cod_paciente` int(3) NOT NULL,
  `nome_paciente` varchar(50) DEFAULT NULL,
  `data` varchar(10) DEFAULT NULL,
  `hora` varchar(5) DEFAULT NULL,
  `tipoconsulta` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `agendamentos` */

insert  into `agendamentos`(`cod_paciente`,`nome_paciente`,`data`,`hora`,`tipoconsulta`) values (1,'1','29/01/1995','10:15','Consulta de Rotina'),(1,'VINICIUS ARAUJO ALVES','24/34/3452','54:65','Tratamento'),(10,'ANDRE','  /  /    ','  :  ','Selecionar'),(9,'VANDERLEI TERTO ALVES','  /  /    ','  :  ','Selecionar'),(1,'VINICIUS ARAUJO ALVES','29/15/1151','21:21','Tratamento'),(11,'bruno','32/13/2112','21:12','Consulta de Rotina');

/*Table structure for table `aluno` */

DROP TABLE IF EXISTS `aluno`;

CREATE TABLE `aluno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rgm` varchar(7) DEFAULT NULL,
  `nome` varchar(80) DEFAULT NULL,
  `curso` varchar(4) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `turma` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `aluno` */

/*Table structure for table `despecas` */

DROP TABLE IF EXISTS `despecas`;

CREATE TABLE `despecas` (
  `COD_DESPECAS` int(55) NOT NULL AUTO_INCREMENT,
  `COD_FORNECEDOR` int(55) DEFAULT NULL,
  `VALOR` double DEFAULT NULL,
  `SITUACAO` varchar(10) DEFAULT NULL,
  `DATA_LANCAMENTO` date DEFAULT NULL,
  `DATA_EMISSAO` date DEFAULT NULL,
  `DATA_VENCIMENTO` date DEFAULT NULL,
  PRIMARY KEY (`COD_DESPECAS`),
  KEY `FORNEC_DESPESA` (`COD_FORNECEDOR`),
  CONSTRAINT `FORNEC_DESPESA` FOREIGN KEY (`COD_FORNECEDOR`) REFERENCES `fornecedor` (`cod_fornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `despecas` */

insert  into `despecas`(`COD_DESPECAS`,`COD_FORNECEDOR`,`VALOR`,`SITUACAO`,`DATA_LANCAMENTO`,`DATA_EMISSAO`,`DATA_VENCIMENTO`) values (1,1,345,'pago','2015-09-10','2015-08-30','2015-09-03'),(3,1,35,'pago','0000-00-00','0000-00-00','0000-00-00');

/*Table structure for table `fornecedor` */

DROP TABLE IF EXISTS `fornecedor`;

CREATE TABLE `fornecedor` (
  `cod_fornecedor` int(5) NOT NULL AUTO_INCREMENT,
  `ds_fornecedor` varchar(45) DEFAULT NULL,
  `cnpj` varchar(18) DEFAULT NULL,
  `lugadouro` varchar(45) DEFAULT NULL,
  `cep` varchar(8) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefone` varchar(10) DEFAULT NULL,
  `cod_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_fornecedor`),
  KEY `cod_usuario_idx` (`cod_usuario`),
  CONSTRAINT `cod_usuario_fornec` FOREIGN KEY (`cod_usuario`) REFERENCES `usuario` (`cod_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `fornecedor` */

insert  into `fornecedor`(`cod_fornecedor`,`ds_fornecedor`,`cnpj`,`lugadouro`,`cep`,`bairro`,`cidade`,`estado`,`email`,`telefone`,`cod_usuario`) values (1,'TECNOPLAST MATERIAIS DESCARTAVEIS','05.569.214/0001-10','RUA SÃO JORGE, 653','08456110','TATUAPÉ','SÃO PAULO','SP','CONTATO@TECNOPLAST.COM.BR','1136658745',1),(2,'CENTRAL MEDICA MEDICAMENTOS','45.658.985/0002-84','RUA MONTE CARLO, 110','54125698','CENTRO','ARARAQUARA','SP','CENTRALMEDICA@CENTRALMEDICA.COM.BR','1933256498',5),(3,'QUALITA MEDICAMENTOS LTDA','01.546.547/0001-89','RUA SANTO AGOSTINHO, 444','54125658','CENTRO','COSMÓPOLIS','SP','ATENDIMENTO@QUALITA.COM.BR','1933247455',1),(4,'BRASCOOP DESCARTÁVEIS LTDA','65.547.897/0004-89','RUA DO GASÔMETRO, 154','03008000','BRÁS','SÃO PAULO','SP','BRASCOOP@BRASCOOP.COM.BR','1133275199',1);

/*Table structure for table `hprocede` */

DROP TABLE IF EXISTS `hprocede`;

CREATE TABLE `hprocede` (
  `ds_procedimento` varchar(50) DEFAULT NULL,
  `codpaciente` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hprocede` */

insert  into `hprocede`(`ds_procedimento`,`codpaciente`) values ('EXTRAÇÃO','12'),('ABTURAÇÃO','12'),('IMPLANTE','12'),('CANAL','12'),('RESTAURAÇÃO DE AMÁLGAMA','12'),('RESTAURAÇÃO EM IONÔMERO DE VIDRO','12');

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `cod_pedido` int(5) DEFAULT NULL,
  `cod_produto` int(5) DEFAULT NULL,
  `quantidade` int(5) DEFAULT NULL,
  KEY `item_pedido` (`cod_pedido`),
  KEY `item_produto` (`cod_produto`),
  CONSTRAINT `item_pedido` FOREIGN KEY (`cod_pedido`) REFERENCES `pedido` (`cod_pedido`),
  CONSTRAINT `item_produto` FOREIGN KEY (`cod_produto`) REFERENCES `produto` (`cod_produto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `item` */

insert  into `item`(`cod_pedido`,`cod_produto`,`quantidade`) values (1,3,13),(1,2,14),(1,2,9),(2,1,6),(3,2,5),(4,1,50),(4,3,30);

/*Table structure for table `odontograma` */

DROP TABLE IF EXISTS `odontograma`;

CREATE TABLE `odontograma` (
  `cod_usuario` varchar(50) DEFAULT NULL,
  `codprocede` varchar(50) DEFAULT NULL,
  `ds_procedimento` varchar(50) DEFAULT NULL,
  `detalhes` varchar(50) DEFAULT NULL,
  `valor` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `odontograma` */

/*Table structure for table `paciente` */

DROP TABLE IF EXISTS `paciente`;

CREATE TABLE `paciente` (
  `cod_paciente` int(11) NOT NULL AUTO_INCREMENT,
  `nome_paciente` varchar(45) DEFAULT NULL,
  `rg_paciente` varchar(10) NOT NULL,
  `cpf_paciente` varchar(13) NOT NULL,
  `celular_paciente` varchar(12) DEFAULT NULL,
  `telefone_paciente` varchar(12) DEFAULT NULL,
  `email_paciente` varchar(45) DEFAULT NULL,
  `lugadouro_paciente` varchar(45) DEFAULT NULL,
  `cep_paciente` varchar(9) DEFAULT NULL,
  `estado_paciente` varchar(20) DEFAULT NULL,
  `cidade_paciente` varchar(30) DEFAULT NULL,
  `sexo_paciente` varchar(45) DEFAULT NULL,
  `bairro_paciente` varchar(45) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  PRIMARY KEY (`cod_paciente`),
  UNIQUE KEY `cpf_paciente_UNIQUE` (`cpf_paciente`),
  UNIQUE KEY `rg_paciente_UNIQUE` (`rg_paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `paciente` */

insert  into `paciente`(`cod_paciente`,`nome_paciente`,`rg_paciente`,`cpf_paciente`,`celular_paciente`,`telefone_paciente`,`email_paciente`,`lugadouro_paciente`,`cep_paciente`,`estado_paciente`,`cidade_paciente`,`sexo_paciente`,`bairro_paciente`,`data_nascimento`) values (8,'JEFERSON GONÇALVES SILVÉRIO','365214589','12565232591','11954687854','1125865412','JEFITA@HOTMAIL.COM','RUA DAS MAGOAS, 45 - APTO 5','45214-410','SP','MAUA','MASCULINO','CENTRO','1980-11-20'),(12,'andre','54321','12345','12313134','2314124','jsdncvavbahkbv','kjafoiwehnoigfjl','12313','ES','saopaulo','MASCULINO','jnvdsajfnjlsav c','2015-12-02');

/*Table structure for table `pedido` */

DROP TABLE IF EXISTS `pedido`;

CREATE TABLE `pedido` (
  `cod_pedido` int(5) NOT NULL,
  `cod_fornecedor` int(5) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`cod_pedido`),
  KEY `fornec` (`cod_fornecedor`),
  CONSTRAINT `fornec` FOREIGN KEY (`cod_fornecedor`) REFERENCES `fornecedor` (`cod_fornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pedido` */

insert  into `pedido`(`cod_pedido`,`cod_fornecedor`,`valor`,`status`) values (1,2,146,0),(2,4,24,0),(3,4,35,0),(4,4,107.5,0),(5,NULL,NULL,0),(6,2,0,0),(7,NULL,NULL,0),(8,NULL,NULL,0);

/*Table structure for table `procedimento` */

DROP TABLE IF EXISTS `procedimento`;

CREATE TABLE `procedimento` (
  `cod_procedimento` int(11) NOT NULL AUTO_INCREMENT,
  `ds_procedimento` varchar(45) DEFAULT NULL,
  `valor` varchar(10) DEFAULT NULL,
  `cod_usuario` int(11) DEFAULT NULL,
  `detalhes` varchar(200) DEFAULT NULL,
  `codprocede` varchar(5) DEFAULT NULL,
  `data` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod_procedimento`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

/*Data for the table `procedimento` */

insert  into `procedimento`(`cod_procedimento`,`ds_procedimento`,`valor`,`cod_usuario`,`detalhes`,`codprocede`,`data`) values (1,'CANAL','900',1,NULL,NULL,NULL),(2,'IMPLANTE','1500',1,NULL,NULL,NULL),(3,'EXTRAÇÃO','250',1,NULL,NULL,NULL),(4,'ABTURAÇÃO','400',4,NULL,NULL,NULL),(5,'CLAREAMENTO','1000',4,NULL,NULL,NULL),(6,'RASPAGEM','500',4,NULL,NULL,NULL),(7,'RESTAURAÇÃO','500',4,NULL,NULL,NULL),(8,'PRÓTESE EM RESINA','350',4,NULL,NULL,NULL),(9,'CONSULTA DE URGÊNCIA','35',4,NULL,NULL,NULL),(10,'CONTROLE DE CÁRIE','9.1',4,NULL,NULL,NULL),(11,'RESTAURAÇÃO EM IONÔMERO DE VIDRO','34.8',4,NULL,NULL,NULL),(12,'RESTAURAÇÃO EM RESINA FOTOPOLIMERIZÁVEL','50',4,NULL,NULL,NULL),(13,'RESTAURAÇÃO DE AMÁLGAMA','57.3',4,NULL,NULL,NULL),(38,'EXTRAÇÃO','10',12,'jfjhgjkhkh','3',NULL),(39,'EXTRAÇÃO','210',12,'dfdhjk','3',NULL),(40,'EXTRAÇÃO','210',12,'dfdhjk','3',NULL),(41,'teste','1010.0',1,NULL,NULL,NULL);

/*Table structure for table `produto` */

DROP TABLE IF EXISTS `produto`;

CREATE TABLE `produto` (
  `cod_produto` int(5) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) DEFAULT NULL,
  `cod_barras` bigint(20) DEFAULT NULL,
  `cod_tipoproduto` int(1) DEFAULT NULL,
  `cod_fornecedor` int(11) DEFAULT NULL,
  `embalagem` varchar(10) DEFAULT NULL,
  `unidade` varchar(2) DEFAULT NULL,
  `cod_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_produto`),
  KEY `cod_tipoproduto_idx` (`cod_tipoproduto`),
  KEY `cod_fornecedor_idx` (`cod_fornecedor`),
  KEY `cod_usuario_produt_idx` (`cod_usuario`),
  CONSTRAINT `cod_fornecedor` FOREIGN KEY (`cod_fornecedor`) REFERENCES `fornecedor` (`cod_fornecedor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cod_tipoproduto` FOREIGN KEY (`cod_tipoproduto`) REFERENCES `produto_tipo` (`cod_tipoproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cod_usuario_produt` FOREIGN KEY (`cod_usuario`) REFERENCES `usuario` (`cod_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `produto` */

insert  into `produto`(`cod_produto`,`descricao`,`cod_barras`,`cod_tipoproduto`,`cod_fornecedor`,`embalagem`,`unidade`,`cod_usuario`) values (1,'COPO DESCARTAVEL 200ML',4015000090711,2,4,'50X500','UN',1),(2,'COPO DESCARTEVEL 500ML',4015000090811,2,4,'10X500','UN',5),(3,'COPO DESCARTEVEL 300ML',4015000090611,2,4,'10X300','UN',5);

/*Table structure for table `produto_tipo` */

DROP TABLE IF EXISTS `produto_tipo`;

CREATE TABLE `produto_tipo` (
  `cod_tipoproduto` int(1) NOT NULL,
  `descricao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cod_tipoproduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `produto_tipo` */

insert  into `produto_tipo`(`cod_tipoproduto`,`descricao`) values (1,'MEDICAMENTO'),(2,'CONSUMO'),(3,'CIRÚRGICO');

/*Table structure for table `professor` */

DROP TABLE IF EXISTS `professor`;

CREATE TABLE `professor` (
  `idprof` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(11) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `salario` float DEFAULT NULL,
  PRIMARY KEY (`idprof`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `professor` */

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `cod_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `permissao` int(11) NOT NULL DEFAULT '0',
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL DEFAULT 'PADRAO',
  `setor` varchar(45) DEFAULT NULL,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cod_usuario`),
  UNIQUE KEY `login_UNIQUE` (`login`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `usuario` */

insert  into `usuario`(`cod_usuario`,`permissao`,`login`,`senha`,`setor`,`nome`) values (1,1,'ADMIN','ADMIN','ADMIN','ADMIN'),(2,1,'VINICIUS','ADMIN','T.I.','VINICIUS ARAUJO ALVES'),(3,1,'DENTISTA','ADMIN','DENTISTA','JOSÉ EDUARDO SILVÉRIO'),(4,2,'RECEPCAO','RECEPCAO','RECEPCAO','ISALTINA MARIA DOS SANTOS'),(5,3,'COMPRAS','COMPRAS','COMPRAS','GUSTAVO SANTOS'),(6,1,'AFONSO.PAVAO','ADMIN','ADMIN','AFONSO MARIA PAVÃO'),(7,4,'ANDRE.SILVA','ESTOQUE','ESTOQUE','ANDRE SILVA GONÇALVES');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
