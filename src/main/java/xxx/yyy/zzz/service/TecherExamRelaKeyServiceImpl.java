package xxx.yyy.zzz.service;

import org.springframework.stereotype.Service;
import xxx.yyy.zzz.dao.TecherExamRelaMapper;
import xxx.yyy.zzz.entity.Teacher;
import xxx.yyy.zzz.entity.TecherExamRelaKey;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TecherExamRelaKeyServiceImpl implements ITeacherExamRelaService {

    @Resource
    TecherExamRelaMapper relaMapper;
    @Override
    public boolean add(TecherExamRelaKey relaKey) {
        return relaMapper.insert(relaKey) > 0;
    }
}
