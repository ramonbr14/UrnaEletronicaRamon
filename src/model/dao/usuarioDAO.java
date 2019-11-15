/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *CRUD
 * @author Ramonbr14
 */
public class usuarioDAO {
    private Connection com = null;
    
    //Salvando
    public void create(Usuario usuario){
        com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = com.prepareStatement("INSERT INTO (usulogin, ususenha) VALUES(?,?)");
            stmt.setString(1,usuario.getUsulogin());
            stmt.setString(2, usuario.getUsusenha());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"URNA ELEITORAL S/A", "DADOS SALVOS COM SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"URNA ELEITORAL S/A", "Erro no Salvamento dos Dados!"+ex, JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(com, stmt);
        }
    }
    
    
}
