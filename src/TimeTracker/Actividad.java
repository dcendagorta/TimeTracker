package TimeTracker;

public class Actividad{
    private String a_ID;
    private String a_nombre;
    private String a_fecha_inicial;   
    private String a_fecha_final;
    private int a_tiempo_total;

    public Actividad(String ID, String name, String start){
        a_ID = ID;
        a_nombre = name;
        a_fecha_inicial = start;
        a_fecha_final = "";
        a_tiempo_total = 0;
    }
    
    //calcular_tiempo_total(){} = get_tiempo_total()

    //getters
    public String get_ID(){ //get ID(this)
        return a_ID;
    }
    
    public String get_nombre(){
        return a_nombre;
    }
    
    public String get_fecha_inicial(){
        return a_fecha_inicial;
    }
    
    public String get_fecha_final(){
        return a_fecha_final;
    }
    
    public int get_tiempo_total(){ //podría calcular el tiempo también
        return a_tiempo_total;
    }
    
    //setters
    public void set_ID(String ID){
        a_ID = ID;
    }
    
    public void set_nombre(String name){
        a_nombre = name;
    }
    
    public void set_fecha_inicial(String start){
        a_fecha_inicial = start;
    }
    
    public void set_fecha_final(String finish){
        a_fecha_final = finish;
    }
    
    public void set_tiempo_total(int time){ //¿necesaria?
        a_tiempo_total = time;
    }
    
    //crear() == contructor ¿no?
    
    public void actualizar(String ID, String name, String start){
        set_ID(ID);
        set_nombre(name);
        set_fecha_inicial(start);
    }
    
}
