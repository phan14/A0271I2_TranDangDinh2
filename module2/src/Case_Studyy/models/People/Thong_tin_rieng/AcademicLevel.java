package Case_Studyy.models.People.Thong_tin_rieng;

import java.io.Serializable;

public class AcademicLevel implements Serializable {
    private String levelName;

    public AcademicLevel(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return  levelName ;
    }
}