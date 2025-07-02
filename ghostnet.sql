-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 02. Jul 2025 um 13:37
-- Server-Version: 10.4.32-MariaDB
-- PHP-Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `ghostnet`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `net`
--

CREATE TABLE `net` (
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `person` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Daten für Tabelle `net`
--

INSERT INTO `net` (`latitude`, `longitude`, `id`, `person`, `size`, `state`) VALUES
(80.0844, 120.001, 1, 'PEC', 'XS', 'Bergung bevorstehend'),
(8.0158, 40.0888, 2, '', 'S', 'verschollen'),
(12.888, 4.111, 3, '', 'M', 'verschollen'),
(-88.777, -177.1, 5, 'Jens', 'XL', 'Bergung bevorstehend'),
(-1.92478, -45.0777, 6, 'Hendrik', 'XL', 'Bergung bevorstehend'),
(-14.87674, 90, 7, 'Hendrik', 'XL', 'geborgen'),
(-24.2318, 125.5155, 8, 'Patrick', 'XL', 'geborgen'),
(84.45, 13.48623, 9, 'Patrick', 'XL', 'Bergung bevorstehend'),
(-12.1451, 133.5131, 10, '', 'M', 'verschollen'),
(-52.11351, 133.5131, 11, '', 'M', 'verschollen'),
(-52.11351, -80.1153, 12, '', 'L', 'verschollen'),
(-89.121719, 50.4949, 13, '', 'XL', 'gemeldet'),
(-167.15616, 90, 14, '', 'M', 'gemeldet'),
(-125.48852, 40.1515187, 15, '', 'S', 'gemeldet'),
(-45.154163, 90, 16, '', 'M', 'gemeldet'),
(NULL, NULL, 17, NULL, 'M', 'verschollen'),
(-45.12, 49.15131513, 18, 'PEC', 'M', 'Bergung bevorstehend'),
(25.252525, -125.252525, 19, '', 'M', 'gemeldet'),
(69.696969, -69.696969, 20, '', 'M', 'gemeldet'),
(69.696969, -69.696969, 21, 'Test', '[XS, S, M, L, XL]', 'geborgen'),
(-23.45811, 125.999, 22, '', 'M', 'gemeldet'),
(-15.888888, 125.999, 23, '', 'M', 'gemeldet'),
(-15.888888, 12.31252, 24, '', 'XL', 'gemeldet'),
(-15.888888, 12.31252, 25, NULL, 'M', 'gemeldet'),
(-15.888888, 12.31252, 26, NULL, 'M', 'gemeldet');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `net`
--
ALTER TABLE `net`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `net`
--
ALTER TABLE `net`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
