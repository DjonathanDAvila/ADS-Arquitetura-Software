CREATE TABLE arqs_alan_new.t_genre
(
    id VARCHAR(64) PRIMARY KEY NOT NULL
    , name VARCHAR(30) NOT NULL UNIQUE
    , created_date DATETIME DEFAULT NOW()
    , inactivated_date DATETIME NULL
);

CREATE TABLE arqs_alan_new.t_category
(
    id VARCHAR(64) PRIMARY KEY NOT NULL
    , name VARCHAR(30) NOT NULL UNIQUE
    , created_date DATETIME DEFAULT NOW()
    , inactivated_date DATETIME NULL
);

CREATE TABLE arqs_alan_new.t_media
(
    id VARCHAR(64) PRIMARY KEY NOT NULL
    , name VARCHAR(250) NOT NULL UNIQUE
    , created_date DATETIME DEFAULT NOW()
    , inactivated_date DATETIME NULL
);

CREATE TABLE arqs_alan_new.t_media_type
(
    id VARCHAR(64) PRIMARY KEY NOT NULL
    , name VARCHAR(30) NOT NULL UNIQUE
    , created_date DATETIME DEFAULT NOW()
    , inactivated_date DATETIME NULL
);

CREATE TABLE arqs_alan_new.t_rating
(
    id VARCHAR(64) PRIMARY KEY NOT NULL
    , name VARCHAR(20) NOT NULL UNIQUE
    , created_date DATETIME DEFAULT NOW()
    , inactivated_date DATETIME NULL
);

CREATE TABLE arqs_alan_new.t_participant
(
    id VARCHAR(64) PRIMARY KEY NOT NULL
    , name VARCHAR(50) NOT NULL UNIQUE
    , created_date DATETIME DEFAULT NOW()
    , inactivated_date DATETIME NULL
);

DROP DATABASE arqs_alan;
CREATE DATABASE arqs_alan;
USE arqs_alan;

CREATE TABLE arqs_alan.t_media
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT
    , genre VARCHAR(30) NOT NULL
    , category VARCHAR(30) NOT NULL
    , media_name VARCHAR(250) NOT NULL
    , type VARCHAR(30) NOT NULL
    , rating VARCHAR(20) NOT NULL
    , participant VARCHAR(50) NOT NULL
);