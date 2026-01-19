package org.example.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("file_recycle")
public class FileRecycle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 回收站记录ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 批次ID
     */
    @TableField("batch_id")
    private Long batchId;

    /**
     * 文件ID
     */
    @TableField("file_id")
    private Long fileId;

    /**
     * 文件名称
     */
    @TableField("file_name")
    private String fileName;

    /**
     * 文件路径
     */
    @TableField("file_path")
    private String filePath;

    /**
     * 文件类型:0-文件; 1-文件夹
     */
    @TableField("file_type")
    private Integer fileType;

    /**
     * 文件大小(字节)
     */
    @TableField("file_size")
    private Long fileSize;

    /**
     * 删除时间
     */
    @TableField("deleted_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime deletedAt;

    /**
     * 过期时间
     */
    @TableField("expired_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expiredAt;

    /**
     * 回收状态:0-未恢复; 1-已恢复; 2-已彻底删除
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
}
