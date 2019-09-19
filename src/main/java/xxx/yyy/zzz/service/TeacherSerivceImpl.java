package xxx.yyy.zzz.service;

import org.springframework.stereotype.Service;
import xxx.yyy.zzz.dao.TeacherMapper;
import xxx.yyy.zzz.entity.Teacher;
import xxx.yyy.zzz.entity.TeacherExample;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherSerivceImpl implements ITeacherService {

    @Resource
    TeacherMapper teacherMapper;
    @Override
    public List<Teacher> list() {
        return teacherMapper.selectByExample(new TeacherExample());

    }
}
