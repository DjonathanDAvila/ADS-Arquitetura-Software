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
    id binary(16) NOT NULL  DEFAULT (UUID_TO_BIN(UUID()))
    , name VARCHAR(30) NOT NULL UNIQUE
    , created_date DATETIME DEFAULT NOW()
    , inactivated_date DATETIME NULL
    , CONSTRAINT PK_media_type PRIMARY KEY (id)
);

CREATE TABLE arqs_alan_new.t_rating
(
    id binary(16) NOT NULL  DEFAULT (UUID_TO_BIN(UUID()))
    , name VARCHAR(20) NOT NULL UNIQUE
    , created_date DATETIME DEFAULT NOW()
    , inactivated_date DATETIME NULL
    , CONSTRAINT PK_rating PRIMARY KEY (id)
);

CREATE TABLE arqs_alan_new.t_participant
(
    id binary(16) NOT NULL  DEFAULT (UUID_TO_BIN(UUID()))
    , name VARCHAR(50) NOT NULL UNIQUE
    , created_date DATETIME DEFAULT NOW()
    , inactivated_date DATETIME NULL,
    CONSTRAINT PK_participant PRIMARY KEY (id)
);