package com.rnj.ddangily.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@DynamicInsert // JPA가 JDBC API를 호출하기전, 동적쿼리를 생성할 때, 컬럼중 Null이아닌, 컬럼만을 이용하여 Insert쿼리를 작성.
@DynamicUpdate //                                   ...                                 컬럼만을 이용하여 Update쿼리를 작성.
@Entity
@Getter
@Setter
//@Table(name ="master_config", indexes = @Index(name = "idx_master_config_created_at", columnList = "createdAt"))
@Table(name ="master_config")
public class MasterConfig {

    /***
     * CREATE TABLE `master_config` (
     *   `master_config_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
     *   `master_type` varchar(50) DEFAULT '',
     *   `master_key` varchar(50) DEFAULT '',
     *   `master_value` varchar(255) DEFAULT '',
     *   `enabled` tinyint(4) NOT NULL DEFAULT 0,
     *   `created_by` varchar(1024) DEFAULT NULL,
     *   `created_at` timestamp NULL DEFAULT current_timestamp(),
     *   `updated_by` varchar(1024) DEFAULT NULL,
     *   `last_update` timestamp NULL DEFAULT current_timestamp(),
     *   PRIMARY KEY (`master_config_id`)
     * ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3
     */
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    //updatable : false = 업데이트시 readonly pk값이 변하지않음 잘못(?) 설정을하더라도
    @Column(updatable = false, nullable = false, columnDefinition =  "INT UNSIGNED")
    private Long id;

    @Column(length = 128)
    private String masterType;

    @Column(length = 128)
    private String masterKey;

    @Column(length = 256)
    public String masterValue;

    @ColumnDefault(value = "1")
    private byte enabled;

    @Column(length = 256)
    private String createdBy;

    /***
     * TemporalType.DATE: 날짜, 데이터베이스의 date타입과 매핑 (예: 2013-10-11)
     * TemporalType.TIME: 시간, 데이터베이스의 time타입과 매핑 (예: 12:00:00)
     * TemporalType.TIMESTAMP: 날짜와 시간, 데이터베이스의 timestamp타입과 매핑 (예: 2013-10-11 12:00:00)
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;

    @Column(length = 256)
    private String updatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date updatedAt;


    /***
     * @PrePersist > JPA가 JDBC를 Insert되기 전 실행되어야 하는 애노테이션을 정의.
     */
    @PrePersist
    protected void onCreate() {
        createdAt = Timestamp.valueOf(LocalDateTime.now());
    }

    /***
     * @PreUpdate > JPA가 JDBC를 Update되기 전 실행되어야 하는 애노테이션을 정의.
     */
    @PreUpdate
    protected void onUpdate() {
        updatedAt = Timestamp.valueOf(LocalDateTime.now());
    }

}
