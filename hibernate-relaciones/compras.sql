-- MySQL dump 10.16  Distrib 10.1.37-MariaDB, for Win32 (AMD64)
--
-- Host: 127.0.0.1    Database: compras
-- ------------------------------------------------------
-- Server version	10.1.37-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `idcategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `borrame` decimal(10,4) DEFAULT NULL,
  PRIMARY KEY (`idcategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Deliciosas frutas',NULL),(2,'Verdura',NULL),(3,'Pescados',NULL),(4,'Carnes',NULL),(5,'pepe',10.5000),(6,'aaa',10.5000),(7,'Cat desde hibernate',NULL),(8,'Cat2 desde hibernate',NULL),(9,'Cat2 desde hibernate',NULL),(10,'Cat0 desde hibernate',NULL),(11,'Cat1 desde hibernate',NULL),(12,'Cat2 desde hibernate',NULL),(13,'Cat3 desde hibernate',NULL),(15,'Cat5 desde hibernate',NULL),(16,'Cat6 desde hibernate',NULL),(17,'Cat7 desde hibernate',NULL),(18,'Cat8 desde hibernate',NULL);
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_proveedor`
--

DROP TABLE IF EXISTS `producto_proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto_proveedor` (
  `idproducto_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `idproducto` int(11) NOT NULL,
  `idproveedor` int(11) NOT NULL,
  `precio` decimal(10,4) NOT NULL DEFAULT '0.0000',
  PRIMARY KEY (`idproducto_proveedor`),
  KEY `fk_producto` (`idproducto`),
  KEY `fk_proveedor` (`idproveedor`),
  CONSTRAINT `fk_producto` FOREIGN KEY (`idproducto`) REFERENCES `productos` (`idproducto`) ON UPDATE CASCADE,
  CONSTRAINT `fk_proveedor` FOREIGN KEY (`idproveedor`) REFERENCES `proveedores` (`idproveedor`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_proveedor`
--

LOCK TABLES `producto_proveedor` WRITE;
/*!40000 ALTER TABLE `producto_proveedor` DISABLE KEYS */;
INSERT INTO `producto_proveedor` VALUES (1,1,1,20.0000),(2,1,2,19.0000),(3,2,1,10.0000),(4,3,2,10.0000),(5,4,3,80.0000),(6,15,5,0.0000),(7,16,5,0.0000);
/*!40000 ALTER TABLE `producto_proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `idproducto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `idcategoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Manzana','Manzana saludable',3,1),(2,'Pera','No ha salido de un olmo',13,1),(3,'Brócoli','Verdura fractal',5,2),(4,'Salmonete','Salmón chiquitín',30,3),(5,'Tomate','Rojo como el pecado',10,2),(7,'Tomate','Rojo como el pecado',10,2),(8,'Coliflor','Blanca y radiante',7,14),(9,'Pimiento','Del Padrón',5,NULL),(10,'Tomate','Rojo como el pecado',10,2),(11,'Coliflor','Blanca y radiante',7,2),(12,'Pimiento','Del Padrón',5,2),(15,'Pepino','Francés',5,NULL),(16,'Endivia','Nada envidiosa',7,NULL);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedores` (
  `idproveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `nif` varchar(15) DEFAULT NULL,
  `poblacion` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`idproveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (1,'De fruta madre','B1231231','Lleida'),(2,'L\'hort de l\'avia','B716721','Girona'),(3,'De la mar el mero','B2334231','Tarragona'),(5,'Paco','11111','Turruncún');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-28 10:15:27
