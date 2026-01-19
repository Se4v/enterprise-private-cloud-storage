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
@TableName("sys_log")
public class SysLog implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 日志记录ID
     */
    @TableId(value = "id")
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
     * 操作类型:0-登录; 1-登出; 2-上传; 3-下载; 4-删除; 5-重命名; 6-移动; 7-分享
     */
    @TableField("type")
    private Integer type;

    /**
     * 操作结果:0-失败; 1-成功
     */
    @TableField("result")
    private Integer result;

    /**
     * 操作详情
     */
    @TableField("detail")
    private String detail;

    /**
     * 操作IP地址
     */
    @TableField("client_ip")
    private String clientIp;

    /**
     * 错误信息
     */
    @TableField("error_msg")
    private String errorMsg;

    /**
     * 创建时间
     */
    @TableField("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
}
