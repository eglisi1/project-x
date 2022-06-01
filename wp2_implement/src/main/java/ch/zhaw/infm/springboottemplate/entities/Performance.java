package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.*;

@Entity
public class Performance extends TemporalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long performanceId;

    private String performer;

    public long getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(long performanceId) {
        this.performanceId = performanceId;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }
}
