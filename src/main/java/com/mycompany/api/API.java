/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.api;


/**
 *
 * @author js802
 */
public class API {

    public static void main(String[] args) throws Exception {
      APIsms sms = new APIsms();
      ///sentSms("String username,String password, String number, String message) username y password fijos
      ///sms.sentSms("joels2812","Padrinos2812","+50660101068","Hola");
      APIemail email = new APIemail();
      /// sentEmail(String projectName, String namePersonLog, String email, String detail, String date)
      ///email.sentEmail("Progra 1","Joel","joelledez2812@gmail.com","Logre enviar el video", "10/7/2022");
    }
}
