package org.example.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("file_acl")
public class FileAcl implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 访问控制ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 文件ID
     */
    @TableField("file_id")
    private Long fileId;

    /**
     * 主体ID
     */
    @TableField("subject_id")
    private Long subjectId;

    /**
     * 主体类型:0-USER; 1-NODE; 2-ROLE
     */
    @TableField("subject_type")
    private Integer subjectType;

    /**
     * 授权行为:0-拒绝;1-允许
     */
    @TableField("is_allow")
    private Integer isAllow;

    /**
     * 权限唯一标识
     */
    @TableField("permission")
    private String permission;

    /**
     * 过期时间
     */
    @TableField("expired_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expiredAt;

    /**
     * 创建时间
     */
    @TableField("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    /**
     * 创建者ID
     */
    @TableField("creator_id")
    private Long creatorId;
}
