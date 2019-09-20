package xxx.yyy.zzz.service;

import org.springframework.stereotype.Service;
import xxx.yyy.zzz.dao.CustomMapper;
import xxx.yyy.zzz.dao.ExamRecordMapper;
import xxx.yyy.zzz.entity.ExamRecord;
import xxx.yyy.zzz.vo.ExamRecordVO;


import javax.annotation.Resource;
import java.util.List;

@Service
public class ExamRecordServiceImpl implements IExamRecordService {

    @Resource
    ExamRecordMapper examRecordMapper;

    @Resource
    CustomMapper customMapper;

    @Override
    public boolean addExamRecord(ExamRecord record) {
        examRecordMapper.insertSelective(record);
        return true;
    }




    @Override
    public List<ExamRecordVO> listExamRecord(String location) {
        if(location == null || location.isEmpty()){
            return customMapper.listExamRecord(location);
        }
        return customMapper.listExamRecord(null);
    }
}
