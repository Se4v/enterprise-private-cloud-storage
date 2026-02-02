package org.example.storagebackend.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@TableName("sys_notification")
public class SysNotification {
    /**
     * 通知记录ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 接收者ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 发送者ID(0代表系统消息)
     */
    @TableField("sender_id")
    private Long senderId;

    /**
     * 通知标题
     */
    @TableField("title")
    private String title;

    /**
     * 通知内容
     */
    @TableField("content")
    private String content;

    /**
     * 通知类型: 1-系统公告; 2-文件分享; 3-团队邀请
     */
    @TableField("notification_type")
    private Integer notificationType;

    /**
     * 阅读状态: 0-未读; 1-已读
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
}
