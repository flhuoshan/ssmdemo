package xxx.yyy.zzz.service;

import org.springframework.stereotype.Service;
import xxx.yyy.zzz.dao.ExamRecordMapper;
import xxx.yyy.zzz.entity.ExamRecord;
import xxx.yyy.zzz.entity.ExamRecordExample;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExamRecordServiceImpl implements IExamRecordService {

    @Resource
    ExamRecordMapper examRecordMapper;

    @Override
    public boolean addExamRecord(ExamRecord record) {
        examRecordMapper.insertSelective(record);
        return true;
    }




    @Override
    public List<ExamRecord> listExamRecord(String location) {

        ExamRecordExample example = new ExamRecordExample();
        if(location != null && !location.isEmpty()){
            example.createCriteria().andLocationLike(location);
        }

        return examRecordMapper.selectByExample(example);
    }
}
