/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.austro.service;

import ec.fin.austro.model.Propiedad;
import ec.fin.austro.util.EncodeDecode;
import ec.fin.austro.util.EncryptDecrypt;
import java.util.ArrayList;
import java.util.List;

public class EncryptDecryptAction {

    public String encripta(String valor) {
        EncryptDecrypt ed = new EncryptDecrypt();
        try {
            return ed.encryptAES(valor);
        } catch (Exception e) {
            System.out.println("Exception en metodo encripta(String valor):Valor:" + valor);
            System.out.println("Error: " + e.getMessage());
            return "Error Encripta: " + e.getMessage();
        }
    }

    public String encripta(String key, String valor) {
        EncryptDecrypt ed = new EncryptDecrypt();
        try {
            return ed.encryptAES(key, valor);
        } catch (Exception e) {
            System.out.println("Exception en metodo encripta(String Key,String valor):Valor:" + valor);
            System.out.println("Error: " + e.getMessage());
            return "*Error Encripta: " + e.getMessage();
        }
    }

    public String desencripta(String valor) {
        EncryptDecrypt ed = new EncryptDecrypt();
        try {
            return ed.decryptAES(valor);
        } catch (Exception e) {
            System.out.println("Exception en metodo desencripta(String valor):Valor:" + valor);
            System.out.println("Error: " + e.getMessage());
            return "*Error desencripta: " + e.getMessage();
        }
    }

    public String desencripta(String key, String valor) {
        EncryptDecrypt ed = new EncryptDecrypt();
        try {
            return ed.decryptAES(key, valor);
        } catch (Exception e) {
            System.out.println("Exception en metodo desencripta(String key,String valor):Key: " + key + "Valor:" + valor);
            System.out.println("Error: " + e.getMessage());
            return "*Error desencripta: " + e.getMessage();
        }
    }

    public List<Propiedad> encriptaLista(String key, List<Propiedad> list) {
        EncryptDecrypt ed = new EncryptDecrypt();
        List<Propiedad> listResult = new ArrayList<>();
        for (Propiedad propiedad : list) {
            try {
                propiedad.setValue(encripta(key, propiedad.getValue()));
            } catch (Exception e) {
                System.out.println("Exception en metodo encriptaLista(String key,String valor):Key: " + key + "Valor:" + propiedad.getValue());
                System.out.println("Error: " + e.getMessage());
                propiedad.setValue(propiedad.getValue() + "  ***** NO ENCRIPTADO *****");
            }
            listResult.add(propiedad);
        }
        return listResult;
    }

    public List<Propiedad> desencriptaLista(String key, List<Propiedad> list) {
        EncryptDecrypt ed = new EncryptDecrypt();
        List<Propiedad> listResult = new ArrayList<>();
        for (Propiedad propiedad : list) {
            try {
                String res = ed.decryptAES(key, propiedad.getValue());
                if (res != null) {
                    propiedad.setValue(res);
                }
            } catch (Exception e) {
                System.out.println("Exception en metodo desencriptaLista(String key,String valor):Key: " + key + "Valor:" + propiedad.getValue());
                System.out.println("Error: " + e.getMessage());
            }
            listResult.add(propiedad);
        }
        return listResult;
    }

    public List<Propiedad> listarTexto(String text, String sep) {
        String[] lista = text.split("\n");
        List<Propiedad> list = new ArrayList<>();
        for (int j = 0; j < lista.length; j++) {
            String[] value = lista[j].trim().split(sep);
            if (value.length == 2) {
                list.add(new Propiedad(value[0].trim(), value[1].trim(), sep));
            }
            if (value.length == 1) {
                list.add(new Propiedad(value[0].trim(), "", sep));
            }
        }
        return list;
    }

    public String encode64(String valor) {
        try {
            return EncodeDecode.encodeTextToBase64Encoded(valor);
        } catch (Exception e) {
            System.out.println("Exception en metodo encode64 - Valor:" + valor);
            System.out.println("Error: " + e.getMessage());
            return "Error encode64: " + e.getMessage();
        }
    }

    public String decode64(String valor) {
        try {
            return EncodeDecode.decodeBase64EncodedToText(valor);
        } catch (Exception e) {
            System.out.println("Exception en metodo decode64 - Valor:" + valor);
            System.out.println("Error: " + e.getMessage());
            return "*Error decode64: " + e.getMessage();
        }
    }

}
