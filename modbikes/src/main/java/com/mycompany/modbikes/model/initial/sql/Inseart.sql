/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Admin
 * Created: Apr 18, 2021
 */


-- __________________________Start_Student__________________________

INSERT INTO Student (StudentID, FirstName, LastName, Faculty, Department, Password, IsUseBike, TelephoneNo, Email, OtherContact )
VALUES ( 46000100001, 'Akimoto', 'Manatsu', 'Group46', 'Nogizaka46', '12646',TRUE,'0460460001','Akimoto.Manatsu@gmail.com','Japan');


INSERT INTO Student (StudentID, FirstName, LastName, Faculty, Department, Password, IsUseBike, TelephoneNo, Email, OtherContact )
VALUES ( 46000100002, 'Ikuta', 'Erika', 'Group46', 'Nogizaka46', '12646',TRUE,'0460460002','Ikuta.Erika@gmail.com','Japan');


INSERT INTO Student (StudentID, FirstName, LastName, Faculty, Department, Password, IsUseBike, TelephoneNo, Email, OtherContact )
VALUES ( 46000100003, 'Saito', 'Asuka', 'Group46', 'Nogizaka46', '12646',TRUE,'0460460003','Saito.Asuka@gmail.com','Japan');


INSERT INTO Student (StudentID, FirstName, LastName, Faculty, Department, Password, IsUseBike, TelephoneNo, Email, OtherContact )
VALUES ( 46000100004, 'Takayama', 'Kazumi', 'Group46', 'Nogizaka46', '12646',TRUE,'0460460004','Takayama.Kazumi@gmail.com','Japan');


INSERT INTO Student (StudentID, FirstName, LastName, Faculty, Department, Password, IsUseBike, TelephoneNo, Email, OtherContact )
VALUES ( 46000100005, 'Higuchi', 'Hina', 'Group46', 'Nogizaka46', '12646',TRUE,'0460460005','Higuchi.Hina@gmail.com','Japan');


INSERT INTO Student (StudentID, FirstName, LastName, Faculty, Department, Password, IsUseBike, TelephoneNo, Email, OtherContact )
VALUES ( 46000100006, 'Hoshino', 'Minami', 'Group46', 'Nogizaka46', '12646',TRUE,'0460460006','Hoshino.Minami@gmail.com','Japan');


INSERT INTO Student (StudentID, FirstName, LastName, Faculty, Department, Password, IsUseBike, TelephoneNo, Email, OtherContact )
VALUES ( 46000100007, 'Matsumura', 'Sayuri', 'Group46', 'Nogizaka46', '12646',TRUE,'0460460007','Matsumura.Sayuri@gmail.com','Japan');


INSERT INTO Student (StudentID, FirstName, LastName, Faculty, Department, Password, IsUseBike, TelephoneNo, Email, OtherContact )
VALUES ( 46000100008, 'Wada', 'Maaya', 'Group46', 'Nogizaka46', '12646',FALSE,'0460460008','Wada.Maaya@gmail.com','Japan');


-- ___________________________End_Student____________________________



-- __________________________Start_Location__________________________

INSERT INTO Location (LocationID, LocationName , LocationPicLink, Latitude ,Londtitude )
VALUES ( 1, 'SIT', 'https://drive.google.com/thumbnail?id=1t26xroWSf1drL9pw8crvCxGeAghTqrt2', 0.0, 0.0);

INSERT INTO Location (LocationID, LocationName , LocationPicLink, Latitude ,Londtitude )
VALUES ( 2, 'SIT', 'https://drive.google.com/thumbnail?id=1t26xroWSf1drL9pw8crvCxGeAghTqrt2', 0.0, 0.0);

INSERT INTO Location (LocationID, LocationName , LocationPicLink, Latitude ,Londtitude )
VALUES ( 3, 'SIT', 'https://drive.google.com/thumbnail?id=1t26xroWSf1drL9pw8crvCxGeAghTqrt2', 0.0, 0.0);

INSERT INTO Location (LocationID, LocationName , LocationPicLink, Latitude ,Londtitude )
VALUES ( 4, 'SIT', 'https://drive.google.com/thumbnail?id=1t26xroWSf1drL9pw8crvCxGeAghTqrt2', 0.0, 0.0);

INSERT INTO Location (LocationID, LocationName , LocationPicLink, Latitude ,Londtitude )
VALUES ( 5, 'SIT', 'https://drive.google.com/thumbnail?id=1t26xroWSf1drL9pw8crvCxGeAghTqrt2', 0.0, 0.0);

INSERT INTO Location (LocationID, LocationName , LocationPicLink, Latitude ,Londtitude )
VALUES ( 6, 'SIT', 'https://drive.google.com/thumbnail?id=1t26xroWSf1drL9pw8crvCxGeAghTqrt2', 0.0, 0.0);

INSERT INTO Location (LocationID, LocationName , LocationPicLink, Latitude ,Londtitude )
VALUES ( 7, 'SIT', 'https://drive.google.com/thumbnail?id=1t26xroWSf1drL9pw8crvCxGeAghTqrt2', 0.0, 0.0);

INSERT INTO Location (LocationID, LocationName , LocationPicLink, Latitude ,Londtitude )
VALUES ( 8, 'SIT', 'https://drive.google.com/thumbnail?id=1t26xroWSf1drL9pw8crvCxGeAghTqrt2', 0.0, 0.0);


-- ___________________________End_Location____________________________




-- __________________________Start_Bicycle__________________________


INSERT INTO Bicycle ( BikeID , LocationID ,IsAvailable , Detail, BikePicLink )
VALUES ( 1, 1, False, 'Nogizaka46Bicycle', 'https://drive.google.com/thumbnail?id=1y28vUTqGdBcRcG6XOgb5qkw92HiIMblq');


INSERT INTO Bicycle ( BikeID , LocationID ,IsAvailable , Detail, BikePicLink )
VALUES ( 2, 2, False, 'Nogizaka46Bicycle', 'https://drive.google.com/thumbnail?id=1lA6pln9eE6huinZ2EBxl3P0H_J9Qt5OP');


INSERT INTO Bicycle ( BikeID , LocationID ,IsAvailable , Detail, BikePicLink )
VALUES ( 3, 3, False, 'Nogizaka46Bicycle', 'https://drive.google.com/thumbnail?id=1ieHC54zUnRo4PwYeV27hYBJO25-SJ4ha');


INSERT INTO Bicycle ( BikeID , LocationID ,IsAvailable , Detail, BikePicLink )
VALUES ( 4, 4, False, 'Nogizaka46Bicycle', 'https://drive.google.com/thumbnail?id=1QhCiT3gWMB_g133YcAsG6Hp1TP-yDCnY');


INSERT INTO Bicycle ( BikeID , LocationID ,IsAvailable , Detail, BikePicLink )
VALUES ( 5, 5, False, 'Nogizaka46Bicycle', 'https://drive.google.com/thumbnail?id=1m_G4iIpaPSTSWvCypzEoF5gw0bJqXpE8');


INSERT INTO Bicycle ( BikeID , LocationID ,IsAvailable , Detail, BikePicLink )
VALUES ( 6, 6, False, 'Nogizaka46Bicycle', 'https://drive.google.com/thumbnail?id=1BvdQjYMW0bOVsxMwlMrSzn4dTYmjet0a');


INSERT INTO Bicycle ( BikeID , LocationID ,IsAvailable , Detail, BikePicLink )
VALUES ( 7, 7, False, 'Nogizaka46Bicycle', 'https://drive.google.com/thumbnail?id=1u7eLEQ5ZpetdK1ktgBD6b2g6dZkokF7R');


INSERT INTO Bicycle ( BikeID , LocationID ,IsAvailable , Detail, BikePicLink )
VALUES ( 8, 8, True, 'Nogizaka46Bicycle', 'https://drive.google.com/thumbnail?id=1tmyb5FJ9c2bEhjWBUHGCQxRuTplhXBDG');


-- ___________________________End_Bicycle____________________________



-- __________________________Start_History__________________________

INSERT INTO History (HistoryID ,StudentID ,BikeID ,StartDate ,FinishedDate ,LastLocation ,IsReturnBikeOntime )
VALUES ( 1, 46000100001, 1, '2020-08-20 9:30:20', '2020-08-20 12:45:20', 'SIT',TRUE);

INSERT INTO History (HistoryID ,StudentID ,BikeID ,StartDate ,FinishedDate ,LastLocation ,IsReturnBikeOntime )
VALUES ( 2, 46000100002, 2, '2020-01-22 9:30:20', '2020-01-22 12:45:20', 'SIT',TRUE);

INSERT INTO History (HistoryID ,StudentID ,BikeID ,StartDate ,FinishedDate ,LastLocation ,IsReturnBikeOntime )
VALUES ( 3, 46000100003, 3, '2020-08-10 9:30:20', '2020-08-10 12:45:20', 'SIT',TRUE);

INSERT INTO History (HistoryID ,StudentID ,BikeID ,StartDate ,FinishedDate ,LastLocation ,IsReturnBikeOntime )
VALUES ( 4, 46000100004, 4, '2020-02-08 9:30:20', '2020-02-08 12:45:20', 'SIT',TRUE);

INSERT INTO History (HistoryID ,StudentID ,BikeID ,StartDate ,FinishedDate ,LastLocation ,IsReturnBikeOntime )
VALUES ( 5, 46000100005, 5, '2020-01-31 9:30:20', '2020-01-31 12:45:20', 'SIT',TRUE);

INSERT INTO History (HistoryID ,StudentID ,BikeID ,StartDate ,FinishedDate ,LastLocation ,IsReturnBikeOntime )
VALUES ( 6, 46000100006, 6, '2020-02-06 9:30:20', '2020-02-06 12:45:20', 'SIT',TRUE);

INSERT INTO History (HistoryID ,StudentID ,BikeID ,StartDate ,FinishedDate ,LastLocation ,IsReturnBikeOntime )
VALUES ( 7, 46000100007, 7, '2020-08-27 9:30:20', '2020-08-27 12:45:20', 'SIT',TRUE);

INSERT INTO History (HistoryID ,StudentID ,BikeID ,StartDate ,FinishedDate ,LastLocation ,IsReturnBikeOntime )
VALUES ( 8, 46000100008, 8, '2020-04-23 9:30:20', '2020-04-23 12:45:20', 'SIT',TRUE);



-- ___________________________END_History___________________________




