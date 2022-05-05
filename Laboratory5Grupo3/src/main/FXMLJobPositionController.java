/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import domain.CircularDoublyLinkedList;
import domain.JobPosition;
import domain.ListException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Profesor Gilberth Chaves A <gchavesav@ucr.ac.cr>
 */
public class FXMLJobPositionController implements Initializable {

    CircularDoublyLinkedList jobPositionList;
    @FXML
    private BorderPane bp;
    @FXML
    private Button btnAdd;
    @FXML
    private TableView<List<String>> jobPositionTableView;
    @FXML
    private TableColumn<List<String>, String> idTableColumn;
    @FXML
    private TableColumn<List<String>, String> descriptionTableColumn;
    @FXML
    private TableColumn<List<String>, String> hourlyWageTableColumn;
    @FXML
    private TableColumn<List<String>, String> totalHoursTableColumn;
    @FXML
    private TableColumn<List<String>, String> monthlyWageTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //cargamos la lista
        this.jobPositionList = util.Utility.getCircularDoublyLinkedList();
        
        this.idTableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        
        this.descriptionTableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(1));
            }
        });
        
        this.hourlyWageTableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(2));
            }
        });
        
        this.totalHoursTableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(3));
            }
        });
        
        this.monthlyWageTableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(4));
            }
        });
        
        try{
            if(this.jobPositionList!=null && !this.jobPositionList.isEmpty()){
                for(int i=1; i<=jobPositionList.size(); i++) {
                    this.jobPositionTableView.setItems(getData());
                }
            }
        }catch(ListException ex){
            //Mostrar la excepción: Student list is empty
        }
    }    

    @FXML
    private void btnAddOnAction(ActionEvent event) {
    }

    private ObservableList<List<String>> getData() {
        ObservableList<List<String>> data = FXCollections.observableArrayList();
        if(this.jobPositionList!=null&&!this.jobPositionList.isEmpty()){
            try{
                for (int i = 1; i <= this.jobPositionList.size(); i++) {
                    JobPosition jp = (JobPosition) this.jobPositionList.getNode(i).data;
                    //asigno horas en forma aleatoria
                    int totaHours = util.Utility.random(40 ,50);
                    //obtenemos el salario mensual
                    double mWage = jp.getSalary(totaHours);
                    List<String> arrayList = new ArrayList<>();
                    arrayList.add(String.valueOf(jp.getId()));
                    arrayList.add(jp.getDescription());
                    arrayList.add(String.valueOf(jp.getHourlyWage()));
                    arrayList.add(String.valueOf(totaHours));
                    arrayList.add(String.valueOf(util.Utility.$format(mWage)));
                
                    //Agrego el arrayList a ObservableList<List<String>> data
                    data.add(arrayList);
                }
            }catch(ListException ex){
                
            }
        }
        return data;
    }
    
}
