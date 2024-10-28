/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.system;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class CommonConnection
{
    public static Connection getConnection() throws SQLException
    {
        Connection con;
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","Dhanu@17");
        return con;
    }
    
    public static void addImage(JLabel lblclose, String url)
    {
        BufferedImage img;
        try
        {
            img = ImageIO.read(new File(url));
            Image dimg;
            dimg = img.getScaledInstance(lblclose.getWidth(), lblclose.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imgicon = new ImageIcon(dimg);
            lblclose.setIcon(imgicon);
        }
        catch(Exception e)
        {
        }
    }
}
