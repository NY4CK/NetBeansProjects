
package testeexemplos;

public class CGenerica<T> {
    
    private T data;
    
    public CGenerica ( T data){
        this.data = data;
    }
    
    public T getData(){
        return data;
    }
    
    public void setData(){
        this.data=data;
    }
}
