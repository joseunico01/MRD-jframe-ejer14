/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author joseluis
 */
public class Metodos {
    private Matriz num[][];
    private void burbuja(Matriz nu[][]) {
        int aux;
        for (int i = 0; i <nu.length; i++) {
            for (int j = 0; j < nu.length; j++) {
                for (int i1 = i; i1 < nu.length; i1++) {
                    int caux = 0;
                    if (i == i1) {
                        caux = j + 1;
                    }
                    for (int j1 = caux; j1 < nu.length; j1++) {
                        if (nu[i][j].getProducto() > nu[i1][i1].getProducto()) {
                            aux = num[i1][j1].getProducto();
                            nu[i1][j1].setProducto(nu[i][j].getProducto());
                            nu[i][j].setProducto(aux);
                        }
                    }
                }

            }
        }
    }

    private boolean multi_matriz() {
        boolean compatible = true;
        if (num[0].length != num.length) {
            compatible = false;
        } else {
            for (Matriz[] num1 : num) {
                for (int j = 0; j < num.length; j++) {
                    for (int k = 0; k < num.length; k++) {
                        num1[j].setProducto(num1[j].getProducto() + (num1[k].getDato() * num[k][j].getDato2()));
                    }
                }
            }
        }
        return compatible;
    }
    public void llenandoDatos(){
        int x,y,w,q,dat,dat2;
        JOptionPane.showMessageDialog(null,"\tLLENANDO LA MATRIZ  A");
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas: "));
        y=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas: "));
        JOptionPane.showMessageDialog(null,"\tLLENANDO LA MATRIZ  B");
        w=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas: "));
        q=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas: "));
        num=new Matriz[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                dat=(int) (Math.random() * 10);
                dat2=(int) (Math.random() * 10);
                num[i][j] = new Matriz(dat, dat2);
            }
        }
    }
    private void datos() {
        String cad = "",cad2 = "",cad3 = "";
        for (Matriz[] num1 : num) {
            for (int j = 0; j < num.length; j++) {
                cad += num1[j].getDato() + "   ";
                cad2 += num1[j].getDato2() + "   ";
                cad3 += num1[j].getProducto() + "   ";
            }
            cad += "\n";
            cad2 += "\n";
            cad3 += "\n";
        }
        JOptionPane.showMessageDialog(null, "\tMOSTRANDO LA MATRIZ  A\n"+cad);
        JOptionPane.showMessageDialog(null, "\tMOSTRANDO LA MATRIZ  B\n"+cad2);
        JOptionPane.showMessageDialog(null, "\tMOSTRANDO LA MATRIZ RESULTANTE\n"+cad3);
        burbuja(num);
        String cad4 = "";
        for (Matriz[] num1 : num) {
            for (int j = 0; j < num.length; j++) {
                cad4 += num1[j].getProducto() + "   ";
            }
            cad4 += "\n";
        }
        JOptionPane.showMessageDialog(null, "\tMOSTRANDO LA MATRIZ RESULTANTE ORDENANDA\n"+cad4);

    }
    public void mostrar(){
        if(multi_matriz()){
            datos();
        }
        else{
            JOptionPane.showMessageDialog(null,"Matrices no compatibles");
        }
    }
    public void finalizar(){
        JOptionPane.showMessageDialog(null,"\tGRACIAS POR USAR EL MENÚ");
      
    }
    
    
}
