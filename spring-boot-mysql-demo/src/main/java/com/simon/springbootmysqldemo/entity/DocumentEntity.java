package com.simon.springbootmysqldemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("document")
public class DocumentEntity {
    @TableId("id_document")
    private Long id;
    private byte[] avatar;
}
