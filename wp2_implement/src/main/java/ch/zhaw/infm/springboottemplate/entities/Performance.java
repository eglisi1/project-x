package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="dtype", discriminatorType = DiscriminatorType.STRING)
public class Performance {

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
