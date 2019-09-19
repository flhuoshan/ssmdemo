package xxx.yyy.zzz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xxx.yyy.zzz.entity.Teacher;
import xxx.yyy.zzz.entity.TeacherExample;

public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String teacherid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String teacherid);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}