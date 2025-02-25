package tempory;

import jakarta.persistence.*;

@Entity
@Table(name="dev")

public class temporyEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int salary;
    temporyEmployee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public String getname(){
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
