CREATE TABLE surveys (
    survey_num varchar2(255) ,
    Fname VARCHAR2(255),
    Lname VARCHAR2(255),
    Street VARCHAR2(255),
    City VARCHAR2(255),
    Statename VARCHAR2(255),
    Zip NUMBER,
    Telephone VARCHAR2(20),
    Email VARCHAR2(255),
    Dateofsurvey VARCHAR2(20),
    students VARCHAR2(255),
    locationaddr NUMBER(1,0),
    campus NUMBER(1,0),
    atmos VARCHAR2(255),
    dorm VARCHAR2(255),
    sport VARCHAR2(255),
    recommend VARCHAR2(255),
    comments VARCHAR2(4000)
);


select * from surveys;