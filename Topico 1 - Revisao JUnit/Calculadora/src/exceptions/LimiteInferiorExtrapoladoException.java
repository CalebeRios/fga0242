package exceptions;

public class LimiteInferiorExtrapoladoException extends Exception
{
    public LimiteInferiorExtrapoladoException()
    {
        super("Limite inferior extrapolado.");
    }
}