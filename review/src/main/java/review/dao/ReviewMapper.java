package review.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import review.entity.Review;
import review.entity.ReviewExample;

import java.util.List;

@Mapper
public interface ReviewMapper {
    long countByExample(ReviewExample example);

    int deleteByExample(ReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}