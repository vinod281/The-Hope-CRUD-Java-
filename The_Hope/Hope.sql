-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 11, 2024 at 09:32 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Hope`
--

-- --------------------------------------------------------

--
-- Table structure for table `HopeStu`
--

CREATE TABLE `HopeStu` (
  `s_ID` int(6) NOT NULL,
  `s_name` varchar(20) NOT NULL,
  `s_date` varchar(15) NOT NULL,
  `s_address` varchar(30) NOT NULL,
  `s_tel` varchar(15) NOT NULL,
  `s_class` varchar(6) NOT NULL,
  `g_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `HopeStu`
--

INSERT INTO `HopeStu` (`s_ID`, `s_name`, `s_date`, `s_address`, `s_tel`, `s_class`, `g_name`) VALUES
(26138, 'Dulashi Lakmini', '2006/01/06', 'Thambuththegama.', '0712044363', '12-B', 'Lakshmie'),
(28222, 'Lakshmie', '1969/03/05', 'Padukka', '0712044363', 'VET', 'Premawathi'),
(28223, 'Chathuranga Prabhath', '1998/03/22', 'Padukka', '0712044363', 'VET', 'Sumana'),
(28226, 'Kapila Suranga', '1994/01/01', 'Thambuththegama', '0765454343', 'CC1', 'Sumimal'),
(28227, 'Awishka', '1998/01/01', 'Thalawa', '0982534554', 'DF1', 'Karunarathna'),
(28228, 'Sajila', '1998/02/23', 'Orugodawaththa', '19903235', 'TEC', 'Adhikari'),
(28229, 'Dilanka Jayasooriya', '1998/01/23', 'Maldives', '0765434221', 'CF', 'Jayasinghe'),
(28232, 'Sajintha Lakshan', '1998/12/13', 'Ipilwaththa', '0712432332', 'TEC', 'Nihal'),
(28233, 'Sunimal Perera', '2002/08/12', 'Homagama.', '0765543232', 'FOC', 'Nihal Thennakoon'),
(28234, 'Nishmika Ekanayaka', '2003/06/13', 'Galle', '0765434112', 'FOC', 'Sunil Ekanayaka'),
(28238, 'Pravihara', '1998/08/11', 'Dambulla', '0765544345', 'FOC', 'Jayasingha'),
(28255, 'Sunil', '1992/09/22', 'Anuradhapura', '0719154070', 'FOC', 'Perera'),
(28257, 'Tharusha Navodya', '2000/01/06', 'Thambuththegama', '0767135911', 'FOT', 'Jayasinghe'),
(28259, 'Nilupul Dissanayaka', '2002/03/12', 'Ipilwaththa', '0774345432', 'FOT', 'Dalugoda Kumara'),
(28262, 'Chamalka', '1234', 'advv', 'ddd', '12n', 'dsgsd'),
(28263, 'pravihara new', '1998', 'homagama', '0112343432', 'foc', 'sunimal'),
(28265, 'Chathura Senarathna', '1985/12/12', 'Colombo 07', '0789867543', 'PRLT', 'Rajitha Senarathna'),
(28266, 'Ronath', '1999', 'homagama', '119', 'foc', 'nimal'),
(28267, 'Sadun ', '2001', 'homagama', '119', 'foc', 'nimal'),
(28268, 'Nimal Dissanayaka', '1999/12/12', 'Anuradhapura', '0761234567', 'FOC', 'Sugath Dissanayaka');

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE `payments` (
  `s_ID` int(5) NOT NULL,
  `s_name` varchar(20) NOT NULL,
  `jan` tinyint(1) DEFAULT NULL,
  `feb` tinyint(1) DEFAULT NULL,
  `mar` tinyint(1) DEFAULT NULL,
  `apr` tinyint(1) DEFAULT NULL,
  `may` tinyint(1) DEFAULT NULL,
  `jun` tinyint(1) DEFAULT NULL,
  `jul` tinyint(1) DEFAULT NULL,
  `aug` tinyint(1) DEFAULT NULL,
  `sep` tinyint(1) DEFAULT NULL,
  `oct` tinyint(1) DEFAULT NULL,
  `nov` tinyint(1) DEFAULT NULL,
  `dec` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payments`
--

INSERT INTO `payments` (`s_ID`, `s_name`, `jan`, `feb`, `mar`, `apr`, `may`, `jun`, `jul`, `aug`, `sep`, `oct`, `nov`, `dec`) VALUES
(28238, '', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(28255, '', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(28257, 'Tharusha Navodya', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(28259, 'Nilupul Dissanayaka', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0),
(28262, 'Chamalka', 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0),
(28263, 'pravihara new', 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0),
(28265, 'Chathura Senarathna', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1),
(28266, 'Ronath', 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0),
(28267, 'Sadun ', 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0),
(28268, 'Nimal Dissanayaka', 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `HopeStu`
--
ALTER TABLE `HopeStu`
  ADD PRIMARY KEY (`s_ID`);

--
-- Indexes for table `payments`
--
ALTER TABLE `payments`
  ADD KEY `s_ID` (`s_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `HopeStu`
--
ALTER TABLE `HopeStu`
  MODIFY `s_ID` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28269;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `payments`
--
ALTER TABLE `payments`
  ADD CONSTRAINT `payments_ibfk_1` FOREIGN KEY (`s_ID`) REFERENCES `HopeStu` (`s_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
