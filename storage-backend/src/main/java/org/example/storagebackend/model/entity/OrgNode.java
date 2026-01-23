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
@TableName("org_node")
public class OrgNode implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 节点ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 上级节点ID(根节点为0)
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 节点名称
     */
    @TableField("node_name")
    private String nodeName;

    /**
     * 节点类型:0-公司; 1-部门; 2-团队; 3-个人
     */
    @TableField("node_type")
    private Integer nodeType;

    /**
     * 绑定的用户ID
     */
    @TableField("bind_id")
    private Long bindId;

    /**
     * 节点状态:0-禁用; 1-启用
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
