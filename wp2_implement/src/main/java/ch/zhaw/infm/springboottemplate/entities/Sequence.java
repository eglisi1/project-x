package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("sequence")
public class Sequence extends Performance {
    private String title;

    @OneToMany
    List<Performance> performances;

    public Sequence() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
