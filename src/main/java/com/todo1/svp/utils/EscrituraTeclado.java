package com.todo1.svp.utils;

import java.awt.*;
import java.awt.event.KeyEvent;

public class EscrituraTeclado {

  private static Robot robot;

  private EscrituraTeclado() {}

  public static void caracterTeclado(char caracter) throws AWTException {
    robot = new Robot();
    switch (caracter) {
      case '@':
        escribirArroba();
        break;
      case '!':
        escribirSignoExclamacion();
        break;
      case '#':
        escribirAlmohadilla();
        break;
      case '$':
        escribirSignoPesos();
        break;
      case '%':
        escribirSignoPorcentaje();
        break;
      case '&':
        escribirEtLatina();
        break;
      case '/':
        escribirBarraInclinada();
        break;
      case '(':
      case ')':
        escribirParentesis(caracter);
        break;
      case '?':
        escribirSignoInterrogacion();
        break;
      case '*':
        escribirAsterisco();
        break;
      case '[':
        escribirCorchetes(caracter);
        break;
      case ']':
        escribirCorchetes(caracter);
        break;
      case ';':
        escribirPuntoComa();
        break;
      case ':':
        escribirDosPuntos();
        break;
      case '_':
        escribirGuionBajo();
        break;
      case '-':
        escribirGuionMedio();
        break;
      case '"':
        escribirComillas();
        break;
      case '+':
        escribirSignoMas();
        break;
      case '}':
      case '{':
        escribirLlaveCurva(caracter);
        break;
      case '<':
      case '>':
        escribirMenorQueMayorQue(caracter);
        break;
      case 'ñ':
        escribirEnie();
        break;
      case '=':
        escribirSignoIgual();
        break;
      case ',':
        escribirComa();
        break;
      case 'a':
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        break;
      case 's':
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        break;
      case 'd':
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        break;
      case 'f':
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        break;
      case 'g':
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_G);
        break;
      case 'h':
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        break;
      case 'j':
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        break;
      case 'k':
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        break;
      case 'l':
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        break;
      case 'm':
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        break;
      case 'n':
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        break;
      case 'b':
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        break;
      case 'v':
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        break;
      case 'c':
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        break;
      case 'x':
        robot.keyPress(KeyEvent.VK_X);
        robot.keyRelease(KeyEvent.VK_X);
        break;
      case 'z':
        robot.keyPress(KeyEvent.VK_Z);
        robot.keyRelease(KeyEvent.VK_Z);
        break;
      case 'q':
        robot.keyPress(KeyEvent.VK_Q);
        robot.keyRelease(KeyEvent.VK_Q);
        break;
      case 'w':
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        break;
      case 'e':
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        break;
      case 'r':
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        break;
      case 't':
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        break;
      case 'y':
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        break;
      case 'u':
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        break;
      case 'i':
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        break;
      case 'o':
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        break;
      case 'p':
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        break;
      case '1':
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        break;
      case '2':
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        break;
      case '3':
        robot.keyPress(KeyEvent.VK_3);
        robot.keyRelease(KeyEvent.VK_3);
        break;
      case '4':
        robot.keyPress(KeyEvent.VK_4);
        robot.keyRelease(KeyEvent.VK_4);
        break;
      case '5':
        robot.keyPress(KeyEvent.VK_5);
        robot.keyRelease(KeyEvent.VK_5);
        break;
      case '6':
        robot.keyPress(KeyEvent.VK_6);
        robot.keyRelease(KeyEvent.VK_6);
        break;
      case '7':
        robot.keyPress(KeyEvent.VK_7);
        robot.keyRelease(KeyEvent.VK_7);
        break;
      case '8':
        robot.keyPress(KeyEvent.VK_8);
        robot.keyRelease(KeyEvent.VK_8);
        break;
      case '9':
        robot.keyPress(KeyEvent.VK_NUMPAD9);
        robot.keyRelease(KeyEvent.VK_NUMPAD9);
        break;
      case '0':
        robot.keyPress(KeyEvent.VK_NUMPAD0);
        robot.keyRelease(KeyEvent.VK_NUMPAD0);
        break;
      case '.':
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyRelease(KeyEvent.VK_PERIOD);
        break;
      default:
        robot.delay(100);
    }
  }

  private static void escribirComa() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD4);
    robot.keyPress(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirSignoIgual() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD6);
    robot.keyPress(KeyEvent.VK_NUMPAD1);
    robot.keyRelease(KeyEvent.VK_NUMPAD1);
    robot.keyRelease(KeyEvent.VK_NUMPAD6);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirEnie() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD1);
    robot.keyPress(KeyEvent.VK_NUMPAD6);
    robot.keyPress(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_NUMPAD6);
    robot.keyRelease(KeyEvent.VK_NUMPAD1);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirMenorQueMayorQue(char caracter) {
    if ("<".equals(Character.toString(caracter))) {
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_NUMPAD6);
      robot.keyPress(KeyEvent.VK_NUMPAD0);
      robot.keyRelease(KeyEvent.VK_NUMPAD0);
      robot.keyRelease(KeyEvent.VK_NUMPAD6);
      robot.keyRelease(KeyEvent.VK_ALT);
    } else {
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_NUMPAD6);
      robot.keyPress(KeyEvent.VK_NUMPAD2);
      robot.keyRelease(KeyEvent.VK_NUMPAD2);
      robot.keyRelease(KeyEvent.VK_NUMPAD6);
      robot.keyRelease(KeyEvent.VK_ALT);
    }
  }

  private static void escribirLlaveCurva(char caracter) {
    if ("}".equals(Character.toString(caracter))) {
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_NUMPAD1);
      robot.keyPress(KeyEvent.VK_NUMPAD2);
      robot.keyPress(KeyEvent.VK_NUMPAD5);
      robot.keyRelease(KeyEvent.VK_NUMPAD5);
      robot.keyRelease(KeyEvent.VK_NUMPAD2);
      robot.keyRelease(KeyEvent.VK_NUMPAD1);
      robot.keyRelease(KeyEvent.VK_ALT);
    } else {
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_NUMPAD1);
      robot.keyPress(KeyEvent.VK_NUMPAD2);
      robot.keyPress(KeyEvent.VK_NUMPAD3);
      robot.keyRelease(KeyEvent.VK_NUMPAD3);
      robot.keyRelease(KeyEvent.VK_NUMPAD2);
      robot.keyRelease(KeyEvent.VK_NUMPAD1);
      robot.keyRelease(KeyEvent.VK_ALT);
    }
  }

  private static void escribirSignoMas() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD4);
    robot.keyPress(KeyEvent.VK_NUMPAD3);
    robot.keyRelease(KeyEvent.VK_NUMPAD3);
    robot.keyRelease(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirComillas() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD3);
    robot.keyPress(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_NUMPAD3);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirGuionMedio() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD4);
    robot.keyPress(KeyEvent.VK_NUMPAD5);
    robot.keyRelease(KeyEvent.VK_NUMPAD5);
    robot.keyRelease(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirGuionBajo() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD9);
    robot.keyPress(KeyEvent.VK_NUMPAD5);
    robot.keyRelease(KeyEvent.VK_NUMPAD5);
    robot.keyRelease(KeyEvent.VK_NUMPAD9);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirDosPuntos() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD5);
    robot.keyPress(KeyEvent.VK_NUMPAD8);
    robot.keyRelease(KeyEvent.VK_NUMPAD8);
    robot.keyRelease(KeyEvent.VK_NUMPAD5);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirPuntoComa() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD5);
    robot.keyPress(KeyEvent.VK_NUMPAD9);
    robot.keyRelease(KeyEvent.VK_NUMPAD9);
    robot.keyRelease(KeyEvent.VK_NUMPAD5);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirCorchetes(char caracter) {
    if ("[".equals(Character.toString(caracter))) {
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_NUMPAD9);
      robot.keyPress(KeyEvent.VK_NUMPAD1);
      robot.keyRelease(KeyEvent.VK_NUMPAD1);
      robot.keyRelease(KeyEvent.VK_NUMPAD9);
      robot.keyRelease(KeyEvent.VK_ALT);
    } else {
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_NUMPAD9);
      robot.keyPress(KeyEvent.VK_NUMPAD3);
      robot.keyRelease(KeyEvent.VK_NUMPAD3);
      robot.keyRelease(KeyEvent.VK_NUMPAD9);
      robot.keyRelease(KeyEvent.VK_ALT);
    }
  }

  private static void escribirAsterisco() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD4);
    robot.keyPress(KeyEvent.VK_NUMPAD2);
    robot.keyRelease(KeyEvent.VK_NUMPAD2);
    robot.keyRelease(KeyEvent.VK_NUMPAD4);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirSignoInterrogacion() {
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_NUMPAD6);
    robot.keyPress(KeyEvent.VK_NUMPAD3);
    robot.keyRelease(KeyEvent.VK_NUMPAD3);
    robot.keyRelease(KeyEvent.VK_NUMPAD6);
    robot.keyRelease(KeyEvent.VK_ALT);
  }

  private static void escribirParentesis(char caracter) {
    if ("(".equals(Character.toString(caracter))) {
      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.keyPress(KeyEvent.VK_8);
      robot.keyRelease(KeyEvent.VK_8);
      robot.keyRelease(KeyEvent.VK_SHIFT);
    } else {
      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.keyPress(KeyEvent.VK_9);
      robot.keyRelease(KeyEvent.VK_9);
      robot.keyRelease(KeyEvent.VK_SHIFT);
    }
  }

  private static void escribirBarraInclinada() {
    robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_7);
    robot.keyRelease(KeyEvent.VK_7);
    robot.keyRelease(KeyEvent.VK_SHIFT);
  }

  private static void escribirEtLatina() {
    robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_6);
    robot.keyRelease(KeyEvent.VK_6);
    robot.keyRelease(KeyEvent.VK_SHIFT);
  }

  private static void escribirSignoPorcentaje() {
    robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_5);
    robot.keyRelease(KeyEvent.VK_5);
    robot.keyRelease(KeyEvent.VK_SHIFT);
  }

  private static void escribirSignoPesos() {
    robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_4);
    robot.keyRelease(KeyEvent.VK_4);
    robot.keyRelease(KeyEvent.VK_SHIFT);
  }

  private static void escribirArroba() {
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_Q);
    robot.keyRelease(KeyEvent.VK_Q);
    robot.keyRelease(KeyEvent.VK_ALT);
    robot.keyRelease(KeyEvent.VK_CONTROL);
  }

  private static void escribirSignoExclamacion() {
    robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_1);
    robot.keyRelease(KeyEvent.VK_1);
    robot.keyRelease(KeyEvent.VK_SHIFT);
  }

  private static void escribirAlmohadilla() {
    robot.keyPress(KeyEvent.VK_SHIFT);
    robot.keyPress(KeyEvent.VK_3);
    robot.keyRelease(KeyEvent.VK_3);
    robot.keyRelease(KeyEvent.VK_SHIFT);
  }
}
