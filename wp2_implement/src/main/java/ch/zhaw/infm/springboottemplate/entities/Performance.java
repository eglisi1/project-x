package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.*;

@Entity
public class Performance extends TemporalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String performer;

    public long getId() {
        return id;
    }

    public void setId(long performanceId) {
        this.id = performanceId;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }
}
