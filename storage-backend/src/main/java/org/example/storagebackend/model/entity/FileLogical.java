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
@TableName("file_logical")
public class FileLogical implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 文件ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 空间ID
     */
    @TableField("drive_id")
    private Long driveId;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 父目录ID,根目录为0
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 物理文件ID(文件夹为0)
     */
    @TableField("physical_file_id")
    private Long physicalFileId;

    /**
     * 文件/目录名称
     */
    @TableField("file_name")
    private String fileName;

    /**
     * 文件类型:1-文件; 2-文件夹
     */
    @TableField("file_type")
    private Integer fileType;

    /**
     * 文件大小(字节)
     */
    @TableField("file_size")
    private Long fileSize;

    /**
     * 状态:0-禁用; 1-启用
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
