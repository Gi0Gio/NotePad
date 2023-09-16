package com.mycompany.notepad;

import java.util.Scanner;

public class NotePad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**/
        int id = 0;
        String FileAuthor, FileName, FileDescription;
        String[] AuthorArr = new String[10];
        String[] DescArr = new String[10];
        String[] NameArr = new String[10];
        /* Menu */
        System.out.println("Choose an option 1-new 2-delete -update");
        switch(){
            case 1:

        }

        /*Input*/
        System.out.println("/nIngrese el nombre del archivo");
        FileName = sc.nextLine();
        System.out.println("/nEscriba...");
        FileDescription = sc.nextLine();
        System.out.println("/nQuien es el autor");
        FileAuthor = sc.nextLine();


        NameArr[0] = FileName;
        DescArr[0] = FileDescription;
        AuthorArr[0] = FileAuthor;

        /*Impresion del array*/
        System.out.println(NameArr[0]);
        System.out.println(DescArr[0]);
        System.out.println(AuthorArr[0]);
    }
}
