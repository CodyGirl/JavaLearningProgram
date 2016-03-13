/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author VATSAL-PC
 */
public class User {
    public int id;
    public String name;
    public String password;
    
    public String getName(int ideaaaa, String passwd){
       if(this.id==ideaaaa && this.password == passwd){
           return this.name;
       }
        return "ID and pasword not matching";
    }
    
    public static void main(String args[]){
        User u1 = new User();
        User u2 = new User();
        
        u1.id = 1;
        u1.name = "Shubham";
        u1.password = "qwerty";
        
        u2.id = 2;
        u2.name = "Vatsal";
        u2.password = "qwerty";
        
        
        String name = u1.getName(2, "qwerty");
        System.out.println(name);
    }
}
