package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.GregorianCalendar;

public class Lucky {

    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        int y = today.get(GregorianCalendar.YEAR);
        int m = today.get(GregorianCalendar.MONTH)+1;
        int d = today.get(GregorianCalendar.DATE);
        System.out.printf("today is %04d %02d %02d.",y,m,d);
        Random random = new Random();
        int a = random.nextInt(10);
        switch (a){
            case 0:
                System.out.println("Most Lucky!!");
                break;
            case 1: case 2: case 3:
                System.out.println("Lucky!!");
                break;
            case 4: case 5: case 6:
                System.out.println("So-so");
                break;
            case 7: case 8:
                System.out.println("Be careful");
                break;
            case 9:
                System.out.println("unlucky");
        }

    }


}
