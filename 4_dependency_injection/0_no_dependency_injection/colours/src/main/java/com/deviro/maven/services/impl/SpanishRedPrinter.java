/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deviro.maven.services.impl;

import com.deviro.maven.services.RedPrinter;
import org.springframework.stereotype.Service;

/**
 * @author hackathon
 */
@Service
public class SpanishRedPrinter implements RedPrinter {
  @Override
  public String print() {
    return "rojo";
  }
}
