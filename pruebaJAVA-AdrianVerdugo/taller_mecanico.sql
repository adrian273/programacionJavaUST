-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 29-06-2018 a las 13:24:58
-- Versión del servidor: 5.7.17-log
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `taller_mecanico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `rutCliente` varchar(15) NOT NULL,
  `nombresCliente` varchar(60) NOT NULL,
  `apellidosCliente` varchar(65) NOT NULL,
  `emailCliente` varchar(45) NOT NULL,
  `fonoCliente` varchar(45) NOT NULL,
  `fechaCreacionCliente` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`rutCliente`, `nombresCliente`, `apellidosCliente`, `emailCliente`, `fonoCliente`, `fechaCreacionCliente`) VALUES
('12.787.467-0', 'Esteban ', ' Navarrete ', ' mauri@gmail.com ', ' 78854533', '2018-06-26 21:57:52');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marcas`
--

CREATE TABLE `marcas` (
  `idMarca` int(11) NOT NULL,
  `nombreMarca` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `marcas`
--

INSERT INTO `marcas` (`idMarca`, `nombreMarca`) VALUES
(1, 'nissan'),
(2, 'toyota'),
(3, 'chevrolet'),
(4, 'ford');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE `registros` (
  `idRegistro` int(11) NOT NULL,
  `fechaRegistro` datetime NOT NULL,
  `descripcionRegistro` text NOT NULL,
  `totalCobroRegistro` int(11) NOT NULL,
  `vehiculos_patenteVehiculo` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`idRegistro`, `fechaRegistro`, `descripcionRegistro`, `totalCobroRegistro`, `vehiculos_patenteVehiculo`) VALUES
(11, '2018-06-26 21:59:36', '27000', 15000, 'kdrs01'),
(12, '2018-06-29 12:56:05', 'esta maloo lod frenos', 1122121, 'srcs02'),
(13, '2018-06-29 13:17:47', '225', 225, 'kdrs01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(50) NOT NULL,
  `emailUsuario` varchar(100) NOT NULL,
  `passwordUsuario` varchar(50) NOT NULL,
  `fechaCreacionUsuario` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombreUsuario`, `emailUsuario`, `passwordUsuario`, `fechaCreacionUsuario`) VALUES
(3, 'adrian', 'jbj', 'jbkj', '2018-06-29 00:00:00'),
(5, 'adrian andres', 'adrik@kdrs.src', '12345678', '2018-06-29 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

CREATE TABLE `vehiculos` (
  `patenteVehiculo` varchar(8) NOT NULL,
  `marcas_idMarca` int(11) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `color` varchar(45) NOT NULL,
  `yearVehiculo` int(11) NOT NULL,
  `fechaRegistroVehiculo` date NOT NULL,
  `clientes_rutCliente` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`patenteVehiculo`, `marcas_idMarca`, `modelo`, `color`, `yearVehiculo`, `fechaRegistroVehiculo`, `clientes_rutCliente`) VALUES
('kdrs01', 1, 'tuckson', 'negro', 2019, '2018-06-26', '12.787.467-0'),
('srcs02', 1, 'centra', 'rojo', 2018, '2018-06-29', '12.787.467-0');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`rutCliente`);

--
-- Indices de la tabla `marcas`
--
ALTER TABLE `marcas`
  ADD PRIMARY KEY (`idMarca`);

--
-- Indices de la tabla `registros`
--
ALTER TABLE `registros`
  ADD PRIMARY KEY (`idRegistro`,`vehiculos_patenteVehiculo`),
  ADD KEY `fk_registros_vehiculos1_idx` (`vehiculos_patenteVehiculo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- Indices de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`patenteVehiculo`,`marcas_idMarca`,`clientes_rutCliente`),
  ADD KEY `fk_vehiculos_marcas_idx` (`marcas_idMarca`),
  ADD KEY `fk_vehiculos_clientes1_idx` (`clientes_rutCliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `marcas`
--
ALTER TABLE `marcas`
  MODIFY `idMarca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `registros`
--
ALTER TABLE `registros`
  MODIFY `idRegistro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `registros`
--
ALTER TABLE `registros`
  ADD CONSTRAINT `fk_registros_vehiculos1` FOREIGN KEY (`vehiculos_patenteVehiculo`) REFERENCES `vehiculos` (`patenteVehiculo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD CONSTRAINT `fk_vehiculos_clientes1` FOREIGN KEY (`clientes_rutCliente`) REFERENCES `clientes` (`rutCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vehiculos_marcas` FOREIGN KEY (`marcas_idMarca`) REFERENCES `marcas` (`idMarca`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
