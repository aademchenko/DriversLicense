package com.company;


import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Введите ваше имя");
        String age= JOptionPane.showInputDialog("Ваш возраст (введите только цифры)");
        int Age=Integer.parseInt(age);
        int expiration=Age+10;
        String category=JOptionPane.showInputDialog("Категория прав");
        String text="Водитель: "+name;
        text=text+"\n"+"Возраст: "+age+" лет";
        text=text+'\n'+"Права категории: '"+category+"'";
        JOptionPane.showMessageDialog(null, text+" нужно обновить в "+expiration+" лет");
    }
}
