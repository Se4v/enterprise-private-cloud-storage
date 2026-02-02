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
@TableName("sys_log")
public class SysLog implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 日志记录ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 操作用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 操作用户名称
     */
    @TableField("username")
    private String username;

    /**
     * 功能模块: FILE/USER/SHARE/SYSTEM
     */
    @TableField("module")
    private String module;

    /**
     * 操作类型: UPLOAD/DOWNLOAD/LOGIN/DELETE
     */
    @TableField("action")
    private String action;

    /**
     * 请求路径
     */
    @TableField("request_uri")
    private String requestUri;

    /**
     * 操作IP地址
     */
    @TableField("client_ip")
    private String clientIp;

    /**
     * 操作状态:0-失败; 1-成功
     */
    @TableField("status")
    private Integer status;

    /**
     * 操作详情
     */
    @TableField("content")
    private String content;

    /**
     * 创建时间
     */
    @TableField("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
}
