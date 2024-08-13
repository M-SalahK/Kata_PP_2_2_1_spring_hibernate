package hiber.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model_car")
    private String model;

    @Column(name = "series_num")
    private int series;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Car car;



    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        if (model != null) {
            return model + " - " + series;
        }
        return "Yac mashen";
    }
}
