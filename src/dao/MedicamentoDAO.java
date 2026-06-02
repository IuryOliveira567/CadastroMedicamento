/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Medicamento;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import model.Medicamento;
import util.Conexao;

public class MedicamentoDAO {
    public boolean inserir(Medicamento m) {
        String sql = "INSERT INTO medicamentos(nome, componenteAtivo, datacadastro) VALUES(?,?,?)";
        
        try(Connection con = Conexao.conectar();
            PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setString(1, m.getNome());
            pst.setString(2, m.getComponenteAtivo());
            pst.setString(3, m.getDataCadastro());
            
            pst.executeUpdate();
            return true;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public List<Medicamento> listar() {
        
        List<Medicamento> lista = new ArrayList<>();
        String sql = "SELECT * FROM medicamentos";

        try(Connection con = Conexao.conectar();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery()) {

            while(rs.next()) {

                Medicamento m = new Medicamento();

                m.setId(rs.getInt("id"));
                m.setNome(rs.getString("nome"));
                m.setComponenteAtivo(rs.getString("componenteativo"));
                m.setDataCadastro(rs.getString("datacadastro"));

                lista.add(m);
            }

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        return lista;
    }
    
    public boolean atualizar(Medicamento m){
        
        String sql = "UPDATE medicamentos SET nome=?, componenteativo=?, datacadastro=? WHERE id=?";

        try(Connection con = Conexao.conectar();
                PreparedStatement pst = con.prepareStatement(sql)) {

                pst.setString(1, m.getNome());
                pst.setString(2, m.getComponenteAtivo());
                pst.setString(3, m.getDataCadastro());
                pst.setInt(4, m.getId());

                pst.executeUpdate();

                return true;

        } catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
