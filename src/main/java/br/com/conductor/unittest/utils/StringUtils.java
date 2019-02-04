package br.com.conductor.unittest.utils;

public class StringUtils {

    String fieldPackagePrivate = "Eu sou uma propriedade package private";

    public int getSize(String string) {

        if (string == null)
            throw new StringInvalidaException();

        return string.length();
    }

    public static void main(String...args) {
        StringUtils utils = new StringUtils();
        String testString = "cinco";

        if (utils.getSize(testString) != 5) {
            throw new RuntimeException("Falha no teste de contagem de caracteres");
        }

        try {
            utils.getSize(null);
        } catch (StringInvalidaException ex) {
            return;
        } catch (RuntimeException ex) {
            throw new RuntimeException("Falha no teste de contagem de caracteres com valor nulo", ex);
        }

    }


}
