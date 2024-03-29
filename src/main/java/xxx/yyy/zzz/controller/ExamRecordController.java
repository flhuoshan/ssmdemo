package xxx.yyy.zzz.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import xxx.yyy.zzz.commons.R;
import xxx.yyy.zzz.entity.ExamRecord;
import xxx.yyy.zzz.entity.TecherExamRelaKey;
import xxx.yyy.zzz.service.IExamRecordService;
import xxx.yyy.zzz.service.ITeacherExamRelaService;
import xxx.yyy.zzz.vo.ExamRecordVO;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static com.alibaba.fastjson.JSON.parseArray;

@Controller
@RequestMapping("/record")
public class ExamRecordController {

    @Resource
    IExamRecordService examRecordService;

    @Resource
    ITeacherExamRelaService relaService;



    @RequestMapping(value="list", method = RequestMethod.GET)
    @ResponseBody
    public R list(String location){
        List<ExamRecordVO> records = examRecordService.listExamRecord(location);

        return R.ok().put("rows", records).put("total", records.size());
    }


    @RequestMapping(value="add", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public R add(String params, String teacherids){
//        ObjectMapper objectMapper = new ObjectMapper();
//        ExamRecord examRecord = null;
//        try {
//            examRecord = objectMapper.readValue(params, ExamRecord.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        JSONArray teachers = JSON.parseArray(teacherids);

        ExamRecord examRecord = JSON.parseObject(params, ExamRecord.class);

        examRecord.setExamid(UUID.randomUUID().toString());
        boolean success = examRecordService.addExamRecord(examRecord);
        for (Object teacher : teachers) {
            TecherExamRelaKey relaKey = new TecherExamRelaKey();
            relaKey.setExamid(examRecord.getExamid());
            relaKey.setTeacherid(teacher.toString());
            relaService.add(relaKey);
        }

        return R.ok();
    }


    @RequestMapping(value="view", method = RequestMethod.GET)
    public String list(){
//        examRecordService.listExamRecord();

        return "record_list";
    }
}
