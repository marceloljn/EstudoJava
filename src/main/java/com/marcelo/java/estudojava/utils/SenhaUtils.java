package com.marcelo.java.estudojava.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * SenhaUtils
 */
public class SenhaUtils {

    public static String gerarBCrypt(String senha) {
        if (senha == null) {
            return senha;
        }

        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.encode(senha);
    }

    public static boolean senhaValida(String senha, String senhaEncoded) {
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.matches(senha, senhaEncoded);
    }
}