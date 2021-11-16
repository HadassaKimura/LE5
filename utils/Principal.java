package utils;

import util.CSVUtils;
import java.io.IOException;
import java.nio.file.Path;
import static java.nio.file.Paths.get;


public class Principal {

    public static void main(String[] args) throws IOException {
        Path arquivo = get("funcionarios.csv");

        CSVUtils.gerarCSVFunSemFilhos (arquivo);
    }
}
