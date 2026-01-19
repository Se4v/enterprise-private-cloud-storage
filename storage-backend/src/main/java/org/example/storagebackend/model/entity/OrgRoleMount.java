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
@TableName("org_role_mount")
public class OrgRoleMount implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 挂载ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 角色ID
     */
    @TableField("role_id")
    private Long roleId;

    /**
     * 节点ID
     */
    @TableField("node_id")
    private Long nodeId;

    /**
     * 权限继承:0-仅当前节点;1-包含子节点
     */
    @TableField("is_inherit")
    private Integer isInherit;

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
