create table book
(
    id      int(10) not null primary key comment 'ID',
    name    varchar(20) comment '书本名称',
    cn_desc varchar(1000) comment '中文描述',
    en_desc varchar(1000) comment '英文文描述',
    forn_f  varchar(1000) comment '外文标识',
    isbn_cd varchar(1000) comment 'ISBN代码',
    ctgr_id int(10) comment '分类ID',
    crtr    varchar(20),
    crt_tm  timestamp,
    updtr   varchar(20),
    upd_tm  timestamp
) engine = 'innodb' default charset = 'utf8';

show
tables ;

select *
from book;