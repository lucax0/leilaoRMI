/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO<TipoObjeto> {

    public TipoObjeto proximo()
            throws SQLException,
            ClassNotFoundException;
    
    public boolean inserir(TipoObjeto obj)
            throws SQLException,
            ClassNotFoundException;

    public boolean alterar(TipoObjeto obj)
            throws SQLException,
            ClassNotFoundException;

    public boolean excluir(TipoObjeto obj)
            throws SQLException,
            ClassNotFoundException;

    public TipoObjeto pesquisar(TipoObjeto obj)
            throws SQLException,
            ClassNotFoundException;

    public List<TipoObjeto> listar(String criterio)
            throws SQLException,
            ClassNotFoundException;
}