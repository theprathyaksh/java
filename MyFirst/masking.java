/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author theprathyaksh
 */
public class masking {
    public static void main(String[] args)
    {
        byte a = 5, b = 9;
        byte c;
        c = (byte)(b<<4);
        c = (byte)(c|a);
        
        System.out.println((c&0b11110000)>>4);
        System.out.println(c&0b00001111);
    }
    
}
