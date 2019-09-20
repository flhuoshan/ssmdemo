package xxx.yyy.zzz.dao;

import org.apache.ibatis.annotations.Param;
import xxx.yyy.zzz.entity.ExamRecord;
import xxx.yyy.zzz.vo.ExamRecordVO;

import java.util.List;

public interface CustomMapper {
    List<ExamRecordVO> listExamRecord(@Param(value="location") String location);
}
