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
@TableName("file_physical")
public class FilePhysical implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 物理文件ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 原始文件名
     */
    @TableField("original_name")
    private String originalName;

    /**
     * 文件后缀
     */
    @TableField("extension")
    private String extension;

    /**
     * 文件大小(字节)
     */
    @TableField("size_bytes")
    private Long sizeBytes;

    /**
     * 文件唯一标识
     */
    @TableField("file_hash")
    private String fileHash;

    /**
     * 存储桶(MinIO Bucket)
     */
    @TableField("storage_bucket")
    private String storageBucket;

    /**
     * 存储键(MinIO ObjectKey)
     */
    @TableField("storage_key")
    private String storageKey;

    /**
     * 引用计数:有多少个逻辑文件指向我
     */
    @TableField("ref_count")
    private Integer refCount;

    /**
     * 首次上传时间
     */
    @TableField("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    /**
     * 首次创建者ID
     */
    @TableField("creator_id")
    private Long creatorId;
}
