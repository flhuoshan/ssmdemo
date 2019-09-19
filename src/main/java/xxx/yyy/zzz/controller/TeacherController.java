package xxx.yyy.zzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xxx.yyy.zzz.commons.R;
import xxx.yyy.zzz.entity.ExamRecord;
import xxx.yyy.zzz.entity.Teacher;
import xxx.yyy.zzz.service.ITeacherService;
import xxx.yyy.zzz.vo.ComboEntity;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/teacher")
@Controller
public class TeacherController {

    @Resource
    ITeacherService teacherService;

    @RequestMapping(value="list", method = RequestMethod.GET)
    @ResponseBody
    public List<ComboEntity> list(String location){
        List<Teacher> teachers = teacherService.list();
        List<ComboEntity> comboEntities = new ArrayList<>();
        for (Teacher teacher : teachers) {
            ComboEntity comboEntity = new ComboEntity();
            comboEntity.setGroup("teacher");
            comboEntity.setText(teacher.getName());
            comboEntity.setValue(teacher.getTeacherid());
            comboEntities.add(comboEntity);
        }
        return comboEntities;
    }
}
