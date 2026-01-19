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
@TableName("file_drive")
public class FileDrive implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 空间ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 空间名称
     */
    @TableField("drive_name")
    private String driveName;

    /**
     * 空间类型:0-公司; 1-部门; 2-团队; 3-个人
     */
    @TableField("drive_type")
    private Integer driveType;

    /**
     * 归属节点ID(个人空间为0)
     */
    @TableField("node_id")
    private Long nodeId;

    /**
     * 用户/管理员ID(个人空间-用户;公有空间-管理员)
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 总存储(字节)
     */
    @TableField("total_quota")
    private Long totalQuota;

    /**
     * 已用存储(字节)
     */
    @TableField("used_quota")
    private Long usedQuota;

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

    /**
     * 更新时间
     */
    @TableField("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    /**
     * 更新者ID
     */
    @TableField("updater_id")
    private Long updaterId;
}
