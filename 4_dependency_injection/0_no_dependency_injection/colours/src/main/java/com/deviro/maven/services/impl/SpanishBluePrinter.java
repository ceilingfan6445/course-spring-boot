/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deviro.maven.services.impl;

import com.deviro.maven.services.BluePrinter;
import org.springframework.stereotype.Component;

/**
 * @author hackathon
 */
@Component
public class SpanishBluePrinter implements BluePrinter {
  @Override
  public String print() {
    return "azul";
  }
}
