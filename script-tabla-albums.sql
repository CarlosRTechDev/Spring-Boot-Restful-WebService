--
-- Estructura de tabla para la tabla `albums`
--

CREATE TABLE `albums` (
  `id` int(11) NOT NULL,
  `titulo` varchar(80) NOT NULL,
  `artista` varchar(50) NOT NULL,
  `lanzado` date NOT NULL,
  `genero` varchar(50) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `albums`
--

INSERT INTO `albums` (`id`, `titulo`, `artista`, `lanzado`, `genero`, `precio`) VALUES
(1, 'Petals for Armor', 'Hayley Williams', '2020-05-08', 'Pop', 429),
(2, 'Misadventures', 'Pierce The Veil', '2016-05-13', 'Post-Hardcore', 179),
(3, 'Power Up', 'AC/DC', '2016-11-13', 'Hard Rock', 189);

