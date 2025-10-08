package exercices;

public class Exercise1 {
    //1. Escreva um código que receba nome e ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você  tem 'X' anos"
    public void exibirNomeEIdadeAPartirDaDataDeNascimento(String name, int anoDeNascimento, int anoAtual){
        var idade = anoAtual - anoDeNascimento;
        System.out.printf("\nOlá %s, você tem %s anos", name, idade);
    }

    //2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e xiba na tela
    //  fórmula: área = base x altura
    public void calcularAreaDeUmQuadrado(float valorLado){
        var area = valorLado * valorLado;
        System.out.println("\nA área do quadrado é: " + area);
    }

    //3. Escreva um código que receba a base e a altura de um retângulo, calcule a área e exiba na tela
    //  fórmula: área = base x altura
    public void calcularAreaDeUmRetangulo(float valorBase, float valorAltura ){
        var area = valorBase * valorAltura;
        System.out.println("\nA área do retângulo é: " + area);
    }

    //4. Escreva um código que receba o nome e idade de duas pessoas e imprima a diferença de idade entre elas
    public void calcularDiferencaEntreIdades(int idade1, int idade2){
        int diff;
        if(idade1 > idade2){
            diff = idade1 - idade2;
        }else{
            diff = idade2 - idade1;
        }
        System.out.println("\nA diferença entre idades é de: " + diff + " anos");
    }
}
