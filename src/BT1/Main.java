/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author phatc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       HoaDonHeader HDH = new HoaDonHeader("HD001",new SimpleDateFormat("dd/mm/yy").parse("30/11/2020"),"Trường Phát");
       CTHD CTHD1 = new CTHD("Cà Rốt", 30,3000,0.2);
       CTHD CTHD2 = new CTHD("Táo", 10,8000,0.1);
       
       HoaDon HD = new HoaDon.Builder()
          .addHoaDonHeader(HDH)
          .addCTHD(CTHD1)
          .addCTHD(CTHD2)
          .build();
    
       System.out.println(HD.toString()); 
    }
     
}
