package JDL.Biblioteca.Models;

import java.time.LocalDate;

public class Emprestimo extends DbModel {

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private int qtDiasEmprestados;
    private double precoDiaria;
    private int qtDiasAtrasados;

    public Emprestimo(int id, LocalDate dataEmprestimo, LocalDate dataDevolucao, 
                      int qtDiasEmprestados, double precoDiaria, int qtDiasAtrasados) {
        
        super(id);
        
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.qtDiasEmprestados = qtDiasEmprestados;
        this.precoDiaria = precoDiaria;
        this.qtDiasAtrasados = qtDiasAtrasados;
    }

    public LocalDate getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(LocalDate dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }

    public LocalDate getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(LocalDate dataDevolucao) { this.dataDevolucao = dataDevolucao; }

    public int getQtDiasEmprestados() { return qtDiasEmprestados; }
    public void setQtDiasEmprestados(int qtDiasEmprestados) { this.qtDiasEmprestados = qtDiasEmprestados; }

    public double getPrecoDiaria() { return precoDiaria; }
    public void setPrecoDiaria(double precoDiaria) { this.precoDiaria = precoDiaria; }

    public int getQtDiasAtrasados() { return qtDiasAtrasados; }
    public void setQtDiasAtrasados(int qtDiasAtrasados) { this.qtDiasAtrasados = qtDiasAtrasados; }
}