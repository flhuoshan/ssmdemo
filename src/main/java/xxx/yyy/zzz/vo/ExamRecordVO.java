package xxx.yyy.zzz.vo;

import xxx.yyy.zzz.entity.ExamRecord;

import java.util.List;

public class ExamRecordVO extends ExamRecord {
    List<String> teachernames;
    List<String> teacherids;

    public List<String> getTeachernames() {
        return teachernames;
    }

    public void setTeachernames(List<String> teachernames) {
        this.teachernames = teachernames;
    }

    public List<String> getTeacherids() {
        return teacherids;
    }

    public void setTeacherids(List<String> teacherids) {
        this.teacherids = teacherids;
    }
}
