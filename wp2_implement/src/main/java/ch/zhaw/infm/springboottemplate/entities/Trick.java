package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("trick")
public class Trick extends Performance {
    private double budget;

    public Trick() {
        super();
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
