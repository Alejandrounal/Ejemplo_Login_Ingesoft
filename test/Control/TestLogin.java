/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Usuario;
import static Frontera.FramePrincipal.sistema;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro
 */
public class TestLogin {
        
    private static ValidarLogin validarLogin = new ValidarLogin();
    
    private String LONG_NOMBRE_INCORRECTA = "Longitud de nombre incorrecta";
    private String LONG_PASSWORD_INCORRECTA = "Longitud de contraseña incorrecta";
    private String DATOS_INCORRECTOS = "Datos incorrectos";
    private String USUARIO_AUTORIZADO = "Bienvenido";
    
    public TestLogin() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        /*ArrayList <Usuario> usuarios = new ArrayList<Usuario>();
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        Usuario c = new Usuario();
        
        a.setNombre("juan");
        a.setContransenia("1234");
        b.setNombre("pedro");
        b.setContransenia("123");
        c.setNombre("maria");
        c.setContransenia("12345");
        
        usuarios.add(a);
        usuarios.add(b);
        usuarios.add(c);
        
        sistema.setUsuarios(usuarios);
        
        for (Usuario u : sistema.getUsuarios()) {
            System.out.println(u.getNombre());
            System.out.println(u.getContransenia());
            System.out.println("-----------------");
        }*/
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testLongitudNombre(){
        Usuario u = new Usuario();
        u.setNombre("R");
        u.setContransenia("123456");
        assertEquals(validarLogin.verificarLogin(u), LONG_NOMBRE_INCORRECTA);
        
        u.setNombre("Roberto");
        u.setContransenia("123456");
        assertEquals(validarLogin.verificarLogin(u), LONG_NOMBRE_INCORRECTA);
        
    }
    
    @Test
    public void testLongitudContrasenia(){
        Usuario u = new Usuario();
        u.setNombre("Pepe");
        u.setContransenia("12");
        assertEquals(validarLogin.verificarLogin(u), LONG_PASSWORD_INCORRECTA);
        
        u.setNombre("Pepe");
        u.setContransenia("123456");
        assertEquals(validarLogin.verificarLogin(u), LONG_PASSWORD_INCORRECTA);
        
    }
    
    @Test
    public void testNombre(){
        Usuario u = new Usuario();
        u.setNombre("Henry");
        u.setContransenia("12345");
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
       
    }
    
     @Test
    public void testContrasenia(){
        Usuario u = new Usuario();
        u.setNombre("maria");
        u.setContransenia("1234");
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
    }
    
    @Test
    public void testDatos(){
        Usuario u = new Usuario();
        u.setNombre("Henry");
        u.setContransenia("Af586");
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
    }
    
    @Test
    public void testTodoCorrecto(){
        Usuario u = new Usuario();
        
        u.setNombre("juan");
        u.setContransenia("1234");
        assertEquals(validarLogin.verificarLogin(u), USUARIO_AUTORIZADO);
      
        u.setNombre("pedro");
        u.setContransenia("123");
        assertEquals(validarLogin.verificarLogin(u), USUARIO_AUTORIZADO);
        
        u.setNombre("maria");
        u.setContransenia("12345");
        assertEquals(validarLogin.verificarLogin(u), USUARIO_AUTORIZADO);
    }
    
}
