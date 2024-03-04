package com.codigofacilito.clase03;

import java.io.IOException;

public class Excepciones {
    public static void main(String[] args) {
        // Algo salio mal -> java.lang.Error
        // El padre de todas las exceptions es Throwable
        Exception e; // Checked
        RuntimeException re; // Unchecked

        checkChat();
    }

    private static void withResources() {
        CodigoFacilitoClosable anotheClosable = new CodigoFacilitoClosable();
        try {
            anotheClosable.startClase();
            anotheClosable.close();
        } catch (Exception ex){

        } finally {

        }

        // try-with-resources
        try (CodigoFacilitoClosable codigoFacilitoClosable = new CodigoFacilitoClosable()) {
            codigoFacilitoClosable.startClase();
        } catch (Exception ex) {

        } finally {

        }
    }

    public static void checkChat() {
        try {
            speakOnChat();
            speakOnChat();
            speakOnChat();
            System.out.println("");
        } catch (ChatNotAnswerException | IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Soy finally");
        }

        writeOnChat();
    }

    public static void speakOnChat() throws ChatNotAnswerException, IOException {
        if (Math.random() < 0.5) {
            throw new IOException();
        } else {
            throw new ChatNotAnswerException("Ricardo did answer but did not get a like");
        }
    }

    public static void writeOnChat() {
        throw new WriteOnChatException();
    }
}
