package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Shows {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long showsId;

    private String title;
    private LocalDateTime startTime;
    @ManyToOne
    @JoinColumn(name = "eventId")
    private Event event;
    @ManyToOne
    private Performance performance;

    public void setShowsId(long showId) {
        this.showsId = showId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
