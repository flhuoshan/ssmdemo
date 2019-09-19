package xxx.yyy.zzz.service;

import xxx.yyy.zzz.entity.ExamRecord;

import java.util.List;
import java.util.Map;

public interface IExamRecordService {
    public boolean addExamRecord(ExamRecord record);
    public List<ExamRecord> listExamRecord(String location);

}
