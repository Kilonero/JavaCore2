package Lesson_15;

public class Pult {
    protected String name;
    protected boolean on;


    public Pult(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return on;
    }

    public void tournOn() {
        on = true;
    }

    public void tournOff() {
        on = false;
    }

    public void printStatus() {

    }

    protected String isOnAsString() {
        String result;
        if (on) {
            result = "on";
        }
        else {
            result = "off";
        }
        return result;
    }
}



// Представьте, что все электрические приборы, которые есть вокруг вас могут включаться и выключаться одновременно при помощи специального пульта
// управления с тремя кнопками: ON, OFF и ADD. В пульте есть список устройств, которыми он управляет.
// Когда вы нажимаете ON, все устройства, добавленные в список пульта, включаются. Когда нажимаете OFF, все устройства из списка выключаются.
// Чтобы добавить устройство в список пульта, используется кнопка ADD.
// Придумайте классы, которые будут представлять из себя чайник, телевизор и лампочку.
// Вы добавляете их в список пульта командой ADD, а потом, нажимая ON, видите, что и чайник и телевизор и лампочка пишут о себе в программе,
// что они включены. Нажимаете OFF, они о себе пишут, что выключены.

