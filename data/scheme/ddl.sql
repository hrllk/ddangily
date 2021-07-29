-- instagram 자료 받아올 항아리
CREATE TABLE instagram
(
    instagram_id BIGINT UNSIGNED  NOT NULL AUTO_INCREMENT,
    id BIGINT UNSIGNED NOT NULL,
    media_type VARCHAR(256),
    media_url VARCHAR(1024),
    permalink VARCHAR(256),
    username VARCHAR(56),
    caption VARCHAR(1024),
    collection_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
    PRIMARY KEY (instagram_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 인증키 담고있는 테이블 인증키를 수시로 변경해주어야한다.




-- 인증키 history
