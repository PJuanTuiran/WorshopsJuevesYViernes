package org.riwi.models;

import org.riwi.entities.AvionEntity;
import org.riwi.imodel.IAvionModel;
import org.riwi.persistence.ConfigDB;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AvionModel implements IAvionModel {

    @Override
    public AvionEntity create(AvionEntity request ) {
        Connection  connection = ConfigDB.openConnection();
        String sql = "INSERT INTO avion(modelo, capacidad) VALUES(?,?)";
        AvionEntity avion = null;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,request.getModelo() );
            preparedStatement.setInt(2,request.getCapacidad() );
            preparedStatement.executeUpdate();
            ResultSet result = preparedStatement.getGeneratedKeys();


            if(result.next()){
                request.setIdAvion(result.getInt(1));
                avion = new AvionEntity(
                        request.getIdAvion(),
                        result.getString("modelo"),
                        result.getInt("capacidad"));

            }
            preparedStatement.close();
            connection.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return avion;
    }

    public static void main(String[] args) {
        String modelo = JOptionPane.showInputDialog("ingresa el modelo");
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la capacidad"));

        AvionEntity avion1 = new AvionEntity();
        avion1.setModelo(modelo);
        avion1.setCapacidad(capacidad);
        AvionModel modelavion = new AvionModel();
        modelavion.create(avion1);
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public Integer read(AvionEntity avionEntity, Integer request) {
        return 0;
    }
}
