package xxx.yyy.zzz.entity;

public class TecherExamRelaKey {
    private String teacherid;

    private String examid;

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid == null ? null : examid.trim();
    }
}