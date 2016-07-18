-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2016 at 03:01 PM
-- Server version: 5.6.24
-- PHP Version: 5.5.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `javawebproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
  `id` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `price` varchar(50) NOT NULL,
  `publication` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`id`, `name`, `price`, `publication`, `author`) VALUES
(2, 'physics', '2000', 'ekta book', 'DB singh'),
(3, 'biology', '1500', 'pearson ', 'Sharda Kuinkel'),
(4, '213', '233', '333', '333');

-- --------------------------------------------------------

--
-- Table structure for table `file_test`
--

CREATE TABLE IF NOT EXISTS `file_test` (
  `id` int(10) NOT NULL,
  `image_name` varchar(100) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `file_test`
--

INSERT INTO `file_test` (`id`, `image_name`, `name`, `address`) VALUES
(1, 'd0be659c-b549-11e5-a4f7-f80f41fc63ce.jpg', 'arnautovic', 'austria'),
(7, '34F87FCD00000578-0-image-a-5_1465220803589.jpg', 'England', 'London'),
(8, 'assa.png', 'Rooney', 'Manchester');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `id` int(10) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Level` varchar(30) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `Name`, `Level`, `Address`, `Phone`, `Gender`, `Email`) VALUES
(7, 'ada', 'ada', 'asda', 'adas', 'female', 'adas'),
(8, 'SUJAN', 'BE', 'asdaASG', 'HHHHSA', 'other', 'asdasASF'),
(13, 'chake', 'BE', 'chitwan', '9841081005', 'male', 'maharjanajal@gmail.com'),
(14, 'adads', 'Masters', 'aaa', 'asdfggg', 'male', 'affaf'),
(15, 'asdasd', 'Masters', 'asdas', 'ggopjopj', 'female', '9091289084'),
(16, 'Inesh', 'Inesh', 'thimii', '9841325133', 'male', 'maharjanajal@gmail.com'),
(17, 'IOOIJASD', 'IOOIJASD', 'ASFGAG', 'ASFFA', 'male', 'ASDASD'),
(19, 'shankhar', '+2', 'MANMAIJU', '83985921', 'female', 'sarkar@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(3) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Gender` varchar(7) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Phone` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `Name`, `Password`, `Address`, `Gender`, `Email`, `Phone`) VALUES
(1, 'Inesh Manandhar', 'passwordd', 'Madhyapur Thimi-13,Bhaktapur', 'male', 'manandharinesh@gmail.com', '9841081005'),
(2, 'asd', 'asdasd', 'asdsad', 'male', 'asddas', 'asdasd'),
(3, 'Suman Shrestha', 'passwordd', 'thimi', 'male', 'sumansth@gmail.com', '9849755773'),
(5, 'chake', 'hawaldar', 'chitwan', 'male', 'csad', 'a982139312'),
(6, 'maninesh', 'maninesh', 'thimi', 'male', 'maninesh@gmail.com', '9841081005'),
(7, 'abc', 'abc', 'abc', 'male', 'abc', 'abc'),
(8, 'Asrar Ansari', '12345678', 'kalimati', 'male', 'ansariasrar@gmail.com', '9841012341'),
(9, 'kjkk', 'kkk', 'kkk', 'male', 'kkk', 'kkk'),
(10, '123', '222', '222', 'male', '222', '222'),
(11, 'jjj', 'jjj', 'jjj', 'male', 'jjj', 'jjj'),
(12, 'aaa', 'bbb', 'ccc', 'male', 'ddd', 'eee'),
(13, 'manish_like', 'manish_like', 'kapan', 'male', 'manish_like@hotmail.com', '9841081005'),
(14, 'manish_like', 'manish_like', 'kapan', 'male', 'manish_like@hotmail.com', '9841081005');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `file_test`
--
ALTER TABLE `file_test`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `file_test`
--
ALTER TABLE `file_test`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
