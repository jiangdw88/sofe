package com.example.demo.mapper;

import com.example.demo.bean.Dynamic;
import com.example.demo.bean.DynamicAndSort;
import com.example.demo.bean.DynamicAndUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DynamicMapper {
//    发布动态
    int releaseNews(Dynamic dynamic);
//    查询本人发布的动态
    List<DynamicAndSort> myDynamic(String id);
//    删除本人动态假删除
    int deleteDynamic(String id);
    /**
     *  按照分类查询10分钟内的最新动态
     * @param sortId 分类id
     * @param minute 查询时间
     * @return
     */
    List<DynamicAndSort> newDynamic(String sortId,int minute);

    /**
     * 按照分类查询按照点赞数从多到少的动态（热评）
     * @param sortId 分类id
     * @return
     */
    List<DynamicAndSort> hotDynamic(String sortId);

    /**
     * 根据输入的关键字查询动态
     * @param keyWords 关键字
     * @return
     */
    List<DynamicAndSort> likeKeyDynamic(@Param("keyWords") String keyWords);

    /**
     * 获取全部动态
     * @return
     */
    List<Dynamic> getAllDynamic();

    /**
     * 根据动态id获取当前动态
     * @param dId
     * @return
     */
    List<DynamicAndUser> getDynamicById(String dId);
}
