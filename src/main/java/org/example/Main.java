package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarando un dato especial
        Scanner entraadaTeclado= new Scanner(System.in);

        //Declarando datos entrada
        String nombres;
        String apellidos;
        String edad;
        Integer numerousosdetarjetames;
        Integer productoaseocompras;
        Integer productoalimenticioscompras;
        Integer productovarioscompras;
        Short puntaje;




        //Inicializar las variables
        System.out.println("-Bienvenido a almacenes Exito-");

        System.out.print("Digite su nombre: ");
        nombres= entraadaTeclado.nextLine();

        System.out.print("Digite sus apellidos: ");
        apellidos= entraadaTeclado.nextLine();

        System.out.print("Ingrese su edad: ");
        edad=entraadaTeclado.nextLine();

        System.out.print("Digite su puntaje de 1 a 9: ");
        puntaje= entraadaTeclado.nextShort();

        System.out.print("Digite el total de veces que utilizo su tarjeta como medio de pago: ");
        numerousosdetarjetames= entraadaTeclado.nextInt();

        System.out.print("Digite el valor monetario hecho en gastos de productos alimenticios: ");
        productoalimenticioscompras= entraadaTeclado.nextInt();

        System.out.print("Digite el valor monetario hecho en compras fuera de la canasta familiar: ");
        productovarioscompras= entraadaTeclado.nextInt();

        System.out.print("Digite el valor monetario hechos en gastos de productos de aseo: ");
        productoaseocompras= entraadaTeclado.nextInt();

        //Proceso


        Integer totalCuenta = productoalimenticioscompras + productoaseocompras + productovarioscompras;
        Integer totaldescuentodeuda;
        Integer descuentoUsuario;

        if (puntaje==1){
            descuentoUsuario= (totalCuenta*25/100);
            totaldescuentodeuda= totalCuenta-descuentoUsuario;
            System.out.println("Querido usuario usted tiene una deuda de: " +totaldescuentodeuda);

        }else if (puntaje==2){
            descuentoUsuario= (totalCuenta*20/100);
            totaldescuentodeuda= totalCuenta-descuentoUsuario;
            System.out.println("Querido usuario usted tiene una deuda de: " +totaldescuentodeuda);

        } else if (puntaje==3) {
            descuentoUsuario= (totalCuenta*20/100);
            totaldescuentodeuda= totalCuenta-descuentoUsuario;
            System.out.println("Querido usuario usted tiene una deuda de: " +totaldescuentodeuda);

        } else if (puntaje ==4) {
            descuentoUsuario= (totalCuenta*15/100);
            totaldescuentodeuda= totalCuenta-descuentoUsuario;
            System.out.println("Querido usuario usted tiene una deuda de: " +totaldescuentodeuda);
    } else if (puntaje==5 || puntaje==6 || puntaje==7 || puntaje==8 || puntaje==9) {


        }else{
            System.out.println("Usted no aplica");

        }


    }
}