CREATE DATABASE ddangily DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;



-- instagram 자료 받아올 항아리
DROP TABLE IF EXISTS instagram;
CREATE TABLE instagram
(
    instagram_id BIGINT UNSIGNED  NOT NULL AUTO_INCREMENT,
    id BIGINT UNSIGNED NOT NULL,
    media_type VARCHAR(256),
    media_url VARCHAR(1024),
    permalink VARCHAR(256),
    username VARCHAR(56),
    caption VARCHAR(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci  DEFAULT NULL,
    enabled          TINYINT         NOT NULL DEFAULT 0,
    collection_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
    last_update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
    PRIMARY KEY (instagram_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- 인증키 담고있는 테이블 인증키를 수시로 변경해주어야한다.
DROP TABLE IF EXISTS master_config;
CREATE TABLE master_config
(
    master_config_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    master_type      VARCHAR(50)     NULL     DEFAULT '',
    master_key       VARCHAR(50)     NULL     DEFAULT '',
    master_value     VARCHAR(255)    NULL     DEFAULT '',
    enabled          TINYINT         NOT NULL DEFAULT 0,

    created_by          VARCHAR(1024)                         NULL,
    created_at          TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NULL,
    updated_by          VARCHAR(1024)                         NULL,
    last_update         TIMESTAMP DEFAULT CURRENT_TIMESTAMP() NULL,
    PRIMARY KEY (master_config_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

INSERT INTO master_config (master_type,master_key,master_value,enabled) values
-- ('instagram','appId','197394555734199',1),
-- ('instagram','redirectUrl','https://9c3117167348.ngrok.io/',1),
-- ('instagram','authorizeKeyUrl','https://api.instagram.com/oauth/authorize?client_id={app-id}&redirect_uri={redirect-uri}&scope=user_profile,user_media&response_type=code',1),
-- ('instagram','authorizeKey','https://api.instagram.com/oauth/authorize?client_id={app-id}&redirect_uri={redirect-uri}&scope=user_profile,user_media&response_type=code',1),
-- ('instagram','tokenPublishUrl','https://graph.instagram.com/access_token?grant_type=ig_exchange_token&client_secret={instagram-app-secret}&access_token={access_token}',1),
('instagram','tokenRefreshUrl','http://graph.instagram.com/refresh_access_token?grant_type=ig_refresh_token&access_token={long-lived-access-token}',1),
('instagram','token','IGQVJVRTlRaHpZAMjUydXdzT1Q4SV9Kck1zWUxzcU9CYXFsZAEI0bVJwcU5qcXVBdEVtUTVIckNrdjdXSFBKVy1zY0xWRFJ5TG1xeHg5NGkyU1p4OHo0cS1jeGZAyWWRxcXZAYcWRub3RR',1),
('instagram','user_id','17841447012364353',1),
('instagram', 'request_data_url', 'https://graph.instagram.com/{user_id}/media?fields=id,media_type,media_url,permalink,thumbnail_url,username,caption&access_token={access_token}', 1);
# ('instagram','token','IGQVJVLS1xdE9HRWVjbVZAHQldQdkUzNnBteXU3UnB6bG54aWVLMnVaREN3eU5BWkEyd0k4ZADktREVPY3JTMnNMeVVNbWU1RW9ybHU2Wml6Y1ZAQenBtZAm4zQTdlcFM2RGh5eXE5TWJR',1)
;



-- 인증키 history
