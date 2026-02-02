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
@TableName("file_share")
public class FileShare implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 分享记录ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 分享链接名称
     */
    @TableField("share_name")
    private String shareName;

    /**
     * 空间ID
     */
    @TableField("drive_id")
    private Long driveId;

    /**
     * 文件/文件夹ID
     */
    @TableField("file_id")
    private Long fileId;

    /**
     * 文件类型:1-文件; 2-文件夹
     */
    @TableField("file_type")
    private Integer fileType;

    /**
     * 分享者用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 分享链接唯一标识
     */
    @TableField("share_token")
    private String shareToken;

    /**
     * 加密分享提取码
     */
    @TableField("access_code")
    private String accessCode;

    /**
     * 分享类型:1-加密链接; 2-公开链接
     */
    @TableField("share_type")
    private Integer shareType;

    /**
     * 分享状态:0-失效; 1-有效
     */
    @TableField("status")
    private Integer status;

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
}
