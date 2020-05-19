/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.UsuarioDAO;
import Entidad.Usuario;
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
public class Inicializacion {
    
    public Inicializacion() {
    }
    
    @Test
    public void initData(){
        UsuarioDAO dao = new UsuarioDAO();
        
         ArrayList <Usuario> usuarios = new ArrayList<Usuario>();
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
        
        //sistema.setUsuarios(usuarios);
        
        //for (Usuario u : sistema.getUsuarios()) {
        for(Usuario u: usuarios){
            System.out.println(u.getNombre());
            System.out.println(u.getContransenia());
            System.out.println("-----------------");
            dao.crear(u);
        }
        
    }
    
    
    @BeforeClass
    public static void setUpClass() {
       
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
    
     
    
}
