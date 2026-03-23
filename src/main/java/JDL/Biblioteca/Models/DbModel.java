package JDL.Biblioteca.Models;

public class DbModel {

    protected int id;
    
    public DbModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
