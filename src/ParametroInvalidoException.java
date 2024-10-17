public class ParametroInvalidoException extends RuntimeException{

    public ParametroInvalidoException(){
        super("Parametro invalido, digite corretamente");
    }
    public ParametroInvalidoException(Object messagem){
        System.err.println(messagem);
    }
}
