/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peristentuser;

import entities.User;

/**
 *
 * @author mac
 */
public class PeristentUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            findById(int id)
            findAll()
            save(User user) // insert into
            update(int id, User user)
            delete(int id)
        
        */
        services.UserImpl userService = new services.UserImpl();
        User user = userService.findById(5);
        if(user == null) {
            System.out.println("Oh!!! Something is not found!!");
        } else {
            System.out.println(user);
        }
    }
    
}
