package xxx.yyy.zzz.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xxx.yyy.zzz.entity.ExamRecord;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/springcontext.xml"})
public class ExamRecordServiceImplTest {

    @Autowired
    IExamRecordService examRecordService;

    @Test
    public void addExamRecord() {
    }

    @Test
    public void listExamRecord() {
        List<ExamRecord> examRecordList = examRecordService.listExamRecord("");
        System.out.println("size " + examRecordList.size());
    }
}