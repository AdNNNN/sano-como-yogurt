-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-06-2019 a las 14:24:12
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `disponibilidades`
--

CREATE TABLE `disponibilidades` (
  `id` int(11) NOT NULL,
  `medicos_id` int(11) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `deleted_at` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dolencias`
--

CREATE TABLE `dolencias` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `gravedad` varchar(45) NOT NULL,
  `deleted_at` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidades`
--

CREATE TABLE `especialidades` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `deleted_at` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `especialidades`
--

INSERT INTO `especialidades` (`id`, `nombre`, `deleted_at`) VALUES
(1, 'Sysadmin', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicos`
--

CREATE TABLE `medicos` (
  `id` int(11) NOT NULL,
  `usuarios_id` int(11) NOT NULL,
  `especialidades_id` int(11) NOT NULL,
  `fecha_contratacion` varchar(45) NOT NULL,
  `deleted_at` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `id` int(11) NOT NULL,
  `usuarios_id` int(11) NOT NULL,
  `deleted_at` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes_dolencias`
--

CREATE TABLE `pacientes_dolencias` (
  `id` int(11) NOT NULL,
  `pacientes_id` int(11) NOT NULL,
  `dolencias_id` int(11) NOT NULL,
  `deleted_at` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `privilegios`
--

CREATE TABLE `privilegios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `deleted_at` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `privilegios`
--

INSERT INTO `privilegios` (`id`, `nombre`, `deleted_at`) VALUES
(1, 'usuario', NULL),
(2, 'Sysadmin', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `id` int(11) NOT NULL,
  `disponibilidades_id` int(11) NOT NULL,
  `pacientes_id` int(11) NOT NULL,
  `hora_inicio` varchar(45) NOT NULL,
  `hora_termino` varchar(45) NOT NULL,
  `deleted_at` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `privilegios_id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `rut` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `deleted_at` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `privilegios_id`, `nombre`, `password`, `rut`, `telefono`, `correo`, `deleted_at`) VALUES
(1, 1, 'Juan Perez', 'pass', '1-2', '123', '123@123.cl', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `disponibilidades`
--
ALTER TABLE `disponibilidades`
  ADD PRIMARY KEY (`id`),
  ADD KEY `medicos_id` (`medicos_id`);

--
-- Indices de la tabla `dolencias`
--
ALTER TABLE `dolencias`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `especialidades`
--
ALTER TABLE `especialidades`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarios_id` (`usuarios_id`),
  ADD KEY `especialidades_id` (`especialidades_id`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarios_id` (`usuarios_id`);

--
-- Indices de la tabla `pacientes_dolencias`
--
ALTER TABLE `pacientes_dolencias`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pacientes_id` (`pacientes_id`),
  ADD KEY `dolencias_id` (`dolencias_id`);

--
-- Indices de la tabla `privilegios`
--
ALTER TABLE `privilegios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `disponibilidades_id` (`disponibilidades_id`),
  ADD KEY `pacientes_id` (`pacientes_id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `privilegios_id` (`privilegios_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `disponibilidades`
--
ALTER TABLE `disponibilidades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `dolencias`
--
ALTER TABLE `dolencias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `especialidades`
--
ALTER TABLE `especialidades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `medicos`
--
ALTER TABLE `medicos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pacientes_dolencias`
--
ALTER TABLE `pacientes_dolencias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `privilegios`
--
ALTER TABLE `privilegios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `disponibilidades`
--
ALTER TABLE `disponibilidades`
  ADD CONSTRAINT `disponibilidades_ibfk_1` FOREIGN KEY (`medicos_id`) REFERENCES `medicos` (`id`);

--
-- Filtros para la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD CONSTRAINT `medicos_ibfk_1` FOREIGN KEY (`usuarios_id`) REFERENCES `usuarios` (`id`),
  ADD CONSTRAINT `medicos_ibfk_2` FOREIGN KEY (`especialidades_id`) REFERENCES `especialidades` (`id`);

--
-- Filtros para la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD CONSTRAINT `pacientes_ibfk_1` FOREIGN KEY (`usuarios_id`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `pacientes_dolencias`
--
ALTER TABLE `pacientes_dolencias`
  ADD CONSTRAINT `pacientes_dolencias_ibfk_1` FOREIGN KEY (`pacientes_id`) REFERENCES `pacientes` (`id`),
  ADD CONSTRAINT `pacientes_dolencias_ibfk_2` FOREIGN KEY (`dolencias_id`) REFERENCES `dolencias` (`id`);

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`disponibilidades_id`) REFERENCES `disponibilidades` (`id`),
  ADD CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`pacientes_id`) REFERENCES `pacientes` (`id`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`privilegios_id`) REFERENCES `privilegios` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
