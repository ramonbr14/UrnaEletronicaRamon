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
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *CRUD
 * @author Ramonbr14
 */
public class UsuarioDAO {
        
    //Salvando
    public void create(Usuario usu){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO usuario"+ "(usulogin, ususenha)"+"VALUES(?,?)");
            stmt.setString(1,usu.getUsulogin());
            stmt.setString(2,usu.getUsusenha());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"DADOS SALVOS COM SUCESSO!","URNA ELEITORAL S/A", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro no Salvamento dos Dados!"+ex, "URNA ELEITORAL S/A", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
}
