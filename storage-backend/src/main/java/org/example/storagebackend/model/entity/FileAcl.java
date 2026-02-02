package org.example.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
    @TableId(value = "id", type = IdType.ASSIGN_ID)
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
     * 主体类型:1-用户; 2-角色; 3-组织节点
     */
    @TableField("subject_type")
    private Integer subjectType;

    /**
     * 授权类型:1-允许; 2-拒绝
     */
    @TableField("grant_type")
    private Integer grantType;

    /**
     * 授权范围:1-包含子节点; 2-仅当前文件/文件夹
     */
    @TableField("grant_scope")
    private Integer grantScope;

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
