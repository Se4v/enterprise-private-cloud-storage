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
@TableName("org_closure")
public class OrgClosure implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 闭包ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 上级节点ID(根节点为0)
     */
    @TableField("ancestor")
    private Long ancestor;

    /**
     * 下级节点ID
     */
    @TableField("descendant")
    private Long descendant;

    /**
     * 距离
     */
    @TableField("distance")
    private Integer distance;

    /**
     * 创建时间
     */
    @TableField("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
}
