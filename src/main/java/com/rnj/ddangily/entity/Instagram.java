package com.rnj.ddangily.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@DynamicInsert // JPA가 JDBC API를 호출하기전, 동적쿼리를 생성할 때, 컬럼중 Null이아닌, 컬럼만을 이용하여 Insert쿼리를 작성.
@DynamicUpdate //                                   ...                                 컬럼만을 이용하여 Update쿼리를 작성.
@Getter
@Setter
@Entity

@Table(name="instagram", indexes = @Index(name = "idx_instagram_collection_time", columnList = "collectionTime")) // 테이블명, 인덱스설정 ...
public class Instagram implements Serializable {
    @Id // PK설정(필수)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, columnDefinition = "INT UNSIGNED")
    @SerializedName("instagramId")
    private Long id;


    /***
     * id	bigint(20) unsigned	NO
     * instagram_id	bigint(20) unsigned	NO
     * media_type	varchar(256)	YES
     * media_url	varchar(1024)	YES
     * permalink	varchar(256)	YES
     * username	varchar(56)	YES
     * caption	varchar(1024)	YES
     * enabled	tinyint(4)	YES
     * collection_time	timestamp	NO
     * last_update_time	datetime	YES
     */
    /***
     * @Column > 테이블이 생성될 때 해당 컬럼을 참조하여 테이블이 생성됨
     * nullable, length, unique 등을 설정할 수 있고, DEFAULT 값 설정과 같은 상세 설정은 columnDefinition으로 설정.
     * length는 String 값에만 설정할 수 있는 기능입니다.
      */
    /***
     * @ColumnDefault > DEFAULT 값 설정과 같은 상세 설정
     */
//    @Column(nullable = false)
//    @ColumnDefault(value = "1")
    @Column(nullable = false, columnDefinition = "BIGINT UNSIGNED")
    @SerializedName("id")
    public Long instagramId;


    @SerializedName("media_type")
    @Column(length = 256)
    private String mediaType;

    @SerializedName("media_url")
    @Column(length = 512)
    private String mediaUrl;

    @SerializedName("permalink")
    @Column(length = 256)
    private String permalink;

    @SerializedName("username")
    @Column(length = 256)
    private String username;

    @SerializedName("caption")
    @Column(length = 512)
    private String caption;

    @ColumnDefault(value = "1")
//    @Column(length = 256)
    private byte enabled;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date collectionTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date lastUpdateTime;


//    @ColumnDefault(value = "1")
//    @Column(nullable = false, length = 1, columnDefinition = "CHAR(1)")
//    private String sex;
//
//    @Column(nullable = false, length = 6)
//    private String birthDate;
//
//    @Column(nullable = false, length = 20)
//    private String phoneNumber;
//
//    @JsonIgnore
//    @Column(nullable = false, length = 150)
//    private String password;
//
//    @Column(nullable = false, columnDefinition = "TINYINT(1) DEFAULT 1")
//    private boolean active;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//    private Date createdAt;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(nullable = true, columnDefinition = "TIMESTAMP DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
//    private Date updatedAt;

    /***
     * @PrePersist > JPA가 JDBC를 Insert되기 전 실행되어야 하는 애노테이션을 정의.
     */
    @PrePersist
    protected void onCreate() {
//        createdAt = Timestamp.valueOf(LocalDateTime.now());
        collectionTime = Timestamp.valueOf(LocalDateTime.now());
    }

    /***
     * @PreUpdate > JPA가 JDBC를 Update되기 전 실행되어야 하는 애노테이션을 정의.
     */
    @PreUpdate
    protected void onUpdate() {
//        updatedAt = Timestamp.valueOf(LocalDateTime.now());
        lastUpdateTime = Timestamp.valueOf(LocalDateTime.now());
    }
}
