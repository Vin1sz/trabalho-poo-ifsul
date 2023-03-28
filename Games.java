public class Games {
public String titulo;
public String plataforma;
public String desenvolvedor;
public String genero;
public String dataLancamento;
public String descricao;

public Games(String titulo,String plataforma, String desenvolvedor, String genero, String dataLancamento, String descricao ) {
this.titulo = titulo;
this.plataforma = plataforma;
this.desenvolvedor = desenvolvedor;
this.genero = genero;
this.dataLancamento = dataLancamento;
this.descricao = descricao;
}

public String getTitulo() {
return titulo;
}

public String getPlataforma() { 
return plataforma;
}
    
public String getDesenvolvedor() {
return desenvolvedor;
}
    
public String getGenero() {
return genero;
}
    
public String getDataLancamento() {
return dataLancamento;
}
    
public String getDescricao() {
return descricao;
}


public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
}

public void setDesenvolvedor(String desenvolvedor) {
    this.desenvolvedor = desenvolvedor;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public void setDataLancamento(String dataLancamento) {
    this.dataLancamento = dataLancamento;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}
}