package xxx.yyy.zzz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xxx.yyy.zzz.entity.ExamRecord;
import xxx.yyy.zzz.entity.ExamRecordExample;

public interface ExamRecordMapper {
    long countByExample(ExamRecordExample example);

    int deleteByExample(ExamRecordExample example);

    int deleteByPrimaryKey(String examid);

    int insert(ExamRecord record);

    int insertSelective(ExamRecord record);

    List<ExamRecord> selectByExample(ExamRecordExample example);

    ExamRecord selectByPrimaryKey(String examid);

    int updateByExampleSelective(@Param("record") ExamRecord record, @Param("example") ExamRecordExample example);

    int updateByExample(@Param("record") ExamRecord record, @Param("example") ExamRecordExample example);

    int updateByPrimaryKeySelective(ExamRecord record);

    int updateByPrimaryKey(ExamRecord record);
}