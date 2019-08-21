-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2019 at 03:12 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminanduser`
--

CREATE TABLE `adminanduser` (
  `userid` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `usertype` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminanduser`
--

INSERT INTO `adminanduser` (`userid`, `password`, `usertype`) VALUES
('pawan', 'admin', 'admin'),
('nirajan', 'user', 'user'),
('ankit', 'user', 'user'),
('bastola', 'abcd', 'user'),
('parash', '8828', 'admin'),
('hari', 'hari123', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `customerdetails`
--

CREATE TABLE `customerdetails` (
  `ticketno` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `citizenshipno` int(11) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `dateofbirth` date NOT NULL,
  `phone` int(11) NOT NULL,
  `nationality` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `dateofjourney` date NOT NULL,
  `flightid` int(11) NOT NULL,
  `seatno` int(11) NOT NULL,
  `class` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customerdetails`
--

INSERT INTO `customerdetails` (`ticketno`, `customer_id`, `name`, `citizenshipno`, `gender`, `dateofbirth`, `phone`, `nationality`, `address`, `dateofjourney`, `flightid`, `seatno`, `class`) VALUES
(1, 1, 'pawan', 89, 'male', '2002-01-01', 8828, 'Australia', 'jhapa', '2003-01-01', 56, 7, 'A'),
(34, 2, 'nirajan', 343434, 'female', '2000-01-01', 5454, 'Nationality', 'kksfdf', '2000-01-01', 89, 56, 'V'),
(21, 132, 'hjhjh', 45, 'male', '2003-01-01', 656, 'Australia', 'hghh', '2000-01-01', 21, 56, 'x'),
(3434, 137, 'niru', 678, 'female', '2000-01-01', 3434, 'Nationality', 'btm', '2000-01-01', 125, 56, 'I');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `empid` int(11) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` text NOT NULL,
  `date_of_birth` date NOT NULL,
  `address` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empid`, `first_name`, `last_name`, `gender`, `phone`, `email`, `date_of_birth`, `address`) VALUES
(8, 'parash', 'bastola', 'male', '9844694958', 'parashbastola16@gmail.com', '2000-01-01', 'bhadrapur'),
(7, 'hari', 'pyakurel', 'male', '987456894', 'hari@gmail.com', '2000-01-01', 'chandragadi');

-- --------------------------------------------------------

--
-- Table structure for table `flightdetails`
--

CREATE TABLE `flightdetails` (
  `flightid` int(11) NOT NULL,
  `from2` varchar(30) NOT NULL,
  `to2` varchar(30) NOT NULL,
  `arrival` time NOT NULL,
  `departure` time NOT NULL,
  `adultprice` int(11) NOT NULL,
  `childprice` int(11) NOT NULL,
  `seatno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flightdetails`
--

INSERT INTO `flightdetails` (`flightid`, `from2`, `to2`, `arrival`, `departure`, `adultprice`, `childprice`, `seatno`) VALUES
(21, 'bhadrapur', 'bhaktapur', '10:30:00', '12:00:00', 2000, 1000, 54);

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `routes` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`routes`) VALUES
('jhapa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customerdetails`
--
ALTER TABLE `customerdetails`
  ADD PRIMARY KEY (`customer_id`),
  ADD UNIQUE KEY `ticketno` (`ticketno`);

--
-- Indexes for table `flightdetails`
--
ALTER TABLE `flightdetails`
  ADD PRIMARY KEY (`flightid`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`routes`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
