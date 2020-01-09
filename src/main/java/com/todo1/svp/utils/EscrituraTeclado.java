package com.todo1.svp.utils;

import static java.awt.event.KeyEvent.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class EscrituraTeclado {

  private static Robot robot;
  private static Map<Character, Runnable> caracteres;

  static {
    caracteres = new HashMap<>();
    caracteres.put('@', EscrituraTeclado::escribirArroba);
    caracteres.put('!', EscrituraTeclado::escribirCerrarSignoExclamacion);
    caracteres.put('¡', EscrituraTeclado::escribirAbrirSignoExclamacion);
    caracteres.put('#', EscrituraTeclado::escribirAlmohadilla);
    caracteres.put('$', EscrituraTeclado::escribirSignoPesos);
    caracteres.put('%', EscrituraTeclado::escribirSignoPorcentaje);
    caracteres.put('&', EscrituraTeclado::escribirEtLatina);
    caracteres.put('/', EscrituraTeclado::escribirBarraInclinada);
    caracteres.put('(', EscrituraTeclado::escribirAbrirParentesisParentesis);
    caracteres.put(')', EscrituraTeclado::escribirCerrarParentesisParentesis);
    caracteres.put('?', EscrituraTeclado::escribirCerrarSignoInterrogacion);
    caracteres.put('¿', EscrituraTeclado::escribirAbrirSignoInterrogacion);
    caracteres.put('*', EscrituraTeclado::escribirAsterisco);
    caracteres.put('[', EscrituraTeclado::escribirAbrirCorchete);
    caracteres.put(']', EscrituraTeclado::escribirCerraCorchete);
    caracteres.put(';', EscrituraTeclado::escribirPuntoComa);
    caracteres.put(':', EscrituraTeclado::escribirDosPuntos);
    caracteres.put('_', EscrituraTeclado::escribirGuionBajo);
    caracteres.put('-', EscrituraTeclado::escribirGuionMedio);
    caracteres.put('"', EscrituraTeclado::escribirComillas);
    caracteres.put('+', EscrituraTeclado::escribirSignoMas);
    caracteres.put('{', EscrituraTeclado::escribirAbrirLlaveCurva);
    caracteres.put('}', EscrituraTeclado::escribirCerrarLLaveCurva);
    caracteres.put('>', EscrituraTeclado::escribirMayorQue);
    caracteres.put('<', EscrituraTeclado::escribirMenorQue);
    caracteres.put('ñ', EscrituraTeclado::escribirEnie);
    caracteres.put('=', EscrituraTeclado::escribirSignoIgual);
    caracteres.put('.', EscrituraTeclado::escribirPunto);
    caracteres.put(',', EscrituraTeclado::escribirComa);
    caracteres.put('a', EscrituraTeclado::escribirLetraA);
    caracteres.put('s', EscrituraTeclado::escribirLetraS);
    caracteres.put('d', EscrituraTeclado::escribirLetraD);
    caracteres.put('f', EscrituraTeclado::escribirLetraF);
    caracteres.put('g', EscrituraTeclado::escribirLetraG);
    caracteres.put('h', EscrituraTeclado::escribirLetraH);
    caracteres.put('j', EscrituraTeclado::escribirLetraJ);
    caracteres.put('k', EscrituraTeclado::escribirLetraK);
    caracteres.put('l', EscrituraTeclado::escribirLetraL);
    caracteres.put('m', EscrituraTeclado::escribirLetraM);
    caracteres.put('n', EscrituraTeclado::escribirLetraN);
    caracteres.put('b', EscrituraTeclado::escribirLetraB);
    caracteres.put('v', EscrituraTeclado::escribirLetraV);
    caracteres.put('c', EscrituraTeclado::escribirLetraC);
    caracteres.put('x', EscrituraTeclado::escribirLetraX);
    caracteres.put('z', EscrituraTeclado::escribirLetraZ);
    caracteres.put('q', EscrituraTeclado::escribirLetraQ);
    caracteres.put('w', EscrituraTeclado::escribirLetraW);
    caracteres.put('e', EscrituraTeclado::escribirLetraE);
    caracteres.put('r', EscrituraTeclado::escribirLetraR);
    caracteres.put('t', EscrituraTeclado::escribirLetraT);
    caracteres.put('y', EscrituraTeclado::escribirLetraY);
    caracteres.put('u', EscrituraTeclado::escribirLetraU);
    caracteres.put('i', EscrituraTeclado::escribirLetraI);
    caracteres.put('o', EscrituraTeclado::escribirLetraO);
    caracteres.put('p', EscrituraTeclado::escribirLetraP);
    caracteres.put('1', EscrituraTeclado::escribirNumero1);
    caracteres.put('2', EscrituraTeclado::escribirNumero2);
    caracteres.put('3', EscrituraTeclado::escribirNumero3);
    caracteres.put('4', EscrituraTeclado::escribirNumero4);
    caracteres.put('5', EscrituraTeclado::escribirNumero5);
    caracteres.put('6', EscrituraTeclado::escribirNumero6);
    caracteres.put('7', EscrituraTeclado::escribirNumero7);
    caracteres.put('8', EscrituraTeclado::escribirNumero8);
    caracteres.put('9', EscrituraTeclado::escribirNumero9);
    caracteres.put('0', EscrituraTeclado::escribirNumero0);
  }

  private EscrituraTeclado() {}

  public static void escribirCaracter(char caracter) throws AWTException {
    robot = new Robot();
    if (caracteres.containsKey(caracter)) {
      caracteres.get(caracter).run();
    } else {
      throw new IllegalArgumentException("No se encuentra mapeado el caracter con Robot");
    }
  }

  private static void escribirLetraA() {
    robot.keyPress(VK_A);
    robot.keyRelease(VK_A);
  }

  private static void escribirLetraS() {
    robot.keyPress(VK_S);
    robot.keyRelease(VK_S);
  }

  private static void escribirLetraD() {
    robot.keyPress(VK_D);
    robot.keyRelease(VK_D);
  }

  private static void escribirLetraF() {
    robot.keyPress(VK_F);
    robot.keyRelease(VK_F);
  }

  private static void escribirLetraG() {
    robot.keyPress(VK_G);
    robot.keyRelease(VK_G);
  }

  private static void escribirLetraH() {
    robot.keyPress(VK_H);
    robot.keyRelease(VK_H);
  }

  private static void escribirLetraJ() {
    robot.keyPress(VK_J);
    robot.keyRelease(VK_J);
  }

  private static void escribirLetraK() {
    robot.keyPress(VK_K);
    robot.keyRelease(VK_K);
  }

  private static void escribirLetraL() {
    robot.keyPress(VK_L);
    robot.keyRelease(VK_L);
  }

  private static void escribirLetraM() {
    robot.keyPress(VK_M);
    robot.keyRelease(VK_M);
  }

  private static void escribirLetraN() {
    robot.keyPress(VK_N);
    robot.keyRelease(VK_N);
  }

  private static void escribirLetraB() {
    robot.keyPress(VK_B);
    robot.keyRelease(VK_B);
  }

  private static void escribirLetraV() {
    robot.keyPress(VK_V);
    robot.keyRelease(VK_V);
  }

  private static void escribirLetraC() {
    robot.keyPress(VK_C);
    robot.keyRelease(VK_C);
  }

  private static void escribirLetraX() {
    robot.keyPress(VK_X);
    robot.keyRelease(VK_X);
  }

  private static void escribirLetraZ() {
    robot.keyPress(VK_Z);
    robot.keyRelease(VK_Z);
  }

  private static void escribirLetraQ() {
    robot.keyPress(VK_Q);
    robot.keyRelease(VK_Q);
  }

  private static void escribirLetraW() {
    robot.keyPress(VK_W);
    robot.keyRelease(VK_W);
  }

  private static void escribirLetraE() {
    robot.keyPress(VK_E);
    robot.keyRelease(VK_E);
  }

  private static void escribirLetraR() {
    robot.keyPress(VK_R);
    robot.keyRelease(VK_R);
  }

  private static void escribirLetraT() {
    robot.keyPress(VK_T);
    robot.keyRelease(VK_T);
  }

  private static void escribirLetraY() {
    robot.keyPress(VK_Y);
    robot.keyRelease(VK_Y);
  }

  private static void escribirLetraU() {
    robot.keyPress(VK_U);
    robot.keyRelease(VK_U);
  }

  private static void escribirLetraI() {
    robot.keyPress(VK_I);
    robot.keyRelease(VK_I);
  }

  private static void escribirLetraO() {
    robot.keyPress(VK_O);
    robot.keyRelease(VK_O);
  }

  private static void escribirLetraP() {
    robot.keyPress(VK_P);
    robot.keyRelease(VK_P);
  }

  private static void escribirNumero1() {
    robot.keyPress(VK_1);
    robot.keyRelease(VK_1);
  }

  private static void escribirNumero2() {
    robot.keyPress(VK_2);
    robot.keyRelease(VK_2);
  }

  private static void escribirNumero3() {
    robot.keyPress(VK_3);
    robot.keyRelease(VK_3);
  }

  private static void escribirNumero4() {
    robot.keyPress(VK_4);
    robot.keyRelease(VK_4);
  }

  private static void escribirNumero5() {
    robot.keyPress(VK_5);
    robot.keyRelease(VK_5);
  }

  private static void escribirNumero6() {
    robot.keyPress(VK_6);
    robot.keyRelease(VK_6);
  }

  private static void escribirNumero7() {
    robot.keyPress(VK_7);
    robot.keyRelease(VK_7);
  }

  private static void escribirNumero8() {
    robot.keyPress(VK_8);
    robot.keyRelease(VK_8);
  }

  private static void escribirNumero9() {
    robot.keyPress(VK_9);
    robot.keyRelease(VK_9);
  }

  private static void escribirNumero0() {
    robot.keyPress(VK_0);
    robot.keyRelease(VK_0);
  }

  private static void escribirPunto() {
    robot.keyPress(VK_PERIOD);
    robot.keyRelease(VK_PERIOD);
  }

  private static void escribirComa() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD4);
    robot.keyPress(VK_NUMPAD4);
    robot.keyRelease(VK_NUMPAD4);
    robot.keyRelease(VK_NUMPAD4);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirSignoIgual() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD6);
    robot.keyPress(VK_NUMPAD1);
    robot.keyRelease(VK_NUMPAD1);
    robot.keyRelease(VK_NUMPAD6);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirEnie() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD1);
    robot.keyPress(VK_NUMPAD6);
    robot.keyPress(VK_NUMPAD4);
    robot.keyRelease(VK_NUMPAD4);
    robot.keyRelease(VK_NUMPAD6);
    robot.keyRelease(VK_NUMPAD1);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirMayorQue() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD6);
    robot.keyPress(VK_NUMPAD2);
    robot.keyRelease(VK_NUMPAD2);
    robot.keyRelease(VK_NUMPAD6);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirMenorQue() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD6);
    robot.keyPress(VK_NUMPAD0);
    robot.keyRelease(VK_NUMPAD0);
    robot.keyRelease(VK_NUMPAD6);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirAbrirLlaveCurva() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD1);
    robot.keyPress(VK_NUMPAD2);
    robot.keyPress(VK_NUMPAD3);
    robot.keyRelease(VK_NUMPAD3);
    robot.keyRelease(VK_NUMPAD2);
    robot.keyRelease(VK_NUMPAD1);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirCerrarLLaveCurva() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD1);
    robot.keyPress(VK_NUMPAD2);
    robot.keyPress(VK_NUMPAD5);
    robot.keyRelease(VK_NUMPAD5);
    robot.keyRelease(VK_NUMPAD2);
    robot.keyRelease(VK_NUMPAD1);
    robot.keyPress(VK_ALT);
  }

  private static void escribirSignoMas() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD4);
    robot.keyPress(VK_NUMPAD3);
    robot.keyRelease(VK_NUMPAD3);
    robot.keyRelease(VK_NUMPAD4);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirComillas() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD3);
    robot.keyPress(VK_NUMPAD4);
    robot.keyRelease(VK_NUMPAD4);
    robot.keyRelease(VK_NUMPAD3);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirGuionMedio() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD4);
    robot.keyPress(VK_NUMPAD5);
    robot.keyRelease(VK_NUMPAD5);
    robot.keyRelease(VK_NUMPAD4);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirGuionBajo() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD9);
    robot.keyPress(VK_NUMPAD5);
    robot.keyRelease(VK_NUMPAD5);
    robot.keyRelease(VK_NUMPAD9);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirDosPuntos() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD5);
    robot.keyPress(VK_NUMPAD8);
    robot.keyRelease(VK_NUMPAD8);
    robot.keyRelease(VK_NUMPAD5);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirPuntoComa() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD5);
    robot.keyPress(VK_NUMPAD9);
    robot.keyRelease(VK_NUMPAD9);
    robot.keyRelease(VK_NUMPAD5);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirAbrirCorchete() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD9);
    robot.keyPress(VK_NUMPAD1);
    robot.keyRelease(VK_NUMPAD1);
    robot.keyRelease(VK_NUMPAD9);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirCerraCorchete() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD9);
    robot.keyPress(VK_NUMPAD3);
    robot.keyRelease(VK_NUMPAD3);
    robot.keyRelease(VK_NUMPAD9);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirAsterisco() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD4);
    robot.keyPress(VK_NUMPAD2);
    robot.keyRelease(VK_NUMPAD2);
    robot.keyRelease(VK_NUMPAD4);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirAbrirSignoInterrogacion() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD1);
    robot.keyPress(VK_NUMPAD6);
    robot.keyPress(VK_NUMPAD8);
    robot.keyRelease(VK_NUMPAD8);
    robot.keyRelease(VK_NUMPAD6);
    robot.keyRelease(VK_NUMPAD1);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirCerrarSignoInterrogacion() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_NUMPAD6);
    robot.keyPress(VK_NUMPAD3);
    robot.keyRelease(VK_NUMPAD3);
    robot.keyRelease(VK_NUMPAD6);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirAbrirParentesisParentesis() {
    robot.keyPress(VK_SHIFT);
    robot.keyPress(VK_8);
    robot.keyRelease(VK_8);
    robot.keyRelease(VK_SHIFT);
  }

  private static void escribirCerrarParentesisParentesis() {
    robot.keyPress(VK_SHIFT);
    robot.keyPress(VK_9);
    robot.keyRelease(VK_9);
    robot.keyRelease(VK_SHIFT);
  }

  private static void escribirBarraInclinada() {
    robot.keyPress(VK_SHIFT);
    robot.keyPress(VK_7);
    robot.keyRelease(VK_7);
    robot.keyRelease(VK_SHIFT);
  }

  private static void escribirEtLatina() {
    robot.keyPress(VK_SHIFT);
    robot.keyPress(VK_6);
    robot.keyRelease(VK_6);
    robot.keyRelease(VK_SHIFT);
  }

  private static void escribirSignoPorcentaje() {
    robot.keyPress(VK_SHIFT);
    robot.keyPress(VK_5);
    robot.keyRelease(VK_5);
    robot.keyRelease(VK_SHIFT);
  }

  private static void escribirSignoPesos() {
    robot.keyPress(VK_SHIFT);
    robot.keyPress(VK_4);
    robot.keyRelease(VK_4);
    robot.keyRelease(VK_SHIFT);
  }

  private static void escribirArroba() {
    robot.keyPress(VK_CONTROL);
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_Q);
    robot.keyRelease(VK_Q);
    robot.keyRelease(VK_ALT);
    robot.keyRelease(VK_CONTROL);
  }

  private static void escribirCerrarSignoExclamacion() {
    robot.keyPress(VK_SHIFT);
    robot.keyPress(VK_1);
    robot.keyRelease(VK_1);
    robot.keyRelease(VK_SHIFT);
  }

  private static void escribirAbrirSignoExclamacion() {
    robot.keyPress(VK_ALT);
    robot.keyPress(VK_1);
    robot.keyPress(VK_7);
    robot.keyPress(VK_3);
    robot.keyRelease(VK_3);
    robot.keyRelease(VK_7);
    robot.keyRelease(VK_1);
    robot.keyRelease(VK_ALT);
  }

  private static void escribirAlmohadilla() {
    robot.keyPress(VK_SHIFT);
    robot.keyPress(VK_3);
    robot.keyRelease(VK_3);
    robot.keyRelease(VK_SHIFT);
  }
}
