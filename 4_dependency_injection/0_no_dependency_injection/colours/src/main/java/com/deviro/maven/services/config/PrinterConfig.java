/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deviro.maven.services.config;

import com.deviro.maven.services.BluePrinter;
import com.deviro.maven.services.ColourPrinter;
import com.deviro.maven.services.GreenPrinter;
import com.deviro.maven.services.RedPrinter;
import com.deviro.maven.services.impl.ColourPrinterImpl;
import com.deviro.maven.services.impl.EnglishBluePrinter;
import com.deviro.maven.services.impl.EnglishGreenPrinter;
import com.deviro.maven.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hackathon
 */
@Configuration
public class PrinterConfig {
  @Bean
  public BluePrinter bluePrinter() {
    return new EnglishBluePrinter();
  }

  @Bean
  public GreenPrinter greenPrinter() {
    return new EnglishGreenPrinter();
  }

  @Bean
  public RedPrinter redPrinter() {
    return new EnglishRedPrinter();
  }

  @Bean
  public ColourPrinter colourPrinter(RedPrinter red, BluePrinter blue, GreenPrinter green) {
    return new ColourPrinterImpl(red, blue, green);
  }
}
