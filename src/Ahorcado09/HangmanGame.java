package Ahorcado09;

/**
 * Interfaz para el juego del Ahorcado.
 */
public interface HangmanGame {
    
    /**
     * Inicia un nuevo juego del Ahorcado.
     * 
     * @param word La palabra a adivinar
     * @param maxAttempts El número máximo de intentos permitidos
     */
    public void startNewGame(String word, int maxAttempts);
    
    /**
     * Intenta adivinar una letra en la palabra.
     * 
     * @param letter La letra a intentar adivinar
     * @return true si la letra es parte de la palabra, false de lo contrario
     * @throws IllegalStateException Si el juego no se ha iniciado aún
     */
   public  boolean guessLetter(char letter);
    
    /**
     * Obtiene el estado actual de la palabra a adivinar, mostrando las letras adivinadas y los espacios en blanco.
     * 
     * @return El estado actual de la palabra
     * @throws IllegalStateException Si el juego no se ha iniciado aún
     */
    public String getWordState();
    
    /**
     * Obtiene el número de intentos restantes.
     * 
     * @return El número de intentos restantes
     * @throws IllegalStateException Si el juego no se ha iniciado aún
     */
    public int getRemainingAttempts();
    
    /**
     * Comprueba si el juego ha terminado.
     * 
     * @return true si el juego ha terminado, false de lo contrario
     * @throws IllegalStateException Si el juego no se ha iniciado aún
     */
    public boolean isGameOver();
    
    /**
     * Comprueba si el jugador ha ganado el juego.
     * 
     * @return true si el jugador ha ganado, false de lo contrario
     * @throws IllegalStateException Si el juego no se ha iniciado aún
     */
    public boolean isGameWon();
}

