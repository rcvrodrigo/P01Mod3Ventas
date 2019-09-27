
package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestColeccion {
    
    public TestColeccion() {
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta venta= new Venta("Codigo", 123, 123);
        ColeccionVentas instance=new ColeccionVentas();
        boolean esperado=true;
        boolean obtenido=instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
    
    @Test
    public void TestModificar() {
        System.out.println("Modificar");
        Venta venta= new Venta("Codigo", 123, 123);
        ColeccionVentas instance=new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado=true;
        venta= new Venta("Codigo", 123, 123);
        boolean obtenido=instance.Modificar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
    
    @Test
    public void TestEliminar() {
        String codigo = "Codigo";
        System.out.println("Eliminar");
        Venta venta= new Venta("Codigo", 123, 123);
        ColeccionVentas instance=new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado=true;        
        boolean obtenido=instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
    
    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado=new ArrayList<Venta>();
        ArrayList<Venta> obtenido=instance.Listar();
        Assert.assertEquals(esperado, obtenido);
        
        {
            
        }
    }
    
    @Test
    public void testSubTotal() {
        System.out.println("SubTotal");
        Venta venta= new Venta("Codigo", 5, 6);
        ColeccionVentas instance=new ColeccionVentas();
        assertTrue(instance.SubTotal(venta)==30);              
    }
  
}
