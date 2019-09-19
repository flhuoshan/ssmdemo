package xxx.yyy.zzz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xxx.yyy.zzz.entity.TecherExamRelaExample;
import xxx.yyy.zzz.entity.TecherExamRelaKey;

public interface TecherExamRelaMapper {
    long countByExample(TecherExamRelaExample example);

    int deleteByExample(TecherExamRelaExample example);

    int deleteByPrimaryKey(TecherExamRelaKey key);

    int insert(TecherExamRelaKey record);

    int insertSelective(TecherExamRelaKey record);

    List<TecherExamRelaKey> selectByExample(TecherExamRelaExample example);

    int updateByExampleSelective(@Param("record") TecherExamRelaKey record, @Param("example") TecherExamRelaExample example);

    int updateByExample(@Param("record") TecherExamRelaKey record, @Param("example") TecherExamRelaExample example);
}