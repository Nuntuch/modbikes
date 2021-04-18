/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Admin
 * Created: Apr 14, 2021
 */

DROP TABLE IF EXISTS History;
DROP TABLE IF EXISTS Bicycle;
DROP TABLE IF EXISTS Location;
DROP TABLE IF EXISTS Student;

CREATE TABLE Student(
   StudentID bigint NOT NULL,
   FirstName VARCHAR(255) NOT NULL,
   LastName VARCHAR(255) NOT NULL,
   Faculty VARCHAR(255) NOT NULL,
   Department VARCHAR(255) NOT NULL,
   Password VARCHAR(255) NOT NULL,
   IsUseBike boolean NOT NULL,
   TelephoneNo VARCHAR(255) NOT NULL,
   Email VARCHAR(255) NOT NULL,
   OtherContact VARCHAR(255) NOT NULL,
   PRIMARY KEY(StudentID)
);




CREATE TABLE Location(
   LocationID INT NOT NULL,
   LocationName VARCHAR(255) NOT NULL,
   LocationPicLink VARCHAR(255) NOT NULL,
   Latitude real NOT NULL,
   Londtitude real NOT NULL,
   PRIMARY KEY(LocationID)
);





CREATE TABLE Bicycle(
   BikeID INT NOT NULL,
   LocationID INT NOT NULL,
   IsAvailable boolean NOT NULL,
   Detail VARCHAR(255) NOT NULL,
   BikePicLink VARCHAR(255) NOT NULL,
   PRIMARY KEY(BikeID),
   CONSTRAINT fk_location
      FOREIGN KEY(LocationID) 
	  REFERENCES Location(LocationID)
);






CREATE TABLE History(
   HistoryID INT NOT NULL,
   StudentID bigint NOT NULL,
   BikeID bigint NOT NULL,
   StartDate timestamp NOT NULL,
   FinishedDate timestamp NOT NULL,
   LastLocation VARCHAR(255) NOT NULL,
   IsReturnBikeOntime boolean NOT NULL,
   PRIMARY KEY(HistoryID),
   CONSTRAINT fk_student
      FOREIGN KEY(StudentID) 
	  REFERENCES Student(StudentID),
   CONSTRAINT fk_bicycle
      FOREIGN KEY(BikeID) 
	  REFERENCES Bicycle(BikeID)
);
