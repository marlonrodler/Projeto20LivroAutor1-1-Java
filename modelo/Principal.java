/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro livro01 = new Livro();
        Autor autor01 = new Autor();

        autor01.setNome("Marlon");
        autor01.setEmail("marlon@hotmail.com");
        autor01.setAnoNasc(2000);
        autor01.setObra(livro01);
        livro01.setTitulo("Sistemas Operacionais");
        livro01.setEditora("Fatec");
        livro01.setAno(2018);
        livro01.setEscritor(autor01);

        System.out.println("O autor '" + livro01.getEscritor().getNome() + "' escreveu o livro '" + autor01.getObra().getTitulo() + "'");
    }

}
