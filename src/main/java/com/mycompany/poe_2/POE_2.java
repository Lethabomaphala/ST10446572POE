/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_2;

import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class POE_2 {

    public static void main(String[] args) {
        createLoginAccount();
    }

    public static void createLoginAccount() {
                            String name = JOptionPane.showInputDialog("Hello please enter your name and surname");

        boolean validUsername = false;
        boolean validPassword = false;
        String username = "";
        String password = "";
        
        while (!validUsername) {
            username =
                    JOptionPane.showInputDialog(null, name + 
                              "please enter a username that you would like to use for your account."
                            
                               +   "NOTE: The username must not exceed 5 character and must contain of an underscore");
            if (username != null && checkUserName(username)) {
                validUsername = true;
            } else {
                JOptionPane.showMessageDialog(null, name + 
                          "Your Username is not correctly formatted. "
                        + "Please ensure that the username contains of an underscore and is no more than 5 characters in length" );
            } 
        } 
        JOptionPane.showMessageDialog(null, "Username successfully captured");

while (!validPassword) {
password =
        JOptionPane.showInputDialog(null, name +
                 "please enter the password that you would like to use"
                +    "NOTE: The password must contain atleast 8 characters, it must contain of a capital letter, number and a special character");
if (password != null && isValidPassword(password)) {
    validPassword = true;
} else {
    JOptionPane.showMessageDialog(null, name +
              "Your password is formatted incorrectly. Please ensure that your password has atleast 8 characters"
            + ",a capital letter, number and a special character");
}
      
}
JOptionPane.showMessageDialog(null, "Password successfully captured");
    }
    public static void login() {

        boolean loggedIn =  false;
        while (!loggedIn) {
            String inputUsername = JOptionPane.showInputDialog(null,  "Please enter your username");
            String inputPassword = JOptionPane.showInputDialog(null, "Please enter your password");
                                        Object Username = null;
                                        Object password = null;
            
             if (inputUsername != null && inputPassword != null && inputUsername.equals(Username) && inputPassword.equals(password)) {
                 
                 JOptionPane.showMessageDialog(null, "Welcome back. It is great to see you again");
                 loggedIn = true;
             } else {
                 JOptionPane.showMessageDialog(null, "Username or password incorrect. Please try again") ;
            }
        }
    }
    public static boolean checkUserName(String username) {
        return username != null && username.length() <=5 && username.contains("_");
    }
    public static boolean isValidPassword(String password) {
        if (password.length() <8) {
            return false;
        }
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) { 
                hasCapitalLetter = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }else if (isSpecialCharacter(c)) {
                hasSpecialCharacter = true;
            }
        }
        return hasCapitalLetter && hasNumber && hasSpecialCharacter;
    }
    public static boolean 
            isSpecialCharacter (char c) {
                String specialCharacters = "!@#$%^&*()_-+=";
                return specialCharacters.indexOf(c) != -1;
            }
            
                }

        
            


