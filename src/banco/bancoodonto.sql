/*
SQLyog Ultimate v9.51 
MySQL - 5.6.26-log : Database - pizzaria15
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pizzaria15` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `pizzaria15`;

/*Table structure for table `categoriaproduto` */

DROP TABLE IF EXISTS `categoriaproduto`;

CREATE TABLE `categoriaproduto` (
  `categoria` varchar(20) NOT NULL,
  PRIMARY KEY (`categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `categoriaproduto` */

insert  into `categoriaproduto`(`categoria`) values ('Alimento'),('Pizza'),('Refrigerante');

/*Table structure for table `clientes` */

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `telefone` varchar(13) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `numero` varchar(6) DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `situacao` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`telefone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clientes` */

insert  into `clientes`(`telefone`,`nome`,`cep`,`endereco`,`numero`,`complemento`,`cidade`,`uf`,`bairro`,`situacao`) values ('10101010','Paulo','08080110','HIPOLITO CARON','10','dfgsgf','SAO PAULO','SP','PARQUE PAULISTANO',NULL),('11343485','Paulo','08080300','FIGUEIREDO PIMENTEL','10','dfsfds','SAO PAULO','SP','PARQUE PAULISTANO',NULL),('12345678','Teste Caixa','08081400','ALVARO COELHO','10','10','SAO PAULO','SP','PARQUE PAULISTANO',NULL),('20258316','Teste Caixa','08080100','SUACUAPARA','10','proximo ao mercado nagumo','SAO PAULO','SP','PARQUE PAULISTANO',NULL),('25853775','andreia','08080100','SUACUAPARA','276','','SAO PAULO','SP','PARQUE PAULISTANO',NULL),('25858180','Teste Caixa','08080300','FIGUEIREDO PIMENTEL','10','aaaaaaa','SAO PAULO','SP','PARQUE PAULISTANO',NULL);

/*Table structure for table `compras` */

DROP TABLE IF EXISTS `compras`;

CREATE TABLE `compras` (
  `NPedido` int(10) NOT NULL AUTO_INCREMENT,
  `nomeFantasia` varchar(50) DEFAULT NULL,
  `cpfFor` varchar(14) DEFAULT NULL,
  `cnpjFor` varchar(18) DEFAULT NULL,
  `formapagto` varchar(18) DEFAULT NULL,
  `condicaopagto` varchar(9) DEFAULT NULL,
  `parcelas` int(1) DEFAULT NULL,
  `tipopedido` varchar(7) DEFAULT NULL,
  `valortotal` float(5,2) DEFAULT NULL,
  `valordesc` float(5,2) DEFAULT NULL,
  `valornf` float(5,2) DEFAULT NULL,
  `observacao` varchar(200) DEFAULT NULL,
  `tipoproduto` varchar(30) DEFAULT NULL,
  `produto` varchar(50) DEFAULT NULL,
  `unidmedida` varchar(2) DEFAULT NULL,
  `refproduto` varchar(20) DEFAULT NULL,
  `qtde` int(7) DEFAULT NULL,
  `valorunit` float(5,2) DEFAULT NULL,
  `valordescitens` float(5,2) DEFAULT NULL,
  `valornfitens` float(5,2) DEFAULT NULL,
  PRIMARY KEY (`NPedido`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `compras` */

insert  into `compras`(`NPedido`,`nomeFantasia`,`cpfFor`,`cnpjFor`,`formapagto`,`condicaopagto`,`parcelas`,`tipopedido`,`valortotal`,`valordesc`,`valornf`,`observacao`,`tipoproduto`,`produto`,`unidmedida`,`refproduto`,`qtde`,`valorunit`,`valordescitens`,`valornfitens`) values (10,'gfdgdf','455.365.058-40','01.554.910/0001-89','Cartão de Crédito','Parcelado',6,'Pedido',4.00,5.00,45.00,'4554','Massa','massa para pizza','UN','5',4,5.00,4.00,5.00),(17,'gfdgdf','455.365.058-40','01.554.910/0001-89','Cartão de Crédito','Parcelado',6,'Pedido',4.00,5.00,45.00,'4554','Massa','massa para pizza','UN','5',4,5.00,4.00,5.00),(19,'Paulo','455.365.058-40','  .   .   /    -  ','Cartão de Crédito','Parcelado',6,'Pedido',4.00,5.00,45.00,'4554','Massa','massa para pizza','UN','5',4,5.00,4.00,5.00);

/*Table structure for table `contaspagar` */

DROP TABLE IF EXISTS `contaspagar`;

CREATE TABLE `contaspagar` (
  `notaFiscal` varchar(100) NOT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `dataRecebimento` varchar(10) DEFAULT NULL,
  `dataEmissao` varchar(10) DEFAULT NULL,
  `dataVencimento` varchar(10) DEFAULT NULL,
  `valor` varchar(10) DEFAULT NULL,
  `juros` varchar(10) DEFAULT NULL,
  `multa` varchar(10) DEFAULT NULL,
  `fornecedor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`notaFiscal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contaspagar` */

insert  into `contaspagar`(`notaFiscal`,`descricao`,`dataRecebimento`,`dataEmissao`,`dataVencimento`,`valor`,`juros`,`multa`,`fornecedor`) values ('121','jghj','12/12/1212','12/12/1212','12/12/1212','34,00','43,00','3,00','Paulo'),('42442','asdfghjklç','12/12/1212','12/12/1212','12/12/1212','34,00','43,00','3,00','Paulo');

/*Table structure for table `contasreceber` */

DROP TABLE IF EXISTS `contasreceber`;

CREATE TABLE `contasreceber` (
  `telefone` varchar(13) DEFAULT NULL,
  `Cliente` varchar(50) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `valor` varchar(10) DEFAULT NULL,
  `juros` varchar(10) DEFAULT NULL,
  `multa` varchar(10) DEFAULT NULL,
  `tipopagamento` varchar(20) DEFAULT NULL,
  `nparcela` varchar(1) DEFAULT NULL,
  `dtrecebimento` varchar(10) DEFAULT NULL,
  `dtemissao` varchar(10) DEFAULT NULL,
  `dtvencimento` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `contasreceber` */

insert  into `contasreceber`(`telefone`,`Cliente`,`descricao`,`valor`,`juros`,`multa`,`tipopagamento`,`nparcela`,`dtrecebimento`,`dtemissao`,`dtvencimento`) values ('545','6565','7876','78,00','7,00','7,00','Cartão de Débito','1','56/54/6546','45/65/4654','56/65/6546'),('11343485','Paulo','5455234','4,00','3,00','2,00','Cartão de Débito','1','34/23/4234','34/23/4234','23/42/4324');

/*Table structure for table `fornecedor` */

DROP TABLE IF EXISTS `fornecedor`;

CREATE TABLE `fornecedor` (
  `cnpjFor` varchar(20) NOT NULL,
  `cpfFor` varchar(15) DEFAULT NULL,
  `nomeFantasia` varchar(50) DEFAULT NULL,
  `endeFor` varchar(50) DEFAULT NULL,
  `cidadeFor` varchar(30) DEFAULT NULL,
  `nomeContato` varchar(50) DEFAULT NULL,
  `emailFor` varchar(30) DEFAULT NULL,
  `bairroFor` varchar(30) DEFAULT NULL,
  `telFor` varchar(15) DEFAULT NULL,
  `cepFor` varchar(13) DEFAULT NULL,
  `celFor` varchar(14) DEFAULT NULL,
  `estadualFor` varchar(15) DEFAULT NULL,
  `numFor` varchar(6) DEFAULT NULL,
  `tel2For` varchar(15) DEFAULT NULL,
  `siteFor` varchar(40) DEFAULT NULL,
  `tipopessoa` varchar(17) DEFAULT NULL,
  `ufFor` varchar(2) DEFAULT NULL,
  `tipoproduto` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`cnpjFor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fornecedor` */

insert  into `fornecedor`(`cnpjFor`,`cpfFor`,`nomeFantasia`,`endeFor`,`cidadeFor`,`nomeContato`,`emailFor`,`bairroFor`,`telFor`,`cepFor`,`celFor`,`estadualFor`,`numFor`,`tel2For`,`siteFor`,`tipopessoa`,`ufFor`,`tipoproduto`) values ('  .   .   /    -  ','455.365.058-40','Paulo','SUACUAPARA','SAO PAULO','Paulo','a@a.com','PARQUE PAULISTANO','(42)3424-3242','08080100','(34)23525-4525','454.545.435.524','43','(23)1231-2423','a.com.br','Pessoa Fisica','SP','Pizza'),('38.362.852/0001-00','   .   .   -  ','Paulo','SUACUAPARA','SAO PAULO','Paulo','a@a.com','PARQUE PAULISTANO','(42)3424-3242','08080100','(34)23525-4525','454.545.435.524','43','(23)1231-2423','a.com.br','Pessoa Juridica','SP','Refrigerante');

/*Table structure for table `funcionario` */

DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `nomeFun` varchar(50) DEFAULT NULL,
  `rgFun` varchar(15) DEFAULT NULL,
  `cpfFun` varchar(15) NOT NULL,
  `nasciFun` varchar(10) DEFAULT NULL,
  `endeFun` varchar(100) DEFAULT NULL,
  `compleFun` varchar(100) DEFAULT NULL,
  `bairroFun` varchar(50) DEFAULT NULL,
  `cidadeFun` varchar(20) DEFAULT NULL,
  `cepFun` varchar(15) DEFAULT NULL,
  `numFun` varchar(5) DEFAULT NULL,
  `telFun` varchar(15) DEFAULT NULL,
  `celFun` varchar(15) DEFAULT NULL,
  `sexoFun` varchar(10) NOT NULL,
  `setorFun` varchar(20) DEFAULT NULL,
  `ufFun` varchar(2) DEFAULT NULL,
  `motoboy` varchar(3) DEFAULT NULL,
  `placamoto` varchar(7) DEFAULT NULL,
  `cnh` varchar(11) DEFAULT NULL,
  `modelomoto` varchar(15) DEFAULT NULL,
  `situacao` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cpfFun`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `funcionario` */

insert  into `funcionario`(`nomeFun`,`rgFun`,`cpfFun`,`nasciFun`,`endeFun`,`compleFun`,`bairroFun`,`cidadeFun`,`cepFun`,`numFun`,`telFun`,`celFun`,`sexoFun`,`setorFun`,`ufFun`,`motoboy`,`placamoto`,`cnh`,`modelomoto`,`situacao`) values ('Paulo','48.695.431-6','057.045.958-39','29/01/1995','SUACUAPARA','sds','PARQUE PAULISTANO','SAO PAULO','08080100',' 10','(11)2585-8180','(11)25813-1621','Masculino','balcao','SP',NULL,NULL,NULL,NULL,NULL),('william','39.725.858-6','264.051.848-89','28/07/2000','SUACUAPARA','','PARQUE PAULISTANO','SAO PAULO','08080100','276','(11)2585-3775','(11)96791-6805','Masculino','caixa','SP','SIM','fd','dfsdfsff','dsfsfdf',NULL),('Paulo','48.695.431-6','455.365.058-40','29/01/1995','SUACUAPARA','a','PARQUE PAULISTANO','SAO PAULO','08080100','5','(11)2154-5221','(54)54121-2548','Masculino','caixa','SP','NAO','','','','Ativado');

/*Table structure for table `itenspedido` */

DROP TABLE IF EXISTS `itenspedido`;

CREATE TABLE `itenspedido` (
  `npedido` int(10) DEFAULT NULL,
  `produto` varchar(50) DEFAULT NULL,
  `preco` float(5,2) DEFAULT NULL,
  `qtde` int(3) DEFAULT NULL,
  `total` float(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `itenspedido` */

insert  into `itenspedido`(`npedido`,`produto`,`preco`,`qtde`,`total`) values (6,'Meio a Meio de Pizza mussarela  e Atum',28.00,1,28.00),(6,'Meio a Meio de Pizza mussarela  e Atum',32.00,1,32.00),(8,'Atum',32.00,1,32.00),(13,'Meio a Meio de Pizza Calabresa e Pizza Calabresa',32.00,1,32.00),(14,'Refrigerante 300ML',5.99,1,5.99),(15,'Refrigerante 300ML',5.99,1,5.99),(17,'Meio a Meio de Pizza Calabresa e Pizza Calabresa',0.00,1,25.00),(20,'Meio a Meio de Pizza Calabresa e Pizza Calabresa',0.00,1,25.00),(22,'Meio a Meio de Atum e Pizza Calabresa',32.00,1,32.00),(23,'Meio a Meio de Pizza mussarela  e Pizza Calabresa',28.00,1,28.00),(23,'Atum',32.00,1,32.00),(23,'Refrigerante 300ML',5.99,1,5.99),(24,'Atum',32.00,1,32.00),(24,'Meio a Meio de Pizza Calabresa e Pizza mussarela ',28.00,1,28.00),(31,'Refrigerante 300ML',5.99,1,5.99),(33,'Atum',32.00,1,32.00),(37,'Atum',32.00,1,32.00),(38,'Pizza mussarela ',28.00,1,28.00),(39,'Pizza mussarela ',28.00,1,28.00),(40,'Pizza Calabresa',25.00,1,25.00),(41,'Pizza Calabresa',25.00,1,25.00),(42,'Refrigerante 300ML',5.99,1,5.99),(43,'Pizza Calabresa',25.00,1,25.00),(44,'Pizza mussarela ',28.00,1,28.00),(45,'Pizza Calabresa',25.00,1,25.00),(46,'Pizza Calabresa',25.00,1,25.00),(47,'Meio a Meio de Pizza Calabresa e Pizza mussarela ',28.00,1,28.00),(48,'Pizza Calabresa',25.00,1,25.00),(49,'Pizza mussarela ',28.00,1,28.00),(50,'Pizza mussarela ',28.00,1,28.00),(51,'Pizza Calabresa',25.00,1,25.00),(52,'Pizza Calabresa',25.00,1,25.00),(53,'Pizza Calabresa',25.00,1,25.00),(54,'Pizza Calabresa',25.00,1,25.00),(55,'Pizza Calabresa',25.00,1,25.00),(56,'Refrigerante 300ML',5.99,1,5.99),(57,'Pizza mussarela ',28.00,1,28.00),(58,'Refrigerante 300ML',5.99,1,5.99),(59,'Meio a Meio de Pizza mussarela  e Pizza Calabresa',28.00,1,28.00),(60,'Pizza Calabresa',25.00,1,25.00),(61,'Pizza mussarela ',28.00,1,28.00),(62,'Pizza Calabresa',25.00,1,25.00),(63,'Pizza Calabresa',25.00,1,25.00),(64,'Atum',32.00,1,32.00),(65,'Pizza Calabresa',25.00,1,25.00),(66,'Pizza Calabresa',25.00,1,25.00),(67,'Pizza Calabresa',25.00,1,25.00),(68,'Pizza Calabresa',25.00,1,25.00),(69,'Pizza mussarela ',28.00,1,28.00),(70,'Refrigerante 300ML',5.99,1,5.99),(71,'Pizza mussarela ',28.00,1,28.00),(72,'Pizza Calabresa',25.00,1,25.00),(73,'Pizza Calabresa',25.00,1,25.00),(74,'Pizza mussarela ',28.00,1,28.00),(75,'Pizza mussarela ',28.00,1,28.00),(76,'Pizza Calabresa',25.00,1,25.00),(77,'Pizza mussarela ',28.00,1,28.00),(78,'Pizza mussarela ',28.00,1,28.00),(79,'Pizza Calabresa',25.00,1,25.00),(80,'Pizza Calabresa',25.00,1,25.00),(81,'Pizza mussarela ',28.00,1,28.00),(82,'Pizza mussarela ',28.00,1,28.00),(83,'Pizza Calabresa',25.00,1,25.00),(84,'Pizza mussarela ',28.00,1,28.00),(85,'Pizza Calabresa',25.00,1,25.00),(86,'Refrigerante 300ML',5.99,1,5.99),(87,'Pizza mussarela ',28.00,1,28.00),(87,'Refrigerante 300ML',5.99,1,5.99),(88,'Pizza mussarela ',28.00,1,28.00),(88,'Meio a Meio de Pizza Calabresa e Pizza mussarela ',28.00,1,28.00),(89,'Refrigerante 300ML',5.99,1,5.99);

/*Table structure for table `produtos` */

DROP TABLE IF EXISTS `produtos`;

CREATE TABLE `produtos` (
  `codigoproduto` varchar(5) NOT NULL,
  `tipoproduto` varchar(20) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `ingredientes` varchar(50) DEFAULT NULL,
  `unidmedida` varchar(2) DEFAULT NULL,
  `estocavel` varchar(3) DEFAULT NULL,
  `qtdeminima` int(6) DEFAULT NULL,
  `acabadoprima` varchar(25) DEFAULT NULL,
  `valor` float(6,2) DEFAULT NULL,
  `qtdeestoque` int(6) DEFAULT NULL,
  `produtovenda` varchar(3) DEFAULT NULL,
  `dataregistro` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`codigoproduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `produtos` */

insert  into `produtos`(`codigoproduto`,`tipoproduto`,`descricao`,`ingredientes`,`unidmedida`,`estocavel`,`qtdeminima`,`acabadoprima`,`valor`,`qtdeestoque`,`produtovenda`,`dataregistro`) values ('121','Refrigerante','Refrigerante 300ML','','LT','SIM',5,'Produto Acabado',5.99,100,'SIM',NULL),('31','Pizza','Pizza mussarela ','queijo queijo e mais queijo','UN','NAO',0,'Produto Acabado',28.00,0,'SIM',NULL),('34','Pizza','Pizza Calabresa','calabreza , fermento','UN','NAO',0,'Produto Acabado',25.00,0,'SIM',NULL),('75','Pizza','Atum','atum','UN','-',0,'Produto Acabado',32.00,0,'SIM',NULL);

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `codigo` int(30) DEFAULT NULL,
  `nome` varchar(60) DEFAULT NULL,
  `login` varchar(40) NOT NULL,
  `senha` varchar(60) DEFAULT NULL,
  `permissao` varchar(4) DEFAULT NULL,
  `logado` char(2) DEFAULT NULL,
  `cpfFun` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`codigo`,`nome`,`login`,`senha`,`permissao`,`logado`,`cpfFun`) values (NULL,NULL,'1','1','1','s','455.365.058-40'),(NULL,NULL,'teste','teste','00','n','563.553.262-43');

/*Table structure for table `venda` */

DROP TABLE IF EXISTS `venda`;

CREATE TABLE `venda` (
  `npedido` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `telefone` varchar(13) DEFAULT NULL,
  `total` float(5,2) DEFAULT NULL,
  `formaPagamento` varchar(20) DEFAULT NULL,
  `observacao` varchar(50) DEFAULT NULL,
  `data` varchar(10) DEFAULT NULL,
  `valorrecebido` float(5,2) DEFAULT NULL,
  `troco` float(5,2) DEFAULT NULL,
  `hora` varchar(8) DEFAULT NULL,
  `tipopedido` varchar(20) DEFAULT NULL,
  `situacaoEntrega` varchar(20) DEFAULT NULL,
  `hrsaida` varchar(8) DEFAULT NULL,
  `horaentrega` varchar(8) DEFAULT NULL,
  `motoboy` varchar(50) DEFAULT NULL,
  `dataformat` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`npedido`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=utf8;

/*Data for the table `venda` */

insert  into `venda`(`npedido`,`telefone`,`total`,`formaPagamento`,`observacao`,`data`,`valorrecebido`,`troco`,`hora`,`tipopedido`,`situacaoEntrega`,`hrsaida`,`horaentrega`,`motoboy`,`dataformat`) values (21,'',25.00,'Cartão de Crédito','','29-09-2015',0.00,0.00,'02:46:04','Pedido Entrega',NULL,NULL,NULL,NULL,NULL),(22,'25858180',32.00,'Cartão de Crédito','','29-09-2015',0.00,0.00,'02:46:51','Pedido Entrega','Saiu Para Entregar','12:28:16','','Paulo',NULL),(23,'25853775',65.99,'Dinheiro','calotero','29-09-2015',100.00,34.01,'03:15:56','Pedido Entrega','Não Entregue','12:33:02','12:33:05','william',NULL),(24,'25858180',60.00,'Dinheiro','','29-09-2015',100.00,40.00,'03:56:15','Pedido Entrega','Cancelado','12:43:26','12:43:24','Paulo',NULL),(25,'',25.00,'Cartão de Débito','','07-10-2015',0.00,0.00,'03:29:22','Pedido Entrega','Aberto',NULL,NULL,NULL,NULL),(26,'',28.00,'Cartão de Crédito','','2015/10/07',0.00,0.00,'03:33:17','Pedido Balcao','Entrega OK',NULL,'03:33:36','',NULL),(27,'',28.00,'Cartão de Crédito','','07-10-2015',0.00,0.00,'03:34:22','Pedido Balcao','Entrega OK',NULL,'03:34:35','',NULL),(28,'',25.00,'Cartão de Débito','','07-10-2015',0.00,0.00,'03:35:13','Pedido Balcao','Aberto',NULL,NULL,NULL,NULL),(29,'25858180',28.00,'Cartão de Débito','','07-10-2015',0.00,0.00,'03:48:38','Pedido Entrega','Aberto',NULL,NULL,NULL,NULL),(30,'',25.00,'Cartão de Crédito','','14/10/2015',0.00,0.00,'08:48:33','Pedido Balcao','Aberto',NULL,NULL,NULL,NULL),(31,'',5.99,'Cartão de Crédito','','14/10/2015',0.00,0.00,'08:51:22','Pedido Balcao','Aberto',NULL,NULL,NULL,NULL),(32,'',28.00,'Cartão de Crédito','','14/10/2015',0.00,0.00,'08:51:35','Pedido Balcao','Aberto',NULL,NULL,NULL,NULL),(33,'',32.00,'Cartão de Crédito','','14/10/2015',0.00,0.00,'09:22:42','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/14'),(34,'25858180',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'04:49:34','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(35,'25858180',25.00,'Dinheiro','','24/10/2015',50.00,25.00,'04:50:54','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(36,'25858180',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:13:11','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(37,'25858180',32.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:16:54','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(38,'25858180',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:25:04','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(39,'25858180',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:26:46','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(40,'25858180',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:28:13','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(41,'',25.00,'Cartão de Débito','','24/10/2015',0.00,0.00,'05:29:37','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(42,'',5.99,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:30:27','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(43,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:31:28','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(44,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:34:56','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(45,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:35:51','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(46,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:36:59','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(47,'25858180',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:38:42','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(48,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:39:26','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(49,'',28.00,'Cartão de Débito','','24/10/2015',0.00,0.00,'05:41:52','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(50,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:47:07','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(51,'',25.00,'Cartão de Débito','','24/10/2015',0.00,0.00,'05:47:58','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(52,'',25.00,'Cartão de Débito','','24/10/2015',0.00,0.00,'05:48:56','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(53,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:53:46','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(54,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'05:56:22','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(55,'',25.00,'Cartão de Débito','','24/10/2015',0.00,0.00,'06:12:37','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(56,'',5.99,'Cartão de Crédito','','24/10/2015',0.00,0.00,'06:13:55','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(57,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'06:14:36','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(58,'',5.99,'Cartão de Crédito','','24/10/2015',0.00,0.00,'06:24:04','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(59,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'06:24:29','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(60,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'06:24:49','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(61,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'06:31:46','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(62,'',25.00,'Cartão de Débito','','24/10/2015',0.00,0.00,'06:32:44','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(63,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'06:44:00','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(64,'',32.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'06:58:09','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(65,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:06:33','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(66,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:13:06','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(67,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:14:23','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(68,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:27:02','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(69,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:27:52','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(70,'',5.99,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:28:51','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(71,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:30:51','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(72,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:31:24','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(73,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:32:17','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(74,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:32:44','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(75,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:34:55','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(76,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:36:57','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(77,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:38:10','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(78,'',28.00,'Cartão de Débito','','24/10/2015',0.00,0.00,'07:41:13','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(79,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:41:30','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(80,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:41:55','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(81,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:48:11','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(82,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:48:58','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(83,'',25.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:49:23','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(84,'',28.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:50:30','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(85,'',25.00,'Cartão de Débito','','24/10/2015',0.00,0.00,'07:51:01','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(86,'',5.99,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:52:56','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(87,'',33.99,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:56:02','Pedido Balcao','Aberto',NULL,NULL,NULL,'2015/10/24'),(88,'',56.00,'Cartão de Crédito','','24/10/2015',0.00,0.00,'07:56:29','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/24'),(89,'25858180',5.99,'Cartão de Débito','','25/10/2015',0.00,0.00,'01:34:57','Pedido Entrega','Aberto',NULL,NULL,NULL,'2015/10/25');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
