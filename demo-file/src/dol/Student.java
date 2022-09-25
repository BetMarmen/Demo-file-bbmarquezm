package dol;

import java.util.Date;

public class Student extends Person{

	private String no_carnet;
        private Date fecha_ingreso;

    public Student(String no_carnet, Date fecha_ingreso) {
        this.no_carnet = no_carnet;
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getNo_carnet() {
        return no_carnet;
    }

    public void setNo_carnet(String no_carnet) {
        this.no_carnet = no_carnet;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
        

}
