package eu.forkandpie.springidea.entity;

import javax.persistence.*;

@Entity
@Table(name="pies")
public class Pie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="stuffing")
    private String stuffing;

    @Column(name="country_origin")
    private String countryOrigin;

    public Pie(String name, String stuffing, String countryOrigin) {
        this.name = name;
        this.stuffing = stuffing;
        this.countryOrigin = countryOrigin;
    }

    public Pie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuffing() {
        return stuffing;
    }

    public void setStuffing(String stuffing) {
        this.stuffing = stuffing;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
}
