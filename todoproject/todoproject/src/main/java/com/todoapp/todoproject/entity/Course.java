package com.todoapp.todoproject.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses_table")
public class Course {
//so here in this file because there's we have fields with the private access modifiers we need to include getters and setter but for some others because we use lombok it auto generates them
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id //indicates that the member field in a primary key
    @GeneratedValue(strategy = GenerationType.AUTO)// has to do with the incrementing of the  id field
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "username")// used to add column called username into the table
    private String username;

}
