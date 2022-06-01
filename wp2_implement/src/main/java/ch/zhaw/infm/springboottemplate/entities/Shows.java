package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Shows extends TemporalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime startTime;
    @ManyToOne
    private Event event;
    @ManyToOne
    private Performance performance;

    public long getId() {
        return id;
    }

    public void setId(long showId) {
        this.id = showId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime starttime) {
        this.startTime = starttime;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }
}
