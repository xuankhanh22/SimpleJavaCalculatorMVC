/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import Views.View;
import java.awt.event.ActionListener;
import Models.Model;
import java.awt.event.ActionEvent;
/**
 *
 * @author khanh.hoang
 */
public class Controler implements ActionListener{
    
    private View view;
    private Model model;

    public Controler(View view, Model model) {
        this.view = view;
        this.model=model;     
      this.view.cmd_multiply.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       this.model.setA(Integer.parseInt(this.view.txtA.getText()));
       this.model.setB(Integer.parseInt(this.view.txtB.getText()));
       this.view.txtResult.setText(String.valueOf(this.model.Mutiply()));                     
    }    
}
