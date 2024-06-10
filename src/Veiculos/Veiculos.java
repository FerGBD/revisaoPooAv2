import java.util.Scanner;
public abstract class Veiculos {
    protected double preco;
    protected String placa, marca;
    public static final int idadeMinima = 18;
    public motor motor;
    //Começando os construtores
    public Veiculos(){
    }
    public Veiculos(double preco, String marca, String placa){
        setPreco(preco);
        setMarca(marca);
        setPlaca(placa);
    }
    public Veiculos(double preco, String marca){
        setPreco(preco);
        setMarca(marca);
    }
    public Veiculos(String marca, String placa){
        setMarca(marca);
        setPlaca(placa);
    }
    public Veiculos(String placa, double preco){
        setPreco(preco);
        setPlaca(placa);
    }
    public Veiculos(String marca, String placa, double preco){
        setPlaca(placa);
        setMarca(marca);
        setPreco(preco);
    }

    //Métodos sets e gets
    public void setMarca(String marca){
        if(!marca.isEmpty()){
            this.marca = marca;
        }
    }
    public void setPlaca(String placa){
        if(!placa.isEmpty()){
            this.placa = placa;
        }
    }
    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }
    }
    public String getMarca(){
        return this.marca;
    }
    public String getPlaca(){
        return this.placa;
    }
    public double getPreco(){
        return this.preco;
    }
    //Cadastrando
    public void cadastrar(String marca, String placa, double preco){
        this.setMarca(marca);
        this.setPlaca(placa);
        this.setPreco(preco);
    }
    //Entrda de dados
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        this.setMarca(sc.nextLine());
        System.out.println("Preco: ");
        this.setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("Placa: ");
        this.setPlaca(sc.nextLine());
    }
    //Imprimindo
    public void imprimir(){
        System.out.println("Marca..:" + getMarca());
        System.out.println("Placa..:" + getPlaca());
        System.out.println("Preco..:" + getPreco());
    }
}
