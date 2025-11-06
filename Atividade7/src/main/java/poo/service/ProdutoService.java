package poo.service;

import poo.model.Produto;
import com.opencsv.CSVReader;
import org.springframework.stereotype.Service;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        try {
            InputStream input = getClass().getResourceAsStream("/produtos.csv");
            if (input == null) {
                System.err.println("❌ Arquivo produtos.csv não encontrado!");
                return produtos;
            }

            CSVReader reader = new CSVReader(new InputStreamReader(input));
            String[] linha;
            boolean cabecalho = true;

            while ((linha = reader.readNext()) != null) {
                if (cabecalho) {
                    cabecalho = false;
                    continue;
                }

                String id = linha[0];
                String nome = linha[1];
                double preco = Double.parseDouble(linha[3]);
                String descricao = linha[2];
                int estoque = Integer.parseInt(linha[4]);

                produtos.add(new Produto(id, nome, preco, estoque, descricao));
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return produtos;
    }
}
