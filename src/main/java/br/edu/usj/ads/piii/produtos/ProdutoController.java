package br.edu.usj.ads.piii.produtos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@CrossOrigin
@ResponseBody
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping(value="/")
    public List<Produto> getTodos() {
        List<Produto> lista = produtoRepository.findAll();
        return lista;
    }
    
    @PostMapping(value="/cadastrar")
    public void postCadastrar(@RequestBody Produto produto) {
        produtoRepository.save(produto);
    }
    
    
}
