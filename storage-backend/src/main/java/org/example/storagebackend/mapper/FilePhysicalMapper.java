package org.example.storagebackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.storagebackend.model.entity.FilePhysical;

@Mapper
public interface FilePhysicalMapper extends BaseMapper<FilePhysical> {
}
