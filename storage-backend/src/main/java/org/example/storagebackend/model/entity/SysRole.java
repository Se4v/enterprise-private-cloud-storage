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
@TableName("sys_role")
public class SysRole implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 角色名称
     */
    @TableField("role_name")
    private String roleName;

    /**
     * 角色代码
     */
    @TableField("role_code")
    private String roleCode;

    /**
     * 角色类型:0-全局角色; 1-组织内角色,挂载到节点
     */
    @TableField("role_type")
    private Integer roleType;

    /**
     * 角色状态:0-禁用; 1-启用
     */
    @TableField("status")
    private Integer status;

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
