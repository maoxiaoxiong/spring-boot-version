-- 权限表 --
CREATE TABLE permission (
    pid int(11) NOT NUll AUTO_INCREMENT,
    pname varchar(255) NOT NUll DEFAULT '',
    purl varchar(255) NOT NUll DEFAULT '',
    PRIMARY KEY (pid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

insert INTO permission VALUES ('1','add','');
insert INTO permission VALUES ('2','delete','');
insert INTO permission VALUES ('3','edit','');
insert INTO permission VALUES ('4','query','');

-- 用户表 --
CREATE TABLE user (
    uid int(11) NOT NUll AUTO_INCREMENT,
    uname varchar(255) NOT NUll DEFAULT '',
    upassword varchar(255) NOT NUll DEFAULT '',

    PRIMARY KEY (uid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

insert INTO user VALUES ('1','admin','admin');
insert INTO user VALUES ('2','demo','admin');

-- 角色表 --
CREATE TABLE role (
    rid int(11) NOT NUll AUTO_INCREMENT,
    rname varchar(255) NOT NUll DEFAULT '',
    PRIMARY KEY (rid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

insert INTO role VALUES ('1','admin');
insert INTO role VALUES ('2','customer');


-- 权限角色表 --
CREATE TABLE permission_role (
    pid int(11) NOT NUll,
    rid int(11) NOT NUll,
    KEY idx_pid (pid),
    KEY idx_rid (rid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

insert INTO permission_role VALUES ('1','1');
insert INTO permission_role VALUES ('1','2');
insert INTO permission_role VALUES ('1','3');
insert INTO permission_role VALUES ('1','4');
insert INTO permission_role VALUES ('2','4');
insert INTO permission_role VALUES ('2','1');


-- 用户角色表 --
CREATE TABLE user_role (
    uid int(11) NOT NUll,
    rid int(11) NOT NUll,
    KEY idx_uid (uid),
    KEY idx_rid (rid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

insert INTO user_role VALUES ('1','1');
insert INTO user_role VALUES ('2','2');