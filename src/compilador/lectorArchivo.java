/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class lectorArchivo {

    //Diseñar un programa que permita leer un archivo txt que contenga
    //caracteres alfanuméricos. Implementar un método que retorne el carácter en el que va en el archivo.
    //En otro método imprimir a pantalla los caracteres que arroja la 
    //clase anterior (Dependiendo de cuantas veces se mande llamar el primer método serían los caracteres que mostraría a pantalla).
    public File leerDatos() throws IOException {
        // ventana para abrir el txt

        String texto, aux;
        ArrayList<String> lista = new ArrayList();

        //llamamos el metodo que permite cargar la ventana
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(file);
        // FileReader fr = new FileReader("C:\\Users\\carli\\Desktop\\iris.data"); 
        //abrimos el archivo seleccionado
        File abre = file.getSelectedFile();

        //recorremos el archivo y lo leemos
        if (abre != null) {
            // System.out.print("saque: "+leyendo(abre));
            return abre;
        }

        return null;
    }

    public char leyendo(FileReader archivos) throws FileNotFoundException, IOException {

        BufferedReader lee = new BufferedReader(archivos);
        int caract = archivos.read();

        if (caract == -1) {
            exit(0);
        }
        //return 0;
        return (char) caract;

    }

    public void imprimiendo(char caracter) {
        System.out.println(caracter);
    }

    public static void main(String[] args) throws IOException {
        int fers;
        int carliwis;
        lectorArchivo la = new lectorArchivo();
        FileReader archivos = new FileReader(la.leerDatos());
        String palabra = la.tokenizar(archivos);
        String palabra2 = la.tokenizar(archivos);
        String palabra3 = la.tokenizar(archivos);
        System.out.println(palabra);
        System.out.println(palabra2);
        System.out.println(palabra3);
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//
//        //AQUI SE PASA DE LOS DATOS DEL ARCHIVO
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));
//        System.out.println(la.leyendo(archivos));

    }

    public String tokenizar(FileReader archivos) throws IOException {
        String cadena = "";
        char caract = leyendo(archivos);
        System.out.println("AQUI ANDO QLO: "+caract);
        if (caract == 95 || (caract >= 65 && caract <= 90) || (caract >= 97 && caract <= 122)) {
            cadena += caract;
            caract = leyendo(archivos);
            while ((caract >= 65 && caract <= 90) || (caract >= 97 && caract <= 122)) {
                cadena += caract;
                caract = leyendo(archivos);
            }
            //caract = leyendo(archivos);
            System.out.println(caract);
            if (caract == 95 || (caract >= 48 && caract <= 57)) {
                System.out.println("Hola perro");
                cadena += caract;
                caract = leyendo(archivos);
                while (caract >= 48 && caract <= 57) {
                    cadena += caract;
                    
                    caract = leyendo(archivos);
                }
            }
            
            //caract = aux;
            System.out.println("En este me quedo perro "+caract);
            return cadena;
        } else if (caract >= 48 && caract <= 57) {
            cadena += caract;
            caract = leyendo(archivos);
            while (caract >= 48 && caract <= 57) {
                cadena += caract;
                caract = leyendo(archivos);
            }
            if (caract == 46) {
                cadena += caract;
                caract = leyendo(archivos);
            }
            while (caract >= 48 && caract <= 57) {
                cadena += caract;
                caract = leyendo(archivos);
            }
            return cadena;
        }else{
            System.out.println(caract);
            cadena += caract;
            return cadena;
        }
        
        //return cadena;
       
    }

    // (_)?([a-z]|[A-Z])+(_)?([0-9])*
    // [0-9]+ (/.)* [0-9]*
    //_ -> 95
    //A-Z -> 65 - 90
    //a -z -> 97 - 122
    //0-9 -> 48 - 57
    //. -> 46
}
