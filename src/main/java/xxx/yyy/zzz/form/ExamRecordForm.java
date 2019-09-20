package xxx.yyy.zzz.form;

import java.util.Date;

public class ExamRecordForm {
    private String examno;
    private Date starttime;
    private Date endtime;


    public String getExamno() {
        return examno;
    }

    public void setExamno(String examno) {
        this.examno = examno;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}
