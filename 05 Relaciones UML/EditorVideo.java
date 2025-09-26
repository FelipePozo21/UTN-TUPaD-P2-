package tpsemana5;
public class EditorVideo {
    private Render render;
    
    public EditorVideo(Render render) {
        this.render = render;
    }
    
    public void exportar(Render render) {
        this.render = render;
    }
    
    public void generar(String nombre, int duracion) {
        Proyecto proyecto = new Proyecto(nombre, duracion);
        
        render.setProyecto(proyecto);
    }

    @Override
    public String toString() {
        return "EditorVideo{" + "render=" + render + '}';
    }
}
