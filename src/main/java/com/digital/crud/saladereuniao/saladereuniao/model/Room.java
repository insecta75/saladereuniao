package com.digital.crud.saladereuniao.saladereuniao.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="meetingroom")
@Setter //Lombok: setters;
@AllArgsConstructor //Lombok: constructor com parametros;
@NoArgsConstructor //Lombok: constructor sem parametros;
public class Room {
    private long id;
    private String name;
    private String date;
    private String startHour;
    private String endHour;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() { return id; }
    @Column(name="name", nullable = false)
    public String getName() { return name; }
    @Column(name="date", nullable = false)
    public String getDate() { return date; }
    @Column(name="startHour", nullable = false)
    public String getStartHour() { return startHour; }
    @Column(name="endHour", nullable = false)
    public String getEndHour() { return endHour; }
    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }
}