-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 13. Jul 2025 um 17:06
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
(-20, 59.3, 28, NULL, 'XS', 'gemeldet'),
(18.4416, -33.9208, 29, NULL, 'M', 'geborgen'),
(-30, 0, 30, 'Peter', 'XL', 'Bergung bevorstehend'),
(-15.404, -170.612, 31, NULL, 'L', 'geborgen'),
(12.8, 144.8, 32, NULL, 'S', 'verschollen'),
(55.72139, 1, 33, 'Kathrin', 'L', 'Bergung bevorstehend'),
(40, -149, 34, NULL, 'XS', 'gemeldet'),
(68.25, -16.4, 35, 'Thomas', 'XL', 'Bergung bevorstehend'),
(-9.5, 112.2, 36, NULL, 'XS', 'gemeldet'),
(-34.03, -53, 37, 'Kathrin', 'M', 'verschollen'),
(20.1234, -160.98765, 38, 'Martin', 'L', 'Bergung bevorstehend'),
(-0.5, -91.1, 39, NULL, 'S', 'geborgen'),
(51.2, -3.9, 40, 'Peter', 'L', 'geborgen'),
(5, 60, 41, NULL, 'XL', 'verschollen'),
(-21.4829, 55.6198, 42, NULL, 'S', 'gemeldet'),
(33.8802, 137.4255, 43, NULL, 'M', 'geborgen'),
(65.1, 170.2, 44, NULL, 'L', 'gemeldet'),
(-54.9, -36.5, 45, 'Thomas', 'XL', 'Bergung bevorstehend'),
(-7, -25, 46, 'Thomas', 'L', 'geborgen'),
(27.333, -78.1, 47, NULL, 'S', 'verschollen'),
(14.6001, -61.083, 48, NULL, 'M', 'gemeldet'),
(-45.72, 165.1, 49, NULL, 'M', 'gemeldet'),
(3.142857, 43, 50, NULL, 'L', 'gemeldet'),
(38.92, -123.001, 51, NULL, 'XL', 'gemeldet'),
(-60, -30.5, 52, NULL, 'XS', 'gemeldet');

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
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
