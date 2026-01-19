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
@TableName("sys_perm")
public class SysPerm implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 权限ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 权限名称
     */
    @TableField("perm_name")
    private String permName;

    /**
     * 权限代码
     */
    @TableField("perm_code")
    private String permCode;

    /**
     * 权限类型:0-菜单权限; 1-操作权限; 2-数据权限
     */
    @TableField("perm_type")
    private Integer permType;

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
