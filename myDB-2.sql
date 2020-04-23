-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 23, 2020 at 07:27 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myDB`
--

-- --------------------------------------------------------

--
-- Table structure for table `Clock`
--

CREATE TABLE `Clock` (
  `day` date NOT NULL,
  `Intime` time NOT NULL,
  `Empid1` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Clock`
--

INSERT INTO `Clock` (`day`, `Intime`, `Empid1`) VALUES
('2019-11-20', '01:02:30', '12345'),
('2019-11-20', '01:02:48', '23456'),
('2019-11-20', '01:03:42', '12345'),
('2019-11-20', '02:02:07', '12345'),
('2019-11-20', '02:03:31', '12345'),
('2019-11-20', '02:05:57', '34567'),
('2019-11-20', '02:10:16', '23456'),
('2019-11-20', '02:12:05', '23456'),
('2019-11-20', '02:15:19', '12345'),
('2019-11-20', '02:15:28', '23456'),
('2019-11-20', '02:15:35', '34567'),
('2019-11-20', '02:15:44', '12345'),
('2019-11-20', '06:05:56', '12345'),
('2019-11-20', '06:44:55', '12345'),
('2019-11-20', '06:53:09', '23456'),
('2019-11-20', '06:56:34', '34567'),
('2019-11-20', '07:30:46', '12345'),
('2019-11-20', '07:31:59', '34567'),
('2019-11-20', '08:38:58', '12345'),
('2019-11-20', '10:47:26', '56789'),
('2019-11-21', '12:13:30', '23456'),
('2019-11-21', '12:07:08', '12345'),
('2019-11-21', '12:22:49', '12345'),
('2019-11-21', '12:24:01', '12345'),
('2019-11-21', '12:35:05', '34567'),
('2019-11-21', '01:11:26', '12345'),
('2019-11-21', '01:19:52', '23456'),
('2019-11-21', '02:21:13', '34567'),
('2019-11-21', '02:32:22', '12345'),
('2019-11-21', '02:40:24', '23456'),
('2019-11-21', '02:41:25', '34567'),
('2019-11-21', '02:42:23', '34567'),
('2019-11-21', '03:17:44', '5555');

-- --------------------------------------------------------

--
-- Table structure for table `Employeesearch`
--

CREATE TABLE `Employeesearch` (
  `day` date NOT NULL,
  `Intime` time NOT NULL,
  `Emplid` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `mob` bigint(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Employeesearch`
--

INSERT INTO `Employeesearch` (`day`, `Intime`, `Emplid`, `name`, `mob`) VALUES
('2019-11-20', '02:15:19', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-20', '02:15:28', '23456', 'Roshni Avasarala', 9908514237),
('2019-11-20', '02:15:35', '34567', 'Ponnam sai Vineeth', 8106427527),
('2019-11-20', '02:15:44', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-20', '06:05:56', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-20', '06:44:55', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-20', '06:53:09', '23456', 'Roshni Avasarala', 9908514237),
('2019-11-20', '06:56:34', '34567', 'Ponnam sai Vineeth', 8106427527),
('2019-11-20', '07:30:46', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-20', '07:31:59', '34567', 'Ponnam sai Vineeth', 8106427527),
('2019-11-20', '08:38:58', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-20', '10:47:26', '56789', '', 9848944571),
('2019-11-21', '12:13:30', '23456', 'Roshni Avasarala', 9908514237),
('2019-11-21', '12:07:08', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-21', '12:22:49', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-21', '12:24:01', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-21', '12:35:05', '34567', 'Ponnam sai Vineeth', 8106427527),
('2019-11-21', '01:11:26', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-21', '01:19:52', '23456', 'Roshni Avasarala', 9908514237),
('2019-11-21', '02:21:13', '34567', 'Ponnam sai Vineeth', 8106427527),
('2019-11-21', '02:32:22', '12345', 'Yashwanth Veerepalli', 7036095666),
('2019-11-21', '02:40:24', '23456', 'Roshni Avasarala', 9908514237),
('2019-11-21', '02:41:25', '34567', 'Ponnam sai Vineeth', 8106427527),
('2019-11-21', '02:42:23', '34567', 'Ponnam sai Vineeth', 8106427527),
('2019-11-21', '03:17:44', '5555', 'Nancy', 6789067890);

-- --------------------------------------------------------

--
-- Table structure for table `MyGuests`
--

CREATE TABLE `MyGuests` (
  `Empid` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `mob` bigint(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `MyGuests`
--

INSERT INTO `MyGuests` (`Empid`, `name`, `mob`) VALUES
('12334', 'Raghu', 8978978712),
('12345', 'Yashwanth Veerepalli', 7036095666),
('19090', 'KID', 7036012345),
('20019', 'Alex hales', 9010542079),
('200996', 'chiranjeevi', 3168801996),
('21212', 'Virat Kohli', 1289012345),
('21345', 'rams', 316123988),
('21346', 'krishna', 316123987),
('23301', 'ROSH', 6303477442),
('23330', 'John Dale', 8632456666),
('23456', 'Roshni Avasarala', 9908514237),
('34567', 'Ponnam sai Vineeth', 8106427527),
('456789', 'Ronaldo', 6554765865),
('5555', 'Nancy', 6789067890),
('56700', 'vijay', 4106427527),
('56788', 'jaguar', 6565856),
('56789', 'king', 9848944571),
('571641', 'Bose', 2330692501),
('67220', 'mini', 9000012345),
('67890', 'ram', 4321432199),
('76543', 'David Warner ', 9909909909),
('99567', 'suresh', 7134567898),
('99999', 'Ganesh', 3168802046);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Clock`
--
ALTER TABLE `Clock`
  ADD KEY `Empid1` (`Empid1`);

--
-- Indexes for table `MyGuests`
--
ALTER TABLE `MyGuests`
  ADD PRIMARY KEY (`Empid`) USING BTREE,
  ADD UNIQUE KEY `mob` (`mob`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Clock`
--
ALTER TABLE `Clock`
  ADD CONSTRAINT `Clock_ibfk_1` FOREIGN KEY (`Empid1`) REFERENCES `MyGuests` (`Empid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
