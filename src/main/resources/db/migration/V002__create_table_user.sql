/*==============================================================*/
/* TABLE: TB_USER                                               */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS TB_USER(
     ID SERIAL NOT NULL,
     LOGIN VARCHAR(200) NOT NULL,
     PASSWORD VARCHAR(200) NOT NULL,
     CREATE_AT TIMESTAMP NOT NULL,
     UPDATE_AT TIMESTAMP NOT NULL,
     STATUS VARCHAR(50) NOT NULL,
     ROLE_ID INTEGER NOT NULL,
     CONSTRAINT PK_USER PRIMARY KEY(ID),
     CONSTRAINT FK_ROLE FOREIGN KEY (ROLE_ID) REFERENCES TB_ROLE(ID),
     CONSTRAINT LOGIN_UNIQUE UNIQUE(LOGIN)
);

